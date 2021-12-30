package com.utlis;


import org.junit.Test;

import java.util.UUID;

@SuppressWarnings("all")
public class IDUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

//    @Test
//    public static void main(String[] args) {
//        System.out.println(getId());
//        System.out.println(getId());
//        System.out.println(getId());
//        System.out.println(getId());
//    }
}
