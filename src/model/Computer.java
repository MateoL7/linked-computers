package model;

public class Computer {

	private int hd;
	private int ram;
	private String ip;
	private Computer previous;
	private Computer next;
	
	public Computer(int hd, int ram, String ip) {
		this.hd = hd;
		this.ram = ram;
		this.ip = ip;
	}

	public int getHd() {
		return hd;
	}

	public int getRam() {
		return ram;
	}

	public String getIp() {
		return ip;
	}

	public Computer getPrevious() {
		return previous;
	}

	public void setPrevious(Computer previous) {
		this.previous = previous;
	}

	public Computer getNext() {
		return next;
	}

	public void setNext(Computer next) {
		this.next = next;
	}
	
	
}
