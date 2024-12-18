package com.example.request.service;

import java.util.List;

import com.example.request.model.Tourist;

public interface ITourismMgmtService 
{
       public String registerTourist(Tourist tourist);
       public List<Tourist> fetchAllTourist();
       public Tourist fetchTouristById(Integer tid) throws TouristNotFoundException;
       public String updateTouristDetails(Tourist tourist) throws TouristNotFoundException;
       public String deleteTouristDetails(Tourist tourist)throws TouristNotFoundException;
       public String partialUpdateTouristDetails(Integer id,String  packageType) throws TouristNotFoundException;
       public String deleteRecordsByIDRange(Integer start,Integer end);
}
