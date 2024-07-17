
import java.util.*;
import java.io.*;
import java.sql.*;
/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2023, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com ���ں�: fkbooks
 * @version 6.0
 */
public class ExecuteDML
{
    private String driver;
    private String url;
    private String user;
    private String pass;
    public void initParam(String paramFile)
        throws Exception
    {
        // ʹ��Properties�������������ļ�
        var props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("user");
        pass = props.getProperty("pass");
    }
    public long insertData(String sql) throws Exception
    {
        // ��������
        Class.forName(driver);
        try (
            // ��ȡ���ݿ�����
            Connection conn = DriverManager.getConnection(url,
                user, pass);
            // ʹ��Connection������һ��Statement����
            Statement stmt = conn.createStatement())
        {
            // ִ��DML��䣬������Ӱ��ļ�¼����
            return stmt.executeLargeUpdate(sql);
        }
    }
    public static void main(String[] args) throws Exception
    {
        var ed = new ExecuteDML();
        ed.initParam("mysql.ini");
        var result = ed.insertData("insert into jdbc_test(jdbc_name, jdbc_desc)"
            + "select s.student_name, t.teacher_name "
            + "from student_table s, teacher_table t "
            + "where s.java_teacher = t.teacher_id;");
        System.out.println("--ϵͳ�й���" + result + "����¼��Ӱ��--");
    }
}