package com.wbq.db;

import java.sql.*;

/**
 * Created by Administrator on 2016/10/10.
 */
public class DBUtils {
    private static String URL="jdbc:mysql://192.168.0.34:3306/wbq";
    private static String USER="root";
    private static String PASSWORD="823919";
    private static Connection conn=null;

    static {
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获得数据库的连接
             conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void main(String[] args) throws Exception {
        //3.操作数据库
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT name,age FROM students");
        while(rs.next()) {
            System.out.println(rs.getString("name")+","+rs.getInt("age"));
        }
    }
}
