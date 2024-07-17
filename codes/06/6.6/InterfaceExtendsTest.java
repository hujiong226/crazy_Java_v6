

/**
 * Description:
 * ÍøÕ¾: <a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com ¹«ÖÚºÅ: fkbooks
 * @version 6.0
 */
interface InterfaceA
{
	int PROP_A = 5;
	void testA();
}
interface InterfaceB
{
	int PROP_B = 6;
	void testB();
}
interface InterfaceC extends InterfaceA, InterfaceB
{
	int PROP_C = 7;
	void testC();
}
public class InterfaceExtendsTest
{
	public static void main(String[] args)
	{
		System.out.println(InterfaceC.PROP_A);
		System.out.println(InterfaceC.PROP_B);
		System.out.println(InterfaceC.PROP_C);
	}
}
