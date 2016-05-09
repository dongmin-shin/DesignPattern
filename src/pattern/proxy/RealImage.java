package pattern.proxy;

/**
 * Created by DongMinShin on 2016. 5. 10..
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("RealImage : " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading : " + fileName);
    }
}
