package Game;

public class Main {

    public static void main(String[] args) {

        Mage johnny = new Mage("Johnny");

        NPC wolf = new NPC("Wolf");
        NPC wolf2 = new NPC("Wolf2");
        NPC wolf3 = new NPC("Wolf2");

        Log.printFireBall(johnny.name, johnny.fireBall(), wolf.name);
        Log.printNPCTakeDamage (wolf.name, wolf.takeDamage(johnny.fireBall()));

        NPC[] mons = new NPC[] {wolf, wolf2, wolf3};

        for (NPC mo: mons) {
            mo.takeDamage(johnny.blastWave());
        }

        Log.printBlastWave(johnny.name, johnny.blastWave());
        Log.printNPCAttack(wolf.name, wolf.attack(), johnny.name);
        Log.printMageTakeDamage(johnny.name, johnny.takeDamage(wolf.attack()));

        //        if (wolf.isNPCDead()) {
//            System.out.println("Monster has died!");
//        }

    }

}
