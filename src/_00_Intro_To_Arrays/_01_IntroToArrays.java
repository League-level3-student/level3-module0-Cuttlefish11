package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {

        // 1. declare and Initialize an array 5 Strings
        String[] classes = new String[5];
        
        classes[0] = "Bard";
        classes[1] = "Druid";
        classes[2] = "Sorcerer";
        classes[3] = "Warlock";
        classes[4] = "Wizard";

        // 2. print the third element in the array
System.out.println(classes[2]);
        // 3. set the third element to a different value
classes[2] = ("Cleric");
        // 4. print the third element again
System.out.println(classes[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
for(int i = 0; i < classes.length; i++){
    classes[i] = ("Artificer");
}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for(int i = 0; i < classes.length; i++){
System.out.println(classes[i]);
}

        // 7. make an array of 50 integers
int[] blarg = new int[50];

        // 8. use a for loop to make every value of the integer array a random
    //    number
Random ran = new Random();
int smallest = 1000;
for(int i = 0; i < blarg.length; i++){
	int rando = ran.nextInt(1000);
	  blarg[i] = rando;
	  if (i == 0) {
		  smallest = blarg[0];
	  }
	  else if (blarg[i]< smallest) {
		  smallest = blarg[i];
	  }
	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
System.out.println(smallest);
        // 10 print the entire array to see if step 8 was correct
for(int i = 0; i < blarg.length; i++){
	System.out.println(blarg[i]);
	}
        // 11. print the largest number in the array.
int bigBoy;
bigBoy = 0;
for(int i = 0; i < blarg.length; i++){
	  if (i == 0) {
		  bigBoy = blarg[0];
	  }
	  else if (blarg[i]> bigBoy) {
		 bigBoy = blarg[i];
	  }
	}
System.out.println(bigBoy);
        // 12. print only the last element in the array
System.out.println(blarg[49]);
    }
}
