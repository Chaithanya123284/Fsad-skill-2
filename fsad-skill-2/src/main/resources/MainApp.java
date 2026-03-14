package com.fsad;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        Student s = new Student(1,"Ram","CSE");

        dao.addStudent(s);

        List<Student> students = dao.getStudents();

        for(Student st : students){
            System.out.println(st.getId()+" "+st.getName()+" "+st.getCourse());
        }
    }
}
