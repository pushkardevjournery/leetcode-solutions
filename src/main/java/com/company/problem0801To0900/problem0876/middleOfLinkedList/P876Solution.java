package com.company.problem0801To0900.problem0876.middleOfLinkedList;

import java.util.ArrayList;
import java.util.List;

public class P876Solution {

    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        int length = 0;
        while (head != null) {
            list.add(head);
            head = head.next;
            length++;
        }
        return list.get(length / 2);
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}


