package trunglmtech;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



public class ViDuDocStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fInput = new FileInputStream("C:\\Users\\Admin\\Desktop\\Bai1-Java-Basic\\ViDuStreamDocChuoi\\src\\trunglmtech\\test.txt");
		InputStreamReader ipReader = new InputStreamReader(fInput);
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		
		
		String line1 = bufReader.readLine();
		System.out.println(line1);
		String line2 = bufReader.readLine();
		System.out.println(line2);
	}

}
