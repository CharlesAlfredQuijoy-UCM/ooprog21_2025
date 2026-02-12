public abstract class Employee extends Person implements iCompute{
      int idNo;
      String position;
      String department;
      int hoursWorked;
      double hourlyRate;
      
      public Employee(String firstName, String lastName, int idNo,
                      String position, String department,
                      int hoursWorked, double hourlyRate){
             super(firstName, lastName);
             this.idNo = idNo;
             this.position = position;
             this.department = department;
             this.hoursWorked = hoursWorked;
             this.hourlyRate = hourlyRate;                    
  }
}