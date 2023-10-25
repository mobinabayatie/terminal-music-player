public class player2  extends  player1 {
    private int health;
    private boolean shield;

    public player2(String name, String weapon, int health, boolean shield) {
        super(name, weapon, health);
        this.health = health;
        this.shield = shield;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void damagebygun1() {
        if (shield) {
            this.health -= 10;
            if (this.health <= 0)
                this.health = 0;
            System.out.println("shield is out.got hit by gun1 health is redused by 10.new health is " + this.health);
            if (!shield) {
                this.health -= 30;
                if (this.health <= 0) this.health = 0;
                System.out.println("Shield is OFF! Got hit by Gun1.Health is reduced by 30. New Health is: " + this.health);
            }
            if (this.health == 0) {
                System.out.println(getName() + " is dead!");

            }
        }

    }

}
