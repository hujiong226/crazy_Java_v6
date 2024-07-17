

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
public class MultiThreadDown
{
	public static void main(String[] args) throws Exception
	{
		// 初始化DownUtil对象
		final var downUtil = new DownUtil("https://fkjava.org/2020/04/01/ssm/ssm_post.jpg",
			"ssm.jpg", 4);
		// 开始下载
		downUtil.download();
		new Thread(() -> {
				while (downUtil.getCompleteRate() < 1)
				{
					// 每隔0.1秒查询一次任务的完成进度，
					// GUI程序中可根据该进度来绘制进度条
					System.out.println("已完成：" + downUtil.getCompleteRate());
					try
					{
						Thread.sleep(100);
					}
					catch (Exception ex){}
				}
		}).start();
	}
}
