package com.jiaoshen.design.observe;

import java.util.ArrayList;
import java.util.List;

public class Isubject {
	private List<Iobserve>  observeList=new ArrayList<Iobserve>();
	private String weather;
	private void remainOb(String weather){
		for(Iobserve ob:observeList){
			ob.update(weather);
		}
	}
    public void addObserve(Iobserve ob){
    	observeList.add(ob);
    }
    public void deleteObserve(Iobserve ob){
    	observeList.remove(ob);
    }
	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
		remainOb(weather);
	}

}
