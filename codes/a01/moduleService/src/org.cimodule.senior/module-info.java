
import org.crazyit.oa.UserService;
import org.crazyit.oa.senior.UserServiceSenior;
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
module org.cimodule.senior
{
	// ָ����������ӿ����ڵ�ģ��
	requires org.cimodule;
	// ΪUserService����ӿ��ṩUserServiceSeniorʵ����
	provides UserService with UserServiceSenior;
}