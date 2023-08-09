package com.example.MavenS.crudProject.student;

import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {


    private final StudentService service;

    public StudentController(
            StudentService service
    ) {
        this.service = service;
    }

    @GetMapping(value = {"","/"})
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }

    @PostMapping("/createUser")
    public Student save(
            @RequestBody Student student
    ) {
        return service.Create(student);
    }

    @PostMapping("/createUsers")
    public List<Student> CreateAllStudent(@RequestBody List<Student> student) {

        return  service.createAll(student);
    }

    @GetMapping("/id/{id}")
    public Student findById(
            @PathVariable(value = "id") int id
    ) {
        return service.finById(id);
    }
    @GetMapping("/email/{email}")
    public Student findByEmail(
            @PathVariable(value = "email") String email
    ) {
        return service.findByEmail(email);
    }


    @PutMapping(value = {"","/"})
    public Student updateStudent(
            @RequestBody Student student
    ) {
        return service.update(student);
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable(value = "id") int id
    ) {
        service.delete(id);
    }

    @DeleteMapping("/id/deleteAll")
    public void deleteAll() {
        service.deleteAll();
    }

}