package org.fkjava.web;

import javax.websocket.*;
import javax.websocket.server.*;

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks
 * @version 6.0
 */
// @ServerEndpoint注解修饰的类将作为WebSocket的服务端
@ServerEndpoint(value="/simpleSocket")
public class SimpleEndpoint
{
	@OnOpen // 该注解修饰的方法将会客户端连接时被激发
	public void start(Session session)
	{
		System.out.println("客户端连接进来了，session id:"
			+ session.getId());
	}
	@OnMessage // 该注解修饰的方法将会客户端消息到达时被激发
	public void message(String message, Session session) throws Exception
	{
		System.out.println("接收到消息了:" + message);
		RemoteEndpoint.Basic remote = session.getBasicRemote();
		remote.sendText("收到！收到！欢迎加入WebSocket的世界！");
		System.out.println("发送完成！！！");
	}
	@OnClose // 该注解修饰的方法将会客户端连接关闭时被激发
	public void end(Session session, CloseReason closeReason)
	{
		System.out.println("客户端连接关闭了，session id:"
			+ session.getId());
	}
	@OnError // 该注解修饰的方法将会客户端出错时被激发
	public void error(Session session, Throwable throwable)
	{
		System.err.println("客户端连接出错了，session id:"
			+ session.getId());
	}
}

