import java.util.UUID;
import java.util.Random;

public class Character {
    private final String id;
    private String name;
    private int hp;
    private boolean isAlive = true;
    private final CharacterType type;

    public Character(String name, CharacterType type, int hp) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.type = type;
        this.hp = hp;
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

    public void setHp(int hp) {
        this.hp = hp;
        if (this.hp <= 0) {
            this.hp = 0;
            this.isAlive = false;
        }
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public CharacterType getType() {
        return type;
    }
}
