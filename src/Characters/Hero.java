package Characters;

public class Hero extends Character
{
    public void move()    
    {
        System.out.printf("Hero use move!\n");
        System.out.printf("Hero is on the way!\n");
    }

    public void move(String direction)
    {
        System.out.printf("Hero use move!\n");
        System.out.printf("Hero move to %s direction!\n",direction);
    }
}
