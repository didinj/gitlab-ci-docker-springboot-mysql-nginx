package com.djamware.myspringbootapp.controller;

import com.djamware.myspringbootapp.entity.MyProduct;
import com.djamware.myspringbootapp.repository.MyProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/product")
public class MyProductController {

    private final MyProductRepository myProductRepository;

    public MyProductController(MyProductRepository myProductRepository) {
        this.myProductRepository = myProductRepository;
    }

    @GetMapping()
    public @ResponseBody
    Iterable<MyProduct> getAllUsers() {
        return myProductRepository.findAll();
    }

    @PostMapping()
    public @ResponseBody String addNewUser (@RequestBody MyProduct myProduct) {
        MyProduct newProduct = MyProduct.builder()
                .prodName(myProduct.getProdName())
                .prodDesc(myProduct.getProdDesc())
                .prodPrice(myProduct.getProdPrice())
                .build();
        myProductRepository.save(newProduct);
        return "Saved";
    }
}
