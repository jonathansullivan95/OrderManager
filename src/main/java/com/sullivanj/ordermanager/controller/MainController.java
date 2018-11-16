package com.sullivanj.ordermanager.controller;

import com.sullivanj.ordermanager.CustomerOrder;
import com.sullivanj.ordermanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class MainController {
    @Autowired

    private UserRepository userRepository;

    @GetMapping("/add")
    public @ResponseBody String addNewOrder(@RequestParam String name, @RequestParam int product) {
        CustomerOrder n = new CustomerOrder(product, name);
        userRepository.save(n);
        return "Saved!";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<CustomerOrder> getAllUsers() {
        // This returns a JSON or XML with all the users
        return userRepository.findAll();
    }
}
