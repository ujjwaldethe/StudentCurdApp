package JDBC_CURD_APP_Controller;

import IStudentService.StudentServiceFactory;
import JDBC_CURD_APP_Service.IStudentService;
import JDBC_CURD_APP_dto.Student;
import java.util.Scanner;

//Controller Logic
public class TestApp {

    public static void main(String[] args) {
        int choice ;
        System.out.println("Student Curd App");
        System.out.println("1.Add Student Data");
        System.out.println("2.Search Student ");
        System.out.println("3.Update Student ");
        System.out.println("4.Delete Student ");
        System.out.println("5.Exit Application ");

        while(true)
        {
            System.out.println("Enter Choice (1/2/3/4/5) : ");
            choice = new Scanner(System.in).nextInt();
            switch (choice)
            {
                case 1:
                {
                    insertOperation();
                }break;
                case 2:
                {
                    selectoperaton();
                }break;
                case 3:
                {
                    System.out.println("Under Process");
                    break;
                }
                case 4:
                {
                    System.out.println("Under Progress");
                    break;
                }
                case 5:
                {
                    System.out.println("Thank You");
                    System.exit(0);
                }break;
                default:
                {
                    System.out.println("Wrong Choice");
                }

            }
        }
    }
    public  static void selectoperaton()
    {
        int id ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id : ");
        id = sc.nextInt();
        IStudentService studentService = StudentServiceFactory.getStudentService();
        Student std = studentService.searchStudent(id);
        if(std!=null)
        {
            System.out.println("SID\tSName\tSAge\tSAddr");
            System.out.println(std.getSid()+"\t"+std.getName()+"\t"+std.getSage()+"\t"+std.getSaddress());
        }
        else{
            System.out.println("Records Not Found");
        }
    }
    public static void insertOperation()
    {
        String name;
        Integer age;
        String address;
        String msg ;
        IStudentService studentService = StudentServiceFactory.getStudentService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Enter Age : ");
        age = sc.nextInt();
        System.out.println("Enter Address : ");
        address = sc.next();

        msg = studentService.addStudent(name,age,address);
        if(msg.equalsIgnoreCase("success"))
        {
            System.out.println("Record Inserted Successfully");
        }
        else
        {
            System.out.println("Record Insertion UnSuccessful");
        }
    }
}
