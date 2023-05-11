package Characters;

public class Fighter extends Hero
{
    public void move()    
    {
        System.out.printf("This hero is a fighter type\n");
        super.move();
        System.out.printf("Fighter will defend you using their greatest ultimate move!\n");
    }
}
