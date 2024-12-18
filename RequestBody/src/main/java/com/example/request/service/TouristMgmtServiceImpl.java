package com.example.request.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.request.model.Tourist;
import com.example.request.repository.ITouristRepo;


@Service
public class TouristMgmtServiceImpl implements ITourismMgmtService   {

	@Autowired
	private ITouristRepo touristrepo;
	
	@Override
	public String registerTourist(Tourist tourist) {
		int idVal=touristrepo.save(tourist).getTid();
		
		return "Tourist is registered having the id value"+idVal;
	}

	@Override
	public List<Tourist> fetchAllTourist() {
		List<Tourist> list= touristrepo.findAll();
		list.sort((t1,t2)->t1.getTid().compareTo(t2.getTid()));
		return list;
	}

	@Override
	public Tourist fetchTouristById(Integer tid) throws TouristNotFoundException {
		
		return touristrepo.findById(tid).orElseThrow(()-> new TouristNotFoundException(tid+"tourist not found"));
	}

	@Override
	public String updateTouristDetails(Tourist tourist) throws TouristNotFoundException {
		Optional<Tourist> optional =touristrepo.findById(tourist.getTid());
		if(optional.isPresent())
		{
			touristrepo.save(tourist);
			return tourist.getTid()+"tourist is updated";
		}
		else {
			throw new TouristNotFoundException(tourist.getTid()+"Tourist not found");
		}
	}

	@Override
	public String deleteTouristDetails(Tourist tourist) throws TouristNotFoundException {
		Optional optional = touristrepo.findById(tourist.getTid());
		if(optional.isPresent())
		{
			touristrepo.deleteById(tourist.getTid());
			return tourist.getTid()+"tourist is deleted";
			
		}
		else {
			throw new TouristNotFoundException(tourist.getTid()+"Tourist not found");
		}
	
	}

	@Override
	public String partialUpdateTouristDetails(Integer id, String packageType) throws TouristNotFoundException {
	Optional<Tourist> optional =touristrepo.findById(id);
	if(optional.isPresent())
	{
		Tourist tourist = optional.get();
		tourist.setPackageType(packageType);
		touristrepo.save(tourist);
		return "Tourist PackType is updated";
		
		
	}
	else
	{
		throw  new TouristNotFoundException(id+"Tourist Not Found");
	}
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String deleteRecordsByIDRange(Integer start, Integer end)
	{
		
			int count=touristrepo.deleteRecordsByIDRange(start, end);
			return count+ "no of records are deleted";
	
		
	}

	
	
}
