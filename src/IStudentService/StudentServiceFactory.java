package IStudentService;

import JDBC_CURD_APP_Service.IStudentService;
import JDBC_CURD_APP_Service.StudentServiceImpl;

//Abstraction Logic of Implementation
public class StudentServiceFactory {
    private static IStudentService studentService =null;
    private StudentServiceFactory()
    {

    }
    public static IStudentService getStudentService()
    {
        //Singleton pattern code
        if(studentService==null)
            studentService =  new StudentServiceImpl();
        return studentService ;
    }
}
