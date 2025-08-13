package com.example.book.web.rest;

import com.example.book.model.Book;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class RestServise {
    List<Book> bookList = new ArrayList<>();
    LocalDateTime now = LocalDateTime.now();
    public RestServise() {
        bookList.add(new Book("test","test",1,12000,now));
        bookList.add(new Book("test1","test1",2,12000,now));
        bookList.add(new Book("test2","test2",3,12000,now));
        bookList.add(new Book("test3","test3",4,12000,now));
    }

    @GetMapping("/books")
    public ResponseEntity getbook(){
        return ResponseEntity.ok("BarchaKitoblar!\n"+bookList);
    }
    @GetMapping("/books/{id}")
    public ResponseEntity findBook(@PathVariable int id){
        for(Book b:bookList){
            if(b.getId()==id){
                return ResponseEntity.ok(b);
            }
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping("/books")
    public ResponseEntity creat(@RequestBody Book b,
                                @RequestParam String name,
                                @RequestParam String title,
                                @RequestParam int id,
                                @RequestParam int prise){
        b.setId(id);
        b.setName(name);
        b.setPrise(prise);
        b.setTitle(title);
        b.setCratedAt(now);
        bookList.add(b);
        return ResponseEntity.ok("Qo'shildi!\n"+b);
    }
    @PutMapping("/books/{id}")
    public ResponseEntity putmetod(@PathVariable int id){
        for(Book b:bookList){
            if(b.getId()==id){
                b.setId(id);
                return ResponseEntity.ok("Id Yangilandi!\n"+b);
            }
        }
        return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/books/{id}")
    public ResponseEntity delete(@PathVariable int id){
        for(Book b:bookList){
            if(b.getId()==id){
                b.setId(id);
                return ResponseEntity.ok("Id Yangilandi!\n"+b);
            }
        }
        return ResponseEntity.ok("Malumot O'chirildi!");
    }
}
