package com.cengizhan.kose;

public class CourseManager {

    public void courseRegister(Course course) {
        System.out.println(course.name + " isimli kursa başarılı bir şekilde kayıt oldunuz.");
    }

    public void courseLeave(Course course) {
        System.out.println(course.name + " isimli kurstan başarılı bir şekilde ayrıldınız.");
    }
}
