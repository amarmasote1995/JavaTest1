package com.amar;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		
		HelloWorld h= new HelloWorld();
		
		System.out.println("Hello World");
		System.out.println(h.getPrope());
		
	}
     public		String getPrope()
		{
			
		
			Properties properties = new Properties();
			properties.setProperty("user.name", "Amar");
			try {
			File file = new File("amar.properties");
			FileOutputStream fileOut = new FileOutputStream(file);
			properties.store(fileOut, "Property file");
			fileOut.close();
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			 try{
				File file1 = new File("amar.properties");
				FileInputStream fileInput = new FileInputStream(file1);
				properties.load(fileInput);
				// System.out.println(properties.getProperty("user.name"));
	            fileInput.close();
			 }
			 catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			 try{
	            Properties prop1 =  new Properties();
			    FileOutputStream out = new FileOutputStream("amar.properties");
		        prop1.setProperty("user.name", "Masote");
				prop1.store(out, "Property file");
				
			    // System.out.println(prop1.getProperty("user.name"));
				out.close();
				return prop1.getProperty("user.name");
			 }
			 catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
		return null;
		
		}
	}

	



