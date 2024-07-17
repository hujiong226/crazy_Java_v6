
import java.util.*;
import static java.util.Calendar.*;

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
public class LenientTest
{
	public static void main(String[] args)
	{
		var cal = Calendar.getInstance();
		// �����YEAR�ֶμ�1��MONTH�ֶ�Ϊ1�����£�
		cal.set(MONTH, 13);   // ��
		System.out.println(cal.getTime());
		// �ر��ݴ���
		cal.setLenient(false);
		// ��������ʱ�쳣
		cal.set(MONTH, 13);   // ��
		System.out.println(cal.getTime());
	}
}