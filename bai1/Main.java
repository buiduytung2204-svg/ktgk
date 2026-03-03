/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ktgk;

/**
 *
 * @author tungb
 */
public class Main {
    public static void main(String[] args) {

     
        StudentManager<Student> manager = new StudentManager<>();

        
        manager.add(new Student("BIT210100", "Tran Dang Khoi", 8.5));
        manager.add(new Student("BIT737373", "Nguyen Duc Khanh", 7.8));
        manager.add(new Student("BIT240245", "Bui Duy Tung", 9.2));

        
        for (Student s : manager.getAll()) {
            System.out.println(s);
        }
    }
}
