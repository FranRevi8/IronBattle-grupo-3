import java.util.UUID;

public class Character implements Attacker{
    private final String id;
    private String name;
    private int hp;
    private boolean isAlive = true;
    private final CharacterType type;
    private int currentHp;

    public Character(String name, CharacterType type, int hp) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.currentHp = hp;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int hp) {
        this.currentHp = hp;
        if (this.currentHp <= 0) {
            this.currentHp = 0;
            this.isAlive = false;
        }else if(!this.isAlive){
            this.isAlive = true;
        }
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public CharacterType getType() {
        return type;
    }

    @Override
    public void attack(Character characterToAttack) {

    }
}
