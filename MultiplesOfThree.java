import java.util.ArrayList;
import java.util.List;

public class MultiplesOfThree {
    public static void main(String[] args) {
        List<Integer> U = new ArrayList<>();
        for (int i = 1; i <= 25; i++) {
            U.add(i);
        }

        List<List<Integer>> combinations = new ArrayList<>();
        findCombinations(U, 3, combinations, new ArrayList<>(), 0);

        int count = 0;
        for (List<Integer> combination : combinations) {
            int sum = 0;
            for (int num : combination) {
                sum += num;
            }
            if (sum % 3 == 0) {
                System.out.println("Combination with sum multiple of 3: " + combination);
                count++;
            }
        }

        System.out.println("Count: " + count);
    }

    private static void findCombinations(List<Integer> U, int k, List<List<Integer>> combinations, List<Integer> currentCombination, int start) {
        if (k == 0) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i < U.size(); i++) {
            currentCombination.add(U.get(i));
            findCombinations(U, k - 1, combinations, currentCombination, i + 1);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
