
import java.util.*;
import java.text.*;
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
public class NumberFormatTest
{
	public static void main(String[] args)
	{
		// 需要被格式化的数字
		var db = 1234000.567;
		// 创建四个Locale，分别代表中国、日本、德国、美国
		Locale[] locales = {Locale.CHINA, Locale.JAPAN,
			Locale.GERMAN, Locale.US};
		var nf = new NumberFormat[16];
		// 为上面四个Locale创建16个NumberFormat对象
		// 每个Locale分别有通用数值格式器、百分比格式器、货币格式器
		for (var i = 0; i < locales.length; i++)
		{
			nf[i * 4] = NumberFormat.getNumberInstance(locales[i]);
			nf[i * 4 + 1] = NumberFormat.getPercentInstance(locales[i]);
			nf[i * 4 + 2] = NumberFormat.getCurrencyInstance(locales[i]);
			nf[i * 4 + 3] = NumberFormat.getCompactNumberInstance(locales[i],
				NumberFormat.Style.SHORT);
		}
		for (var i = 0; i < locales.length; i++)
		{
			var tip = i == 0 ? "----中国的格式----" :
				i == 1 ? "----日本的格式----" :
				i == 2 ? "----德国的格式----" :"----美国的格式----";
			System.out.println(tip);
			System.out.println("通用数值格式："
				+ nf[i * 4].format(db));
			System.out.println("百分比数值格式："
				+ nf[i * 4 + 1].format(db));
			System.out.println("货币数值格式："
				+ nf[i * 4 + 2].format(db));
			System.out.println("紧凑数值格式："
				+ nf[i * 4 + 3].format(db));
		}
	}
}

