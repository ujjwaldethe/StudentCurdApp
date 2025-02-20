package daofactory;

import JDBC_CURD_APP_Persistance.IstudentDao;
import JDBC_CURD_APP_Persistance.StudentDaompl;

public class StudentDaoFactory {
    private static IstudentDao studentDao = null;
    private StudentDaoFactory() {
    }
    public static IstudentDao getStudentDao()
    {
        if(studentDao==null)
            studentDao = new StudentDaompl();
        return studentDao;
    }
}
