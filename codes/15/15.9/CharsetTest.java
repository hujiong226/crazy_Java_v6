
import java.nio.charset.*;
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
public class CharsetTest
{
	public static void main(String[] args)
	{
		// 获取Java支持的全部字符集
		Charset.availableCharsets()
			.forEach((alias, charset) -> {
			// 输出字符集的别名和对应的Charset对象
			System.out.println(alias + "----->"
				+ charset);
		});
	}
}
