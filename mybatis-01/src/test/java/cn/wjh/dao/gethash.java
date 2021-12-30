package cn.wjh.dao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class gethash {
    public static String hashKeyForDisk(String key) {
        String cacheKey;
        try {
            //Java利用MessageDigest获取字符串MD5
            final MessageDigest mDigestData = MessageDigest.getInstance("MD5");
            mDigestData.update(key.getBytes());
            cacheKey = bytesToHexString(mDigestData.digest());
        } catch (NoSuchAlgorithmException e) {
            cacheKey = String.valueOf(key.hashCode());
        }
        return cacheKey;
    }

    private static String bytesToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String name="201519wjh";
        System.out.println(hashKeyForDisk(name));
    }

}
