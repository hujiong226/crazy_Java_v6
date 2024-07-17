
import java.io.*;
import java.net.*;
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
public class ProxyTest
{
	// �����Ǵ����������ĵ�ַ�Ͷ˿ڣ�
	// ����ʵ����Ч�Ĵ����������ĵ�ַ�Ͷ˿�
	final String PROXY_ADDR = "129.82.12.188";
	final int PROXY_PORT = 3124;
	// ������Ҫ���ʵ���վ��ַ
	String urlStr = "http://www.fkjava.org";
	public void init() throws IOException, MalformedURLException
	{
		var url = new URL(urlStr);
		// ����һ����������������
		Proxy proxy = new Proxy(Proxy.Type.HTTP,
			new InetSocketAddress(PROXY_ADDR, PROXY_PORT));
		// ʹ��ָ���Ĵ���������������
		URLConnection conn = url.openConnection(proxy);
		// ���ó�ʱʱ����
		conn.setConnectTimeout(5000);
		try (
			// ͨ��������������ȡ���ݵ�Scanner
			var scan = new Scanner(conn.getInputStream(), "utf-8");
			var ps = new PrintStream("index.html"))
		{
			while (scan.hasNextLine())
			{
				String line = scan.nextLine();
				// �ڿ���̨�����ҳ��Դ����
				System.out.println(line);
				// ����ҳ��Դ���������ָ�������
				ps.println(line);
			}
		}
	}
	public static void main(String[] args)
		throws IOException, MalformedURLException
	{
		new ProxyTest().init();
	}
}