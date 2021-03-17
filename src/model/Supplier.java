package model;

public class Supplier {
	private String cvr;
	private String contactName;
	private String contactPhone;
	private ContactInfo contactInfo;
	
	public Supplier(String cvr, String contactName, String contactPhone, ContactInfo contactInfo) {
		super();
		this.cvr = cvr;
		this.contactName = contactName;
		this.contactPhone = contactPhone;
		this.contactInfo = contactInfo;
	}

	public String getCvr() {
		return cvr;
	}

	public void setCvr(String cvr) {
		this.cvr = cvr;
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
