package com.tao.uitl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
*时间格式处理
 */
public class DateTimeUtils {

    /**
     * 时间戳转日期字符串
     *
     * @param timestamp
     * @param format
     * @return
     */
    public static String timestamp2DateTime(Long timestamp, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.format(new Date(1000 * timestamp));
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return "";
    }

    /**
     * 时间戳转日期对象
     *
     * @param timestamp
     * @return
     */
    public static Date timestamp2DateTime(Long timestamp) {
        try {
            return new Date(1000 * timestamp);
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return null;
    }

    /**
     * 时间格式字符串转时间戳
     *
     * @param date
     * @param format
     * @return
     */
    public static Long dateTime2Timestamp(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date dateO;
        try {
            dateO = sdf.parse(date);
            return dateO.getTime() / 1000;
        } catch (ParseException e) {
            //e.printStackTrace();
        }
        return null;
    }

    /**
     * 时间格式转时间戳
     * @param date
     * @return
     */
    public static Long dateTime2Timestamp(Date date) {
        return date.getTime() / 1000;
    }

}