package org.example;

public interface ActorBehaviour {
    void setMakeOrder(boolean make);
    void setTakeOrder(boolean take);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();

}
