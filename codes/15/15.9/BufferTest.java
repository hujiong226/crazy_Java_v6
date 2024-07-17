
import java.nio.*;
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
public class BufferTest
{
	public static void main(String[] args)
	{
		// 创建Buffer
		CharBuffer buff = CharBuffer.allocate(8);    // ①
		System.out.println("capacity: "	+ buff.capacity());
		System.out.println("limit: " + buff.limit());
		System.out.println("position: " + buff.position());
		// 放入元素
		buff.put('a');
		buff.put('b');
		buff.put('c');      // ②
		System.out.println("加入三个元素后，position = "
			+ buff.position());
		// 调用flip()方法
		buff.flip();	  // ③
		System.out.println("执行flip()后，limit = " + buff.limit());
		System.out.println("position = " + buff.position());
		// 取出第一个元素
		System.out.println("第一个元素(position=0)：" + buff.get());  // ④
		System.out.println("取出一个元素后，position = "
			+ buff.position());
		// 调用clear方法
		buff.clear();     // ⑤
		System.out.println("执行clear()后，limit = " + buff.limit());
		System.out.println("执行clear()后，position = "
			+ buff.position());
		System.out.println("执行clear()后，缓冲区内容并没有被清除："
			+ "第三个元素为：" + buff.get(2));    // ⑥
		System.out.println("执行绝对读取后，position = "
			+ buff.position());
char[] dstArray = new char[8];
// 读取buff中从索引1开始，长度为4的元素，
// 依次放入dstArray的从索引3处开始的位置
buff.get(1, dstArray, 3, 4);
// 下面输出[ ,  ,  , b, c,  ,  ,  ]
System.out.println(Arrays.toString(dstArray));
System.out.println("执行绝对读取后，position = "
+ buff.position()); // 输出0
// 将指定数组中从索引2处开始、长度为4的元素
// 依次放入buff从索引3处开始的位置
buff.put(3, "fkjava".toCharArray(), 2, 4);
// 下面输出abcjava
System.out.println(buff);
	}
}
