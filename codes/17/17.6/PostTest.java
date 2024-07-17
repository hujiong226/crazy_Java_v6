
import java.net.http.*;
import java.time.*;
import java.net.*;
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
public class PostTest
{
	public static void main(String[] args) throws Exception
	{
		// 为CookieHandler设置默认的Cookie管理器
		CookieHandler.setDefault(new CookieManager());
		HttpClient client = HttpClient.newBuilder()
			.version(HttpClient.Version.HTTP_2)
			.followRedirects(HttpClient.Redirect.NORMAL)
			.connectTimeout(Duration.ofSeconds(20))
			// 设置默认的Cookie处理器
			.cookieHandler(CookieHandler.getDefault())
			.build();
		// 创建发送POST请求的request
		HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create("http://localhost:8888/foo/login.jsp"))
			.timeout(Duration.ofMinutes(2))
			// 指定以提交表单的方式编码请求体
			.header("Content-Type", "application/x-www-form-urlencoded")
			// 通过字符串创建请求体，然后作为POST请求的请求参数
			.POST(HttpRequest.BodyPublishers.ofString("name=crazyit.org&pass=leegang"))
			.build();
		// HttpResponse.BodyHandlers.ofString()指定将服务器响应转化成字符串
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("POST请求的响应码:" + response.statusCode());
		System.out.println("POST请求的响应体:" + response.body());
		// 创建发送GET请求的request
		request = HttpRequest.newBuilder()
			.uri(URI.create("http://localhost:8888/foo/secret.jsp"))
			.timeout(Duration.ofMinutes(2))
			.header("Content-Type", "text/html")
			.GET()
			.build();
		// HttpResponse.BodyHandlers.ofString()指定将服务器响应转化成字符串
		response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("GET请求的响应码:" + response.statusCode());
		System.out.println("GET请求的响应体:" + response.body());
	}
}
