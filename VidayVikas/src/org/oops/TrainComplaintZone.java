package org.oops;

public class TrainComplaintZone {
	String name;
	String Complaint=null;

	public TrainComplaintZone(String n) {
		// TODO Auto-generated constructor stub
		name = n;
		System.out.println("Welcome to TCZ " + n);
	}

	public TrainComplaintZone() {
		// TODO Auto-generated constructor stub
	}

	public void generatedNewTickets(String c) {
		Complaint = c;
		if(Complaint!=null)
		{
			System.out.println("Sucessfully ticket generated...");
		}
	}

	public void existingTicket() {
		System.out.println("Hello,"+name +" Your Complaint list are:");
		System.out.println(Complaint);
	}

	public void service() {
		System.out.println("Available Services are:");
		System.out.println("1.TG 2.View ");
	}
	
}
