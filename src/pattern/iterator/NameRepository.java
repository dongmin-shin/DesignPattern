package pattern.iterator;

/**
 * Created by DongMinShin on 2016. 4. 24..
 */
public class NameRepository implements Container {

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }

            return null;
        }
    }

}
