
import lee.Output;

/**
 * Description:
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks
 * @version 6.0
 */
public class OutputFactory
{
	public Output getOutput()
	{
//		return new Printer();
		return new BetterPrinter();
	}
	public static void main(String[] args)
	{
		var of = new OutputFactory();
		var c = new Computer(of.getOutput());
		c.keyIn("轻量级Java EE企业应用实战");
		c.keyIn("疯狂Java讲义");
		c.print();
	}
}
