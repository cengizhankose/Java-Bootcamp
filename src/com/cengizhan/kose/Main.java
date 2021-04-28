package com.cengizhan.kose;

import com.cengizhan.kose.Course;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course(1,"Yazılım geliştirici yetiştirme kampı 1","C# + Angular","Engin Demiroğ");

        Course course2 = new Course(2,"Yazılım geliştirici yetiştirme kampı 2","Java + React","Engin Demiroğ");

        Course course3 = new Course(3,"Programlamaya giriş için temel kurs",
                "Python, C#, Java gibi tüm programlama dilleri için temel programlama mantığını anlatır.",
                "Engin Demiroğ");

        Course[] courses = {course1,course2,course3};

        for (Course course : courses) {
            System.out.println(course.name);
        }

        CourseManager courseManager = new CourseManager();

        courseManager.courseRegister(course1);
        courseManager.courseLeave(course3);
    }

}

