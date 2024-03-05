package actions;
import java.util.Scanner;
public class SubstringAction
{
    //formatting


    public static void main(String[] args)
    {

        //formatting %s
        System.out.println("formatting:\n-----------------");

        //scanner class for reading user input from the console
        Scanner sc = new Scanner(System.in);
        //expect some input
        System.out.println("Welcome to ShoppingLand, <Test>! Please, enter your name to customize your profile!");
        //reading the input using the sc variable
        String userName = sc.nextLine();
        System.out.printf("Welcome to ShoppingLand, %s! Enjoy your shopping journey!", userName);
        System.out.println(" ");

        //replaceAll();
        System.out.println(" ");
        System.out.println("replaceAll() method:\n-------------------------");

        String text = "\t\t\t\t\t\t\t\t\t\t\t\t Laura Karavelova - the girl who died of love\nLaura Karavelova was only 27 years old when she tragically committed suicide." +
                "The love story between her and the poet Peyo Yavorov\n is still talked about today. The cause of death for both of them is their passionate love" +
                        "bordering on madness.\n Lora Karavelova was born on November 8, 1886, and is the daughter of the Bulgarian politician Petko Karavelov" +
                        "and prominent\n socialite Ekaterina Karavelova. Laura Karavelova is the niece of the great Bulgarian writer and revolutionary\n Luben Karavelov." +
                "Laura Karavelova is young, beautiful and well educated. After completing her high school education in Sofia,\n Laura Karavelova studied at the Catholic boarding school \"Notre Dame de Sion\" in Paris, France, and later in Antwerp, Belgium.";
        System.out.println(text);
        System.out.println(" ");
        System.out.println("The same text with replaced name: Laura Karavelova -> DORA GABE");
        System.out.println(" ");
        String replaceText = text.replaceAll("Laura Karavelova","DORA GABE");
        System.out.println(replaceText);

        System.out.println(" ");
        System.out.println("---------------------------------------------------------------");
        System.out.println(" ");

        //equals()
        System.out.println("equals():\n---------------------");
        System.out.println("Please, enter your password:");
        String firstInput = sc.nextLine();
        System.out.println("Please, repeat your password:");
        String secondInput = sc.nextLine();

        if(firstInput.equals(secondInput))
        {
            System.out.println("Welcome in your profile, Maria Vasileva");
        }
        else
        {
            System.out.println("Sorry, your password is wrong");
        }

        System.out.println(" ");
        System.out.println("---------------------------------------------------------------");
        System.out.println(" ");


        // spilt() & length()
        System.out.println(" split() & length():\n-------------------------");
        String myString = "\"Amateurs sit and wait for inspiration, the rest of us just get up and go to work.\" ";
        System.out.println(myString);
        String stringNoSpaces = myString.replace(" ","");
        System.out.println("The length of the string excluding the white spaces is equal to " + myString.replace(" ","").length());
        System.out.println("The number of symbols in the string is: " + stringNoSpaces.length());


        System.out.println(" ");
        System.out.println("---------------------------------------------------------------");
        System.out.println(" ");


        // concat()
        System.out.println("concatenate strings:\n------------------------------");
        String strForConcat1 = "Maria";
        String strForConcat2 = "Georgieva";
        String strForConcat3 = "Vasileva";

        System.out.println(strForConcat1 + " " + strForConcat2 + " " + strForConcat3);
        //or
        String myName = strForConcat1.concat(" ").concat(strForConcat2).concat(" ").concat(strForConcat3);
        System.out.println(myName);

        //-----------------------------------




    }
}
