public class subtracttimespan {
	private int hours;
	private int minutes;
	
	public subtracttimespan(int hours, int minutes) { // this is our timespan with an interval of 0,0
		this.hours = 0;
		this.minutes = 0;
		add(hours, minutes);
	}
	
	public void add(int hours, int minutes){//we are not taking in any negative numbers, this will give an exception
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
    
	public String toString() { //returns the string as a "put together" output
		return hours + "h" + minutes + "m";
	}
	public void subtract(subtracttimespan span) {//Subtract the amount of time chosen from timespan
		this.hours -= span.getHours();
		this.minutes -= span.getMinutes();
		if (minutes < 0) {
			minutes += 60;
			hours --;
	}
}
	
} 

