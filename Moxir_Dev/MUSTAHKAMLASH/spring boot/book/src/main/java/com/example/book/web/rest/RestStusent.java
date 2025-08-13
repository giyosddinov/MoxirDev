package com.example.book.web.rest;

import com.example.book.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/student")
public class RestStusent {
    List<Student> studentList = new ArrayList<>();

    public RestStusent() {
        studentList.add(new Student(1, "javoxir", 18, "Giyosddinov"));
        studentList.add(new Student(2, "javoxir", 18, "Giyosddinov"));
        studentList.add(new Student(3, "javoxir", 18, "Giyosddinov"));
    }

    @GetMapping("/students")
    public ResponseEntity getall() {
        return ResponseEntity.ok(studentList);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity getFindId(@PathVariable int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                return ResponseEntity.ok(s);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/students")
    public ResponseEntity creat(@RequestBody Student student) {
        studentList.add(student);
        return ResponseEntity.ok(studentList);
    }

    @DeleteMapping("/students")
    public ResponseEntity delete(@PathVariable int id) {
        studentList.remove(getFindId(id));
        return ResponseEntity.ok("Malumot O'chirildi");
    }

    @GetMapping("/students/search?name=Ali")
    public ResponseEntity findGetName(@PathVariable String name) {
        for (Student s : studentList) {
            if (s.getName().equals(name)) {
                return ResponseEntity.ok(s);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/students/age/{age}")
    public ResponseEntity getGetAge(@PathVariable int age) {
        Collections.sort(studentList, Comparator.comparing(Student::getAge));
        return ResponseEntity.ok(studentList);
    }

    @GetMapping("/students/sort")
    public ResponseEntity getSort(){
        Collections.sort(studentList, Comparator.comparing(Student::getName));
        return ResponseEntity.ok(studentList);
    }
}