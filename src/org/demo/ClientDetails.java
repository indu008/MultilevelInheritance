package org.demo;

import org.sample.CustomerDetails;

public class ClientDetails extends CustomerDetails{
public void customername()	{
	System.out.println("Customer name=Tcs");
}
public static void main(String[]args){
	ClientDetails c=new ClientDetails();
	c.clientName();
	c.customername();
	c.employeeName();
}
}


