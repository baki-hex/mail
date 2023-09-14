package com.example.demo.repss;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.tnmblr;


public interface Reps extends JpaRepository<tnmblr,Integer>{
    
    boolean existsByrecvmail(String recvmail);
 }
