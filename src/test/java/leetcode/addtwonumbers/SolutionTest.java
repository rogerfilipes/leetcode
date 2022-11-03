package leetcode.addtwonumbers;

import org.junit.jupiter.api.Test;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void example1() {
        Solution.ListNode list1 = from(new int[]{2, 4, 3});
        Solution.ListNode list2 = from(new int[]{5,6,4});
        Solution.ListNode expected = from(new int[]{7,0,8});

        Solution.ListNode output = new Solution().addTwoNumbers(list1, list2);

        assertArrayEquals(toArray(expected), toArray(output));

    }

    @Test
    void example2() {
        Solution.ListNode list1 = new Solution.ListNode(0, null);
        Solution.ListNode list2 = new Solution.ListNode(0, null);
        Solution.ListNode expected = new Solution.ListNode(0, null);


        Solution.ListNode output = new Solution().addTwoNumbers(list1, list2);

        assertArrayEquals(toArray(expected), toArray(output));

    }

    @Test
    void example3() {
        Solution.ListNode list1 = from(new int[]{9, 9, 9, 9, 9, 9, 9});
        Solution.ListNode list2 = from(new int[]{9, 9, 9, 9});
        Solution.ListNode expected = from(new int[]{8,9,9,9,0,0,0,1});


        Solution.ListNode output = new Solution().addTwoNumbers(list1, list2);

        assertArrayEquals(toArray(expected), toArray(output));

    }
    private int[] toArray(Solution.ListNode node) {
        List<Integer> result = new ArrayList<>();
        Solution.ListNode cursor = node;

        while(cursor != null){
            result.add(cursor.val);
            cursor = cursor.next;
        }

        return result.stream().mapToInt(i->i).toArray();

    }

    public Solution.ListNode from(int[] values){
      Solution.ListNode previous = null;
        Solution.ListNode current = null;
      for (int i = values.length-1; i>=0; i--){
          current = new Solution.ListNode(values[i], previous);
          previous = current;
      }

      return current;
    }
}