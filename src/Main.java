public class Main {

    public static void main(String[] args) {

        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();
        Experiment experiment = new Experiment(sorter, searcher);

        int[] small = sorter.generateRandomArray(10);

        System.out.println("Original array:");
        sorter.printArray(small);

        sorter.basicSort(small);

        System.out.println("Sorted array:");
        sorter.printArray(small);

        System.out.println("\n--- Experiments ---");
        experiment.runAllExperiments();
    }
}