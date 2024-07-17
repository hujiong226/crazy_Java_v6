
import java.net.*;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2023, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks<br>
 * @version 1.0
 */
public class UServer
{
	public static void main(String[] args) throws IOException
	{
		// ����������
		var decoder = Charset.forName("utf-8").newDecoder();
		// �򿪻���Unix domain socket��ServerSocketChannel
		var serverSocketChannel = ServerSocketChannel
			.open(StandardProtocolFamily.UNIX);
		// ����Unix domain socket��ַ
		var socketAddr = UnixDomainSocketAddress.of("./fkjava.sock");
		// ��Unix domain socket��ַ
		serverSocketChannel.bind(socketAddr);
		while (true)
		{
			// �������Կͻ��˵�����
			SocketChannel socketChannel = serverSocketChannel.accept();
			ByteBuffer buf = ByteBuffer.allocate(1024);
			// ��ȡ����
			while (socketChannel.read(buf) > 0)
			{
				buf.flip();
				// ���롢�������ȡ�õ�������
				System.out.println(decoder.decode(buf));
				buf.clear();
			}
		}
	}
}
