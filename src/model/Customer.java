package model;

public class Customer {
	private int customerNum;
	private ContactInfo contactInfo;
	private DiscountGroup discoubntGroup;
	public Customer(int customerNum, ContactInfo contactInfo, DiscountGroup discoubntGroup) {
		super();
		this.customerNum = customerNum;
		this.contactInfo = contactInfo;
		this.discoubntGroup = discoubntGroup;
	}
	public int getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	public DiscountGroup getDiscoubntGroup() {
		return discoubntGroup;
	}
	public void setDiscoubntGroup(DiscountGroup discoubntGroup) {
		this.discoubntGroup = discoubntGroup;
	}
	

}
