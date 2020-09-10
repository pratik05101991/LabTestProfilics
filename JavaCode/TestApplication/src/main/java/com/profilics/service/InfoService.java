package com.profilics.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.profilics.entity.Information;
@Service
public interface InfoService {

	public Information createInfo(Information emp);
    public Information updateInfo(Information emp);
    public Information getInfo(Long empId);
    public void deleteInfo(Long empId);
    public List<Information> getAllInfo();
}
