/**
 * 
 *Class for retrieving appointment details from the database.
 */

public class sortAppointments {
  
  ArrayList<String> permissions = new ArrayList<String>();
  ArrayList<String> appointments = new ArrayList<String>();


  /** 
  *This Method Gets the Appointments stored in CSV file.
  *User Login determines which appointments are pulled.
  */
  public void sortAppointments (String userName) {
    
    permissions = getPermissions(userName);
    
    if(permissions.get(1) == "ADMIN"){
    //PULL ALL APPOINTMENTS
    } else {
    //PULL ONLY THE APPOINTMENTS SET BY USER.
    }
  }
  
  /** 
  *This method pulls permissions from the employee database (Probably CSV)
  */
  public ArrayList<String> getPermissions (String userName){
    //Get Permissions based on userName.
    
    //return permission array
  }
  
  /** 
  *Returns appointments to caller.
  */
  public  ArrayList<String> getAppointments (){
    return appointments;
  }
}
