import java.util.Random;

public class Warrior extends Character {
    private int stamina;
    private final int strength;

    public Warrior(String name, CharacterType type, int hp, int stamina, int strength) {
        super(name, type, hp);
        this.stamina = stamina;
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }


    @Override
    public void attack(Character characterToAttack) {

        Random random = new Random();

        int damageHeavyAttack = strength;
        int damageWeakAttack = strength / 2;
        int attackToDo = 1 + random.nextInt(2);
        int hp = characterToAttack.getHp();
        int currentHp = characterToAttack.getCurrentHp();

        if (attackToDo == 1 && stamina >= 5) {
            currentHp -= damageHeavyAttack;
            stamina -= 5;
            System.out.println("\n" + this.getName() + " usa un Ataque Pesado");
        } else {
            currentHp -= damageWeakAttack;
            stamina += 1;
            System.out.println("\n" + this.getName() + " usa un Ataque Ligero");
        }
        characterToAttack.setCurrentHp(currentHp);

        super.attack(characterToAttack);
        System.out.println("La Estamina restante de " + this.getName() + " es " + this.getStamina());

    }
}
