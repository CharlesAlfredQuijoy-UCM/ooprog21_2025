public class Student extends Person{
   int idNo;
   String course;
   String department;
   
   public Student(String firstName, String lastName, int idNo,
                  String course, String department){
                  
         super(firstName, lastName);
         this.idNo = idNo;
         this.course = course;
         this.department = department;
  }
}