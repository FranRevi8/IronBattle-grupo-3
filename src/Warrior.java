public class Warrior extends Character implements Attacker{
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
    public void attack(Character character) {


    }
}
