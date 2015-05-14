package com.ricston.scattergather.services;

import java.util.ArrayList;
import java.util.List;

import com.ricston.scattergather.Result;
import com.ricston.scattergather.ResultsBuilder;

public class OrbitzResultsBuilder extends ResultsBuilder {

	@Override
	public List<Result> getResults() {

		List<Result> results = new ArrayList<Result>();
		
		results.add(new Result(300, "Orbitz", 3));
		results.add(new Result(400, "Orbitz", 4));
		results.add(new Result(500, "Orbitz", 5));
		
		return results;
	}

}
