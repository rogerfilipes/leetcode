package leetcode.common;


import java.util.ArrayList;
import java.util.List;

public class ListNodeUtils {

    public static int[] toArray(ListNode node) {
        List<Integer> result = new ArrayList<>();
        ListNode cursor = node;

        while (cursor != null) {
            result.add(cursor.val);
            cursor = cursor.next;
        }

        return result.stream().mapToInt(i -> i).toArray();

    }

    public static ListNode from(int[] values) {
        ListNode previous = null;
        ListNode current = null;
        for (int i = values.length - 1; i >= 0; i--) {
            current = new ListNode(values[i], previous);
            previous = current;
        }

        return current;
    }

    public static ListNode from(int[] values, int pos) {
        ListNode previous = null;
        ListNode current = null;
        ListNode cycle = null;
        ListNode last = null;
        for (int i = values.length - 1; i >= 0; i--) {
            current = new ListNode(values[i], previous);
            previous = current;

            if (i == pos)
                cycle = current;

            if (i == values.length - 1)
                last = current;

        }

        last.next = cycle;

        return current;
    }
}
