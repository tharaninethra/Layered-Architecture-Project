package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;

public class OrderDAOImpl implements OrderDAO{
    public  String generateIds() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");

        return rst.next() ? String.format("OID-%03d", (Integer.parseInt(rst.getString("oid").replace("OID-", "")) + 1)) : "OID-001";
    }
    public Connection getConnection(Connection connection) throws SQLException, ClassNotFoundException {
        connection = DBConnection.getDbConnection().getConnection();
        return connection;
    }

    public PreparedStatement getOrder(Connection connection,String orderId) throws SQLException, ClassNotFoundException {


        PreparedStatement stm = connection.prepareStatement("SELECT oid FROM `Orders` WHERE oid=?");
        stm.setString(1, orderId);
        return stm;
    }

    public PreparedStatement insertOrder(Connection connection, PreparedStatement stm, String orderId, Date orderDate, String customerId) throws SQLException {
        stm = connection.prepareStatement("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)");
        stm.setString(1, orderId);
        stm.setDate(2, Date.valueOf(orderDate.toLocalDate()));
        stm.setString(3, customerId);
        return stm;
    }





}
