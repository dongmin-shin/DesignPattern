package pattern.observer;

import subject.Subject;

/**
 * Created by DongMinShin on 2016. 4. 24..
 */
public class BinaryObserver extends Observer {

    private Subject subject;

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}