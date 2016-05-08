package executor;

import pattern.iterator.Iterator;
import pattern.iterator.NameRepository;

/**
 * Created by DongMinShin on 2016. 4. 24..
 */
public class IteratorPattern implements ExecutorPattern {

    @Override
    public void execute() {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("name : " + name);
        }
    }
}
