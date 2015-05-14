package com.gs.tools;

import com.gs.database.ContactDAO;

public class CreateContactGuid {

	public static void main(String[] args) {
		ContactDAO dao = new ContactDAO();
		dao.updateContactGuid();
	}
}
