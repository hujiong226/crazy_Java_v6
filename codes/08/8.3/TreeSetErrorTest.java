
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
class Err{}
public class TreeSetErrorTest
{
	public static void main(String[] args)
	{
		var ts = new TreeSet();
		// 向TreeSet集合中添加Err对象
		// 自然排序时，Err没实现Comparable接口将会引发错误
		ts.add(new Err());
	}
}
