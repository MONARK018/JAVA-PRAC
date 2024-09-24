import java.util.*;

class java12

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String fname;
        String lname;
        double msalary,newsalary;

        System.out.println(".......First Employee......");

        System.out.println("Enter the first name of employee:-");
        fname = sc.next();
        System.out.println("Enter the last name of employee:-");
        lname = sc.next();
        System.out.println("Enter the salary:-");
        msalary = sc.nextDouble();
        Employee e = new Employee(fname,lname,msalary);

        System.out.println(".......Second Employee......");

        System.out.println("Enter the first name of employee:-");
        fname = sc.next();
        System.out.println("Enter the last name of employee:-");
        lname = sc.next();
        System.out.println("Enter the salary:-");
        msalary = sc.nextDouble();
        Employee e2 = new Employee(fname,lname,msalary);

        System.out.println("the yearly salary of "+e.getFirstname()+" "+e.getLastname()+":");
        System.out.println(e.getMonthlysalary()*12);
        newsalary= e.getMonthlysalary()*0.1+e.getMonthlysalary();
        e.setMonthlysalary(newsalary);

        System.out.println("the new yearly salary of "+e.getFirstname()+" "+e.getLastname()+" :");
        System.out.println(e.getMonthlysalary()*12);
        e.getMonthlysalary();

        System.out.println("the yearly salary of "+e2.getFirstname()+" "+e2.getLastname()+" :");
        System.out.println(e2.getMonthlysalary()*12);
        newsalary= e2.getMonthlysalary()*0.1+e2.getMonthlysalary();
        e2.setMonthlysalary(newsalary);

        System.out.println("the new yearly salary of "+e2.getFirstname()+" "+e2.getLastname()+" :");
        System.out.println(e2.getMonthlysalary()*12);
        e2.getMonthlysalary();

        System.out.println("23DIT016 MONARK HIRPARA");
    }
    
}     

class Employee
{
        String firstname;
        String lastname;
        double monthlysalary;

        public Employee(String f, String l, double m)
        {
            firstname = f;
            lastname = l;

            if(m < 0)
            { 
                monthlysalary = 0;
            }
            else 
            {
                monthlysalary = m;
            }
        }

        public void setFirstname(String fname)
        {
            firstname = fname;
        }
        

        public String getFirstname()
        {
            return firstname;
        }

        public void setLastname(String lname)
        {
            lastname = lname;
        }
        

        public String getLastname()
        {
            return lastname;
        }

        public void setMonthlysalary(double m) 
        {
            if(m < 0)
            {
            monthlysalary =0;
            }
            else
            {
            monthlysalary = m;
            }
        }
        public double getMonthlysalary() 
        {
            return monthlysalary;
        }     
};
    
