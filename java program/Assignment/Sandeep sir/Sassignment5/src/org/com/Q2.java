package org.com;

class logger{
	private String log;
	private static logger logRef;
	private logger(String log) {
		this.log =log;
	}
	static logger getInstance(String log) {
		if(logRef == null) {
			logRef = new logger(log);
		}
		return logger.logRef;
	}
	String getlog() {
		return this.log;
	}
	void clearlog() {
		this.log="";
		}
	}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger l = logger.getInstance("hi");
		System.out.println(l.getlog());
		l.clearlog();
		logger l1 = logger.getInstance("by");
		System.out.println(l1.getlog());
	}

}
