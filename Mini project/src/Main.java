import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	
    	char ans; //decision of the player
        int n = 30; //max number to guess
        int Max = 5; //Lives of the player
        
        System.out.println("Guess a number I am thinking about.");
     
        System.out.println("You have "+ Max+ " lives.");//Shows how many lives does the player has
        
        Scanner myobj = new Scanner(System.in); //for taking user input
        do {
        	
        	int randomNum= (int) (Math.random()*31); //syntax for generating random number
        	
        for(int i = 1; i<= Max; i++){
        	
            System.out.println("Lives used: "+i);
            System.out.println("Guess from 0 to 30");
    
            int num = myobj.nextInt(); //for taking integer type user input
            
            if (num> n || num<0) { //condition for when the player enters number more than the max guessing number or less than zero 
            	System.out.println("Give a number inside the range!!IDIOT!!");
            	System.out.println("Your punishment! You loose your one life! Hmph!");
            }
            
            if(num == randomNum){ //condition for when the number guessed by payer is same as the random number generated
                System.out.println("YAY!! You guessed it!🎉🥳");
                break;
                
            }
            
            else if(num>randomNum){ //condition for when number guessed by the player is greater than the number generated
                System.out.println("Lower...");
            }
            
            else{ //condition for when the number guessed by the player is less than the number generated
                System.out.println("Higher...");
            }
            
            if(i== Max){ //condition if the player is out of lives 
                System.out.println("Ooops!! Looks like you ran out of lives...😔");
            }
        }
        System.out.println("The number i was thinking about was: "+randomNum); //Shows the number it generated
        
         ans = myobj.next().charAt(0); //takes character type user input
         
         System.out.println("Do you want to continue? "); //Asks if the player wants to continue
         System.out.println("If yes, type y. If no, type n");
         
        }while (ans == 'Y' || ans == 'y');
        
        //Condition if player doesn't want to continue
        
        if(ans=='n'||ans == 'N') {
        	System.out.println("Thanks for playing!😄 Hope you enjoyed!");
        }
        
        myobj.close();
    }
}
