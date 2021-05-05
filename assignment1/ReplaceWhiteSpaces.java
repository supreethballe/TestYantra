package assignment1;

import java.util.Scanner;

public class ReplaceWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Test Yantra Software Solutions";
        String r = "";

        Scanner sc = new Scanner(str);

        while(sc.hasNext()) {
            r += sc.next();
        }
        System.out.println(r);
    }
}
