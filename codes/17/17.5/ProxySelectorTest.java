
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
public class ProxySelectorTest
{
	// �����Ǵ����������ĵ�ַ�Ͷ˿ڣ�
	// ���һ�������������ĵ�ַ�Ͷ˿�
	final String PROXY_ADDR = "139.82.12.188";
	final int PROXY_PORT = 3124;
	// ������Ҫ���ʵ���վ��ַ
	String urlStr = "http://www.fkjava.org";
	public void init() throws IOException, MalformedURLException
	{
		// ע��Ĭ�ϵĴ���ѡ����
		ProxySelector.setDefault(new ProxySelector()
		{
			@Override
			public void connectFailed(URI uri,
				SocketAddress sa, IOException ioe)
			{
				System.out.println("�޷����ӵ�ָ��������������");
			}
			// ����"ҵ����Ҫ"�����ض��Ķ�Ӧ�Ĵ���������
			@Override
			public List<Proxy> select(URI uri)
			{
				// ���������Ƿ���ĳ���̶��Ĵ�����������
				List<Proxy> result = new ArrayList<>();
				result.add(new Proxy(Proxy.Type.HTTP,
					new InetSocketAddress(PROXY_ADDR, PROXY_PORT)));
				return result;
			}
		});
		var url = new URL(urlStr);
		// û��ָ��������������ֱ�Ӵ�����
		URLConnection conn = url.openConnection();   // ��
		// ���ó�ʱʱ����
		conn.setConnectTimeout(3000);
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
		new ProxySelectorTest().init();
	}
}