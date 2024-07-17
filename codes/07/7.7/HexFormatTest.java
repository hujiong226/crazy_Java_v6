
import java.util.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2023, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks<br>
 * @version 1.0
 */
public class HexFormatTest
{
	public static void main(String[] args)
	{
		// ����ʹ��ð����Ϊ�ָ����ĸ�ʽ����
		var hexFormat = HexFormat.ofDelimiter(":")
			// ����ʹ��A-F
			.withUpperCase()
			// ����ʹ��0Xǰ׺
			.withPrefix("0x");
		byte[] data = {2, 3, 17, 34, 36, 92, 78};
		// ��ʽ��ʮ�����Ƶ��ַ���
		var hexStr = hexFormat.formatHex(data);
		// �����0x02:0x03:0x11:0x22:0x24:0x5C:0x4E
		System.out.println(hexStr);
		// ��ʮ�������ַ�����ʽ�����ֽ�����
		var parseData = hexFormat.parseHex(hexStr);
		// �ж�ԭ����ͽ����õ��������Ƿ���ȣ������true
		System.out.println(Arrays.equals(data, parseData));


var bitFormat = HexFormat.of();
// ��200ת��Ϊʮ�������ַ���
var hex = bitFormat.toHexDigits(200);  // ��
// ���000000C8��8λ��ʮ�����������൱��32λ��int��
System.out.println(hex);
// �ָ�intֵ
System.out.println(HexFormat.fromHexDigits(hex));   // ��
// ��short���͵�200ת��Ϊʮ�������ַ���
var hex2 = bitFormat.toHexDigits((short) 200);
// ���00C8��4λ��ʮ�����������൱��16λ��short��
System.out.println(hex2);
	}
}
