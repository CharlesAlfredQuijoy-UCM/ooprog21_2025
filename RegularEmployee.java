public class RegularEmployee extends Employee{
   private double bonus;
   
   
   public RegularEmployee(String firstName, String lastName, int idNo,
                          String position, String department,
                          int hoursWorked, double hourlyRate,
                          double bonus){
          super(firstName, lastName, idNo, position, department, hoursWorked, hourlyRate);
          this.bonus = bonus;
  }
  
  @Override
  public double computeSalary(){
      return (hoursWorked * hourlyRate) + bonus;
   }
}