

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
public class MultiThreadDown
{
	public static void main(String[] args) throws Exception
	{
		// ��ʼ��DownUtil����
		final var downUtil = new DownUtil("https://fkjava.org/2020/04/01/ssm/ssm_post.jpg",
			"ssm.jpg", 4);
		// ��ʼ����
		downUtil.download();
		new Thread(() -> {
				while (downUtil.getCompleteRate() < 1)
				{
					// ÿ��0.1���ѯһ���������ɽ��ȣ�
					// GUI�����пɸ��ݸý��������ƽ�����
					System.out.println("����ɣ�" + downUtil.getCompleteRate());
					try
					{
						Thread.sleep(100);
					}
					catch (Exception ex){}
				}
		}).start();
	}
}
