import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> currentList = new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, currentList, resultList, 0);

        return resultList;
    }

    private void backtrack(int[] candidates, int target, int sum, List<Integer> currentList, List<List<Integer>> resultList, int start) {
        if (sum == target) {
            resultList.add(new ArrayList<>(currentList));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            currentList.add(candidates[i]);
            backtrack(candidates, target, sum + candidates[i], currentList, resultList, i);
            currentList.remove(currentList.size() - 1);
        }
    }
}
