package xyz.zhangyi.diamond.demo.ordercontext.ohs.remote.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.zhangyi.diamond.demo.ordercontext.ohs.local.appservices.OrderAppService;
import xyz.zhangyi.diamond.demo.ordercontext.ohs.local.pl.PlacingOrderRequest;

@RestController
@RequestMapping(value="/orders")
public class OrderController
{
    @Autowired
    private OrderAppService orderAppService;

    @PostMapping
    public void placeOrder(PlacingOrderRequest request) {
        orderAppService.placeOrder(request);
    }
}
