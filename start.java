
import java.util.Scanner;
public class start {
Scanner sc = new Scanner(System.in);
String playerclass;
private String playername;
private necromancer necro;



//Choosing class and name
public void chooseyourclass() throws InterruptedException {
//intro name
StringBuilder name = new StringBuilder("Ohh... welcome back Master errm..?");
System.out.println("Hello Welcome to lostworld!");
Thread.sleep(3000);
System.out.println(name);
Thread.sleep(1000);
System.out.println("-----------------------");
System.out.print("Enter your Name: ");
playername = sc.nextLine();
name.replace(27, 34, playername);
Thread.sleep(500);
System.out.println("...");
Thread.sleep(500);
System.out.println("...");
Thread.sleep(500);
System.out.println("...");
Thread.sleep(500);
System.out.println("...");
Thread.sleep(500);
System.out.println(name +"!");

necro = new necromancer(playername);
necro.introduction();



}

//playername getter
public String getPlayerName(){
    return playername;
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