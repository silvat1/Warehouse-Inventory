package team2.inventory.model;

/** Company class.
 * @author James A. Donnell Jr. */
public class Company {
	/** Company Information. */
	private int id;
	/** Company Information. */
	private String name, email, phone, address;

	public Company(int id, String name, String email, String phone, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "[" + name + ", " + email + ", " + phone + ", " + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}