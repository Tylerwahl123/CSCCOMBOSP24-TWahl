
public class Time {
	int hour;
	int minute;
	double second;
	public Time(int hour, int minute, double second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

public Time() {
	this.hour = 0;
	this.minute = 0;
	this.second = 0.0;
	
}
public int getHour() {
	return hour;
}
public void setHour(int hour) {
	this.hour = hour;
}
public int getMinute() {
	return minute;
}
public void setMinute(int minute) {
	this.minute = minute;
}
public double getSecond() {
	return second;
}
public void setSecond(double second) {
	this.second = second;
}
public static Time add(Time t1, Time t2) {
	Time sum = new Time();
	sum.hour = t1.hour + t2.hour;
	sum.minute = t1.minute + t2.minute;
	sum.second = t1.second + t2.second;
	
	if (sum.second>= 60.0) {
		sum.second -= 60.0;
		sum.hour += 1;
	}
	if (sum.minute >= 60) {
		sum.second -= 60;
		sum.hour +=1;
	}
	if (sum.hour >= 24 ) {
		sum.hour -=24;
	}
	return sum;
}
@Override
public String toString() {
	return "Time hour = " + hour + ", minute = " + minute + ", second = " + second ;
}

}
