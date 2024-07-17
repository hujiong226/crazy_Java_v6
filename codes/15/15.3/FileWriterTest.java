
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
public class FileWriterTest
{
	public static void main(String[] args)
	{
		try (
			var fw = new FileWriter("poem.txt"))
		{
			fw.write("��ɪ - ������\r\n");
			fw.write("��ɪ�޶���ʮ�ң�һ��һ��˼���ꡣ\r\n");
			fw.write("ׯ�������Ժ��������۴����жž顣\r\n");
			fw.write("�׺����������ᣬ������ů�����̡�\r\n");
			fw.write("����ɴ���׷�䣬ֻ�ǵ�ʱ���Ȼ��\r\n");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}