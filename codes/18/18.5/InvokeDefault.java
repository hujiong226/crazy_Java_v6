
import java.lang.reflect.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2023, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks<br>
 * @version 1.0
 */
// ����ӿ�A���ýӿ��ж�������������
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
	// ��Ҫ������Ķ���
	private Object target;
	public void setTarget(Object target)
	{
		this.target = target;
	}

	// ִ�ж�̬�����������з���ʱ�����ᱻ�滻��ִ�����µ�invoke����
	public Object invoke(Object proxy, Method method, Object[] args)
		throws Throwable
	{
		// �������ִ�еķ�����Ĭ�Ϸ���
		if (method.isDefault())
		{
			// ʹ��invokeDefault����Ĭ�Ϸ����������������proxy������
			return InvocationHandler.invokeDefault(proxy, method, args);
		}
		// ��Ĭ�Ϸ�������Ȼʹ�ô�ͳ���÷�ʽ
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
				return name + "�����";
			}
			// ��д�ӿ��е�Ĭ�Ϸ���
			@Override
			public void defMtd(String msg)
			{
				System.out.println("��д��" + msg);
 			}
		});
		// ���ɶ�̬�������
		A a = (A) Proxy.newProxyInstance(A.class.getClassLoader(),
			new Class[]{A.class}, invocationHandler);
		System.out.println(a.mtd("�����"));   // ��
		a.defMtd("��ͨ��Ϣ");       // ��
	}
}
