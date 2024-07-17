
import java.nio.file.*;
import java.net.*;
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
public class FileSystemTest
{
	public static void main(String[] args) throws Exception
	{
//		Path path = Paths.get("g:/");
//		System.out.println(path);
		var fileSystem = FileSystems.newFileSystem(Paths.get("FileSystemTest.java"));
		System.out.println(fileSystem);
	}
}
