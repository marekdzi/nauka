package nauka;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File ("e:\\aaa");
		Scanner in = new Scanner(file);
		System.out.println(in.nextLine());
		
		String str = new String("ala ma kota");
		System.out.println(str.substring(0,5));
	}

}
