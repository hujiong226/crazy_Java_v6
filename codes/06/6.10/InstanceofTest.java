
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
interface Foo {}
class Bar {} // ���ಢδʵ��Foo�ӿ�
public class InstanceofTest
{
	public void test(Bar b)
	{
		if (b instanceof Foo f)
		{
			System.out.println(b + "��Foo���ͣ���ת��Ϊ" + f);
		}
	}
}
class Baz extends Bar implements Foo{}