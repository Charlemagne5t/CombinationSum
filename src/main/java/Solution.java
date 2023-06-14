import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> currentList = new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();

        Set<List<Integer>> resultSet = new HashSet<>();
        backtrack(candidates, target, 0, currentList, resultSet);
        resultList = new ArrayList<>(resultSet);
        return resultList;
    }
    private void backtrack(int[] candidates, int target, int sum, List<Integer> currentList, Set<List<Integer>> resultSet){
        if(sum == target){
            List<Integer> listToAdd = new ArrayList<>(currentList);
            Collections.sort(listToAdd);
            resultSet.add(listToAdd);
            return;
        }
        if(sum > target){
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            currentList.add(candidates[i]);
            backtrack(candidates, target, sum + candidates[i], currentList, resultSet);
            currentList.remove(currentList.size() - 1);
        }
    }
}
