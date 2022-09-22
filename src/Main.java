import java.util.Scanner;
//import java.lang.String;

/* Sample of what the program is supposed to perform.
 <Output>

Enter the year: 2010 <Enter icon>

Enter the gender: M <Enter icon>

Enter the name: Javier <Enter icon>

Javier is ranked #190 in the year 2010

<End Output>
*/

public class Main {
    public static void main(String[] args) {

        String male = "m";
        String female = "f";

        System.out.println("This program will let you know what rank the name you enter was for the year entered." +
                " Make sure that the year entered is from 2001 to 2010.");

        System.out.print("Enter the year: ");
        Scanner year = new Scanner(System.in);
        int numYear = year.nextInt();

        while(numYear < 2001 || numYear > 2010){
            System.out.print("Enter the year: ");
            numYear = year.nextInt();
        }

        System.out.print("Enter the gender (M/F): ");
        Scanner gender = new Scanner(System.in);
        String genderChar = gender.nextLine();

        boolean strCompareMale = genderChar.equalsIgnoreCase(male);
        //System.out.println("The comparison for male is: " + strCompareMale);
        boolean strCompareFemale = genderChar.equalsIgnoreCase(female);
        //System.out.println("The comparison for female is: " + strCompareFemale);

        //System.out.println("The gender is: " + genderChar);

        while(!strCompareFemale && !strCompareMale){
            //System.out.println("The gender inside while loop is: " + genderChar);
            System.out.print("Enter the gender (M/F): ");
            genderChar = gender.nextLine();
        }

        System.out.print("Enter the name: ");
        Scanner name = new Scanner(System.in);
        String firstName = name.nextLine();


        String[][] boyNames = new String[10][1000];
        String[][] girlNames = new String[10][1000];
    }
}