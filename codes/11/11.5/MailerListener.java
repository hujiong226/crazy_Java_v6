
import java.awt.*;
import java.awt.event.*;
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
public class MailerListener implements ActionListener
{
	// ��TextField�ı����������뷢���ʼ��ĵ�ַ
	private TextField mailAddress;
	public MailerListener(){}
	public MailerListener(TextField mailAddress)
	{
		this.mailAddress = mailAddress;
	}
	public void setMailAddress(TextField mailAddress)
	{
		this.mailAddress = mailAddress;
	}
	// ʵ�ַ����ʼ�
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("������"
			+ mailAddress.getText() + "�������ʼ�...");
		// �����ʼ�����ʵʵ��
	}
}
