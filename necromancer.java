public class necromancer {
    private String playername;

    //constructor playername
    public necromancer(String name){
        this.playername = name;
    
    }
    
    //when the player pick the necromancer
    public void introduction() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("So you have been practicing the language of the dead master, the destroyer of life!!");
        Thread.sleep(1000);
        System.out.println("I am glad to see you and have joined the dark side!!, master " + playername);
    }
    public void stats(){
    
    }
}
