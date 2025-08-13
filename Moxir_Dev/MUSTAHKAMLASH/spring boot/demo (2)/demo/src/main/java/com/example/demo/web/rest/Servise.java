package com.example.demo.web.rest;

import com.example.demo.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Servise {
    Student student = new Student("Javoxir","Giyosddinov",1);
    Student student1 = new Student("ali","Giyosddinov",2);
    Student student2 = new Student("vali","Giyosddinov",3);
    List<Student> students = new ArrayList<>();
    @GetMapping("/student")
    public ResponseEntity metodGet(){;
        students.add(student);
        students.add(student1);
        students.add(student2);
        return ResponseEntity.ok(students);
    }
    @PostMapping("/student")
    public ResponseEntity creat(@RequestBody Student student){
        return ResponseEntity.ok(student);
    }
    @PutMapping("/student/{id}")
    public ResponseEntity update(@PathVariable @RequestBody int id){
        for(int i=0;i<students.size();i++){
            if(students.get(i).equals(id)){
                students.get(i).setId(5);
                break;
            }
        }
        return ResponseEntity.ok(students);
    }
}
