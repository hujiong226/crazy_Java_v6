

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
class CacheImmutable
{
	private static int MAX_SIZE = 10;
	// ʹ���������������е�ʵ��
	private static CacheImmutable[] cache
		= new CacheImmutable[MAX_SIZE];
	// ��¼����ʵ���ڻ����е�λ��,cache[pos-1]�����»����ʵ��
	private static int pos = 0;
	private final String name;
	private CacheImmutable(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public static CacheImmutable valueOf(String name)
	{
		// �����ѻ���Ķ���
		for (var i = 0; i < MAX_SIZE; i++)
		{
			// ���������ͬʵ����ֱ�ӷ��ظû����ʵ��
			if (cache[i] != null
				&& cache[i].getName().equals(name))
			{
				return cache[i];
			}
		}
		// ������������
		if (pos == MAX_SIZE)
		{
			// �ѻ���ĵ�һ�����󸲸ǣ����Ѹո����ɵĶ�����ڻ���ص��ʼλ�á�
			cache[0] = new CacheImmutable(name);
			// ��pos��Ϊ1
			pos = 1;
		}
		else
		{
			// ���´����Ķ��󻺴�������pos��1
			cache[pos++] = new CacheImmutable(name);
		}
		return cache[pos - 1];

	}
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj != null && obj.getClass() == CacheImmutable.class)
		{
			var ci = (CacheImmutable) obj;
			return name.equals(ci.getName());
		}
		return false;
	}
	public int hashCode()
	{
		return name.hashCode();
	}
}
public class CacheImmutableTest
{
	public static void main(String[] args)
	{
		var c1 = CacheImmutable.valueOf("hello");
		var c2 = CacheImmutable.valueOf("hello");
		// ������뽫���true
		System.out.println(c1 == c2);
	}
}