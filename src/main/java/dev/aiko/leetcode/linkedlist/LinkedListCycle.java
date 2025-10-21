package dev.aiko.leetcode.linkedlist;

import dev.aiko.leetcode.linkedlist.common.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head.next == null) {
            return false;
        }
        ListNode first = head;
        ListNode second = head.next;
        while (second != null && second.next != null) {
            if (first == second) {
                return true;
            }
            first = first.next;
            second = second.next.next;
        }
        return false;
    }
}
