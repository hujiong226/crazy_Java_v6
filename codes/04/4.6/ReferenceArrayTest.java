

/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks
 * @version 6.0
 */

class Person
{
	public int age; // ����
	public double height; // ����
	// ����һ��info����
	public void info()
	{
		System.out.println("�ҵ������ǣ�" + age
			+ "���ҵ������ǣ�" + height);
	}
}
public class ReferenceArrayTest
{
	public static void main(String[] args)
	{
		// ����һ��students�����������������Person[]
		Person[] students;
		// ִ�ж�̬��ʼ��
		students = new Person[2];
		// ����һ��Personʵ�����������Personʵ������zhang����
		var zhang = new Person();
		// Ϊzhang�����õ�Person�����age��height��ֵ
		zhang.age = 15;
		zhang.height = 158;
		// ����һ��Personʵ�����������Personʵ������lee����
		var lee = new Person();
		// Ϊlee�����õ�Person�����age��height��ֵ
		lee.age = 16;
		lee.height = 161;
		// ��zhang������ֵ������һ������Ԫ��
		students[0] = zhang;
		// ��lee������ֵ�����ڶ�������Ԫ��
		students[1] = lee;
		// �������д���Ľ����ȫһ������Ϊlee
		// ��students[1]ָ�����ͬһ��Personʵ����
		lee.info();
		students[1].info();
	}
}