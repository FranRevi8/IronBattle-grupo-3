import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        play();
    }

    private static void play() {
        System.out.println("\nBienvenido al juego IRONBATTLE");
        System.out.println("\nLas reglas son las siguientes:");
        System.out.println("\n1. Se enfrentarán dos personajes. Tienes que elegir la clase de cada uno, además de sus nombres.");
        System.out.println("2. Una vez creados los personajes, pulsa ENTER para iniciar el combate y después de cada turno para continuar.");
        System.out.println("3. ¡Sólo puede quedar uno! El combate continuará hasta que alguno de los combatientes sea dado de baja.");
        System.out.println("4. Si los dos personajes mueren a la vez habrá empate. El combate se repetirá.");
        System.out.println("5. Escribe X y pulsa ENTER en cualquier momento para salir.");
        System.out.println("\nElige la clase del primer personaje:");

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

        String input = scanner.nextLine();

        if (input.toLowerCase().equals("x")) {
            return;
        }

        int response = Integer.parseInt(input);

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

        System.out.println("\nElige la clase del segundo personaje:");

        for (CharacterType character : CharacterType.values()) {
            System.out.println(character.ordinal() + "-" + character.name());
        }
        ;

        input = scanner.nextLine();
        if (input.toLowerCase().equals("x")) {
            return;
        }

        response = Integer.parseInt(input);

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

        System.out.println("\n¡Se enfrentarán " + character1.getName() + " y " + character2.getName() + "!");
        System.out.println("\n" + character1.getName() + " cuenta con " + character1.getHp() + " puntos de vida" + " y " + character2.getName() + " cuenta con " + character2.getHp()+ ".");

        switch(character1.getType()){
            case WIZARD :
                Wizard wizard = (Wizard) character1;
                System.out.println(character1.getName() + " tiene " + wizard.getMana() + " puntos de Maná y " + wizard.getIntelligence() + " puntos de Inteligencia.");
                break;
            case WARRIOR:
                Warrior warrior = (Warrior) character1;
                System.out.println(character1.getName() + " tiene " + warrior.getStamina() + " puntos de Estamina y " + warrior.getStrength() + " puntos de Fuerza.");
                break;
            default:
        }

        switch(character2.getType()){
            case WIZARD :
                Wizard wizard = (Wizard) character2;
                System.out.println(character2.getName() + " tiene " + wizard.getMana() + " puntos de Maná y " + wizard.getIntelligence() + " puntos de Inteligencia.");
                break;
            case WARRIOR:
                Warrior warrior = (Warrior) character2;
                System.out.println(character2.getName() + " tiene " + warrior.getStamina() + " puntos de Estamina y " + warrior.getStrength() + " puntos de Fuerza.");
                break;
            default:
        }

        System.out.println("\n¡Empieza el combate!");
        do {
            System.out.println("\nPulsa ENTER para continuar");

            input = scanner.nextLine();
            if (input.toLowerCase().equals("x")) {
                return;
            }

            character1.attack(character2);
            character2.attack(character1);

            if(!character1.getIsAlive() && !character2.getIsAlive()) {
                System.out.println("\n¡Ha habido un empate!");
                System.out.println("\nSe procede a la revancha");

                character1.setCurrentHp(character1.getHp());
                character2.setCurrentHp(character2.getHp());
            }

        } while (character1.getIsAlive() && character2.getIsAlive());

        if (character1.getIsAlive()) {
            System.out.println("\n¡Ha ganado " + character1.getName() + "!");
        } else  {
            System.out.println("\n¡Ha ganado " + character2.getName() + "!");
        }

    }

}
