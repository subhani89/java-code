package com.files;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FilesHandle {

	public static void main(String[] args) throws IOException {
		//these files concepts are used to create files&folders in local drive or our local project
		
		File f=new File("D:/resume.txt");
		f.createNewFile();
		//this is used to create file in requried path location and file name
		//in this case we can use local drive path as a location like "D:/"
		
		File f1=new File("./subbu.txt");
		f1.createNewFile();
		//this is use to create file in our local java project.
		//in this case mention path location as " ./ " by using this we can create file in project
		
		File f2=new File("./subbu");
		f2.mkdir();
		//to create folder use name without extension and use "mkdir()" method
		
		//most of the methods return boolean values
		System.out.println("f2 file exist :"+f2.exists());
		//use to check file exist or not
		
		System.out.println("creating folder :"+f2.mkdir());
		
		System.out.println("creating new file :"+f.createNewFile());
		System.out.println("checking weather file exist or not :"+f.exists());
		
		System.out.println("this file can modify? :"+f.canWrite());
		//this is use to check the file is read only access or not if the file read only access
		//then this method will be false because we cant write in read only file
		
		System.out.println("file hidebility :"+f.isHidden());
		//use to file is in hidden or visible
		
		System.out.println("file able to execute :"+f.canExecute());
		//use to check file able to execute or not
		
		System.out.println("file modifying read only method :"+f.setReadOnly());
		//this is use file change to read only access
		
		System.out.println("this file can modify? :"+f.canWrite());
		System.out.println("file able to execute :"+f.canExecute());
		System.out.println("deleting file :"+f.delete());
		//use to delete the file
		
		System.out.println("list of files :"+f.list());
		File f3=new File("D:\\backup");
		System.out.println("list of files :"+Arrays.toString(f3.list()));
		//this is use to print the existing files in given location
	}

}
