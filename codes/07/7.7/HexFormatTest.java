
import java.util.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2023, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks<br>
 * @version 1.0
 */
public class HexFormatTest
{
	public static void main(String[] args)
	{
		// 创建使用冒号作为分隔符的格式化器
		var hexFormat = HexFormat.ofDelimiter(":")
			// 设置使用A-F
			.withUpperCase()
			// 设置使用0X前缀
			.withPrefix("0x");
		byte[] data = {2, 3, 17, 34, 36, 92, 78};
		// 格式化十六进制的字符串
		var hexStr = hexFormat.formatHex(data);
		// 输出：0x02:0x03:0x11:0x22:0x24:0x5C:0x4E
		System.out.println(hexStr);
		// 将十六进制字符串格式化成字节数组
		var parseData = hexFormat.parseHex(hexStr);
		// 判断原数组和解析得到的数组是否相等，输出：true
		System.out.println(Arrays.equals(data, parseData));


var bitFormat = HexFormat.of();
// 将200转换为十六进制字符串
var hex = bitFormat.toHexDigits(200);  // ③
// 输出000000C8（8位的十六进制数，相当于32位的int）
System.out.println(hex);
// 恢复int值
System.out.println(HexFormat.fromHexDigits(hex));   // ④
// 将short类型的200转换为十六进制字符串
var hex2 = bitFormat.toHexDigits((short) 200);
// 输出00C8（4位的十六进制数，相当于16位的short）
System.out.println(hex2);
	}
}
