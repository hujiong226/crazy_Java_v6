
import java.lang.reflect.*;
import java.util.*;
/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks
 * @version 1.0
 */
public class NestTest
{
	public class InA
	{
		// 内部类的两个private成员
		private int age = 2;
		private void foo()
		{
			System.out.println("private的foo方法");
		}
	}
	public class InB
	{
		// 内部类的两个private成员
		private String name = "疯狂Java";
		private void bar() throws Exception
		{
			InA a = new InA();
			// 访问另外一个内部类的private成员，完全没问题
			a.age = 20;
			System.out.println(a.age);
			a.foo();
			System.out.println("private的bar方法");
			// 通过反射访问另外一个内部类的private成员
			// 在Java 11之前报错，Java 11之后没有问题
			Field f = InA.class.getDeclaredField("age");
			f.set(a, 29);           // ①
			System.out.println(f.get(a));    // ②
			Method m = InA.class.getDeclaredMethod("foo");
			m.invoke(a);            // ③
		}
	}
	public void info() throws Exception
	{
		InB b = new InB();
		// 外部类访问内部类的private成员，完全没问题
		b.name = "crazyit.org";
		System.out.println(b.name);
		b.bar();
		// 外部类通过反射访问内部类的private成员
		// 在Java 11之前报错，Java 11之后没有问题
		Field f = InB.class.getDeclaredField("name");
		f.set(b, "fkjava.org");           // ④
		System.out.println(f.get(b));     // ⑤
		Method m = InB.class.getDeclaredMethod("bar");
		m.invoke(b);            // ⑥
	}
	public static void main(String[] args) throws Exception
	{
		new NestTest().info();
		// 获取NestTest的嵌套属主类，由于它自身就是外部类，因此返回它自身（NestTest）
		System.out.println(NestTest.class.getNestHost());
		// 获取NestTest.InA的嵌套属主类，返回NestTest类
		System.out.println(Class.forName("NestTest$InA").getNestHost());
		// 获取NestTest的所有嵌套成员，将会看到NestTest、InA、InB三个嵌套成员
		System.out.println(Arrays.toString(NestTest.class.getNestMembers()));
		// 判断NestTest.InA是否为NestTest.InB的嵌套同伴，返回true
		System.out.println(Class.forName("NestTest$InA")
			.isNestmateOf(Class.forName("NestTest$InB")));
	}
}