package com.example.orderList.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@SessionScope
public class OrderServiceImpl {
    private Map<Integer, Integer> itemMap;
    private final int maxSizeList = 5;
    private int i = 0;

    public OrderServiceImpl() {
        this.itemMap = new HashMap<>();
    }

    public List<Integer> addItem(List<Integer> itemId) {
        for (Integer integer : itemId) {
            if (itemMap.containsKey(integer)) {
                itemMap.replace(integer, itemMap.get(integer) + 1);
            } else {
                itemMap.put(integer, 1);
            }
        }
        return itemId;
    }

    public Map<Integer, Integer> getList() {
        return itemMap;
    }

}