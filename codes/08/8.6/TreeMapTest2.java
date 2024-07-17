
import java.util.*;
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
public class TreeMapTest2
{
	public static void main(String[] args)
	{
		var tm = new TreeMap();
		tm.put("疯狂Java讲义", 139.0);
		tm.put("轻量级Java Web企业应用实战", 128.0);
		tm.put("疯狂Spring Boot终极讲义", 169.0);
		// 为特定key-value重设value
		tm.computeIfPresent("疯狂Java讲义", (key, value) -> {
			double doubleVal = (double) value;
			return (doubleVal > 130) ? doubleVal * 0.8 : doubleVal * 0.9;
		});
		System.out.println(tm);
		// 下面代码会引发异常
		tm.computeIfAbsent("疯狂iOS讲义", (key) -> {
			// 修改Map
			tm.put("疯狂Python讲义", 129.0);  // ①
			return 103.3;
		});
	}
}