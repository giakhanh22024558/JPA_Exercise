package com.example.jpademo.service;

import java.util.ArrayList;
import com.example.jpademo.modal.Employee;
public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
}