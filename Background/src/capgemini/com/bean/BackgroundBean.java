package capgemini.com.bean;


public class BackgroundBean {
	
private 	int requestid;
private 	String requestStartDate;
private String status;
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
private String requestEndDate;

public int getRequestid() {
	return requestid;
}
public void setRequestid(int requestid) {
	this.requestid = requestid;
}
public String getRequestStartDate() {
	return requestStartDate;
}
public void setRequestStartDate(String requestStartDate) {
	this.requestStartDate = requestStartDate;
}
public String getRequestEndDate() {
	return requestEndDate;
}
public void setRequestEndDate(String requestEndDate) {
	this.requestEndDate = requestEndDate;
}

}