package com.zhm.util.encrypt;

/**
 * Base64编码
 * 创建者 hongming.zhao
 * 创建时间	2018年11月27日
 */
public class Base64Encoder {
	public static String getBASE64(String s) {  
        if (s == null)  
            return null;  
        return (new sun.misc.BASE64Encoder()).encode(s.getBytes());  
    }

    /**将 BASE64 编码的字符串 s 进行解码   解密
     *
     * @param s
     * @return
     */
    public static String getFromBASE64(String s) {  
        if (s == null)  
            return null;  
        sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();  
        try {  
            byte[] b = decoder.decodeBuffer(s);  
            return new String(b);  
        } catch (Exception e) {  
            return null;  
        }  
    }

    /**
     * 加密
     * @param ming
     * @return
     */
    public static String mTOa(Object ming){
        return Base64Encoder.getBASE64(Base64Encoder.getBASE64(Base64Encoder.getBASE64((String)ming)));
    }
    /**
     * 解密
     * @param an
     * @return
     */
    public static String aTOm(String an){
        return Base64Encoder.getFromBASE64(Base64Encoder.getFromBASE64(Base64Encoder.getFromBASE64(an)));
    }
    public static void main(String[] args) {
        String a = mTOa("爪哇笔记".toString());
        System.out.println(a);//加密
        System.out.println(aTOm(a));//解密
    }

}
