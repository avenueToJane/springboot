package com.ys.admin.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		sortStrings();
	}
	
	private static void sortStrings() {  
	    List<String> list = new ArrayList<String>();  
	    
	    
	   list.add("1528615528-602728@015833950344.log");
	   list.add("1528615528-602729@015905401633.log");
	   list.add("1528615528-83026@15189556961.log");
	  
	   list.add("1528615528-602728@015833950344.log");
	   list.add("1528615528-602729@015905401633.log");
	   list.add("1528615528-83026@15189556961.log");
	   list.add("1528615528-83027@013939999961.log");
	   list.add("1528629236-207393@18297189570.log   ");
	   list.add("1528629236-207393@18297189570.log   ");
	   list.add("1528629284-207453@015084570996.log  ");
	   list.add("1528629284-207453@015084570996.log  ");
	   list.add("1528615528-83029@18188962331.log    ");

	    //排序  
	    Collections.sort(list);  
	    //输出  
	    
	    for(String item : list) {  
	       System.out.println(item);
	    }  
	}

}
