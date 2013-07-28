package CardGame;

/**
 * Created with IntelliJ IDEA.
 * User: Kim
 * Date: 7/28/13
 * Time: 1:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class allies extends cardFactory.allyCard {
    public static void theMage(int cost, int attack, int resistance) {

        cardFactory.allyCard theMage = new cardFactory.allyCard();

        theMage.cost = cost;
        theMage.attack = attack;
        theMage.resistance = resistance;

        String flavorText = "This mage represents everything that is wrong with Java.";
        System.out.println(flavorText);
    }

}


