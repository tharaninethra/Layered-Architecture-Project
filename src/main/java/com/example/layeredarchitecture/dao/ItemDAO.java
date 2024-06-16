package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {

    ArrayList<ItemDTO> loadAllItem() throws SQLException, ClassNotFoundException ;
    void  saveItem(String code, String description, BigDecimal unitPrice, int qtyOnHand ) throws SQLException, ClassNotFoundException ;
    boolean exist(String code) throws SQLException, ClassNotFoundException ;
    void   deleteItem(String code) throws SQLException, ClassNotFoundException ;
    String generateNewId() throws SQLException, ClassNotFoundException ;
    public ResultSet findItem(String newItemCode) throws SQLException, ClassNotFoundException;
    public ResultSet getItem(String code) throws SQLException, ClassNotFoundException;
     void updateItems(String description, BigDecimal unitPrice, int qtyOnHand, String code) throws SQLException, ClassNotFoundException;
    public PreparedStatement updateItem(Connection connection,ItemDTO item) throws SQLException;
}
