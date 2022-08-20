package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> resultList = new LinkedList<>();
        for(Integer el : sourceList) {
            if(el % 2 != 0) {
                resultList.addFirst(el);
            } else {
                resultList.addLast(el);
            }
        }
        return resultList;
    }
}
