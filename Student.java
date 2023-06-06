package student_info;

public class Student extends acd_info{
	
	
		  String Name, ID;
		  
		  
		  //NAME
		  public String getName()
		  {
		   return Name;
		  }
		  
		  public void setName(String n)
		  {
		   Name=n;
		  }
		  //ID
		  public String getID()
		  {
		   return ID;
		  }
		  
		  public void setID(String x)
		  {
		   ID=x;
		  }
		  
		  @Override
		  public String toString() {
			  return ("Name is :"+getName()+"  ID: "+getID()+"  Address is: "+getAddress()+" Email is: "+getEmail());
		  }
	
}
