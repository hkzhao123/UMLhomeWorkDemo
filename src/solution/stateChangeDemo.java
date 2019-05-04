package solution;
import controller.secretPanelController;
import domain.waitState;
public class stateChangeDemo {
public static void main(String[] args)
{
    secretPanelController controller = new secretPanelController();
    waitState wait = new waitState();
    //直接从wait->lock->open->wait
    System.out.println("it start from waitstate");
    wait.statehandle(controller,true);
    System.out.println(controller.getstate().toString());
    controller.getstate().statehandle(controller,true);
    System.out.println(controller.getstate().toString());
    controller.getstate().statehandle(controller,true);
    System.out.println(controller.getstate().toString());
    System.out.println("the state already return to the initial state");
    //从wait->lock->die
    /*System.out.println("it start from waitstate");
    wait.statehandle(controller,true);
    System.out.println(controller.getstate().toString());
    controller.getstate().statehandle(controller,false);*/

   //从wait->wait
   /* System.out.println("it start from waitstate");
    wait.statehandle(controller,false);
    System.out.println(controller.getstate().toString());
    System.out.println("it still wait!");*/
}

}
