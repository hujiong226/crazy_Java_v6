
import java.util.logging.*;
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
public class LoggerTest
{
	public static void main(String[] args) throws Exception
	{
		// ��ȡSystem.Logger����
		var logger = System.getLogger("fkjava");
		// ����ϵͳ��־����FINE��ӦDEBUG��
		Logger.getLogger("fkjava").setLevel(Level.FINE);
		// ����ʹ��a.xml������־��¼
		Logger.getLogger("fkjava").addHandler(new FileHandler("a.xml"));
		logger.log(System.Logger.Level.DEBUG, "debug��Ϣ");
		logger.log(System.Logger.Level.INFO, "info��Ϣ");
		logger.log(System.Logger.Level.ERROR, "error��Ϣ");
	}
}