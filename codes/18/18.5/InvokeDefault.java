
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
// 定义接口A，该接口中定义了两个方法
interface A
{
	String mtd(String name);
	default void defMtd(String msg)
	{
		System.out.println(msg);
	}
}
class MyInvokationHandler implements InvocationHandler
{
	// 需要被代理的对象
	private Object target;
	public void setTarget(Object target)
	{
		this.target = target;
	}

	// 执行动态代理对象的所有方法时，都会被替换成执行如下的invoke方法
	public Object invoke(Object proxy, Method method, Object[] args)
		throws Throwable
	{
		// 如果正在执行的方法是默认方法
		if (method.isDefault())
		{
			// 使用invokeDefault调用默认方法，留意调用者是proxy（代理）
			return InvocationHandler.invokeDefault(proxy, method, args);
		}
		// 非默认方法，依然使用传统调用方式
		return method.invoke(target, args);
	}
}
public class InvokeDefault
{
	public static void main(String[] args)
	{
		var invocationHandler = new MyInvokationHandler();
		invocationHandler.setTarget(new A(){
			@Override
			public String mtd(String name)
			{
				return name + "，你好";
			}
			// 重写接口中的默认方法
			@Override
			public void defMtd(String msg)
			{
				System.out.println("重写：" + msg);
 			}
		});
		// 生成动态代理对象
		A a = (A) Proxy.newProxyInstance(A.class.getClassLoader(),
			new Class[]{A.class}, invocationHandler);
		System.out.println(a.mtd("孙悟空"));   // ①
		a.defMtd("普通消息");       // ②
	}
}
