
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
public class UServer
{
	public static void main(String[] args) throws IOException
	{
		// 创建解码器
		var decoder = Charset.forName("utf-8").newDecoder();
		// 打开基于Unix domain socket的ServerSocketChannel
		var serverSocketChannel = ServerSocketChannel
			.open(StandardProtocolFamily.UNIX);
		// 定义Unix domain socket地址
		var socketAddr = UnixDomainSocketAddress.of("./fkjava.sock");
		// 绑定Unix domain socket地址
		serverSocketChannel.bind(socketAddr);
		while (true)
		{
			// 接受来自客户端的连接
			SocketChannel socketChannel = serverSocketChannel.accept();
			ByteBuffer buf = ByteBuffer.allocate(1024);
			// 读取数据
			while (socketChannel.read(buf) > 0)
			{
				buf.flip();
				// 解码、并输出读取得到的数据
				System.out.println(decoder.decode(buf));
				buf.clear();
			}
		}
	}
}
