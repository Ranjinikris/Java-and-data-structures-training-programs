public class HillPatternWeight {
    public static int calculateHillPatternWeight(int totalLevels, int headLevelWeight, int weightIncrement) {
        int totalWeight = 0;
        int currentLevelWeight = headLevelWeight;

        // Loop through each level and calculate the total weight
        for (int level = 1; level <= totalLevels; level++) {
            totalWeight += currentLevelWeight; // Add the weight of the current level
            currentLevelWeight += weightIncrement; // Increment the weight for the next level
        }

        return totalWeight;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(calculateHillPatternWeight(5, 10, 2)); // Output: 230
        System.out.println(calculateHillPatternWeight(4, 1, 5));  // Output: 110
    }
}
