
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
interface A
{
	default void defMtd(String msg)
	{
		System.out.println("A�ӿ��е�default����: " + msg);
	}
	String m(String name);
}
// ����B�ӿڣ��̳�A�ӿ�
interface B extends A
{
	@Override
	default void defMtd(String msg)
	{
		System.out.println("B�ӿ���д��default����: " + msg);
	}
}
public class InvokeDefault2
{
	public static void main(String[] args)
	{
		B b = (B) Proxy.newProxyInstance(B.class.getClassLoader(),
			new Class<?>[] { B.class }, (proxy, method, params) -> {
				// �������ִ�еķ�����Ĭ�Ϸ���
				if (method.isDefault())
				{
					// ʹ��invokeDefault����Ĭ�Ϸ����������������proxy������
					return InvocationHandler.invokeDefault(proxy, method, params);
				}
				return null;
		});
		b.defMtd("��ͨ��Ϣ");
	}
}
