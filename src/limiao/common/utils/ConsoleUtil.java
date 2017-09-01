package limiao.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ConsoleUtil {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println((char)System.in.read());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextLine());
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(bufferedReader.readLine());
	}

}
