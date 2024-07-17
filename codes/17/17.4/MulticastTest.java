
import java.net.*;
import java.io.*;
import java.util.*;
/**
 * Description:
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks
 * @version 6.0
 */
// 让该类实现Runnable接口，该类的实例可作为线程的target
public class MulticastTest implements Runnable
{
	// 使用常量作为本程序的多点广播IP地址
	private static final String BROADCAST_IP
		= "230.0.0.1";
	// 使用常量作为本程序的多点广播目的的端口
	public static final int BROADCAST_PORT = 30000;
	// 定义每个数据报的最大大小为4K
	private static final int DATA_LEN = 4096;
	//定义本程序的DatagramSocket实例，可实现多点广播功能
	private DatagramSocket socket = null;
	private SocketAddress group = null;
	private NetworkInterface netInterface;
	private Scanner scan = null;
	// 定义接收网络数据的字节数组
	byte[] inBuff = new byte[DATA_LEN];
	// 以指定字节数组创建准备接受数据的DatagramPacket对象
	private DatagramPacket inPacket
		= new DatagramPacket(inBuff, inBuff.length);
	// 定义一个用于发送的DatagramPacket对象
	private DatagramPacket outPacket = null;
	public void init() throws IOException
	{
		try (
			// 创建键盘输入流
			var scan = new Scanner(System.in))
		{
			// 创建用于发送、接收数据的DatagramSocket对象
			// 由于需要在该端口运行多个客户端，因此要复用该端口
			socket = new DatagramSocket(null); // 先不绑定端口
			socket.setReuseAddress(true); // 在绑定端口之前设置复用该地址
			socket.bind(new InetSocketAddress(BROADCAST_PORT)); // 绑定端口
			var mcastaddr = InetAddress.getByName(BROADCAST_IP);
			// 创建多点广播组
			group = new InetSocketAddress(mcastaddr, 0);
			// 获取本机的网络接口（网卡）
			netInterface = NetworkInterface.getByInetAddress(
				InetAddress.getByName("192.168.1.88"));
			// 设置多点广播数据的TTL为64
			socket.setOption(StandardSocketOptions.IP_MULTICAST_TTL, 64);
			// 设置多点广播所使用的网络接口
			socket.setOption(StandardSocketOptions.IP_MULTICAST_IF, netInterface);
			// 设置本DatagramSocket发送的数据报会被回送到自身
			socket.setOption(StandardSocketOptions.IP_MULTICAST_LOOP, true);
			// 将该socket加入指定的多点广播地址
			socket.joinGroup(group, netInterface);
			// 初始化发送用的DatagramSocket，它包含一个长度为0的字节数组
			outPacket = new DatagramPacket(new byte[0],
				0, mcastaddr, BROADCAST_PORT);
			// 启动以本实例的run()方法作为线程体的线程
			new Thread(this).start();
			// 不断读取键盘输入
			while (scan.hasNextLine())
			{
				// 将键盘输入的一行字符串转换字节数组
				byte[] buff = scan.nextLine().getBytes();
				// 设置发送用的DatagramPacket里的字节数据
				outPacket.setData(buff);
				// 发送数据报
				socket.send(outPacket);
			}
		}
		finally
		{
			socket.close();
		}
	}
	public void run()
	{
		try
		{
			while (true)
			{
				// 读取Socket中的数据，读到的数据放在inPacket所封装的字节数组里。
				socket.receive(inPacket);
				// 打印输出从socket中读取的内容
				System.out.println("聊天信息：" + new String(inBuff,
					0, inPacket.getLength()));
			}
		}
		// 捕捉异常
		catch (IOException ex)
		{
			ex.printStackTrace();
			try
			{
				if (socket != null)
				{
					// 让该Socket离开该多点IP广播地址
					socket.leaveGroup(group, netInterface);
					// 关闭该Socket对象
					socket.close();
				}
				System.exit(1);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws IOException
	{
		new MulticastTest().init();
	}
}