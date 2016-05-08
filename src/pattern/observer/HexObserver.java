package pattern.observer;

import subject.Subject;

/**
 * Created by DongMinShin on 2016. 4. 24..
 */
public class HexObserver extends Observer {

    private Subject subject;

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: " + Integer.toHexString(subject.getState()));
    }
}
