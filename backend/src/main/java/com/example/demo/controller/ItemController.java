package com.example.demo.controller;


import com.example.demo.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping("/api")
public class ItemController {


@GetMapping("/items")
public List<Item> items(){
return List.of(new Item(1L, "Apple"), new Item(2L, "Banana"));
}
}
