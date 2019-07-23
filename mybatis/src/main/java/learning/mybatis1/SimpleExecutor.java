/*

 */
package learning.mybatis1;

import java.sql.*;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 11:33
 * @Version V1.0
 */
public class SimpleExecutor implements Executor {

    @Override
    public <T> T query(String sql, Object parameter) {
        try {
            Connection connection = getConnection();
            PreparedStatement pstmt;
            pstmt = connection.prepareStatement(String.format(sql, Integer.parseInt(String.valueOf(parameter))));
            ResultSet rs = pstmt.executeQuery();
            Test test = new Test();
            while (rs.next()) {
                test.setId(rs.getInt(1));
                test.setName(rs.getString(2));
            }
            return (T) test;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Connection getConnection() throws SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "";
        Connection conn = null;
        try {
            //classLoader,加载对应驱动
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
