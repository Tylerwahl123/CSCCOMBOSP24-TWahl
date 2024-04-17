
public class InPersonCourse extends Course{
	String roomNum;

	public InPersonCourse() {
		super();
		
	}

	public InPersonCourse(String courseNum, int numStudents, int maxStudents, int credits, String roomNum) {
		super(courseNum, numStudents, maxStudents, credits);
		this.roomNum = roomNum;
		
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRoom Number: " + roomNum ;
	}
	
	
	
	
}
