package com.example.orderList.controller;


import com.example.orderList.service.OrderServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

    private final OrderServiceImpl orderServiceImpl;

    public OrderController(OrderServiceImpl orderServiceImpl) {
        this.orderServiceImpl = orderServiceImpl;
    }

    @RequestMapping(path = "/add")
    public List<Integer> addItem (@RequestParam() List<Integer> itemId){
        return orderServiceImpl.addItem(itemId);
    }

    @RequestMapping(path = "/get")
    public Map<Integer, Integer> get (){
        return orderServiceImpl.getList();
    }

}
