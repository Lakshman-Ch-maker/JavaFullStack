package com.bov.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo 
{
	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.addElement(12);
		v.addElement(1232);
		v.addElement(242);
		v.addElement(null);
		v.addElement(232);
		v.addElement('h');
		v.addElement("jhgf");
		v.addElement(345.5);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}
	
}


