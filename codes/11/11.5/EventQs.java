
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
public class EventQs
{
	private Frame f = new Frame("�����¼�");
	private Button ok = new Button("ȷ��");
	private TextField tf = new TextField(30);
	public void init()
	{
		// ע���¼�������
		ok.addActionListener(new OkListener());   // ��
		f.add(tf);
		f.add(ok, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	// �����¼���������
	class OkListener implements ActionListener   // ��
	{
		// ���涨��ķ��������¼���������������Ӧ�ض����¼�
		public void actionPerformed(ActionEvent e)      // ��
		{
			System.out.println("�û�������ok��ť");
			tf.setText("Hello World");
		}
	}
	public static void main(String[] args)
	{
		new EventQs().init();
	}
}