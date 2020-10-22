package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class Java implements Course {


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours 20");
    }

    public void myInitMethod(){
        System.out.println("Executing init method");
    }

    public void myDestroyMethod(){
        System.out.println("Executing destroy method");

    }


}
