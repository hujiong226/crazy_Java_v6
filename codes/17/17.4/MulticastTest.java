
import java.net.*;
import java.io.*;
import java.util.*;
/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks
 * @version 6.0
 */
// �ø���ʵ��Runnable�ӿڣ������ʵ������Ϊ�̵߳�target
public class MulticastTest implements Runnable
{
	// ʹ�ó�����Ϊ������Ķ��㲥IP��ַ
	private static final String BROADCAST_IP
		= "230.0.0.1";
	// ʹ�ó�����Ϊ������Ķ��㲥Ŀ�ĵĶ˿�
	public static final int BROADCAST_PORT = 30000;
	// ����ÿ�����ݱ�������СΪ4K
	private static final int DATA_LEN = 4096;
	//���屾�����DatagramSocketʵ������ʵ�ֶ��㲥����
	private DatagramSocket socket = null;
	private SocketAddress group = null;
	private NetworkInterface netInterface;
	private Scanner scan = null;
	// ��������������ݵ��ֽ�����
	byte[] inBuff = new byte[DATA_LEN];
	// ��ָ���ֽ����鴴��׼���������ݵ�DatagramPacket����
	private DatagramPacket inPacket
		= new DatagramPacket(inBuff, inBuff.length);
	// ����һ�����ڷ��͵�DatagramPacket����
	private DatagramPacket outPacket = null;
	public void init() throws IOException
	{
		try (
			// ��������������
			var scan = new Scanner(System.in))
		{
			// �������ڷ��͡��������ݵ�DatagramSocket����
			// ������Ҫ�ڸö˿����ж���ͻ��ˣ����Ҫ���øö˿�
			socket = new DatagramSocket(null); // �Ȳ��󶨶˿�
			socket.setReuseAddress(true); // �ڰ󶨶˿�֮ǰ���ø��øõ�ַ
			socket.bind(new InetSocketAddress(BROADCAST_PORT)); // �󶨶˿�
			var mcastaddr = InetAddress.getByName(BROADCAST_IP);
			// �������㲥��
			group = new InetSocketAddress(mcastaddr, 0);
			// ��ȡ����������ӿڣ�������
			netInterface = NetworkInterface.getByInetAddress(
				InetAddress.getByName("192.168.1.88"));
			// ���ö��㲥���ݵ�TTLΪ64
			socket.setOption(StandardSocketOptions.IP_MULTICAST_TTL, 64);
			// ���ö��㲥��ʹ�õ�����ӿ�
			socket.setOption(StandardSocketOptions.IP_MULTICAST_IF, netInterface);
			// ���ñ�DatagramSocket���͵����ݱ��ᱻ���͵�����
			socket.setOption(StandardSocketOptions.IP_MULTICAST_LOOP, true);
			// ����socket����ָ���Ķ��㲥��ַ
			socket.joinGroup(group, netInterface);
			// ��ʼ�������õ�DatagramSocket��������һ������Ϊ0���ֽ�����
			outPacket = new DatagramPacket(new byte[0],
				0, mcastaddr, BROADCAST_PORT);
			// �����Ա�ʵ����run()������Ϊ�߳�����߳�
			new Thread(this).start();
			// ���϶�ȡ��������
			while (scan.hasNextLine())
			{
				// �����������һ���ַ���ת���ֽ�����
				byte[] buff = scan.nextLine().getBytes();
				// ���÷����õ�DatagramPacket����ֽ�����
				outPacket.setData(buff);
				// �������ݱ�
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
				// ��ȡSocket�е����ݣ����������ݷ���inPacket����װ���ֽ������
				socket.receive(inPacket);
				// ��ӡ�����socket�ж�ȡ������
				System.out.println("������Ϣ��" + new String(inBuff,
					0, inPacket.getLength()));
			}
		}
		// ��׽�쳣
		catch (IOException ex)
		{
			ex.printStackTrace();
			try
			{
				if (socket != null)
				{
					// �ø�Socket�뿪�ö��IP�㲥��ַ
					socket.leaveGroup(group, netInterface);
					// �رո�Socket����
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