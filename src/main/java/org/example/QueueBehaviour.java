package org.example;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();

}