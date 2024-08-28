import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBienvenido al juego IRONBATTLE");
        System.out.println("\nElige al primer personaje:");

        String name;
        CharacterType type;
        int hp;

        Character character1;
        Character character2;

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        for (CharacterType character : CharacterType.values()) {
            System.out.println(character.ordinal() + "-" + character.name());
        }
        ;

        int response = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nEl tipo de personaje elegido es " + CharacterType.values()[response]);
        System.out.println("\n¿Como llamamos a este personaje?");

        name = scanner.nextLine();

        System.out.println("\nEl nombre elegido es  " + name);

        switch (CharacterType.values()[response]) {
            case WIZARD:
                int mana = 10 + random.nextInt(41);
                int intelligence = 1 + random.nextInt(50);
                hp = 100 + random.nextInt(101);
                character1 = new Wizard(name, CharacterType.WIZARD, hp, mana, intelligence);
                break;
            case WARRIOR:
                int strength = 1 + random.nextInt(10);
                int stamina = 10 + random.nextInt(41);
                hp = 100 + random.nextInt(101);
                character1 = new Warrior(name, CharacterType.WARRIOR, hp, strength, stamina);
                break;
            default:
                character1 = null;
        }
        ;

        System.out.println("\nElige al segundo personaje:");

        for (CharacterType character : CharacterType.values()) {
            System.out.println(character.ordinal() + "-" + character.name());
        }
        ;

        response = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nEl tipo de personaje elegido es " + CharacterType.values()[response]);
        System.out.println("\n¿Como llamamos a este personaje?");

        name = scanner.nextLine();

        System.out.println("\nEl nombre elegido es  " + name);

        switch (CharacterType.values()[response]) {
            case WIZARD:
                int mana = 10 + random.nextInt(41);
                int intelligence = 1 + random.nextInt(50);
                hp = 100 + random.nextInt(101);
                character2 = new Wizard(name, CharacterType.WIZARD, hp, mana, intelligence);
                break;
            case WARRIOR:
                int strength = 1 + random.nextInt(10);
                int stamina = 10 + random.nextInt(41);
                hp = 100 + random.nextInt(101);
                character2 = new Warrior(name, CharacterType.WARRIOR, hp, strength, stamina);
                break;
            default:
                character2 = null;
        }
        ;

        System.out.println("\n¡Que comience la batalla entre " + character1.getName() + " y " + character2.getName() + "!");


    }
}