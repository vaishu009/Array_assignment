
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
public class EmployeeSalary {
    int empid;
    String empname;
    float empsalary;
    int empdate;
     public void getInput() 
     {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the employee id :: ");
        empid = in.nextInt();
        System.out.print("Enter the employee name :: ");
        empname = in.next();
        System.out.println("Enter date of joining date ::");
        empdate = in.nextInt();
        System.out.print("Enter the employee salary :: ");
        empsalary = in.nextFloat();
     }
 
     public void display() 
     {
        System.out.println("Employee id = " + empid);
        System.out.println("Employee name = " + empname);
        System.out.println("Employee salary = " + empsalary);
        System.out.println("Employee date of joining = "+empdate);
     }
 
 public static void main(String[] args) {
 
  EmployeeSalary e[] = new EmployeeSalary[5];
  for(int i=0; i<10; i++) 
  { 
   e[i] = new EmployeeSalary();
   e[i].getInput();
  }
  System.out.println("**** Data Entered as below ****");
  for(int i=0; i<10; i++) 
  { 
   e[i].display();
  }
 }
}
