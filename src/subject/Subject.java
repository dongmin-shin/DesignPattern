package subject;

import pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DongMinShin on 2016. 4. 24..
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    /**
     * Stage가 변경 되면 State를 변경하고 모든 Observer 들에게 변경 된 상태를 전달
     *
     * @param state
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

}
