package com.example.medical_store_application.dao;

import com.example.medical_store_application.model.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.HashMap;
import java.util.List;

public interface AdminDao extends CrudRepository<Admin,Integer> {

@Query(value = "SELECT * FROM `admin` WHERE `username`=:username AND `password`=:password",nativeQuery = true)
List<Admin> PasswordAdmin(@Param("username") String username, @Param("password") String password);



}
