package com.demo.jdbc.assign;

public class JdbcMain { 
	public static void main(String[] args) {
		JdbcExample j = new JdbcExample();

		// Inserting one customer
		j.insertCustomer(103, "lalit", "kanpur", 2345, 32000);

		// Inserting 5 customer
		j.insertCustomer(104, "deepak", "punjab", 5679, 6000);

		j.insertCustomer(105, "annu", "kolkata", 4567, 54200);

		j.insertCustomer(106, "keerat", "noida", 5679, 77800);

		j.insertCustomer(107, "aman", "Lucknow", 8766, 64500);

		j.insertCustomer(109, "john", "Delhi", 1267, 23400);

		// update the balance

		j.updateBalance(104, 56400);

		// Delete the Row
		j.delete(104);

		// List the Customer
		j.getCustomerDetails();

		// Get customer details with id
		j.getCustomerWithId(102);

	}


}
