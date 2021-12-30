package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//抑制警告
@SuppressWarnings("all")
//lombok加载
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String uuid;
    private String name;
    private String pwd;
    private Date   creatDate;

    public User(int i, String uuid, String hh, String s, Date date) {
    }

    //    1	王静涵	123
//            2	王萧涵	1234
//            3	王树明	12345
//            4	黄红	123456\
}
