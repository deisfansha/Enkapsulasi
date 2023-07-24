package parent;

public class Armor{
    private int strenght;
    private String name;
    private int health;
    public  Armor(String name, int strenght, int health){
        this.name = name;
        this.strenght = strenght;
        this.health = health;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getDefencePower() {
        return this.strenght*2;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getAddHealth() {
        return this.strenght*10 + this.health;
    }
}
