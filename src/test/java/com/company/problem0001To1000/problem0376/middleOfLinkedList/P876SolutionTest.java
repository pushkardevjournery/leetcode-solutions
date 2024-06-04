package com.company.problem0001To1000.problem0376.middleOfLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P876SolutionTest {

    @Test
    public void testMiddleNode() {
        P876Solution solution = new P876Solution();

        // Test case 1: Single node
        P876Solution.ListNode head1 = solution.new ListNode(1);
        assertEquals(head1, solution.middleNode(head1));

        // Test case 2: Odd number of nodes
        P876Solution.ListNode head2 = solution.new ListNode(1);
        head2.next = solution.new ListNode(2);
        head2.next.next = solution.new ListNode(3);
        assertEquals(head2.next, solution.middleNode(head2));

        // Test case 3: Even number of nodes
        P876Solution.ListNode head3 = solution.new ListNode(1);
        head3.next = solution.new ListNode(2);
        head3.next.next = solution.new ListNode(3);
        head3.next.next.next = solution.new ListNode(4);
        assertEquals(head3.next.next, solution.middleNode(head3));
    }
}
