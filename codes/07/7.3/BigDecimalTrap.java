
import java.math.*;
/**
 * Description:
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks
 * @version 6.0
 */
public class BigDecimalTrap
{
	public static void main(String[] args)
	{
		var f1 = new BigDecimal("2.0");
		var f2 = new BigDecimal("2");
		System.out.println(f1.equals(f2)); // 输出false
		var f3 = new BigDecimal("0.00");
		System.out.println(f3.equals(BigDecimal.ZERO)); // 输出false
		System.out.println(f1.compareTo(f2));  // 输出0
		System.out.println(f3.compareTo(BigDecimal.ZERO));  // 输出0
	}
}
