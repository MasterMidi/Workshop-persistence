package model;

public class Supplier {
	private String contactName;
	private String contactPhone;
	private ContactInfo contactInfo;
	
	public Supplier(String contactName, String contactPhone, ContactInfo contactInfo) {
		super();
		this.contactName = contactName;
		this.contactPhone = contactPhone;
		this.contactInfo = contactInfo;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	
}
