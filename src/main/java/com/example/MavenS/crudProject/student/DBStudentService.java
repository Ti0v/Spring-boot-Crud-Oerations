package com.example.MavenS.crudProject.student;

import java.util.List;

import org.springframework.stereotype.Service;

  @Service
    public class DBStudentService implements StudentService {

    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student Create(Student s) {
        return repository.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student finById(int id) {
        return repository.getStudentById(id);
    }

    @Override
    public Student update(Student s) {
        return repository.save(s);
    }

    @Override
    public String delete(int id) {

        repository.deleteById(id);
        return "The Student is deleted"+id;


    }

    @Override
    public List<Student> createAll(List<Student> st) {
        return repository.saveAll(st);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

}