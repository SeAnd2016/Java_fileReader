package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class fileReader {
	
	static TreeSet readFile(String path) {
		TreeSet content = new TreeSet();
		//String content = null;
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			for (int i = 0; i <= content.size(); i++) {
			content.add(br.readLine().toString());}
		}
		
		catch (IOException e) {
			System.out.println(e);
		}
		catch (NullPointerException a) {
			System.out.println("Null pointer " + a);
		}
		return content;
	}
	
	public static void main (String[] args) {
		String path ="/Users/sergei/qa.txt";
		//for (int i = 0; i < readFile(path).size(); i++) {
		
		Iterator set = readFile(path).iterator();
		while (set.hasNext()) {
		System.out.println(set.next());
	}
  }
}
