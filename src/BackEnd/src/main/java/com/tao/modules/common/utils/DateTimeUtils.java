package com.tao.modules.common.utils;

import org.apache.commons.lang3.time.DateFormatUtils;

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

    /**
     * 获取当日00:00：00的时间戳
     * @return
     */
    public static Long getDayStartTimestamp(){
        String dateString = DateFormatUtils.format(new Date(), "yyyy-MM-dd 00:00:00");
        Long dateTimestamp = dateTime2Timestamp(dateString, "yyyy-MM-dd HH:mm:ss");
        return dateTimestamp;

//        其他方法
//        Calendar calendar1 = Calendar.getInstance();
//        calendar1.set(calendar1.get(Calendar.YEAR), calendar1.get(Calendar.MONTH), calendar1.get(Calendar.DAY_OF_MONTH),
//                0, 0, 0);
//        Date beginOfDate = calendar1.getTime();
//        System.out.println(beginOfDate);
    }

    /**
     * 获取当日23：59：59的时间戳
     * @return
     */
    public static Long getDayEndTimestamp(){
        String dateString = DateFormatUtils.format(new Date(), "yyyy-MM-dd 23:59:59");
        Long dateTimestamp = dateTime2Timestamp(dateString, "yyyy-MM-dd HH:mm:ss");
        return dateTimestamp;

        // 其他方法 获取当天23点59分59秒Date
//        Calendar calendar2 = Calendar.getInstance();
//        calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
//                23, 59, 59);
//        Date endOfDate = calendar2.getTime();
//        System.out.println(endOfDate);
    }

    public static void main(String[] args) {
        System.out.println(getDayStartTimestamp());
        System.out.println(getDayEndTimestamp());
    }
}