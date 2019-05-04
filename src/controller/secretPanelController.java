package controller;
import domain.*;
public class secretPanelController {
    private secretPanelState state;
public secretPanelController(){
    state = null;
}
public void setstate(secretPanelState state){
this.state =  state;
}
public secretPanelState getstate()
{
    return state;
}
}
