import java.util.*;

class java4
{ 
    public static void main(String[] args) 
    {

        String[] plist = {"Motor", "Fan", "Tube", "wire", "Other"};
        int[] prate = {1000, 500, 200, 100, 300};
        double[] ptax = {8, 12, 5, 7.5, 3};
        System.out.println("!!!Welcome to Hardware Shop!!!");
        char c;

        double pprice = 0;
        double pprice2 = 0;
        double pprice3 = 0;
        double pprice4 = 0;
        double pprice5 = 0;



        do {
            System.out.println("\n1.Motor \n2.Fan \n3.Tube \n4.Wire \n5.Other");
            Scanner obj = new Scanner(System.in);
            int x = obj.nextInt();
            
            switch (x) {

                case 1:
                    System.out.println("Enter the Units of Motor: ");
                    Scanner obj2 = new Scanner(System.in);
                    int n1 = obj2.nextInt();
                    
                    for (int i = 0; i < n1; i++) {
                        double y1 = (ptax[0] * prate[0] / 100) + prate[0];
                        pprice = pprice + y1;
                    }
                    break;

                case 2:
                    System.out.println("Enter the Units of Motor: ");
                    Scanner obj3 = new Scanner(System.in);
                    int n2 = obj3.nextInt();

                    for (int i = 0; i < n2; i++) {
                        double y1 = (ptax[0] * prate[0] / 100) + prate[0];
                        pprice2 = pprice2 + y1;
                    }
                    break;

                case 3:
                    System.out.println("Enter the Units of Motor: ");
                    Scanner obj4 = new Scanner(System.in);
                    int n3 = obj4.nextInt();
                    

                    for (int i = 0; i < n3; i++) {
                        double y1 = (ptax[0] * prate[0] / 100) + prate[0];
                        pprice3 = pprice3 + y1;
                    }
                    break;

                case 4:
                    System.out.println("Enter the Units of Motor: ");
                    Scanner obj5 = new Scanner(System.in);
                    int n4 = obj5.nextInt();
                    

                    for (int i = 0; i < n4; i++) {
                        double y1 = (ptax[0] * prate[0] / 100) + prate[0];
                        pprice4 = pprice4 + y1;
                    }
                    break;

                case 5:
                    System.out.println("Enter the Units of Motor: ");
                    Scanner obj6 = new Scanner(System.in);
                    int n5 = obj6.nextInt();
                    

                    for (int i = 0; i < n5; i++) {
                        double y1 = (ptax[0] * prate[0] / 100) + prate[0];
                        pprice5 = pprice5 + y1;
                    }
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;

            }
                System.out.println("Press Y to add another product or N to Exit");
                Scanner obj7 = new Scanner(System.in);
                c = obj7.next().charAt(0);

            

        } while (c == 'Y' || c == 'y');


        double tprice =(pprice + pprice2 + pprice3 + pprice4 + pprice5);

        System.out.println("Total Price of your Product: " + tprice);

        System.out.println("23DIT016 MONARK HIRPARA");
    }

}