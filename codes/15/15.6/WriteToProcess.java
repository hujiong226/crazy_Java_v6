
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
public class WriteToProcess
{
	public static void main(String[] args)
		throws IOException
	{
		// ����java ReadStandard����������и�������ӽ���
		Process p = Runtime.getRuntime().exec("java ReadStandard");
		try (
			// ��p���̵����������PrintStream����
			// ���������Ա����������������p��������������
			var ps = new PrintStream(p.getOutputStream()))
		{
			// ��ReadStandard����д�����ݣ���Щ���ݽ���ReadStandard��ȡ
			ps.println("��ͨ�ַ���");
			ps.println(new WriteToProcess());
		}
	}
}
// ����һ��ReadStandard�࣬������Խ��ܱ�׼���룬
// ������׼����д��out.txt�ļ���
class ReadStandard
{
	public static void main(String[] args)
	{
		try (
			// ʹ��System.in����Scanner�������ڻ�ȡ��׼����
			var sc = new Scanner(System.in);
			var ps = new PrintStream(new FileOutputStream("out.txt")))
		{
			// ��������һ�н�ֻ�ѻس���Ϊ�ָ���
			sc.useDelimiter("\n");
			// �ж��Ƿ�����һ��������
			while (sc.hasNext())
			{
				// ���������
				ps.println("��������������ǣ�" + sc.next());
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}