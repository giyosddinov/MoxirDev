package com.example.demo.web.rest;

import com.example.demo.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Servise {
    @PostMapping("/student/{id}")
    public ResponseEntity creat(@PathVariable int id,@RequestBody Student student){
        student.setId(id);
        return ResponseEntity.ok(student.getId());
    }
    @GetMapping("/student/{id}")
    public ResponseEntity Student(@PathVariable int id){
        Student student = new Student("javoxir","Giyosddinov",12);
        return ResponseEntity.ok(student);
    }
    @GetMapping("/student/all")
    public ResponseEntity getall(@RequestParam String name,
                                 @RequestParam String lastname,
                                 @RequestParam int id){
        List<Student> students = new ArrayList<>();
        students.add(new Student(name,lastname,id));
        students.add(new Student("javoxir","Giyosddinov",3));;
        return ResponseEntity.ok(students);
    }
    @PatchMapping("/student")
    public ResponseEntity patchmetod(@RequestBody Student student){
        return ResponseEntity.ok(student);
    }
    @DeleteMapping("/student/{id}")
    public ResponseEntity delete(@PathVariable int id){
        return ResponseEntity.ok(id+"Malumot ochirildi!");
    }
}
