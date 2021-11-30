package main.java.dao;

import main.java.bean.Product;

import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO extends DAO{

    public List<Product> search(String keyword) throws SQLException, NamingException {
        List<Product> list = new ArrayList<>();
        Connection conn = getConnection();
        PreparedStatement st = conn.prepareStatement("Select * from product where name like ?");
        st.setString(1,"%"+keyword+"%");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Product p = new Product();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setPrice(rs.getInt("price"));
            list.add(p);
        }
        st.close();
        conn.close();
        return list;
    }

    public int Insert(Product product) throws Exception {
        Connection conn = getConnection();
        PreparedStatement st = conn.prepareStatement("insert into product values (null,?,?)");
        st.setString(1,product.getName());
        st.setInt(2,product.getPrice());
        int line = st.executeUpdate();
        st.close();
        conn.close();
        return line;
    }
}
