
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
public class Server
{
	public static void main(String[] args)
		throws Exception
	{
		var ss = new ServerSocket(30000);
		Socket socket = ss.accept();
		var ps = new PrintStream(socket.getOutputStream());
		ps.println("�������ĵ�һ������");
		ps.println("�������ĵڶ�������");
		// �ر�socket���������������������Ѿ�����
		socket.shutdownOutput();
		// ������佫���false������socket��δ�رա�
		System.out.println(socket.isClosed());
		var scan = new Scanner(socket.getInputStream());
		while (scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}
		scan.close();
		socket.close();
		ss.close();
	}
}
