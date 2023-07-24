import parent.Armor;
import parent.Player;
import parent.Weapon;

public class Main {
    public static void main(String[] args) {

        //objek player 1
        Player player1 = new Player("Dimas");
        Armor armor1 = new Armor("Baju Besi", 5,100);
        Weapon weapon1 = new Weapon("Pedang", 30);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);


        //Objek Player 2
        Player player2 = new Player("Ucok");
        Armor armor2 = new Armor("Kaos PDIP", 2,40);
        Weapon weapon2 = new Weapon("Cangkul", 20) ;
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);


        player1.display();
        player2.display();
        player1.attackLawan(player2);

    }
}