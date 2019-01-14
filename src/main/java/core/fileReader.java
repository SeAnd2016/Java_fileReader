package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class fileReader {
	
	static ArrayList readFile(String path) {
		ArrayList content = new ArrayList();
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			if (br != null) {
				System.out.println("Not Null");
			}
			while (br !=null) {
				content.add(br.readLine().toString());
				//content = br.readLine().toString();}
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		catch (NullPointerException a) {
			System.out.println("File is empty " + a);
		}
		return content;
	}
	
	public static void main (String[] args) {
		String path ="/Users/sergei/qa.txt";
		System.out.println(readFile(path));
	}

}
