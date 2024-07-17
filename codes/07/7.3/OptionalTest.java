
import java.util.Optional;
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
public class OptionalTest
{
	public static void main(String[] args)
	{
		test("fkjava");
		System.out.println("-------");
		test(null);
	}
	public static void test(String st)
	{
		var op = Optional.ofNullable(st);
		// ������װ�ı�����Ϊnullʱ��ִ��Lambda���ʽ
		op.ifPresent(s -> System.out.println(s.length()));
		// ������װ�ı�����Ϊnullʱִ�е�1��Lambda���ʽ
		// ����ִ�е�2��Lambda���ʽ
		op.ifPresentOrElse(s -> System.out.println(s.length()),
			() -> System.out.println("Ϊ��"));
		// �������װ�ı�����Ϊnull�����ر���װ�ı��������򷵻�Ĭ��ֵ
		System.out.println(op.orElse("Ĭ��ֵ"));
		// �������װ�ı�����Ϊnull���򷵻�true
		System.out.println(op.isPresent());
		// �������װ�ı���Ϊnull���򷵻�true
		System.out.println(op.isEmpty());
	}
}