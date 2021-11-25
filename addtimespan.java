public class addtimespan {
	private int hours;
	private int minutes;
	
	public addtimespan(int hours, int minutes) {// this is our timespan with an interval of 0,0
		this.hours = 0;
		this.minutes = 0;
		adds(hours, minutes);
	}
	
	public void adds(int hours, int minutes){//we are not taking in any negative numbers, this will give an exception
		if (hours < 0 || minutes < 0) {
			throw new IllegalArgumentException();
		}
		this.hours += hours;
		this.minutes += minutes;
	}
	
	public int getHours() {//Returns the hours 
        return hours;
    }
    public int getMinutes() {//Returns the minutes
        return minutes;
    }
    
	public String toString() {//returns the string as a "put together" output
		return hours + "h" + minutes + "m";
	}
	public void add(addtimespan span) {// adds an amount of time to timespan
	this.hours += span.getHours();
	this.minutes += span.getMinutes();

	hours += minutes/60;
	minutes = minutes %= 60;
}
	
	
} 

