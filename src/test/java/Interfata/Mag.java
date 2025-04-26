package Interfata;

public class Mag implements Hero{
    private int hp = HP;

    @Override
    public void attack(){
        System.out.println("Magul lanseaza un atac de foc!");
    }

    @Override
    public void defend(){
        System.out.println("Magul creeaza un scut magic!");
    }

    //metoda care reduce HP-ul
    public void takeDamage(int damage){
        if (damage>0){
            hp -= damage;
            if (hp<0){
                hp = 0; //hp-ul meu nu poate fi mai mic de 0
            }
            System.out.println("Magul a luat " + damage + "damage. HP ramas: " + hp);
        }
        else{
            System.out.println("Damage invalid!");
        }
    }

    //metoda pentru a verifica HP-ul curent
    public int getHP(){
        return hp;
    }
}
