package org.example;
import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour{
 //   List <org.example.Actor> orders = new LinkedList<>();
    Queue <org.example.Actor> que = new ArrayDeque<>();

    @Override
    public void acceptToMarket(org.example.Actor actor) {
        System.out.println(actor.getActor().getName() + " Покупатель зашел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(org.example.Actor actor) {
        this.que.add(actor);
        System.out.println(actor.getActor().getName() + " Покупатель встал в очередь");
    }

    @Override
    public void takeOrder() {
        for (org.example.Actor actor : que) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " Покупатель заказал товары");

            }
        }
    }

    @Override
    public void giveOrder() {

        for (org.example.Actor actor : que) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " Покупатель получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<org.example.Actor> releaseActors = new ArrayList<>();
        for (org.example.Actor actor : que) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " Покупатель вышел из очереди");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void releaseFromMarket(List<org.example.Actor> actors) {
        for (org.example.Actor actor : actors) {
            System.out.println(actor.getName() + " Покупатель покинул магазин");
            que.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
}

