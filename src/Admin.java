import java.io.Serializable;

public class Admin implements Serializable{
	
	 private int adminID;
	   private String username;
	   private int password;
	   
	   public Admin() {
		   adminID=11101;
		   username="";
		   password=123456;
	   }

	   public Admin( int adminID, String username, int password) {  //constructor with attributes 
			
			this.adminID = adminID;
			this.username = username;
			this.password = password;
	   }
	
		public int getAdminID() {
		return adminID;
		}
	
		public void setAdminID(int adminID) {
			this.adminID = adminID;
		}

		public String getUsername() {
			return username;
		}
	
		public void setUsername(String username) {
			this.username = username;
		}
	
		public int getPassword() {
			return password;
		}
	
		public void setPassword(int password) {
			this.password = password;
		}
		   
		public String toString() {
			return adminID  + " " + username +" "+ password +" ";
		}

}
