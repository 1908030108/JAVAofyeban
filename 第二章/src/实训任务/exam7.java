package ÊµÑµÈÎÎñ;

class date{
    int year, month, day;
    boolean leapyear() {
    	if(year%4 == 0 && year%100 != 0 || year%400 == 0){
    		return true;
    	}
    	else 
    		return false;
    }
    
    void print() {
    	System.out.println(year+"-"+month+"-"+day);
    }
}

public class exam7 {

	public static void main(String[] args) {
	  date date1 = new date();
	  date1.year = 2020;
	  date1.month = 4;
	  date1.day = 8;
	  
	  date1.leapyear();
	  date1.print();
	}

}
