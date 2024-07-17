
import java.util.*;
import java.io.*;
import java.lang.reflect.*;
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
public class ExtendedObjectPoolFactory
{
	// ����һ������أ�ǰ���Ƕ�������������ʵ�ʶ���
	private Map<String, Object> objectPool = new HashMap<>();
	private Properties config = new Properties();
	// ��ָ�������ļ��г�ʼ��Properties����
	public void init(String fileName)
	{
		try (
			var fis = new FileInputStream(fileName))
		{
			config.load(fis);
		}
		catch (IOException ex)
		{
			System.out.println("��ȡ" + fileName + "�쳣");
		}
	}
	// ����һ����������ķ���
	// �÷���ֻҪ����һ���ַ���������������Ը��ݸ���������Java����
	private Object createObject(String clazzName)
		throws Exception
	{
		// �����ַ�������ȡ��Ӧ��Class����
		Class<?> clazz = Class.forName(clazzName);
		// ʹ��clazz��Ӧ���Ĭ�Ϲ���������ʵ��
		return clazz.getConstructor().newInstance();
	}
	// �÷�������ָ���ļ�����ʼ�������
	// ������������ļ�����������
	public void initPool() throws Exception
	{
		for (var name : config.stringPropertyNames())
		{
			// ÿȡ��һ��key-value�ԣ����key�в������ٷֺţ�%��
			// ��ͱ����Ǹ���value������һ������
			// ����createObject�������󣬲����������ӵ��������
			if (!name.contains("%"))
			{
				objectPool.put(name, createObject(config.getProperty(name)));
			}
		}
	}
	// �÷���������������ļ�������ָ�������setter����
	public void initProperty() throws InvocationTargetException,
		IllegalAccessException, NoSuchMethodException
	{
		for (var name : config.stringPropertyNames())
		{
			// ÿȡ��һ��key-value�ԣ����key�а����ٷֺţ�%��
			// ������Ϊ��key���ڿ��Ƶ��ö����setter��������ֵ
			// %ǰ��Ϊ�������֣�������setter������
			if (name.contains("%"))
			{
				// �������ļ��е�key��%�ָ�
				String[] objAndProp = name.split("%");
				// ȡ������setter�����Ĳ���ֵ
				Object target = getObject(objAndProp[0]);
				// ��ȡsetter������:set + "����ĸ��д" + ʣ�²���
				String mtdName = "set"
					+ objAndProp[1].substring(0, 1).toUpperCase()
					+ objAndProp[1].substring(1);
				// ͨ��target��getClass()��ȡ����ʵ��������Ӧ��Class����
				Class<?> targetClass = target.getClass();
				// ��ȡϣ�����õ�setter����
				Method mtd = targetClass.getMethod(mtdName, String.class);
				// ͨ��Method��invoke����ִ��setter����
				// ��config.getProperty(name)��ֵ��Ϊ����setter�����Ĳ���
				mtd.invoke(target, config.getProperty(name));
			}
		}
	}
	public Object getObject(String name)
	{
		// ��objectPool��ȡ��ָ��name��Ӧ�Ķ���
		return objectPool.get(name);
	}
	public static void main(String[] args) throws Exception
	{
		var epf = new ExtendedObjectPoolFactory();
		epf.init("extObj.txt");
		epf.initPool();
		epf.initProperty();
		System.out.println(epf.getObject("a"));
	}
}

