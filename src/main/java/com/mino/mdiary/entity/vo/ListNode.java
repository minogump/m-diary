package com.mino.mdiary.entity.vo;

public class ListNode<T> {

    private T val;

    private ListNode<T> next;

    public ListNode(T value) {
        val = value;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "" + val + (next != null ? next.toString() : "");
    }

}
