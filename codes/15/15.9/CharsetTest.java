
import java.nio.charset.*;
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
public class CharsetTest
{
	public static void main(String[] args)
	{
		// ��ȡJava֧�ֵ�ȫ���ַ���
		Charset.availableCharsets()
			.forEach((alias, charset) -> {
			// ����ַ����ı����Ͷ�Ӧ��Charset����
			System.out.println(alias + "----->"
				+ charset);
		});
	}
}
