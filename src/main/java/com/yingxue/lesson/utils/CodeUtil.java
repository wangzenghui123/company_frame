package com.yingxue.lesson.utils;

public class CodeUtil {

    private static final String DEPT_TPYE="YXD";
    private static final String PERMISSION_TPYE="YXP";

    public  static String padRight(String oriStr,int len,String alexin){
        String str = "";
        int strlen = oriStr.length();
        if(strlen < len){
            for(int i=0;i<len-strlen;i++){
                str=str+alexin;
            }
        }
        str=str+oriStr;
        return str;
    }

    public static String deptCode(String oriStr,int len,String alexin){
        return DEPT_TPYE+padRight(oriStr, len, alexin);
    }

}
