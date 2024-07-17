
import java.lang.reflect.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2023, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks<br>
 * @version 1.0
 */
interface A
{
	default void defMtd(String msg)
	{
		System.out.println("A接口中的default方法: " + msg);
	}
	String m(String name);
}
// 定义B接口，继承A接口
interface B extends A
{
	@Override
	default void defMtd(String msg)
	{
		System.out.println("B接口重写的default方法: " + msg);
	}
}
public class InvokeDefault2
{
	public static void main(String[] args)
	{
		B b = (B) Proxy.newProxyInstance(B.class.getClassLoader(),
			new Class<?>[] { B.class }, (proxy, method, params) -> {
				// 如果正在执行的方法是默认方法
				if (method.isDefault())
				{
					// 使用invokeDefault调用默认方法，留意调用者是proxy（代理）
					return InvocationHandler.invokeDefault(proxy, method, params);
				}
				return null;
		});
		b.defMtd("普通消息");
	}
}
