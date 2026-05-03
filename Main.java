public class Main {
    public static void main(String[] args) {
        final int N = 100;
        int[] sizes = {N, N * N, N * N * N};
        final int RUNS = 10;
        final long SEED = 42;

        SortingExperiment experiment = new SortingExperiment(SEED, RUNS);

        System.out.println("Дослідження часу сортування низхідним злиттям (спадання)");
        System.out.println("Кількість вимірювань для кожного розміру: " + RUNS);
        System.out.println("Час у наносекундах (усереднений).\n");
        System.out.println("Розмір масиву\tСередній час (нс)");

        for (int size : sizes) {
            long avgTime = experiment.measureAverageTime(size);
            System.out.println(size + "\t\t" + avgTime);
        }

        System.out.println("\nНа основі цих даних побудуйте графік залежності часу від кількості елементів.");
        System.out.println("Дані готові для експорту в Microsoft Excel.");
    }
}
