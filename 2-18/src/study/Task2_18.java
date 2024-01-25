package study;

public class Task2_18 {

	public static void main(String[] args) {
		
		//問②
	   Person person = new Person();
	    person.setName("山田太郎");
	    person.setAge(23);
	    person.setAddles("東京都");
	    
	    //問③
	    System.out.println("名前は、"+person.getName()+"です。");
	    System.out.println("年齢は、"+person.getAge()+"才です。");
	    System.out.println("住所は、"+person.getAddles()+"です。");
	    
	   
		
		
	}
}

class Person {
    private String name;
    private int age;
    private String addles;
    
    //問①
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name=name;
    }
    
    public int getAge() {
    	return age;
    }
    
    public  void setAge(int age) {
    	this.age=age;
    }
    
    public String getAddles() {
    	return addles;
    }
    
    public void setAddles(String addles) {
    	this.addles=addles;
    	
    }
}