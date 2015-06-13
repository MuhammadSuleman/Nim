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
        String uResponse = scan.nextLine();
        if (uResponse.toLowerCase().equals("a")) {
            validInput = true;
            System.out.println(validInput);
        }

        if (uResponse.toLowerCase().equals("b")) {
            validInput = true;
            System.out.println(validInput);
        }
        System.out.print("");



        while (!validInput) {

            System.out.println("please enter a number");
            uResponse = scan.nextLine();

            if (uResponse.toLowerCase().equals("a")) {
                validInput = true;
                System.out.println(validInput);
            }

            if (uResponse.toLowerCase().equals("b")) {
                validInput = true;
                System.out.println(validInput);
            }


        }

        Random generator = new Random();
        int pick = generator.nextInt(2) + 1;

        System.out.println(pick);



        // player field begins
        if (pick == 1) {

            while (pile1 > 0) //condition to ensure game doesn't continue once the piles are all 0
            {

                if (uResponse.toLowerCase().equals("a")) {
                    System.out.println("im smart********************");
                    validInput = true;

                    System.out.println("");
                    System.out.println("                *******************");
                    System.out.println("                * Computer's Move *");
                    System.out.println("                *******************");


                    if (pile1 == 1) {
                        System.out.println("Congratulations you have won!");
                    } else if (pile1 == 2) {
                        pile1 = pile1 - 1;
                        System.out.println("the computer took :" + 1);

                    } else {
                        System.out.println("the computer took : " + smartComputer(pile1));
                        pile1 = pile1 - smartComputer(pile1);

                        System.out.println("the number of matches  remaining is: " + pile1);

                        if (pile1 == 0) {
                            System.out.println("Congratulations you have won!");
                        }

                    }

                } else if (uResponse.toLowerCase().equals("b")) {
                    System.out.println("im dumb ********************");
                    validInput = true;
                    System.out.println("");
                    System.out.println("                *******************");
                    System.out.println("                * Computer's Move *");
                    System.out.println("                *******************");


                    if (pile1 == 1) {
                        System.out.println("Congratulations you have won!");
                    } else if (pile1 == 2) {
                        pile1 = pile1 - 1;
                        System.out.println("the computer took :" + 1);

                    } else {
                        System.out.println("the computer took : " + dumyComputer(pile1));
                        pile1 = pile1 - dumyComputer(pile1);

                        System.out.println("the number of matches  remaining is: " + pile1);

                        if (pile1 == 0) {
                            System.out.println("Congratulations you have won!");
                        }

                    }

                }



                System.out.println("");
                System.out.println("               *****************");
                System.out.println("               * Player's move *");
                System.out.println("               *****************");
                // int y = scan.nextInt();

                if (pile1 == 1) {
                    System.out.println("you lost ");
                    break;
                }

                do {


                    System.out.println("");
                    System.out.print("How Many Matches: ");
                    System.out.print("");
                    scan.next();

                } while (!scan.hasNextInt());




                y = scan.nextInt();

                while (y > pile1 / 2) {
                    System.out.println("The number of matches has to be between " + 1 + " and " + pile1 / 2);
                    y = scan.nextInt();
                }


                pile1 = pile1 - y;

                System.out.println("the number of matches  remaining is: " + pile1);





            }
        }
        if (pick == 2) {



            while (pile1 > 0) //condition to ensure game doesn't continue once the piles are all 0
            {

                System.out.println("");
                System.out.println("               *****************");
                System.out.println("               * Player's move *");
                System.out.println("               *****************");


                if (pile1 == 1) {
                    System.out.println("you lost ");
                    break;
                }
                do {
                    System.out.println("");
                    System.out.print("How Many Matches: ");
                    System.out.print("");
                } while (!scan.hasNextInt());
                y = scan.nextInt();

                while (y > pile1 / 2) {
                    System.out.println("The number of matches has to be between " + 1 + " and " + pile1 / 2);
                    y = scan.nextInt();

                }

                pile1 = pile1 - y;

                System.out.println("the number of matches  remaining is: " + pile1);


                if (uResponse.toLowerCase().equals("a")) {
                    System.out.println("im smart********************");
                    validInput = true;

                    System.out.println("");
                    System.out.println("                *******************");
                    System.out.println("                * Computer's Move *");
                    System.out.println("                *******************");


                    if (pile1 == 1) {
                        System.out.println("Congratulations you have won!");
                    } else if (pile1 == 2) {
                        pile1 = pile1 - 1;
                        System.out.println("the computer took :" + 1);

                    } else {
                        System.out.println("the computer took : " + smartComputer(pile1));
                        pile1 = pile1 - smartComputer(pile1);

                        System.out.println("the number of matches  remaining is: " + pile1);

                        if (pile1 == 0) {
                            System.out.println("Congratulations you have won!");
                        }

                    }

                } else if (uResponse.toLowerCase().equals("b")) {
                    System.out.println("im dumb ********************");
                    validInput = true;
                    System.out.println("");
                    System.out.println("                *******************");
                    System.out.println("                * Computer's Move *");
                    System.out.println("                *******************");


                    if (pile1 == 1) {
                        System.out.println("Congratulations you have won!");
                    } else if (pile1 == 2) {
                        pile1 = pile1 - 1;
                        System.out.println("the computer took :" + 1);

                    } else {
                        System.out.println("the computer took : " + dumyComputer(pile1));
                        pile1 = pile1 - dumyComputer(pile1);

                        System.out.println("the number of matches  remaining is: " + pile1);

                        if (pile1 == 0) {
                            System.out.println("Congratulations you have won!");
                        }

                    }

                }



            }
        }


    }

    static boolean p2(int x) {
        while (((x % 2) == 0) && x > 1) {
            x /= 2;
        }
        return (x == 1);
    }

    static int smartComputer(int x) {
        if (p2(x + 1)) {
            return (int) Math.random() * ((x / 2) - 1) + 1;
        } else {
            int n = 1;
            while (Math.pow(2, n) < x) {
                n++;
            }
            return x - ((int) Math.pow(2, n - 1) - 1);
        }
    }

    static int dumyComputer(int x) {
        Random generator = new Random();
        int take = generator.nextInt(x / 2);
        // int take= (int)Math.random()*((x/2) - 1) +1;
        return take;

    }
}
