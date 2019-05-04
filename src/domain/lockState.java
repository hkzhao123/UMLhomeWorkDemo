package domain;
import controller.secretPanelController;
public class lockState  implements secretPanelState{
    public  lockState(){

    }
    public void statehandle(secretPanelController state,boolean Iscandlein){
        if(Iscandlein)
        {
            System.out.println("宝藏打开了!");
            state.setstate(new openState());
        }
        else
        {
            System.out.println("you are dead by the rabbit!");
            System.exit(0);
        }
    }
    public String toString(){
        return "lock state";
    }
}
