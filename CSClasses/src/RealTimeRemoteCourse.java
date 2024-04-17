
public class RealTimeRemoteCourse extends OnlineCourse {
	String zoomPass;

	public RealTimeRemoteCourse() {
		super();
		
	}

	public RealTimeRemoteCourse(String courseNum, int numStudents, int maxStudents, int credits, String zoomPass) {
		super(courseNum, numStudents, maxStudents, credits);
		this.zoomPass = zoomPass;
	}

	public String getZoomPass() {
		return zoomPass;
	}

	public void setZoomPass(String zoomPass) {
		this.zoomPass = zoomPass;
	}

	@Override
	public String toString() {
		return super.toString() + "\nzoomPass=" + zoomPass ;
	}
	
}
