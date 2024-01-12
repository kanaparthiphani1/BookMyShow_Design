package com.example.bookmyshow.models;

import java.util.Date;
import java.util.List;

public class Show extends BaseModel {
	private Movie movie;
	private Date startTime;
	private Date endTime;
	private Screen screen;
	private ShowStatus status;
	private List<Feature> features;

}
