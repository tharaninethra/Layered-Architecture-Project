package com.example.layeredarchitecture.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface OrderDAO {
    public  String generateIds() throws SQLException, ClassNotFoundException;
    public Connection getConnection(Connection connection) throws SQLException, ClassNotFoundException;
    public PreparedStatement getOrder(Connection connection, String orderId) throws SQLException, ClassNotFoundException;
    public PreparedStatement insertOrder(Connection connection, PreparedStatement stm, String orderId, Date orderDate, String customerId) throws SQLException;
}
