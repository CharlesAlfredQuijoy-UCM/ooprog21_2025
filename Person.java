public abstract class Person{
   protected String lastName;
   protected String firstName;
   
   
   public Person(String lastName, String firstName){
      this.firstName = firstName;
      this.lastName = lastName;
   }
      public String getLastName(){
         return lastName;
      }
      
      public String getFirstName(){
         return firstName;
      }
      
      public String displayInfo(){
         return firstName + " " + lastName;
      }
}