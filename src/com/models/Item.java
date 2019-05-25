package com.models;

import java.sql.Connection; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 

public class Item {    
	public String getItems() {      
		String itemsGrid = null;   
		Connection con = null;   
		Statement st = null;   
		ResultSet rs = null;
		
		try {  
		con = DBconnection.createConnection(); //establishing connection  
		st = con.createStatement();
		rs = st.executeQuery("select * from items");

		if (rs.first()) {
			itemsGrid = "<table border='1' cellspacing='1' cellpadding='1'><tr><th>No</th><th>Name</th><th>Description</th><th>Edit</t h><th>Delete</th></tr>"; 
		
		rs.beforeFirst(); 
		while(rs.next())  {   
			itemsGrid = itemsGrid + "<tr><td>" + rs.getString(1) + "</td>"  
		+ "<td>" + rs.getString(2) + "</td>"  
		+ "<td>" + rs.getString(3) + "</td>"  
		+ "<td><input id=\"btnEdit\" type=\"button\" name=\"btnEdit\"  param=\"" 
		+ rs.getString(1) + "\" value=\"Edit\"</td>"  
		+ "<td>" + "<input id=\"btnRemove\" type=\"button\" name=\"btnRemove\" param=\"" 
		+ rs.getString(1) + "\" value=\"Remove\"</td></tr>";
				
		}
		}
		else     
			itemsGrid = "There are no items...";    
			itemsGrid = itemsGrid + "</table></br>";  
		}   catch (SQLException e) {    
			e.printStackTrace();   
		}
		return itemsGrid;
		}
	public String saveAnItem(String itmName,String itemDesc) {
		String res = null;   
		String sql = null;   
		Connection con = null;   
		Statement st = null; 
		
		try {    con = DBconnection.createConnection(); 
				st = con.createStatement(); 
				sql = "insert into items (nameitems, descitems) values "
						+ "('" + itmName + "', '" + itemDesc + "')";    
				st.executeUpdate(sql);    res = "Successfully inserted..."; 
		}
		catch(SQLException e) {
			e.printStackTrace(); 
		}
		return res; 
		
	}
}
		