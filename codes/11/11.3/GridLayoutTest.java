
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
public class GridLayoutTest
{
	public static void main(String[] args)
	{
		var f = new Frame("������");
		var p1 = new Panel();
		p1.add(new TextField(30));
		f.add(p1, NORTH);
		var p2 = new Panel();
		// ����Panelʹ��GridLayout���ֹ�����
		p2.setLayout(new GridLayout(3, 5, 4, 4));
		String[] name = {"0", "1", "2", "3",
			"4", "5", "6", "7", "8", "9",
			"+", "-", "*", "/", "."};
		// ��Panel����������15����ť
		for (var i = 0; i < name.length; i++)
		{
			p2.add(new Button(name[i]));
		}
		// Ĭ�Ͻ�Panel��������Frame���ڵ��м�
		f.add(p2);
		// ���ô���Ϊ��Ѵ�С
		f.pack();
		// ��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}
}
