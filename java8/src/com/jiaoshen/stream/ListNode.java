package com.jiaoshen.stream;

/**
 * @author jiaoshen
 * @date 2023-04-15-0:20
 */
public class ListNode {
    private String value;

    private ListNode next;


    ListNode(String value){
      this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }
}
