
import java.io.*;
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
public class ReplaceTest
{
	public static void main(String[] args)
	{
		try (
			// 创建一个ObjectOutputStream输出流
			var oos = new ObjectOutputStream(new FileOutputStream("replace.txt"));
			// 创建一个ObjectInputStream输入流
			var ois = new ObjectInputStream(new FileInputStream("replace.txt")))
		{
			var per = new Person("孙悟空", 500);
			// 系统将per对象转换字节序列并输出
			oos.writeObject(per);
			// 反序列化读取得到的是ArrayList
			var list = (ArrayList) ois.readObject();
			System.out.println(list);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}

