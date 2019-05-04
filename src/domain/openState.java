package domain;
import controller.*;
public class openState implements  secretPanelState{
    public openState(){}
    public void statehandle(secretPanelController state,boolean f){
        System.out.println("你已经安全关闭了宝藏");
        state.setstate(new waitState());
    }
    public String toString()
    {
        return "open state";
    }
}
