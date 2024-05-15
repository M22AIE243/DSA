package com.dsa.datastruc;
//Builder design pattern
public class LinkedList {
    private int data;
    private LinkedList next;

    private LinkedList(int data) {
        this.data = data;
    }

    public static class Builder {
        private int data;
        private LinkedList next;

        public Builder setData(int data) {
            this.data = data;
            return this;
        }

        public Builder setNext(LinkedList next) {
            this.next = next;
            return this;
        }

        public LinkedList build() {
            LinkedList node = new LinkedList(data);
            node.next = next;
            return node;
        }
    }