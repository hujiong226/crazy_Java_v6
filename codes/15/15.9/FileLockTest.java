
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
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
public class FileLockTest
{
	public static void main(String[] args)
		throws Exception
	{

		try (
			// ʹ��FileOutputStream��ȡFileChannel
			var channel = new FileOutputStream("a.txt").getChannel())
		{
			// ʹ�÷�����ʽ��ʽ��ָ���ļ�����
			FileLock lock = channel.tryLock();
			// ������ͣ10s
			Thread.sleep(10000);
			// �ͷ���
			lock.release();
		}
	}
}