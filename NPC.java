package Game;

public class NPC {

    String name;
    int level;
    double health;
    double damage;

    NPC(String name) {
        this.name = name;
        this.level = 1;
        this.damage = 6.5;
        this.health = 50;
    }

    public double attack() {
        return this.damage * this.level;
    }

    public double takeDamage(double damage) {
        return this.health -= damage;
    }

    public boolean isNPCDead() {
        if (this.health <= 0) {
            return true;
        }
        else {
            return false;
        }
    }



}
