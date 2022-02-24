package com.iisn.collectionSpring;

import java.util.List;

public class StudentCollections {
private List<StudentDetails> studentDetail;



    public List<StudentDetails> getStudentDetail() {
        return studentDetail;
    }

    public void setStudentDetail(List<StudentDetails> studentDetail) {
        this.studentDetail = studentDetail;
    }
    public void printInfo()
    {
        for(StudentDetails st:studentDetail)
        {
            System.out.println("First Student Details");
            System.out.println("Register No is "+st.getRegisterNo());
            System.out.println("Name is "+st.getName());
            System.out.println("Address "+st.getAddress());
            System.out.println("Mobile Number is "+st.getMobileNo());
        }

    }

}
