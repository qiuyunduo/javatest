package connjdbc;

import java.sql.*;
import java.util.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:24 18-6-22
 * @Modified: null
 */
public class ConnJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/xg?useSSL=true",
                "qiuyunduo","123456");

        String sql = "select * from data_xsxx";

        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();

        List<Map> list = new ArrayList<Map>();

        ResultSetMetaData rsmd = resultSet.getMetaData();

        int columns = rsmd.getColumnCount();

        while(resultSet.next()) {

            Map map = new LinkedHashMap();
            for (int i = 0; i < columns; i++) {
                map.put(rsmd.getColumnName(i+1),resultSet.getObject(i+1));
            }
            list.add(map);
            System.out.println(map);
//
//            String id = resultSet.getString("id");
//            String xh = resultSet.getString("xh");
//            String xm = resultSet.getString("xm");
//
//            System.out.println("id: "+id+" xh: "+xh+" xh: "+xm);

        }

    }
}
