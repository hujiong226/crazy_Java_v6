
import java.net.http.*;
import java.time.*;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.*;
/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks
 * @version 6.0
 */
public class WebSocketChat
{
	public static void main(String[] args) throws Exception
	{
		// ����WebSocket.Listener����������
		WebSocket.Listener listener = new WebSocket.Listener()
		{
			// �����˴�����ʱ�����÷���
			@Override
			public void onOpen(WebSocket webSocket)
			{
				System.out.println("�Ѵ�����");
				// �����ȡ��һ�ε���Ϣ
				webSocket.request(1);
			}
			// ���յ�����˷��ͻ������ı���Ϣʱ�����÷���
			@Override
			public CompletionStage<?> onText(WebSocket webSocket,
				CharSequence message, boolean last)
			{
				System.out.println(message);
				// �����ȡ��һ�ε���Ϣ
				webSocket.request(1);
				return null;
			}
		};
		HttpClient client = HttpClient.newHttpClient();
		// �����������Ϊ����������WebSocket�ͻ���
		client.newWebSocketBuilder().buildAsync(
			URI.create("ws://127.0.0.1:8888/foo/chatSocket"), listener)
			.thenAccept(webSocket -> {
				try
				{
					// ����BufferedReader����
					BufferedReader br = new BufferedReader(new InputStreamReader(
						System.in));
					String line = null;
					// ���϶�ȡ�û��������룬�����û����뷢�͵�WebSocket
					while ((line = br.readLine()) != null)
					{
						webSocket.sendText(line, true);
					}
				}
				catch (IOException ex)
				{
					ex.printStackTrace();
				}
			})
			.join();
	}
}