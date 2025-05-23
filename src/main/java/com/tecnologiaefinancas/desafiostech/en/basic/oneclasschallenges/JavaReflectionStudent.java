package com.tecnologiaefinancas.desafiostech.en.basic.oneclasschallenges;

import java.lang.reflect.Method;
import java.util.*;

class JavaReflectionStudent {

    /*
    JAVA reflection is a very powerful tool to inspect the attributes of a class in runtime.
    For example, we can retrieve the list of public fields of a class using getDeclaredMethods().

    In this problem, you will be given a class Solution in the editor. You have to fill in the incompleted
    lines so that it prints all the methods of another class called Student in alphabetical order.
    We will append your code with the Student class before running it.
    https://www.hackerrank.com/challenges/java-reflection-attributes/problem?isFullScreen=true
     */

    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

class Solution {

    public static void main(String[] args){
        Class<?> student = JavaReflectionStudent.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}




