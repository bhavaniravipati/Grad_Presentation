
public class Employee {

	int eId;
	String eName;
	Address address;
	
	public Employee() {
		
	}
	
	//Constructor Injection
	public Employee(Address address)
	{
		this.address=address;
	}
	
	
	public Employee(int eId, String eName, Address address) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.address = address;
	}
	
	public int geteId() {
		return eId;
	}



	public void seteId(int eId) {
		this.eId = eId;
	}



	public String geteName() {
		return eName;
	}



	public void seteName(String eName) {
		this.eName = eName;
	}



	public Address getAddress() {
		return address;
	}


	//Setter Injection
	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", address=" + address + "]";
	}

	public void myInit()
	{
		System.out.println("---Object Initialized---");
	}
	
	public void myDestroy()
	{
		System.out.println("---Object Destroyed---");
	}
	
}
