
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
// �����ܷ�ӿ�
sealed interface Celestial
{
	void fly();
}
// �ܷ�ӿڵ��ӽӿڣ�ֻ����sealed��non-sealed���Ρ�
non-sealed interface Artificial extends Celestial {}
non-sealed class Star implements Celestial
{
	public void fly()
	{
		System.out.println("��������ϵ��ת��");
	}
}
final class Planet implements Celestial {
	public void fly()
	{
		System.out.println("�����ƺ���ת��");
	}
}
