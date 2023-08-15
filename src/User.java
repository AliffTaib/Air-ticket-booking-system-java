import java.io.Serializable;
public class User implements Serializable{
	   private String userId;
	   private String name;
	   private String email;
	   private int password;

	   public User( String userId, String name, String email, int password) {  //constructor with attributes 
			
			this.userId = userId;
			this.name = name;
			this.email = email;
			this.password = password;
			
	   }
	   
	   public User( String userId, String name, String email) {  //constructor with attributes 
			
			this.userId = userId;
			this.name = name;
			this.email = email;
			
			
	   }
public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

public String toStringWp() {
	return "  " + userId  + "           " + name +"        "+ email +"           "+password +" ";	
}

public String toString() {
	return "  " + userId  + "           " + name +"        "+ email +" ";
	
	
}
	   }
