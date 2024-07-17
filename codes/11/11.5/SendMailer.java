
import java.awt.*;
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
public class SendMailer
{
	private Frame f = new Frame("����");
	private TextField tf = new TextField(40);
	private Button send = new Button("����");
	public void init()
	{
		// ʹ��MailerListener������Ϊ�¼�������
		send.addActionListener(new MailerListener(tf));
		f.add(tf);
		f.add(send, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SendMailer().init();
	}
}