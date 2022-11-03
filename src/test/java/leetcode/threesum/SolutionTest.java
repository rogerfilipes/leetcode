package leetcode.threesum;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example1(){
        int[] input = {-1,0,1,2,-1,-4};
        int[][] expected = {{-1,-1,2},{-1,0,1}};

        List<List<Integer>> output = new Solution().threeSum(input);

        int[][] result = convert(output);
        assertArrayEquals(expected, result);
    }

    @Test
    void example2(){
        int[] input = {0,1,1};
        int[][] expected = {};

        List<List<Integer>> output = new Solution().threeSum(input);

        int[][] result = convert(output);
        assertArrayEquals(expected, result);
    }

    private int[][] convert(List<List<Integer>> values){
        int[][] arrays = new int[values.size()][];
        for(int i = 0; i<values.size(); i++){
            arrays[i] = values.get(i).stream().mapToInt(Integer::intValue).toArray();
        }
        return arrays;
    }
}