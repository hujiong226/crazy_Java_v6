
import java.util.*;
import java.text.*;
import java.net.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.*;
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
public class JFormattedTextFieldTest
{
	private JFrame mainWin = new JFrame("���Ը�ʽ���ı���");
	private JButton okButton = new JButton("ȷ��");
	// �����������Ӹ�ʽ���ı��������
	private JPanel mainPanel = new JPanel();
	JFormattedTextField[] fields = new JFormattedTextField[6];
	String[] behaviorLabels = new String[] {
		"COMMIT",
		"COMMIT_OR_REVERT",
		"PERSIST",
		"REVERT"
	};
	int[] behaviors = new int[] {
		JFormattedTextField.COMMIT,
		JFormattedTextField.COMMIT_OR_REVERT,
		JFormattedTextField.PERSIST,
		JFormattedTextField.REVERT
	};
	ButtonGroup bg = new ButtonGroup();
	public void init()
	{
		// ���Ӱ�ť
		var buttonPanel = new JPanel();
		buttonPanel.add(okButton);
		mainPanel.setLayout(new GridLayout(0, 3));
		mainWin.add(mainPanel, BorderLayout.CENTER);
		// ʹ��NumberFormat��integerInstance����һ��JFormattedTextField
		fields[0] = new JFormattedTextField(NumberFormat
			.getIntegerInstance());
		// ���ó�ʼֵ
		fields[0].setValue(100);
		addRow("������ʽ�ı��� :", fields[0]);
		// ʹ��NumberFormat��currencyInstance����һ��JFormattedTextField
		fields[1] = new JFormattedTextField(NumberFormat
			.getCurrencyInstance());
		fields[1].setValue(100.0);
		addRow("���Ҹ�ʽ�ı���:", fields[1]);
		// ʹ��Ĭ�ϵ����ڸ�ʽ����һ��JFormattedTextField����
		fields[2] = new JFormattedTextField(DateFormat.getDateInstance());
		fields[2].setValue(new Date());
		addRow("Ĭ�ϵ����ڸ�ʽ��:", fields[2]);
		// ʹ��SHORT���͵����ڸ�ʽ����һ��JFormattedTextField����
		// ��Ҫ������ϸ����ڸ�ʽ
		DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
		// Ҫ������ϸ�����ڸ�ʽ�﷨
		format.setLenient(false);
		fields[3] = new JFormattedTextField(format);
		fields[3].setValue(new Date());
		addRow("SHORT���͵����ڸ�ʽ�����﷨�ϸ�:", fields[3]);
		try
		{
			// ����Ĭ�ϵ�DefaultFormatter����
			var formatter = new DefaultFormatter();
			// �ر�overwrite״̬
			formatter.setOverwriteMode(false);
			fields[4] = new JFormattedTextField(formatter);
			// ʹ��DefaultFormatter����ʽ��URL
			fields[4].setValue(new URL("http://www.crazyit.org"));
			addRow("URL:", fields[4]);
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		try
		{
			var formatter = new MaskFormatter("020-########");
			// ����ռλ��
			formatter.setPlaceholderCharacter('��');
			fields[5] = new JFormattedTextField(formatter);
			// ���ó�ʼֵ
			fields[5].setValue("020-28309378");
			addRow("�绰���룺", fields[5]);
		}
		catch (ParseException ex)
		{
			ex.printStackTrace();
		}
		var focusLostPanel = new JPanel();
		// ����ѭ����ʽ����ʧȥ������Ϊ�ĵ�ѡ��ť
		for (var i = 0; i < behaviorLabels.length; i++)
		{
			final var index = i;
			final var radio = new JRadioButton(behaviorLabels[i]);
			// Ĭ��ѡ�еڶ�����ѡ��ť
			if (i == 1)
			{
				radio.setSelected(true);
			}
			focusLostPanel.add(radio);
			bg.add(radio);
			// Ϊ���е�ѡ��ť�����¼�������
			radio.addActionListener(e -> {
				// �����ǰ�õ�ѡ��ť����ѡ��״̬��
				if (radio.isSelected())
				{
					// �������еĸ�ʽ���ı����ʧȥ�������Ϊ
					for (var j = 0; j < fields.length; j++)
					{
						fields[j].setFocusLostBehavior(behaviors[index]);
					}
				}
			});
		}
		focusLostPanel.setBorder(new TitledBorder(new EtchedBorder(),
			"��ѡ�񽹵�ʧȥ�����Ϊ"));
		var p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(focusLostPanel, BorderLayout.NORTH);
		p.add(buttonPanel, BorderLayout.SOUTH);
		mainWin.add(p, BorderLayout.SOUTH);
		mainWin.pack();
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.setVisible(true);
	}
	// ��������һ�и�ʽ���ı���ķ���
	private void addRow(String labelText, final JFormattedTextField field)
	{
		mainPanel.add(new JLabel(labelText));
		mainPanel.add(field);
		final var valueLabel = new JLabel();
		mainPanel.add(valueLabel);
		// Ϊ"ȷ��"��ť�����¼�������
		// ���û�������ȷ������ťʱ���ı����
		okButton.addActionListener(event -> {
			Object value = field.getValue();
			// �����ʽ���ı����ֵ
			valueLabel.setText(value.toString());
		});
	}
	public static void main(String[] args)
	{
		new JFormattedTextFieldTest().init();
	}
}