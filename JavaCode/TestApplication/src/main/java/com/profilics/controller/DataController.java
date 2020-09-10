package com.profilics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.profilics.entity.Information;
import com.profilics.service.InfoService;

@RestController
public class DataController {
	
	@Autowired
    private InfoService DataService;
 
    @PostMapping(consumes = "application/json", produces = "application/json", path = "/info")
    public ResponseEntity<Information> createInfo(@RequestBody Information emp) {
        return new ResponseEntity<>(DataService.createInfo(emp), HttpStatus.CREATED);
    }
 
    @PutMapping(consumes = "application/json", produces = "application/json", path = "/info/update")
    public ResponseEntity<Information> updateInfo(@RequestBody Information emp) {
        return new ResponseEntity<>(DataService.updateInfo(emp), HttpStatus.CREATED);
    }
 
    @DeleteMapping(produces = "application/json", consumes = "text/plain", path = "/Info/{Id}")
    public ResponseEntity<String> deleteInfo(@PathVariable(value="Id") Long Id) {
    	DataService.deleteInfo(Id);
        return new ResponseEntity<>("Id : " + Id + " deleted successfully", HttpStatus.OK);
    }
 
    @GetMapping(path = "/Info/{Id}", produces = "application/json")
    public ResponseEntity<Information> getInfo(@PathVariable(value = "Id") Long Id) {
        return new ResponseEntity<>(DataService.getInfo(Id), HttpStatus.OK);
    }
 
    @GetMapping(path = "/allInfo", produces = "application/json")
    public ResponseEntity<List<Information>> getAllInfo() {
        return new ResponseEntity<>(DataService.getAllInfo(), HttpStatus.OK);
    }
}
