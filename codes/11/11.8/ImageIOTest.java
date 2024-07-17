
import javax.imageio.*;
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
public class ImageIOTest
{
	public static void main(String[] args)
	{
		String[] readFormat = ImageIO.getReaderFormatNames();
		System.out.println("-----ImageIO�ܶ�������ͼ���ļ���ʽ-----");
		for (var tmp : readFormat)
		{
			System.out.println(tmp);
		}
		String[] writeFormat = ImageIO.getWriterFormatNames();
		System.out.println("-----ImageIO��д������ͼ���ļ���ʽ-----");
		for (var tmp : writeFormat)
		{
			System.out.println(tmp);
		}
	}
}
