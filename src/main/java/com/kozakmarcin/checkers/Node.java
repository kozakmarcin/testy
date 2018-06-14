package com.kozakmarcin.checkers;

public class Node<E> {

    E element;
    Node nextElement;

    Node(E element){
        this.element = element;
    }

    public void setNext(Node nextElement){
        this.nextElement = nextElement;
    }

    public Node<E> getNext(){
        return this.nextElement;
    }

    public E get(){
        return element;
    }

}
