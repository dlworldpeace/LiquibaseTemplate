package com.sample.backend.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sample.backend.dao.EmployeeDao;
import com.sample.backend.entity.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    EmployeeDao employeeDao;

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public void insertEmployee(Employee emp) {
        employeeDao.insertEmployee(emp);

    }

    @Override
    public void updateEmployee(Employee emp) {
        employeeDao.updateEmployee(emp);

    }

    @Override
    public void executeUpdateEmployee(Employee emp) {
        employeeDao.executeUpdateEmployee(emp);

    }

    @Override
    public void deleteEmployee(Employee emp) {
        employeeDao.deleteEmployee(emp);

    }
}
