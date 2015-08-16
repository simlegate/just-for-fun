package com.simlegate.direction.loop;

public class CustomLinkedList<T> {

    transient Node<T> first = new Node<T>(null, null, null);

    transient Node<T> last = new Node<T>(null, null, null);

    private transient int size = 0;

    CustomLinkedList() {
    }

    public void add(T element) {
        if(first.next == null) {
            Node<T> current = new Node<T>(null, element, null);
            current.next = current.previous = current;
            first.next = current;
            last.next = current;
            size++;
        }else {
            addAfter(element, last.next);
        }
    }

    public void addAfter(T element, Node<T> node) {
        Node<T> current = new Node<T>(node, element, node.next);
        current.previous.next = current;
        current.next.previous = current;
        last.next = current;
        size++;
    }

    public Node<T> get(T e) {
        int index = 0;
        for (Node<T> node = first.next; index < size ; node = node.next) {
            index++;
            if (e.equals(node.element)) {
                return node;
            }
        }
        return null;
    }


    class Node<T> {

        public Node<T> previous;

        public T element;

        public Node<T> next;

        Node(Node<T> previous, T element, Node<T> next) {
            this.previous = previous;
            this.element = element;
            this.next = next;
        }
    }
}
