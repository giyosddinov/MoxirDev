package com.example.book.web.rest;

import com.example.book.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class RestProduct {
    List<Product> productList = new ArrayList<>();
    public RestProduct() {
        productList.add(new Product(1,"banan","meva",25000,3));
        productList.add(new Product(2,"qo'g'irchoq","O'yinchoq",35000,3));
        productList.add(new Product(3,"kartoshka","sabzovotlar",5000,3));
        productList.add(new Product(4,"qulpunoy","meva",25000,3));
    }

    @GetMapping("/products")
    public ResponseEntity getall(){
        return ResponseEntity.ok(productList);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity getFindId(@PathVariable int id){
        for(Product p:productList){
            if(p.getId()==id){
                return ResponseEntity.ok(p);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/products")
    public ResponseEntity creat(@RequestBody Product product){
        productList.add(product);
        return ResponseEntity.ok(product);
    }

    @PutMapping("/")
}
