package com.jiaoshen.iterator.bean;

import java.util.Iterator;
import java.util.List;

public class ListIteror implements Iterator {
    
	private List list;
	
	public ListIteror(List list){
		this.list=list;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void  remove(){
	}

}
