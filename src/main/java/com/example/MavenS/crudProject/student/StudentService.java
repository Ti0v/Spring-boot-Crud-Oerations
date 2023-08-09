package com.example.MavenS.crudProject.student;

import java.util.List;
import java.util.Optional;

public interface StudentService{

    Student Create(Student s);

    List<Student> findAllStudents();
    Student findByEmail(String email);
    Student finById(int id);

    Student update(Student s);
    String delete(int id);

    List<Student> createAll(List<Student> st);

    void deleteAll();

}
