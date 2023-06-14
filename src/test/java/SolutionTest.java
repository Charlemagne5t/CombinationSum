import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void combinationSumTest1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>(List.of(2, 2, 3)));
        output.add(new ArrayList<>(List.of(7)));
        Assert.assertEquals(output, new Solution().combinationSum(candidates, target));
    }

    @Test
    public void combinationSumTest2() {
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>(List.of(2, 2, 2, 2)));
        output.add(new ArrayList<>(List.of(2, 3, 3)));
        output.add(new ArrayList<>(List.of(3, 5)));
        Assert.assertEquals(output, new Solution().combinationSum(candidates, target));
    }

    @Test
    public void combinationSumTest3() {
        int[] candidates = {2};
        int target = 1;
        List<List<Integer>> output = new ArrayList<>();
        Assert.assertEquals(output, new Solution().combinationSum(candidates, target));
    }
}
