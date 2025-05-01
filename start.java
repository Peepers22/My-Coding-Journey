
import java.util.Scanner;
public class start {
//necromancer necro = new necromancer();
Scanner sc = new Scanner(System.in);
String playerclass;
String playername;


public void chooseyourclass() throws InterruptedException {
StringBuilder name = new StringBuilder("Ohh... welcome back master _____!");
System.out.println("Hello Welcome to lostworld!");
Thread.sleep(3000);
System.out.println(name);
Thread.sleep(1000);
System.out.print("Enter your Name: ");
playername = sc.nextLine();
name.replace(27, 32, playername);
System.out.println(name);

}



    public static void main(String[] args){
    start start = new start();
    try {
        start.chooseyourclass();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
   
    }
}