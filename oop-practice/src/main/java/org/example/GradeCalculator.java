package org.example;

import java.util.List;
public class GradeCalculator {


    private final Courses courses;


    public GradeCalculator(List<Course> courses){
        this.courses = new Courses(courses);


    }


    public double calculateGrade() {
        double totalMultipliedCreditAndCourseGrade = courses.multipliedCreditAndCourseGrade();


        //수강신청 총 학점 수
        int totalCompletedCredit = courses.calculatetotalCompletedCredit();

        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;

    }
}
