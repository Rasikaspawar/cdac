package org.model.com;

 class vehicle {
	 private String manufacture;
	 private  int manuyear;
	 public vehicle(String manufacture,int manuyear){
		 this.manufacture = manufacture;
		 this.manuyear = manuyear;
	 }
	
	public String getManufacture() {
		return manufacture;
	}
	
	public int getManuyear() {
		return manuyear;
	} 
	public String displayInfo() {
		return  " make: " + manufacture + " "  +"year :" +  manuyear;
	 }
	
	
	 
}
