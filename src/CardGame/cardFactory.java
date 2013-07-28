package CardGame;

/**
 * Created with IntelliJ IDEA.
 * User: Kim
 * Date: 7/27/13
 * Time: 10:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class cardFactory extends playCards {


    public static abstract class basicCard {
        int cost = 0;
        String flavorText = "";
    }

    public static abstract class attackCard extends basicCard {
        int health = 0;
        int attack = 0;


        boolean canAttack = true;
        boolean canAttach = true;
        boolean persists = true;
        boolean heroSlot = false;
        boolean allySlot = true;

        public int attackMob(int attack, int health, int resistance, String attackType) {
               return 0;
        }
    }

    public static class allyCard extends attackCard {
        int health = 0;
        int attack = 0;
        int resistance = 0;


        boolean canAttack = true;
        boolean canAttach = false;
        boolean persists = true;
        boolean heroSlot = false;
        boolean allySlot = true;


        public int attackMob(int attack, int health, int resistance, String attackType) {
            return 0;
        }
    }

    public static abstract class heroCard extends attackCard {
        int health=0;
        String flavorText = "";


        boolean canAttack = true;
        boolean canAttach = false;
        boolean persists = true;
        boolean heroSlot = true;
        boolean allySlot = false;

        public int attackMob(int attack, int health, int resistance, String attackType) {
            return 0;
        }

    }

    public static class abilityCard extends attackCard {

        boolean canAttack = true;
        boolean canAttach = true;
        boolean persists = true;
        boolean heroSlot = false;
        boolean allySlot = false;
    }


}
