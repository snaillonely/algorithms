package com.luosk.leetcode;

import java.util.HashMap;

public class Q146_LRUCache {

    class Node {
        int key;
        int value;
        Node next;
        Node prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashMap<Integer, Node> map;
    private int capacity;
    private Node head;
    private Node tail;

    public Q146_LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }

        visit(node);

        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            node.value = value;
            visit(node);
        } else {
            node = new Node(key, value);
            if (capacity == map.size()) {
                pop_front();
            }
            push_back(node);
        }
    }

    private void pop_front() {
        Node node = map.get(head.next.key);
        head.next = head.next.next;
        head.next.prev = head;

        map.remove(node.key);
    }

    private void push_back(Node node) {
        map.put(node.key, node);
        node.next = tail;
        node.prev = tail.prev;
        tail.prev.next = node;
        tail.prev = node;
    }

    private void visit(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;

        node.prev = tail.prev;
        tail.prev.next = node;
        node.next = tail;
        tail.prev = node;
    }
}
