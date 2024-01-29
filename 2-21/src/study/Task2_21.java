package study;

import java.util.ArrayList;
import java.util.HashMap;

public class Task2_21 {
	
	 public static final String orange = "オレンジ";
	    public static final String grape = "ぶどう";
	    public static final String apple = "りんご";
	    public static final String pear = "梨";

	    public static void main(String[] args) {
	    	
	    	//問①
	    	 ArrayList<String> fruitsArrayList = new ArrayList<String>();
	    	 
	    	 fruitsArrayList.add(orange);
	    	 fruitsArrayList.add(grape);
	    	 fruitsArrayList.add(apple);
	    	 fruitsArrayList.add(pear);
	    	 
	    	 
	    	 //問②
	    	 HashMap<String,Integer> fruitsHashMap = new HashMap<String,Integer>();
	    	 
	    	 fruitsHashMap.put(orange,150);
	    	 fruitsHashMap.put(grape,120);
	    	 fruitsHashMap.put(apple,180);
	    	 fruitsHashMap.put(pear,140);
	    	 
	    	 //問③
	    	 fruitsHashMap.replace(orange,200);
	    	 
	    	 
	    	 for(String key: fruitsHashMap.keySet()) {
	    		 
	    		 System.out.println(key + "の値段は"+ fruitsHashMap.get(key) +"です。");
	    		 
	    		 
	    	 }
	    	
	    	
	    	
	    	
	    	
	    }

}
