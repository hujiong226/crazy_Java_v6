

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
public class AuctionTest
{
	private double initPrice = 30.0;
	// ��Ϊ�÷�������ʽ�׳���AuctionException�쳣��
	// ���Դ˴���Ҫ�����׳�AuctionException�쳣
	public void bid(String bidPrice)
		throws AuctionException
	{
		var d = 0.0;
		try
		{
			d = Double.parseDouble(bidPrice);
		}
		catch (Exception e)
		{
			// �˴���ɱ������п��Զ��쳣ִ�е��޸�������
			// �˴��������ڿ���̨��ӡ�쳣����ջ��Ϣ��
			e.printStackTrace();
			// �ٴ��׳��Զ����쳣
			throw new AuctionException("���ļ۱�������ֵ��"
				+ "���ܰ��������ַ���");
		}
		if (initPrice > d)
		{
			throw new AuctionException("���ļ۱����ļ۵ͣ�"
				+ "���������ģ�");
		}
		initPrice = d;
	}
	public static void main(String[] args)
	{
		var at = new AuctionTest();
		try
		{
			at.bid("df");
		}
		catch (AuctionException ae)
		{
			// �ٴβ�׽��bid�����е��쳣�����Ը��쳣���д���
			System.err.println(ae.getMessage());
		}
	}
}