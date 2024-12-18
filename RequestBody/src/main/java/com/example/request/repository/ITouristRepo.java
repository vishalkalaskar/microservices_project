package com.example.request.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.request.model.Tourist;

@Repository
public interface ITouristRepo extends JpaRepository<Tourist, Integer> 
{
	   @Modifying
	   @Query("DELETE FROM Tourist WHERE tid>=:start AND tid <=:end")
       public int deleteRecordsByIDRange(Integer start,Integer end);
       
}
