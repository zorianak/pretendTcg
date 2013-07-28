package CardGame;

/**
 * Created with IntelliJ IDEA.
 * User: Kim
 * Date: 7/27/13
 * Time: 10:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class playCards {

    public static void main(String[] args) {

        // Create an ally, just for test
        /* IntelliJ is being effing stupid right here */
        createAlly();

    }

    public static void createAlly() {
        System.out.println("I am creating theMage");
        /* We'd really prefer to make a new ally object, but IntelliJ is being a pain in the ass.  Since this is
        just quick and dirty, for now we'll just do this.
         */
        allies.theMage(4, 3, 0);
    }


}
