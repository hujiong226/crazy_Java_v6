
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
public class SynchronizedTest
{
	public static void main(String[] args)
	{
		// 下面程序创建了四个线程安全的集合对象
		var c = Collections
			.synchronizedCollection(new ArrayList());
		var list = Collections.synchronizedList(new ArrayList());
		var s = Collections.synchronizedSet(new HashSet());
		var m = Collections.synchronizedMap(new HashMap());
	}
}
