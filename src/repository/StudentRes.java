/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.StudentDao;
import java.util.List;
import model.Student;

/**
 *
 * @author ASUS
 */
public class StudentRes implements IStudentRes{

    @Override
    public void addStudent(List<Student> stdList) {
        StudentDao.Instance().addStudent(stdList);
    }

    @Override
    public void showAll(List<Student> stdList) {
        StudentDao.Instance().showAll(stdList);
    }
    
}
