package org.oops;

public class Contact {
	private String name;
	private long number;
	private String emailId;
	private String contactList;
	private String  result;

	public Contact() {
		// TODO Auto-generated constructor stub
		name = null;
		number = 0;
		emailId = null;
		result="not found";
		contactList ="";
	}

	public void add(String n, long nn, String email) {
		name = n;
		number = nn;
		emailId = email;
		contactList += name + "," + number + "," + emailId + ":";
	}
	public String search(String name)
	{
		if(contactList!=null)
		{
		String contact[]=contactList.split(":");
		for(int i=0;i<contact.length;i++)
		{
			String n=contact[i].split(",")[0];
			if(n.equals(name))
			{
				String nn=contact[i].split(",")[1];
				String e=contact[i].split(",")[2];
				result="Name:"+n+"\t Number:"+nn+"\t Email Id:"+e;
				break;
			}
			
		}
		}
		return result;
	}
	public String search(long number)
	{
		if(contactList!=null)
		{
		String contact[]=contactList.split(":");
		for(int i=0;i<contact.length;i++)
		{
			long nn =Long.parseLong(contact[i].split(",")[1]);
			if(nn==number)
			{
				String n=contact[i].split(",")[0];
				String e=contact[i].split(",")[2];
				result="Name:"+n+"\t Number:"+nn+"\t Email Id:"+e;
				break;
			}
			
		}
		}
		return result;
	}
	public String search(long number,String emailId)
	{
		if(contactList!=null)
		{
		String contact[]=contactList.split(":");
		for(int i=0;i<contact.length;i++)
		{
			long nn =Long.parseLong(contact[i].split(",")[1]);
			String e=contact[i].split(",")[2];
			if(nn==number&&emailId.equals(e))
			{
				String n=contact[i].split(",")[0];
			
				result="Name:"+n+"\t Number:"+nn+"\t Email Id:"+e;
				break;
			}
			
		}
		}
		return result;
	}
}
