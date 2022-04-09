package com.prodapt.week1assignment;
public class SchoolRecords {
	int school_id;
	String school_name;
	String school_address;

	void addRecords() {
		school_id = 1234;
		school_name = "ABC Matriculation School";
		school_address = "OMR,chennai";
	}

	void dispRecords() {
		System.out.println("The School_id is " + school_id);
		System.out.println("The School_name is " + school_name);
		System.out.println("The School_address is " + school_address);
	}
}