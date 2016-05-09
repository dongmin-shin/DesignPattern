package executor;

import pattern.proxy.Image;
import pattern.proxy.ProxyImage;

/**
 * Created by DongMinShin on 2016. 5. 10..
 */
public class ProxyPatternExecutor implements PatternExecutor {

    @Override
    public void execute() {
        Image image = new ProxyImage("test_10mb_image.png");
        // Image will be loaded from Disk.
        image.display();

        // Image will not be loaded from Disk. loaded cache.
        image.display();
    }
}
