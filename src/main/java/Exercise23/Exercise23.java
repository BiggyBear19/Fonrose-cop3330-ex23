/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise23;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner mechanic = new Scanner(System.in);

        System.out.println("Please Enter y or n for the following prompts");
        System.out.println("Is the car silent when you turn the key: ");

        String ans = mechanic.nextLine();


        if(ans.compareTo("y") == 0 | ans.compareTo("Y") == 0){
            System.out.println("Are the battery terminals corroded? ");

            String ans1 = mechanic.nextLine();

            if(ans1.compareTo("y") == 0 | ans.compareTo("Y") == 0){
                System.out.println("Clean out the battery terminals and try again ");

            }
            else{
                System.out.println("Replace cables and try again ");



            }

        }

        else if(ans.compareTo("n") == 0 | ans.compareTo("N") == 0) {
            System.out.println("Does the car make a slicking noise? ");

            String ans2 = mechanic.nextLine();

            if(ans2.compareTo("y") == 0 | ans2.compareTo("Y") == 0){

                System.out.println("Then replace the battery. ");
            }

            else if(ans2.compareTo("n") == 0 | ans2.compareTo("N") == 0){
                System.out.println("Does the car crank up but fail to start? ");

                String ans3 = mechanic.nextLine();

                if(ans3.compareTo("y") == 0 | ans3.compareTo("Y") == 0){
                    System.out.println("Check the spark plug connection ");
                }

                else if(ans3.compareTo("n") == 0 | ans3.compareTo("N") == 0){
                    System.out.print("Does the engine start and then die? ");

                    String ans4 = mechanic.nextLine();

                    if(ans4.compareTo("n") == 0 | ans4.compareTo("N") == 0){
                        System.out.println("This should not be possible ");

                    }


                    if(ans4.compareTo("y") == 0 | ans4.compareTo("Y") == 0){
                        System.out.println("Does your car have a fuel injection? ");

                        String ans5 = mechanic.nextLine();

                        if(ans5.compareTo("y") == 0 | ans5.compareTo("Y") == 0){
                            System.out.println("Then take it in for service ");
                        }

                        else if((ans5.compareTo("n") == 0 | ans5.compareTo("N") == 0)) {
                            System.out.println("Check the the choke to see if it was running properly");
                        }
                    }
                }



            }


        }


    }
}
