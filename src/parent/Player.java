package parent;

public class Player {
    private  String name;
    private int basehealth;
    private int baseAttack;
    private Armor armor;
    private  Weapon weapon;
    private int level;
    private int incrementHealth;
    private int incrementAttack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
        this.basehealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
    }

    private void levelUp(){
        this.level++;
    }

    public void attackLawan(Player opponent){
        //Hitung damage
        int damage = this.getAttackPower();
        //Print event
        System.out.println("Player \t\t:"+this.name+" is Attacking "+opponent.getName()+" with "+damage+"\n");
        opponent.defence(damage);
    }

    private int getAttackPower(){
        return this.baseAttack + this.level*this.incrementAttack+this.weapon.getAttack();
    }

    public void defence(int damage){
        int deltadamage = damage - this.armor.getDefencePower();
        this.totalDamage = this.damage+deltadamage;
    }
    public void setArmor(Armor armor1){
        this.armor = armor1;
    }

    public int maxHealth(){
        return this.basehealth + this.level*this.incrementHealth+ this.armor.getAddHealth();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }



    public void display(){
        System.out.println("Player : "+this.name);
        System.out.println("Level : "+this.level);
        System.out.println("Max Health : "+this.maxHealth());
        System.out.println("Attack : "+this.getAttackPower()+"\n");
    }
}
