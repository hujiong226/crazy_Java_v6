

/**
 * Description:
 * <br/>ÍøÕ¾: <a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a>
 * <br/>Copyright (C), 2001-2023, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com ¹«ÖÚºÅ: fkbooks<br>
 * @version 1.0
 */
final class Point
{
	private final int x;
	private final int y;
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int x() { return this.x; }
	public int y() { return this.y; }
	public final String toString()
	{
		return "Point[x=" + x + ", y=" + y + "]";
	}
	public final boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj != null && obj.getClass() == Point.class)
		{
			Point target = (Point) obj;
			return this.x == target.x && this.y == target.y;
		}
		return false;
	}
	public final int hashCode(){return 1;}
}
