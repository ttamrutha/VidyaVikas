package org.oops;

import java.util.Scanner;

public class ViewTCZ {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		TrainComplaintZone obj = null;
		while (true) {
			System.out.println("1.Generate Ticket 2.View Tickets 3 View Services");
			int ch = key.nextInt();
			if (ch == 1) {
				obj = new TrainComplaintZone("Amrutha");
				obj.generatedNewTickets("fail to cancel booking....");
			} else if (ch == 2) {
				if (obj == null) {
					System.out.println("No ticket found");
				} else {
					obj.existingTicket();
				}
			} else {
				obj = new TrainComplaintZone();
				obj.service();
			}
		}
	}
}
