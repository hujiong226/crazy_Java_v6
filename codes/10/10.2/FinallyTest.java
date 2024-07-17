
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
public class FinallyTest
{
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("noexist.txt");
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
			// return���ǿ�Ʒ�������
			return;       // ��
			// ʹ��exit���˳������
			// System.exit(1);     // ��
		}
		finally
		{
			// �رմ����ļ���������Դ
			if (fis != null)
			{
				try
				{
					fis.close();
				}
				catch (IOException ioe)
				{
					ioe.printStackTrace();
				}
			}
			System.out.println("ִ��finally�������Դ����!");
		}
	}
}