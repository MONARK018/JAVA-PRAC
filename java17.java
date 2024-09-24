 class Member 
{ 
     protected String name; 
     protected int age; 
     protected int phoneNo; 
     protected String address; 
     protected int salary; 

      void printSalary() 
     {
        System.out.println("SALARY:- "+salary);
     }
     void printDetail()
     {
        System.out.println("NAME:- "+name);
        System.out.println("AGE:- "+age);
        System.out.println("PHONE NO.:- "+phoneNo);
        System.out.println("ADDRESS:- "+address);
     }
     } 
     
 class Employee extends Member 
     { 
        String specialization;
        Employee(String name, int age, int phoneNo, String address, int salary)
        { 
            this.name = name; 
            this.age = age; 
            this.phoneNo = phoneNo; 
            this.address = address; 
            this.salary = salary;
        }
    }
class Manager extends Member
     {
         String department; 
         Manager(String name, int age, int phoneNo, String address, int salary)
         { 
            this.name = name;
            this.age = age; 
            this.phoneNo = phoneNo; 
            this.address = address; 
            this.salary = salary; 
        } 
    } 
    
    public class java17 
    { 
        public static void main(String[] args) 
        { 
            Employee emp = new Employee("MONARK", 19, 123456, "INDIA", 100000); 
            Manager man = new Manager("MANAN", 18, 987654, "INDIA", 80000);

            emp.printDetail();
            emp.printSalary(); 
       
            System.out.println(" ");

            man.printDetail();
            man.printSalary();
            
            System.out.println("23DIT016 - MONARK HIRPARA");
        } 
    } 