package assignment1;

public class Airtel {

	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void showActiveServices() {
		service.service();
	}
	

}
