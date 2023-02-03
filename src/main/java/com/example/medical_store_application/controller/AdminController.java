package com.example.medical_store_application.controller;

import com.example.medical_store_application.dao.AdminDao;
import com.example.medical_store_application.model.Admin;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class AdminController {

    @Autowired
    AdminDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/admin",produces = "application/json",consumes = "application/json")
    public HashMap<String, String> admin(@RequestBody Admin a){
        HashMap<String, String> map = new HashMap<String, String>();
        dao.save(a);
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/AdminPassword",produces = "application/json",consumes = "application/json")
    public HashMap<String, String> AdminPassword(@RequestBody Admin a){
        HashMap<String, String> map = new HashMap<String, String>();
        if((dao.PasswordAdmin(a.getUsername(), a.getPassword()).size()>0)){
            map.put("status","success");
        }
        return map;
    }

}
