package paint;
import java.util.Scanner;
//The program will first take in the dimensions of the room, the height, width and length of the room and then it will output the necessary information, the area and volume and amount of paint needed
public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    Prog c = new Prog(); //creates an object for the user to use for their inputs
    System.out.println("Enter the height of the room");

    double height = scan.nextFloat();



    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter the length of the room");

    double length = sc1.nextFloat();



    Scanner sc2 = new Scanner(System.in);



    System.out.println("Enter the width of the room");
    double width = sc2.nextFloat();



    System.out.println("The area of the room is:"+ c.area(length, width)+"m^2"); //The program will then output the information and call the necessary methods
    System.out.println("The volume of the room is:"+c.volume(length, width, height)+"m^3");
    System.out.println("The amount of paint needed is:"+c.paintvalue(height,width)+"l");
    //These commands will call the methods and output the necessary values from the necessary calculations made


    }
}
