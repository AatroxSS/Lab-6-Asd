class SortingExperiment {
    private final ArrayGenerator generator;
    private final int runs;   
    public SortingExperiment(long seed, int runs) {
        this.generator = new ArrayGenerator(seed);
        this.runs = runs;
    }

    public long measureAverageTime(int size) {
        // Фіксований набір даних (однаковий для всіх повторів)
        int[] baseArray = generator.generate(size);

        long totalTime = 0;
        for (int i = 0; i < runs; i++) {
            int[] testArray = baseArray.clone();
            long start = System.nanoTime();
            MergeSorter.sortDescending(testArray);
            long end = System.nanoTime();
            totalTime += (end - start);
        }
        return totalTime / runs;
    }
}
