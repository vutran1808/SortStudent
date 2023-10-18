/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.Student;

/**
 *
 * @author ASUS
 */
public interface IStudentRes {
    void addStudent(List<Student> stdList);
    void showAll(List<Student> stdList);
}
