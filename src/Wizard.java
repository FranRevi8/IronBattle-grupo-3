import java.util.Random;

public class Wizard extends Character{
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

        Random random = new Random();

        int damageHeavyAttack = intelligence;
        int damageWeakAttack = 2;
        int attackToDo = 1 + random.nextInt(2);
        int hp = characterToAttack.getHp();
        int currentHp = characterToAttack.getCurrentHp();

        if(attackToDo == 1){
            currentHp -= damageHeavyAttack;
        }else{
            currentHp -= damageWeakAttack;
        }
        characterToAttack.setCurrentHp(currentHp);

        System.out.println("\n" + this.getName() + " ha atacado y ha dejado a " + characterToAttack.getName() +" con " + characterToAttack.getCurrentHp() + " puntos de vida.");
    }
}

