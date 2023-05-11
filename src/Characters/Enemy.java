package Characters;

public class Enemy extends Character
{
    public void move()    
    {
        System.out.printf("Enemy use move!\n");
    }

    public void move(int step)
    {
        System.out.printf("Enemy use move!\n");
        System.out.printf("Enemy moved %d %s\n",step,(step > 1 ? "steps" : "step"));
    }
}
