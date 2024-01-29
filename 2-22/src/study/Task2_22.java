package study;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Task2_22 {
	
	  public static void main(String[] args) {
		  
		  Date now = new Date();
		  
		  //問①
		  System.out.println(now);
		  
		  
		  
		  Calendar calendar = Calendar.getInstance();
		  
		  //問②「(Calendar.MONTH) + 数値」の処理は、想定していない値となる可能性があります。
		  //その理由をコメントへ記述して下さい。
		  
		  //2020年6月の7ヶ月後が2021年1月になるような、繰り上げや繰り下げの対応をしたい場合、
		  //getメソッドで+1をしたりして対応すると、
		  //あくまで「月の値 + 1」であるため、「13月、14月、15月」という表示になってしまう。
		  //また、年の加算減算はしてくれないため、想定しない値になる可能性がある。
		  
		   System.out.println(calendar.get(Calendar.YEAR));
	       System.out.println(calendar.get(Calendar.MONTH) + 1);
	       System.out.println(calendar.get(Calendar.DATE));
	       
           	
            calendar.add(Calendar.YEAR,+1);
            calendar.add(Calendar.MONTH,+2);
            calendar.add(Calendar.DATE,+15);
            
            System.out.println(calendar.get(Calendar.YEAR));
 	       System.out.println(calendar.get(Calendar.MONTH));
 	       System.out.println(calendar.get(Calendar.DATE));
	       
	       
	       printLeapYear(calendar.get(Calendar.YEAR));
	  }
		  
	       // 問③
	       
	       private static void printLeapYear(final int year) {
	    	   System.out.println(year + "年は、うるう年" + (Year.isLeap(year) ? "です。" : "ではありません。"));
	    
	      
	    	   
	       
 }  
	       
} 


