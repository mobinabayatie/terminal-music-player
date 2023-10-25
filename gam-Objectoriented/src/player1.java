public class player1 {
    private String name;
    private String weapon;
    private int health;
    public  String getName(){
        return name;
    }
    public  void setName(String name){
        this.name=name;
    }
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public player1(String name, String weapon, int health) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        if (health<0||health>100)
            this.health=100;
        else this.health=health;

    }

    public void damagebycun1() {
        this.health -= 30;
        if (this.health <= 0) {
            this.health = 0;
        }
        System.out.println("got hit by gun.health redused by 30 now your health is" + this.health);
        if (this.health == 0) {
            System.out.println("player is dead");
        }

    }
    public  void heal(){
        if (this.health<=0) System.out.println("player is dead heal is not possible");
        else  this.health=100;
    }

    public void damagebygun2() {
        this.health -= 50;
        if (this.health <= 0) {
            this.health = 0;

            System.out.println("got hit by gun.health redused by 30 now your health is" + this.health);
            if (this.health == 0) {
                System.out.println(getName()+" is dead");
            }

        }
    }
}