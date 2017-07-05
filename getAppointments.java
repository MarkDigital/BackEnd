public class getAppointments {
  
  ArrayList<String> permissions = new ArrayList<String>();
  ArrayList<String> appointments = new ArrayList<String>();


  /** 
  *This Method Gets the Appointments stored in CSV file.
  *User Login determines which appointments are pulled.
  */
  public void getAppointments (String userName) {
    
    getPermissions(userName);
    
    if(permissions.get(1) == "ADMIN"){
    //PULL ALL APPOINTMENTS
    } else {
    //PULL ONLY THE APPOINTMENTS SET BY USER.
    }
  }
  
  /** 
  *This method pulls permissions from the employee database (Probably CSV)
  */
  public void getPermissions (String userName){
    //Get Permissions based on userName.
  }
}
