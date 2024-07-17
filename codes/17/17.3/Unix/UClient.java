
import java.net.*;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2023, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks<br>
 * @version 1.0
 */
public class UClient
{
	public static void main(String[] args) throws IOException
	{
		// 打开基于Unix domain socket的SocketChannel
		var socketChannel = SocketChannel.open(StandardProtocolFamily.UNIX);
		// 定义Unix domain socket地址（与服务器端地址相同）
		var socketAddr  = UnixDomainSocketAddress.of("./fkjava.sock");
		// 简历连接
		socketChannel.connect(socketAddr);
		String data = "疯狂Java讲义的Unix domain socket测试..."
			+ System.currentTimeMillis();
		// 创建ByteBuffer
		ByteBuffer buf = ByteBuffer.allocate(1204);
		buf.clear();
		// 将要发送的数据放入ByteBuffer
		buf.put(data.getBytes(Charset.forName("utf-8")));
		buf.flip();
		while (buf.hasRemaining())
		{
			// 发送数据
			socketChannel.write(buf);
		}
		socketChannel.close();
	}
}
