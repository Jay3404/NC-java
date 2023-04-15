package chap98_homework.nc230407.phone;

import java.util.ArrayList;
import java.util.List;

import chap98_homework.nc230407.Add;

public abstract class Test1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Add a = new Add();
		
		List<Add> addList = new ArrayList<Add>();
		for(int i = 0; i < 10; i++) {
			addList.add(new Add());
		}
	}

}
