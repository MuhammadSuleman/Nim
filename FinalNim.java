package finalnim;

import java.io.*;
import java.util.*;

class FinalNim {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int y;
        boolean validInput = false;
        System.out.println("**********************************");
        System.out.println("*                                *");
        System.out.println("*    ##      ## ## ###    ###    *");
        System.out.println("*    ## ##   ## ## ## #  # ##    *");
        System.out.println("*    ##  ##  ## ## ##  ##  ##    *");
        System.out.println("*    ##   ## ## ## ##  ##  ##    *");
        System.out.println("*    ##      ## ## ##      ##    *");
        System.out.println("*                                *");
        System.out.println("**********************************");

        int pile1 = (int) Math.round(Math.random() * 97) + 3; //chooses random numbers for the pile between 0 and 100

        System.out.println("");
        System.out.println("The pile has " + pile1 + " matches");
        System.out.println("***************************");
        System.out.println("* Please choose game mode *");
        System.out.println("***************************");
        System.out.println("");
        System.out.println("* To play the smart computer press A *");
        System.out.println("");
        System.out.println("");
        System.out.println("* To play the the less smart computer press B *");
        System.out.println("");
        System.out.print("A or B : ");
        //initializing the scanner for user input
        String uResponse = scan.nextLine();
        //checking if the user input is a
        if (uResponse.toLowerCase().equals("a")) {
            //if it is, valid input is set to true
            validInput = true;
        }
        //if the user input is b, 
        if (uResponse.toLowerCase().equals("b")) {
            //valid input is set to true
            validInput = true;
        }
        //if the input is not a or b
        while (!validInput) {
            //this is printed out and the scanner is initialized again
            System.out.println("Please enter the correct option");
            uResponse = scan.nextLine();

            //checking if the user input is a
            if (uResponse.toLowerCase().equals("a")) {
                //if it is, valid input is set to true
                validInput = true;
            }
            //if the user input is b, 
            if (uResponse.toLowerCase().equals("b")) {
                //valid input is set to true
                validInput = true;
            }
        }
        //random generator for the pick 
        Random generator = new Random();
        //boundries set to only 1 and 2
        int pick = generator.nextInt(2) + 1;
        // player field begins
        //if random generator has 1 go throguh this statement
        if (pick == 1) {
            //condition to ensure game doesn't continue once the piles are all 0
            while (pile1 > 0) {
                //this is related to the user input at the top
                if (uResponse.toLowerCase().equals("a")) {

                    validInput = true;
                    //players mive
                    System.out.println("");
                    System.out.println("                *******************");
                    System.out.println("                * Computer's Move *");
                    System.out.println("                *******************");

                    //if pile is 1
                    if (pile1 == 1) {
                        //print this message
                        System.out.println("Congratulations you have won!");
                        //if pile = 2
                    } else if (pile1 == 2) {
                        // take 1 fromt the pile so the user looses
                        pile1 = pile1 - 1;
                        System.out.println("the computer took :" + 1);
                        //if pile = 3, the computer takes 1, it stops the computer from cheating
                        //because sometimes the computer takes out 0
                    } else {
                        //otherwise use the smart computer function to win the game
                        System.out.println("the computer took : " + smartComputer(pile1));
                        //update the pile
                        pile1 = pile1 - smartComputer(pile1);
                        //and print it out
                        System.out.println("the number of matches  remaining is: " + pile1);
                    }
                    //otherwise if response = b
                } else if (uResponse.toLowerCase().equals("b")) {
                    //valid input = true
                    validInput = true;
                    //computers move
                    System.out.println("");
                    System.out.println("                *******************");
                    System.out.println("                * Computer's Move *");
                    System.out.println("                *******************");

                    //if pile
                    //if pile is 1
                    if (pile1 == 1) {
                        //print this message
                        System.out.println("Congratulations you have won!");
                        //if pile = 2
                    } else if (pile1 == 2) {
                        // take 1 fromt the pile so the user looses
                        pile1 = pile1 - 1;
                        System.out.println("the computer took :" + 1);
                        //if pile = 3, the computer takes 1, it stops the computer from cheating
                        //because sometimes the computer takes out 0
                    } else {
                        //otherwise use the smart computer function to win the game
                        int takepc = dumyComputer(pile1);
                        System.out.println("the computer took : " + takepc);

                        //update the pile
                        pile1 = pile1 - takepc;
                        //and print it out
                        System.out.println("the number of matches  remaining is: " + pile1);
                    }
                }

                //player move
                System.out.println("");
                System.out.println("               *****************");
                System.out.println("               * Player's move *");
                System.out.println("               *****************");
                //if theres only 1 match in the pile
                if (pile1 == 1) {
                    //prints this 
                    System.out.println("you lost ");
                    //ends the game
                    break;
                }
                //to prevent the user from crashing the program
                //i used a do while loop
                do {

                    //asks the user for an integer
                    // System.out.println("");
                    System.out.print("When you ready, press 1 and enter ");

                    // System.out.print("");
                    // if this is not here then the program goes into an ininate loop
                    scan.next();
                    System.out.print("How Many Matches: ");
                    //this checks if the next token is an integer
                    //if its not, the it goes back to the do loop
                } while (!scan.hasNextInt());

                //for user inpu 
                y = scan.nextInt();
                //condition to make sure the can only half matches in the pile
                while (y > pile1 / 2) {
                    //if he tries taking more, this is printed out
                    System.out.println("The number of matches has to be between " + 1 + " and " + pile1 / 2);
                    //and the scanner is initialised again for user input
                    y = scan.nextInt();
                }

                //then the user input is minused from the pile
                pile1 = pile1 - y;
                //and the remainder is printed out
                System.out.println("the number of matches  remaining is: " + pile1);
            }
        }
        // if random pick is 2
        if (pick == 2) {

            //condition to ensure game doesn't continue once the piles are all 0
            while (pile1 > 0) {
                //players move
                System.out.println("");
                System.out.println("               *****************");
                System.out.println("               * Player's move *");
                System.out.println("               *****************");

                if (pile1 == 1) {
                    //prints this 
                    System.out.println("you lost ");
                    //ends the game
                    break;
                }
                do {

                    //asks the user for an integer
                    //System.out.println("");
                    System.out.print("When you ready, press 1 and enter ");

                    // System.out.print("");
                    // if this is not here then the program goes into an ininate loop
                    scan.next();
                    System.out.print("How Many Matches: ");
                    //this checks if the next token is an integer
                    //if its not, the it goes back to the do loop
                } while (!scan.hasNextInt());

                //for user inpu 
                y = scan.nextInt();
                //condition to make sure the can only half matches in the pile
                while (y > pile1 / 2) {
                    //if he tries taking more, this is printed out
                    System.out.println("The number of matches has to be between " + 1 + " and " + pile1 / 2);
                    //and the scanner is initialised again for user input
                    y = scan.nextInt();
                }

                //then the user input is minused from the pile
                pile1 = pile1 - y;
                //and the remainder is printed out
                System.out.println("the number of matches  remaining is: " + pile1);

                //smart computer 
                //if the response is a or b
                if (uResponse.toLowerCase().equals("a")) {
                    //valid input is true
                    validInput = true;
                    //computers move
                    System.out.println("");
                    System.out.println("                *******************");
                    System.out.println("                * Computer's Move *");
                    System.out.println("                *******************");

                    // if pile is 1
                    if (pile1 == 1) {
                        //print this message
                        System.out.println("Congratulations you have won!");
                        //if pile = 2
                    } else if (pile1 == 2) {
                        // take 1 fromt the pile so the user looses
                        pile1 = pile1 - 1;
                        System.out.println("the computer took :" + 1);
                        //if pile = 3, the computer takes 1, it stops the computer from cheating
                        //because sometimes the computer takes out 0
                    } else {
                        //otherwise use the smart computer function to win the game
                        System.out.println("the computer took : " + smartComputer(pile1));
                        //update the pile
                        pile1 = pile1 - smartComputer(pile1);
                        //and print it out
                        System.out.println("the number of matches  remaining is: " + pile1);
                    }

                    //otherwise if response b
                } else if (uResponse.toLowerCase().equals("b")) {
                    //valid input is true
                    validInput = true;
                    System.out.println("");
                    System.out.println("                *******************");
                    System.out.println("                * Computer's Move *");
                    System.out.println("                *******************");

                    //if pile is equal to 1
                    if (pile1 == 1) {
                        //print this message
                        System.out.println("Congratulations you have won!");
                        //if pile = 2
                    } else if (pile1 == 2) {
                        // take 1 fromt the pile so the user looses
                        pile1 = pile1 - 1;
                        System.out.println("the computer took :" + 1);
                        //if pile = 3, the computer takes 1, it stops the computer from cheating
                        //because sometimes the computer takes out 0
                    } else {
                        //otherwise use the smart computer function to win the game
                        int takepc = dumyComputer(pile1);
                        System.out.println("the computer took : " + takepc);
                        //update the pile
                        pile1 = pile1 - takepc;
                        //and print it out
                        System.out.println("the number of matches  remaining is: " + pile1);
                    }
                }
            }
        }
    }

    //this functions checks if the number is a power of 2
    static boolean p2(int x) {
        //while x modula 2 is 0 and x greater than 1
        while (((x % 2) == 0) && x > 1) {
            //divide it by 2
            x /= 2;
        }
        //and return x 
        return (x == 1);
    }
    //this function tries to give the user a prime number 
    //if the number is not a power of 2

    static int smartComputer(int x) {
        //if the number is a power of 2
        if (p2(x + 1)) {

            //then the best thing the computer can do is pick a random number
            return (int) Math.random() * ((x / 2) - 1) + 1;
        } else {
            //if its not
            //it tries to give the user 2 to the power of n, - 1.
            int n = 1;
            //this while loop goes up the powers of 2 untill
            //it reaches the one higher than the number and - 1 power and takes that
            while (Math.pow(2, n) < x) {

                n++;
            }
            //it takes that power and minuses - from it
            return x - ((int) Math.pow(2, n - 1) - 1);
        }
    }
    //this function just picks a random number from the pile

    static int dumyComputer(int x) {
        Random generator = new Random();
        //if you dont add the 1 at the end, the computer takes 0 sometimes
        int take = generator.nextInt(x / 2) + 1;
        // int take= (int)Math.random()*((x/2) - 1) +1;
        return take;
    }
}
