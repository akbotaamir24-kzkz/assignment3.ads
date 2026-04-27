public class Experiment {

    private Sorter sorter;
    private Searcher searcher;

    public Experiment(Sorter sorter, Searcher searcher) {
        this.sorter = sorter;
        this.searcher = searcher;
    }

    public long measureSortTime(int[] arr, String type) {
        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(arr);
        } else {
            sorter.advancedSort(arr);
        }

        long end = System.nanoTime();
        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();
        return end - start;
    }

    public void runAllExperiments() {

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {

            int[] randomArr = sorter.generateRandomArray(size);
            int[] sortedArr = randomArr.clone();


            sorter.basicSort(sortedArr);

            int[] arr1 = randomArr.clone();
            int[] arr2 = randomArr.clone();

            long bubbleTime = measureSortTime(arr1, "basic");
            long mergeTime = measureSortTime(arr2, "advanced");

            int target = sortedArr[sortedArr.length / 2];
            long searchTime = measureSearchTime(sortedArr, target);

            System.out.println("Array size: " + size);
            System.out.println("Bubble Sort time: " + bubbleTime + " ns");
            System.out.println("Merge Sort time: " + mergeTime + " ns");
            System.out.println("Linear Search time: " + searchTime + " ns");
            System.out.println("--------------------------");
        }
    }
}