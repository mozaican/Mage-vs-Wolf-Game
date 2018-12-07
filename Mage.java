package Game;

public class Mage {

    String name;
    int health;
    int level;
    double damage;

    Mage(String name) {
        this.name = name;
        this.level = 1;
        this.damage = 12.5;
        this.health = 100;
    }

    public double fireBall() {
        return this.damage * this.level;
    }

    public double blastWave() {
        return this.damage * (this.level / 2.0);
    }

    public double takeDamage(double dmg) {
        return this.health -= dmg;
    }

    public boolean isMageDead() {
        if (this.health <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
