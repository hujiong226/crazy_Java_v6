
import static java.lang.System.*;
import static java.lang.Math.*;
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

public class StaticImportTest
{
	public static void main(String[] args)
	{
		// out��java.lang.System��ľ�̬��Ա�����������׼���
		// PI��java.lang.Math��ľ�̬��Ա��������ʾ�г���
		out.println(PI);
		// ֱ�ӵ���Math���sqrt��̬����
		out.println(sqrt(256));
	}
}
