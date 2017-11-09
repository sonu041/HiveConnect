package com.shuvankar.geofind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GeoFindService {
	
	public JSONArray getGeoLocation(String ipaddress)
	{
		/*Connection con = null;
		Statement stmt = null;
		JSONArray json = null;
		ResultSet res = null;
		ResultSetMetaData rsmd;
		
		String tableName = "testHiveDriverTable";
	    String sql = "select * from " + tableName + " where ip = " + ipaddress;
	    
		try {
			
		con = DriverManager.getConnection("jdbc:hive2://localhost:10000/default", "hive", "");
	    stmt = con.createStatement();
	    
	    System.out.println("Running: " + sql);
	    res = stmt.executeQuery(sql);
	    rsmd = res.getMetaData();
	    json = new JSONArray();
	    while(res.next()) {
	    	  int numColumns = rsmd.getColumnCount();
	    	  JSONObject obj = new JSONObject();
	    	  for (int i=1; i<=numColumns; i++) {
	    	    String column_name = rsmd.getColumnName(i);
	    	    obj.put(column_name, res.getObject(column_name));
	    	  }
	    	  json.put(obj);
	    	}
	    
		} catch (Exception e) {
			//Catch the error
		}*/
		//return json;
		JSONArray json = new JSONArray();
		
		String result = "";
		for(int i=0; i<5; i++) {
			JSONObject obj = new JSONObject();
			try {
				obj.put("ipAddress", "ip"+i);
				obj.put("Location", "val"+i);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			json.put(obj);
		}
		System.out.println(json);
		return json;
	}

}
