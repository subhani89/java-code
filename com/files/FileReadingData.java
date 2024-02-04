package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FileReadingData {
	//there are 4 ways of reading data from file
	//1-FileInputStream
	//2-Scanner
	//3-FileReader
	//4-BufferedReader
	//by these method we can read the data from the file in local or project
	
	public static void main(String[] args) throws IOException {
		
		Fileinputstream();
		ScanneR();
		Filereader();
		Bufferedreader();
		
		
	}
	
	public static void Fileinputstream() throws IOException {
		File f=new File("./text.txt");
		f.createNewFile();
		System.out.println(f.exists());
		FileInputStream fis=new FileInputStream(f);
		int code;
		while((code=fis.read())!=-1) {
			System.out.print((char)code);
		}
		//in this while loop we used "-1" because when read()method using
		//it will return the some int value whenever the data end in the  file
		//the method return the "-1"value that means there is no data remaining
		//so while loop runs until the data ends
		
		fis.close();
		//after using these readers it needs to close because to stop resoures leak

	}
	
	
	public static void ScanneR() throws FileNotFoundException {
		File f1=new File("./text.txt");
		Scanner s=new Scanner(f1);
		System.out.println(f1.exists());
		while(s.hasNext()) {
			System.out.println(s.nextLine());			
		}
		//by using scanner it will read the data  line by line
		//so we used hasnext(), nextline() methods
		s.close();		
	}
	
	
	public static void Filereader() throws IOException {
		File f2=new File("./text.txt");
		System.out.println(f2.exists());
		FileReader fr=new FileReader(f2);
		int text;
		while((text=fr.read())!=-1) {
			System.out.print((char)text);
		}
	
		fr.close();
	}
	
	
	public static void Bufferedreader() throws IOException {
		File f=new File("./text.txt");
		FileReader fr=new FileReader(f);		
		BufferedReader br=new BufferedReader(fr);
		int text;
		while((text=br.read())!=-1) {
			System.out.print((char)text);
		}
		
		
		//or else we have anthor method in BufferReader
		//in this method it will read in string not in char
		
		String str=new String();
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		fr.close();
		br.close();
	}
}
