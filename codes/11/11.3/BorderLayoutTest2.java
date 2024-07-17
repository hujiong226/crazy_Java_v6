
import java.awt.*;
import static java.awt.BorderLayout.*;
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
public class BorderLayoutTest2
{
	public static void main(String[] args)
	{
		var f = new Frame("���Դ���");
		// ����Frame����ʹ��BorderLayout���ֹ�����
		f.setLayout(new BorderLayout(30, 5));
		f.add(new Button("��"), SOUTH);
		f.add(new Button("��"), NORTH);
		// ����һ��Panel����
		var p = new Panel();
		// ��Panel�����������������
		p.add(new TextField(20));
		p.add(new Button("������"));
		// Ĭ�����ӵ��м䣬���м�����һ��Panel����
		f.add(p);
		f.add(new Button("��"), EAST);
		// ���ô���Ϊ��Ѵ�С
		f.pack();
		// ��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}
}