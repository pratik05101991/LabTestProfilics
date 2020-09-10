package com.profilics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profilics.entity.Information;
import com.profilics.repository.CRUDoperation;
import com.profilics.service.InfoService;

@Service
public class InfoServiceImpl implements InfoService {
     
    @Autowired
    private CRUDoperation<Information> employeeRepository;
 
    @Override
    public Information createInfo(Information emp) {
        return employeeRepository.save(emp);
    }
 
    @Override
    public Information updateInfo(Information emp) {
        return employeeRepository.save(emp);
    }
 
    @Override
    public Information getInfo(Long empId) {
        Optional<Information> optionalEmp =  employeeRepository.findById(empId);
        if(optionalEmp.isPresent()) {
            return optionalEmp.get();
        }
        return null;
    }
 
    @Override
    public void deleteInfo(Long empId) {
        employeeRepository.deleteById(empId);
    }
 
    @Override
    public List<Information> getAllInfo() {
        return employeeRepository.findAll();
    }

	}
