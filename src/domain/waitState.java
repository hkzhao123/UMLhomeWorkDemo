package domain;
import controller.secretPanelController;
public class waitState implements secretPanelState{

    public waitState(){
    }
    public void  statehandle(secretPanelController state,boolean isdoorclose){
        if(isdoorclose)
        {
            System.out.println("the lock  reveals!");
state.setstate(new lockState());
        }
        else {
            System.out.println("still wait");
            state.setstate(this);
        }
    }
  public String toString()
  {
      return "wait state";
  }
}
