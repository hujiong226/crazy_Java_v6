
import java.net.*;
import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.util.concurrent.*;
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
public class AIOServer
{
	static final int PORT = 30000;
	final static String UTF_8 = "utf-8";
	static List<AsynchronousSocketChannel> channelList
		= new ArrayList<>();
	public void startListen() throws InterruptedException, Exception
	{
		// ����һ���̳߳�
		ExecutorService executor = Executors.newFixedThreadPool(20);
		// ��ָ���̳߳�������һ��AsynchronousChannelGroup
		AsynchronousChannelGroup channelGroup = AsynchronousChannelGroup
			.withThreadPool(executor);
		// ��ָ���̳߳�������һ��AsynchronousServerSocketChannel
		AsynchronousServerSocketChannel serverChannel
			= AsynchronousServerSocketChannel.open(channelGroup)
			// ָ������������PORT�˿�
			.bind(new InetSocketAddress(PORT));
		// ʹ��CompletionHandler�������Կͻ��˵���������
		serverChannel.accept(null, new AcceptHandler(serverChannel));  // ��
		Thread.sleep(100000);
	}
	public static void main(String[] args) throws Exception
	{
		var server = new AIOServer();
		server.startListen();
	}
}
// ʵ���Լ���CompletionHandler��
class AcceptHandler implements
	CompletionHandler<AsynchronousSocketChannel, Object>
{
	private AsynchronousServerSocketChannel serverChannel;
	public AcceptHandler(AsynchronousServerSocketChannel sc)
	{
		this.serverChannel = sc;
	}
	// ����һ��ByteBuffer׼����ȡ����
	ByteBuffer buff = ByteBuffer.allocate(1024);
	// ��ʵ��IO�������ʱ�����÷���
	@Override
	public void completed(final AsynchronousSocketChannel sc,
		Object attachment)
	{
		// ��¼�����ӽ�����Channel
		AIOServer.channelList.add(sc);
		// ׼�����տͻ��˵���һ������
		serverChannel.accept(null, this);
		sc.read(buff, null,
			new CompletionHandler<Integer,Object>()   // ��
		{
			@Override
			public void completed(Integer result,
				Object attachment)
			{
				buff.flip();
				// ��buff�е�����ת��Ϊ�ַ���
				String content = StandardCharsets.UTF_8
					.decode(buff).toString();
				// ����ÿ��Channel�����յ�����Ϣд���Channel��
				for (AsynchronousSocketChannel c : AIOServer.channelList)
				{
					try
					{
						c.write(ByteBuffer.wrap(content.getBytes(
							AIOServer.UTF_8))).get();
					}
					catch (Exception ex)
					{
						ex.printStackTrace();
					}
				}
				buff.clear();
				// ��ȡ��һ������
				sc.read(buff, null, this);
			}
			@Override
			public void failed(Throwable ex, Object attachment)
			{
				System.out.println("��ȡ����ʧ��: " + ex);
				// �Ӹ�Channel�ж�ȡ����ʧ�ܣ��ͽ���Channelɾ��
				AIOServer.channelList.remove(sc);
			}
		});
	}
	@Override
	public void failed(Throwable ex, Object attachment)
	{
		System.out.println("����ʧ��: " + ex);
	}
}