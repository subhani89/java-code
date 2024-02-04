package com.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	//1-FileOutputSteam
	//2-FileWriter
	//3-BufferedWriter
	//these methods use to write the data to the files

	public static void main(String[] args) throws IOException {
		//Fileoutputsteam();
		//Filewriter();
		Bufferedwriter();


	}

	public static void Fileoutputsteam() throws IOException {
		File f=new File("./dairy.txt");
		f.createNewFile();
		System.out.println(f.exists());
		FileOutputStream fo=new FileOutputStream(f);
		fo.write(88);//these numbers are ascii code of characters
		fo.write(70);//these characters stored in the file
		fo.write(98);//anything write in the file it should write char by char
		fo.write(86);
		fo.write(77);
		fo.write(72);

		//another way to write data in file
		//we can write data in file in string format also
		//we can use foreach loop to write data into the file

		String s=new String("  welcome to my world");
		for(char c:s.toCharArray()) {
			fo.write((int)c);
		}
		fo.close();
			
	}
	public static void Filewriter() throws IOException{
		File f=new File("./dairy.txt");
		FileWriter fw=new FileWriter(f);
		String s="hiii my name is ";
		fw.write(s);
        fw.close();
	}
	
	public static void Bufferedwriter() throws IOException {
		File f=new File("./alone.txt");
		f.createNewFile();
		System.out.println(f.exists());
		String s="aloneboy";
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(s);
		
		bw.flush();//flush is used to close after writing data into file
		
		bw.close();
		
		
	}

}
