
import java.awt.datatransfer.*;
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
public class LocalObjectSelection implements Transferable
{
	// ����һ�����������
	private Object obj;
	public LocalObjectSelection(Object obj)
	{
		this.obj = obj;
	}
	// ���ظ�Transferable����֧�ֵ�DataFlavor
	public DataFlavor[] getTransferDataFlavors()
	{
		var flavors = new DataFlavor[2];
		//��ȡ����װ���������
		Class clazz = obj.getClass();
		var mimeType = "application/x-java-jvm-local-objectref;"
			+ "class=" + clazz.getName();
		try
		{
			flavors[0] = new DataFlavor(mimeType);
			flavors[1] = DataFlavor.stringFlavor;
			return flavors;
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
	}
	// ȡ����Transferable�����װ������
	public Object getTransferData(DataFlavor flavor)
		throws UnsupportedFlavorException
	{
		if (!isDataFlavorSupported(flavor))
		{
			throw new UnsupportedFlavorException(flavor);
		}
		if (flavor.equals(DataFlavor.stringFlavor))
		{
			return obj.toString();
		}
		return obj;
	}
	public boolean isDataFlavorSupported(DataFlavor flavor)
	{
		return flavor.equals(DataFlavor.stringFlavor) ||
			flavor.getPrimaryType().equals("application")
			&& flavor.getSubType().equals("x-java-jvm-local-objectref")
			&& flavor.getRepresentationClass().isAssignableFrom(obj.getClass());
	}
}
