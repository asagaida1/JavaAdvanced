package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchengerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger= new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOJNITSI);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.NOJNITSI);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);

        new BestFriend("Vanya", friend1Action, exchanger);
        new BestFriend("Petya", friend2Action, exchanger);
    }
}

enum Action {
    KAMEN, NOJNITSI, BUMAGA;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction) {
        if ((myAction == Action.KAMEN && friendAction == Action.NOJNITSI)
                || (myAction == Action.NOJNITSI && friendAction == Action.BUMAGA)
                || (myAction == Action.KAMEN && friendAction == Action.NOJNITSI)) {
            System.out.println(name + " Wins!!!");
        }
    }

    @Override
    public void run() {
        Action replay;
        for (Action action : myActions) {
            try {
                replay = exchanger.exchange(action);
                whoWins(action, replay);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
