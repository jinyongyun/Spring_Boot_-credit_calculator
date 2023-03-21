package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


public class GradleCalculatorTest {
    
 //학점 계산기 도메인: 이수한 과목, 학점 계산기
    //이수한 과목 : 객체지향프로그래밍, 자료구조, 일본어 회화 ---> 과목(코스) 클래스

    //이수한 과목을 전달하여 평균 학점 게산 요청 ---> 학점 계산기에게 요청 ----> (학점수 * 교과목 평점)의 합계 ----> 과목(코스)
     //                                                   -----> 수강신청 총학점 수         ----> 과목(코스)

    @DisplayName("평균 학점을 계산한다")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3,"A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
