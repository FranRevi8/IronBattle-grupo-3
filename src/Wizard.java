public class Wizard extends Character implements Attacker{
    private int mana;
    private final int intelligence;

    public Wizard(String name, CharacterType type, int hp, int mana, int intelligence) {
        super(name, type, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }


    @Override
    public void attack(Character characterToAttack) {

    }
}

