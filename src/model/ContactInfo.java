package model;

public class ContactInfo {
	private String name;
	private String address;
	private String phone;
	private String email;
	private int zipcode;
	private String city;
	private String country;
	
	public ContactInfo(String name, String address, String phone, String email, int zipcode, String city,
			String country) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.zipcode = zipcode;
		this.city = city;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	

}
