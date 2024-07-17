
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
public class AccessExceptionMsg
{
	public static void main(String[] args)
	{
		try
		{
			var fis = new FileInputStream("noexist.txt");
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
	}
}
