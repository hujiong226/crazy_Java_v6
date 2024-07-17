
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
public class UClient
{
	public static void main(String[] args) throws IOException
	{
		// �򿪻���Unix domain socket��SocketChannel
		var socketChannel = SocketChannel.open(StandardProtocolFamily.UNIX);
		// ����Unix domain socket��ַ����������˵�ַ��ͬ��
		var socketAddr  = UnixDomainSocketAddress.of("./fkjava.sock");
		// ��������
		socketChannel.connect(socketAddr);
		String data = "���Java�����Unix domain socket����..."
			+ System.currentTimeMillis();
		// ����ByteBuffer
		ByteBuffer buf = ByteBuffer.allocate(1204);
		buf.clear();
		// ��Ҫ���͵����ݷ���ByteBuffer
		buf.put(data.getBytes(Charset.forName("utf-8")));
		buf.flip();
		while (buf.hasRemaining())
		{
			// ��������
			socketChannel.write(buf);
		}
		socketChannel.close();
	}
}
