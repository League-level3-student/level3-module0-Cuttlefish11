package _01_Simple_Array_Algorithms;

import java.util.Random;

import javax.swing.JOptionPane;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	String[] chars =new String[5];
	chars[0]="a1";
	chars[1]="b2";
	chars[2]="c3";
	chars[3]="d4";
	chars[4]="e5";
	printer(chars);
	backward(chars);
	oddsAndEvens(chars);
	randomness(chars);
}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
    private static void printer(String[] chars) {
	for (int i = 0; i < chars.length; i++) {
		System.out.println(chars[i]);
	}
}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
    private static void backward(String[] chars) {
	for (int i = chars.length-1; i >= 0; i--) {
		System.out.println(chars[i]);
	}
}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
    private static void oddsAndEvens(String[] chars) {
    	for (int i = 0; i < chars.length; i++) {
    		if(i%2==0) {
        		System.out.println(chars[i]);
    		}
    	}
    }

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
    private static void randomness(String[] chars) {
	for (int i = 0; i < chars.length; i++) {
		System.out.println(chars[i]);
	}
}

}
//String charA = JOptionPane.showInputDialog("enter a string of letters");
//String charB = JOptionPane.showInputDialog("enter a string of letters, again");
//String charC = JOptionPane.showInputDialog("enter a string of letters, again");
//String[] charss =new String[3];
//charss[0].equals(charA);
//charss[1].equals(charB);
//charss[2].equals(charC);
//printer(charss);