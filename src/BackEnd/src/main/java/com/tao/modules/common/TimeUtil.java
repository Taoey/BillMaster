package com.tao.modules.common;


import com.tao.pojo.sys.SimpleMap;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class TimeUtil {

    /**
     * 时间戳转化为时间字符串
     * @param seconds
     * @return
     */
    public static String timeStamp2Date(String seconds) {
        if(seconds == null || seconds.isEmpty() || seconds.equals("null")){
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");

        String date = sdf.format(new Timestamp(Long.valueOf(seconds + "000")));

        return date;
    }


    public static List<SimpleMap> convertSimpleList(List<SimpleMap> rows){
        for(int i=0;i<rows.size();i++){
            SimpleMap temp = rows.get(i);
            String gmtCreate =temp.getString("gmtCreate");
            temp.put("gmtCreate", timeStamp2Date(gmtCreate));
            rows.set(i,temp);
        }
        return rows;
    }

    /**
     * 获取当日0点的时间戳
     * @return
     */
    public static Long curDayTimeStamp(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String date = String.format("%d-%d-%d",year,month,day);
        return date2TimeStamp(date, "date");
    }
    /**
     * 日期格式字符串转换成时间戳
     * @param date 字符串日期
     * @param format 如：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static Long date2TimeStamp(String date,String format){
        try {
            if(format.equals("date")){
                format = "yyyy-MM-dd";
            }else if(format.equals("time")){
                format = "yyyy-MM-dd HH:mm:ss";
            }
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.parse(date).getTime()/1000;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
