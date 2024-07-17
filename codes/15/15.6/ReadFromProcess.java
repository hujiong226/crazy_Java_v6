
import java.io.*;
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
public class ReadFromProcess
{
	public static void main(String[] args)
		throws IOException
	{
		// ����javac����������и�������ӽ���
		Process p = Runtime.getRuntime().exec("javac");
		try (
			// ��p���̵�����������BufferedReader����
			// ����������Ա�����������������p�������������
			var br = new BufferedReader(new
				InputStreamReader(p.getInputStream())))
		{
			String buff = null;
			// ��ȡѭ����ʽ����ȡp���̵Ĵ������
			while ((buff = br.readLine()) != null)
			{
				System.out.println(buff);
			}
		}
	}
}
