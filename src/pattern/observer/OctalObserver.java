package pattern.observer;

import subject.Subject;

/**
 * Created by DongMinShin on 2016. 4. 24..
 */
public class OctalObserver extends Observer {

    private Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {

    }
}
