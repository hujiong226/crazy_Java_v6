
import java.io.*;
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
public class WriteTeacher
{
	public static void main(String[] args)
	{
		try (
			// 创建一个ObjectOutputStream输出流
			var oos = new ObjectOutputStream(new FileOutputStream("teacher.txt")))
		{
			var per = new Person("孙悟空", 500);
			var t1 = new Teacher("唐僧", per);
			var t2 = new Teacher("菩提祖师", per);
			// 依次将四个对象写入输出流
			oos.writeObject(t1);
			oos.writeObject(t2);
			oos.writeObject(per);
			oos.writeObject(t2);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

