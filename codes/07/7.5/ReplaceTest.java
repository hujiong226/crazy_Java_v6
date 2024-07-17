
import java.util.regex.*;
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
public class ReplaceTest
{
	public static void main(String[] args)
	{
		String[] msgs =
		{
			"Java has regular expressions in 1.4",
			"regular expressions now expressing in Java",
			"Java represses oracular expressions"
		};
		var p = Pattern.compile("re\\w*");
		Matcher matcher = null;
		for (var i = 0; i < msgs.length; i++)
		{
			if (matcher == null)
			{
				matcher = p.matcher(msgs[i]);
			}
			else
			{
				matcher.reset(msgs[i]);
			}
			System.out.println(matcher.replaceAll("¹þ¹þ:)"));
		}
	}
}
