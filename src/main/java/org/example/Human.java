package org.example;

public class Human  extends org.example.Actor {


    public Human(String name) {
        super(name);
    }
    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }
    public org.example.Actor getActor()
    {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
  //  @Override
   // public void setName(String name) {
  //      super.name = name;
    }


//}
