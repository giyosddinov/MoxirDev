package com.example.book.web.rest;

import com.example.book.model.Product;
import com.example.book.model.Student;
import jakarta.servlet.annotation.WebServlet;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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

    @PutMapping("/products/{id}")
    public ResponseEntity update(@PathVariable int id,@RequestBody Product product){
        product.setName("nimadir");
        product.setCategory("nimadir");
        productList.add(product);
        productList.remove(getFindId(id));
        return ResponseEntity.ok(productList);
    }

    @GetMapping("/products/search")
    public ResponseEntity findNameProduct(@RequestParam String name){
        for(Product p:productList){
            if(p.getName().equalsIgnoreCase(name)){
                return ResponseEntity.ok(p);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/products/search/{category}")
    public ResponseEntity findCategoryProduct(@PathVariable String category){
        boolean tekshir = true;
        List<Product> pr = new ArrayList<>();
        for(Product p : productList){
            if(p.getCategory().equalsIgnoreCase(category)){
                tekshir = false;
                pr.add(p);
            }
        }
        if(!tekshir){
            return ResponseEntity.ok(pr);
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/product/sort/prise")
    public ResponseEntity productSort(){
        Collections.sort(productList, Comparator.comparing(Product::getPrise));
        return ResponseEntity.ok(productList);
    }

    @GetMapping("/product/sts")
    public ResponseEntity productstatic(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Umumuy Maxsulot Soni",productList.size());
        int umumuy_sum = 0;
        for(Product p:productList){
            umumuy_sum+=p.getPrise();
        }
        map.put("Umumiy Summa",umumuy_sum);
        map.put("O'rtacha Narx",umumuy_sum/productList.size());
        return ResponseEntity.ok(map);
    }
}
