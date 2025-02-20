package JDBC_CURD_APP_Service;
import  IStudentService.StudentServiceFactory;
import JDBC_CURD_APP_Persistance.IstudentDao;
import JDBC_CURD_APP_dto.Student;
import daofactory.StudentDaoFactory;

//Service Layer Logic
public class StudentServiceImpl implements IStudentService{
    IstudentDao stdService=null;
    @Override
    public String addStudent(String sname, Integer sage, String address) {
        stdService = StudentDaoFactory.getStudentDao();
        if(stdService!=null)
            return stdService.addStudent(sname,sage,address);
        else
            return "Failed";
    }

    @Override
    public Student searchStudent(Integer id) {
        stdService = StudentDaoFactory.getStudentDao();
        return stdService.searchStudent(id);
    }

    @Override
    public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
        return "";
    }

    @Override
    public String deleteStudent(Integer sid) {
        return "";
    }
}
