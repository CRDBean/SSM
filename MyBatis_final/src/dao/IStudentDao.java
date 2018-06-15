package dao;

import java.util.List;
import java.util.Map;

import entity.Student;

public interface IStudentDao {
  
    //����ѯ�����װ��Student�����У�����if��̬ƴ���ַ���
    List<Student>  selectStudentByIf(Student student);
    
    //����Where��̬ƴ���ַ���
    List<Student>  selectStudentByWhere(Student student);
    
    //����choose��̬ƴ���ַ���
    List<Student>  selectStudentByChoose(Student student);
    
    //���Դ����������foreach��̬ƴ���ַ���
    List<Student>  selectStudentByForeach(int[]  a);
    
    //���Դ�����List��foreach��̬ƴ���ַ���
    List<Student>  selectStudentByForeach2(List  a);
    } 
