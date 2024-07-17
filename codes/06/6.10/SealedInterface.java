
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
// 定义密封接口
sealed interface Celestial
{
	void fly();
}
// 密封接口的子接口，只能用sealed或non-sealed修饰。
non-sealed interface Artificial extends Celestial {}
non-sealed class Star implements Celestial
{
	public void fly()
	{
		System.out.println("恒星在星系内转动");
	}
}
final class Planet implements Celestial {
	public void fly()
	{
		System.out.println("行星绕恒星转动");
	}
}
