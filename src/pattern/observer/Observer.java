package pattern.observer;

import subject.Subject;

/**
 * Created by DongMinShin on 2016. 4. 24..
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();

}