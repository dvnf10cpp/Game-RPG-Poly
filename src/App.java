import Characters.*;
import Characters.Character;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Hero hero1 = new Hero();
        Enemy enemy1 = new Enemy();
        System.out.printf("Demo Soal 1 Bagian A\n");
        System.out.printf("=".repeat(40) + "\n");
        hero1.move();
        hero1.move("south");
        System.out.printf("-".repeat(40) + "\n");
        enemy1.move();
        enemy1.move(4);
        System.out.printf("=".repeat(40) + "\n");

        Character defaultChar = new Character();
        Character hero2 = new Hero();
        Character enemy2 = new Enemy();
        Character witch2 = new Witch();
        Character fighter2 = new Fighter();
        System.out.printf("Demo Soal 1 Bagian B\n");
        System.out.printf("=".repeat(40) + "\n");
        defaultChar.move();
        System.out.printf("-".repeat(40) + "\n");
        hero2.move();
        System.out.printf("-".repeat(40) + "\n");
        enemy2.move();
        System.out.printf("-".repeat(40) + "\n");
        witch2.move();
        System.out.printf("-".repeat(40) + "\n");
        fighter2.move();
        System.out.printf("=".repeat(40) + "\n");

        System.out.printf("Demo Soal 1 Bagian C\n");
        Character witch3 = new Witch();
        ((Fighter)witch3).move();
    }
}
