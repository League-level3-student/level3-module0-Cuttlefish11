package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
public static void main(String[] args) {
	
        // 2. create an array of 5 robots.
Robot[] bots = new Robot[3];
        // 3. use a for loop to initialize the robots.
for (int i = 0; i < bots.length; i++) {
	bots[i] = new Robot();
	bots[i].setX(50+(100*i));
	bots[i].setY(554);
}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
boolean racin = true;    
while(racin) {
	Random ran = new Random();
	for(Robot bot : bots){
		bot.setSpeed(700);
		bot.setRandomPenColor();
		bot.penDown();		
	}
	for (int i = 0; i < bots.length; i++) {
	int rando = ran.nextInt(15);
	bots[i].turn(360/359);
	bots[i].move(rando);
			if(bots[i].getY() < 553 && bots[i].getX() < (50+(100*i))) {
				for(Robot bot : bots){
					bot.setSpeed(20);
					bot.turn(360);
				}
				JOptionPane.showMessageDialog(null, "Robot" + (i+1) + " wins!!!");
				racin=false;
			}
	}
}
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.

}
}