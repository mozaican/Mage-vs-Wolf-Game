package Game;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {

    static void printFireBall(String nameMage, double damageFireBall, String nameNPC) {
        System.out.println(nameMage + " casts Fireball spell and deals " + damageFireBall + " damage to " + nameNPC);
    }

    static void printBlastWave(String name, double damageBlastWave) {
        System.out.println(name + " casts Blastwave spell and deals " + damageBlastWave + " to every NPC");
    }

    static void printNPCAttack(String nameNPC, double damageBlastWave, String nameMage) {
        System.out.println(nameNPC + " attacks and deals " + damageBlastWave + " damage to " + nameMage);
    }

    static void printMageTakeDamage(String nameMage, double health) {
        System.out.println(nameMage + " loses " + health + " health");
    }

    static void printNPCTakeDamage(String nameNPC, double health) {
        System.out.println(nameNPC + " loses " + health + " health");
    }

    static void log() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }


}
