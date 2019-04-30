public class SimpleArray implements MyArrays {
    private int[] arr;

    public SimpleArray(int[] array) {
        this.arr = array;
    }

    @Override
    public MyIterator getIterator() {
        return new SimpleIterator(arr);
    }

    private class SimpleIterator implements MyIterator {
        private int[] arr;
        private int counter = 0;

        public SimpleIterator(int[] arr) {
            this.arr = arr;
        }

        @Override
        public Object next() {
            return arr[counter++];
        }

        @Override
        public Object first() {
            return arr[0];
        }

        @Override
        public boolean hasNext() {
            return counter < arr.length;
        }

        @Override
        public Object getCurrentElement() {
            return arr[counter];
        }
    }
}
