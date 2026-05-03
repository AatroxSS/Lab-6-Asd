import java.util.Random;

class ArrayGenerator {
    private final Random random;

    public ArrayGenerator(long seed) {
        this.random = new Random(seed);
    }

    public int[] generate(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}
