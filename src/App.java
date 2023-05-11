import Characters.*;
import Characters.Character;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Witch w = new Witch();
        Character c = (Character) w;
        Fighter f = (Fighter) c;
    }
}
