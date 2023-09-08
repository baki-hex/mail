package com.example.demo.repss;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.demo.entity.tnmblr;


public interface Reps extends JpaRepository<tnmblr,Integer>{
    
    boolean existsByUserMail(String usermail);
 }
