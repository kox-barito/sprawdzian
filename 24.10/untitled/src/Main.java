class Person{
    private String name;
    private String surname;
    private int age;
    private String gender;

public Person(String name, String surname, int age, String gender){
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.gender = gender;
}
public String getName(){
    return name;
}
public String getSurname(){
    return surname;
}
public int getAge(){
    return age;
}
public String getGender(){
    return gender;
}
public void setName(String name){
    this.name = name;
}
public void setSurname(String surname){
    this.surname = surname;
}
public void setAge(int age){
    this.age = age;
}
class Employee extends Person{
  private String position;
  private int salary;
  private int numerId;
  private boolean status;

    public Employee(String position,int salary, int numerId, boolean status, String name, String surname, int age, String gender) {
        super(name, surname, age, gender);{}
       this.position = position;
       this.salary = salary;
       this.numerId = numerId;
       this.status = status;
    }
    public String getPosition(){
        return position;
    }
    public int getSalary(){
        return salary;
    }
    public int getNumerId(){
        return numerId;
    }
    public boolean getStatus(){
        return status;
    }
    class Manager extends Employee{
          private int numberOfSubordinate;
          private String department;
        public Manager(int numberOfSubordinate,String department,String position, int salary, int numerId, boolean status, String name, String surname, int age, String gender) {
            super(position, salary, numerId, status, name, surname, age, gender);{}
            this.numberOfSubordinate = numberOfSubordinate;
            this.department = department;
        }
        public int getNumberOfSubordinate(){
            return numberOfSubordinate;
        }
        public String getDepartment(){
            return department;
        }

    }
}

}

public class Main {
    public static void main(String[] args) {

     Person beat = new Person("Andrzej", "Jajecznik", 21, "Male");
     System.out.println(beat.getName()+" "+beat.getSurname()+" "+beat.getAge()+" "+beat.getGender()+".");
     // Person.Employee emp = new Person.Employee("duze jajco",2510,2423213,"tak","Andrzej", "Jajecznik", 21, "Male"); //

    }

}