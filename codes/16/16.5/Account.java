

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
public class Account
{
	// ��װ�˻���š��˻�����������Ա����
	private String accountNo;
	private double balance;
	public Account(){}
	// ������
	public Account(String accountNo, double balance)
	{
		this.accountNo = accountNo;
		this.balance = balance;
	}
	// �˴�ʡ����accountNo��balance��setter��getter����

	// accountNo��setter��getter����
	public void setAccountNo(String accountNo)
	{
		this.accountNo = accountNo;
	}
	public String getAccountNo()
	{
		return this.accountNo;
	}

	// balance��setter��getter����
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return this.balance;
	}

	// ����������������accountNo����дhashCode()��equals()����
	public int hashCode()
	{
		return accountNo.hashCode();
	}
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj != null
			&& obj.getClass() == Account.class)
		{
			var target = (Account) obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}
}