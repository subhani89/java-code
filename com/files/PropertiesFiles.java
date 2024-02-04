package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class PropertiesFiles {

	public static void main(String[] args) throws Exception {
		// if any file extension is have ".properties" then those files are called properties file
		//in propertie file we can store key and value of data
		//so in the data base it will stored as key=value format
		//to connect the database and get the information from database use propertiesFile
		//it is mainly use to modify data from the application without interrupting the application 
		//get the data and store into the properties file and modify
		
		File f=new File("LogInDetails.properties");
		if(!f.exists())
		f.createNewFile();
		
		
		
		//to write the data into properties we need to create instance of properties
		Properties prop=new Properties();
		prop.setProperty("username", "subhani@");
		prop.setProperty("password", "subhani@143");
		prop.setProperty("url", "www.mypage.com");
		//to add the data in properties use "set properties"
		
				
		FileOutputStream fos=new FileOutputStream(f);
		prop.store(fos, "new propertie is created");
		//after adding data it needs to store the data to reflect into the database 
		//by  using file writers we can save the data
		//and 2nd parameter in the store method is commenting in the database
		//we can write user defined comment in the database like "new properties created"
		
		FileInputStream fis=new FileInputStream(f);
		prop.load(fis);
		//by using this can be we can read the data in database
		
		Set<String> keys =prop.stringPropertyNames();
		System.out.println(keys);
		//it will return the data in set so we created set with string generics
		            //or
		System.out.println(prop.keySet());
		
		
		prop.setProperty("refferakey","jnxjhdx");
		
		System.err.println(prop);//to get the  data  in list
		             //or
		for (Object data : prop.keySet()) {
			System.out.println(data);
		}
		
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.get("url"));//to get the data by using key 
		Collection<Object> values=prop.values();
		System.out.println(values);//get all the values in database
		
		System.err.println(prop.getProperty("Email", "There is no key value in database matched"));
		//in this case it will check the database by using given key
		//if the key is not there in the list then it will print the user defined statement.
		
		//to update any data then use ".setPropertie()" method using same keyvalue with updated data
		
		prop.remove("refferakey");//to remove data
		
		
		
		 
		
		
		
		
		
		
		

	}

}
