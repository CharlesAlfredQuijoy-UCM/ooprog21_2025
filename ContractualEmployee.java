public class ContractualEmployee extends Employee{
   private double overtime;
   
   public ContractualEmployee(String firstName, String lastName, int idNo,
                              String position, String department,
                              int hoursWOrked, double hourlyRate,
                              double overtime){
                              
            super(firstName, lastName, idNo, position, department, hoursWorked, hourlyRate);
            this.overtime = overtime;
  }
  
  @Override
  public double computeSalary(){
      return (hoursWorked * hourlyRate) + overtime;
  }
}