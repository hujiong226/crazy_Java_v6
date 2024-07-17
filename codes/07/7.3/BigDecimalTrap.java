
import java.math.*;
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
public class BigDecimalTrap
{
	public static void main(String[] args)
	{
		var f1 = new BigDecimal("2.0");
		var f2 = new BigDecimal("2");
		System.out.println(f1.equals(f2)); // ���false
		var f3 = new BigDecimal("0.00");
		System.out.println(f3.equals(BigDecimal.ZERO)); // ���false
		System.out.println(f1.compareTo(f2));  // ���0
		System.out.println(f3.compareTo(BigDecimal.ZERO));  // ���0
	}
}
