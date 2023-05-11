package Characters;

public class Witch extends Enemy
{
    public void move()    
    {
        System.out.printf("This enemy is a witch type\n");
        super.move();
        System.out.printf("Beware of the cast/spell witch will make!\n");
    }
}
