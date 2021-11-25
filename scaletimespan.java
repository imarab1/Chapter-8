public class scaletimespan {
	private int hours;
	private int minutes;
	
	public scaletimespan(int hours, int minutes) { // this is our timespan with an interval of 0,0
		this.hours = 0;
		this.minutes = 0;
		add(hours, minutes);
	}
	
	public void add(int hours, int minutes){ //we are not taking in any negative numbers, this will give an exception
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
	public void scale(int factor) {//scales the time span by a factor
		this.hours *= factor;
		this.minutes *= factor;
		this.hours += this.minutes/60;
		this.minutes -= minutes/60 * 60;
}
	
}
