package com.ibm.service;

import java.util.Collection;

import com.ibm.entity.Train;
import com.ibm.exception.InvalidTrainException;

public interface TrainService {
	
	int addTrain(Train t);
	
	Train getTrain(int tcode) throws InvalidTrainException;
	
	Collection<Train> getAll();
	
	void deleteTrain(int tcode);
	
	void updateTrain(Train t);
}