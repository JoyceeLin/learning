/*

 */
package learning.mybatis.mybatis2.statement;

import learning.mybatis.mybatis2.config.Configuration;
import learning.mybatis.mybatis2.config.MapperRepository;
import learning.mybatis.mybatis2.result.ResultSetHandler;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 16:22
 * @Version V1.0
 */
public class StatementHandler {

    private Configuration configuration;
    private ResultSetHandler resultSetHandler;

    public StatementHandler(Configuration configuration) {
        this.configuration = configuration;
        resultSetHandler = new ResultSetHandler(configuration);
    }

    public <E> E query(MapperRepository.MapperData mapperData, Object parameter) throws SQLException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Connection connection = getConnection();
        PreparedStatement stmt = connection.prepareStatement(String.format(mapperData.getSql(), Integer.parseInt(String.valueOf(parameter))));
        stmt.execute();
        return (E) resultSetHandler.handle(stmt, mapperData);
    }

    public Connection getConnection() throws SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/leetcode?useUnicode=true&characterEncoding=utf-8&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
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
        System.out.println();
        return conn;
    }
}
