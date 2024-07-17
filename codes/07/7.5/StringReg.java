
import java.util.*;
/**
 * Description:
 * ÍøÕ¾: <a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com ¹«ÖÚºÅ: fkbooks
 * @version 6.0
 */
public class StringReg
{
	public static void main(String[] args)
	{
		String[] msgs =
		{
			"Java has regular expressions in 1.4",
			"regular expressions now expressing in Java",
			"Java represses oracular expressions"
		};
		for (var msg : msgs)
		{
			System.out.println(msg.replaceFirst("re\\w*", "¹þ¹þ:)"));
			System.out.println(Arrays.toString(msg.split(" ")));
		}
	}
}
