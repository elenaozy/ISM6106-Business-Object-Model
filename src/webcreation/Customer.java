/**
 * 
 */
package webcreation;

/**
 * @author elenaozyman
 *
 */
public class Customer {
	private String name;
	private String deliveryAddress;
	private String contact;
	private boolean active;
	private String password;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public String getCustName() {
		return name;
	}

	public void setCustName(String name) {
		this.name = name;
	}

	public String getCustDeliveryAddress() {
		return deliveryAddress;
	}

	public void setCustDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getCustContact() {
		return contact;
	}

	public void setCustContact(String contact) {
		this.contact = contact;
	}

	public boolean isActive() {
		return active;
	}

	public void setCustStatus(boolean active) {
		this.active = active;
	}
	public void getCustStatus(boolean active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}