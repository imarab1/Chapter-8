public class timespan {
	private int hours;
	private int minutes;
	
	public timespan(int hours, int minutes) {// this is our timespan with an interval of 0,0
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
	
	public String toString() { //returns the string as a "put together" output
		return hours + "h" + minutes + "m";
	}
}

