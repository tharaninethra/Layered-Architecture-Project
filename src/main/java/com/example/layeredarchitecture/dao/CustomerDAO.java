package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.view.tdm.CustomerTM;
import javafx.scene.control.Alert;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
     ArrayList<CustomerDTO> loadAllCustomer() throws SQLException, ClassNotFoundException ;
     void saveCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException ;
     void  deleteCustomer(String id) throws SQLException, ClassNotFoundException ;
     boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;
     String  generateNewId () throws SQLException, ClassNotFoundException ;
     public void updatecustomer (String name, String address, String id ) throws SQLException, ClassNotFoundException;
     public ResultSet searchCustomer(String newValue) throws SQLException, ClassNotFoundException;






}
