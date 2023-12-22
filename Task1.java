import java.util.Scanner;

public class Task1 {

    public static void main(String args[])
    {
        double temp,cel,fahr,kelvin;
        String unit;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature value\n");
        temp=sc.nextFloat();
        System.out.println("Enter the original unit of measurement");


           do
            {
                System.out.println("Type \"c\" for unit of temperature in Celcius");
                System.out.println("Type \"k\" for unit of temperature in Kelvin");
                System.out.println("Type \"f\" for unit of temperature in Fahrenheit\n");
                unit= sc.next();
                if(unit.equals("c"))
                {
                      fahr= 1.8*temp +32;
                      kelvin=temp+273.15;
                      System.out.println("temperature in fahrenheit is "+fahr+" F\n");
                    System.out.println("temperature in kelvin is "+kelvin+" K\n");
                    if(flag)
                        break;

                }
               else if(unit.equals("k"))
                {
                    cel=temp-273.15;
                    fahr=1.8*(temp-273.15)+32;
                    System.out.println("temperature in celcius is "+cel+" C\n");
                    System.out.println("temperature in fahrenheit is "+fahr+" F\n");
                    if(flag)
                        break;
                }
               else if(unit.equals("f"))
                {
                    cel=(temp-32)*(5/9);
                    kelvin=(temp-32)*(5/9) +273.15;
                    System.out.println("temperature in celcius is "+cel+" C\n");
                    System.out.println("temperature in kelvin is "+kelvin+" K\n");
                    if(flag)
                        break;
                }
                else {
                    flag=true;
                    System.out.println("Please enter the correct unit:\n");
                }
            }while(flag);
    }
}
