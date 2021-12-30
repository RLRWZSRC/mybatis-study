package cn.wjh.dao;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class getScurity {


    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("test"));


        // 201519wjh
        // String encodedPassword = "$2a$10$zH7MwOR3i8c/i60HwSoYaOmEbmrplEap7lCH64bfR5wIQzlFSHLIe";

        String encodedPassword = "$2a$10$zH7MwOR3i8c/i60HwSoYaOmEbmrplEap7lCH64bfR5wIQzlFSHLIe";

        boolean bMatch = bCryptPasswordEncoder.matches("201519wjh", encodedPassword);
        System.out.println(bMatch); // true
    }
}
