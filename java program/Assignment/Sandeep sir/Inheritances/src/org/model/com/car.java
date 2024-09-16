package org.model.com;

 class car extends vehicle {
	 private String model;
	 public car(String manufacture, int manuyear,String model) {
	  super(manufacture,manuyear);
	  this.model = model;
		  
	 }
	 public String getModel() {
		 return model;
	 }
	 public String displayInfo() {
		 return  super.displayInfo() + " "+" model:" +model;
	 }

}
