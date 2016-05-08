package executor;

import pattern.observer.BinaryObserver;
import pattern.observer.HexObserver;
import subject.Subject;

/**
 * Created by DongMinShin on 2016. 4. 24..
 */
public class ObserverPattern implements ExecutorPattern {

    @Override
    public void execute() {
        // Subject 생성
        Subject subject = new Subject();

        // Subject의 변경 사항을 감지할 Object를 생성 후 등록 (In 생성자)
        new BinaryObserver(subject);
        new HexObserver(subject);

        // 상태 변경 테스트
        int state = 15;
        System.out.println("First state change : " + state);
        subject.setState(state);

        state = 10;
        System.out.println("Second state change : " + state);
        subject.setState(state);
    }
}
