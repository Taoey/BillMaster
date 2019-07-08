package com.tao.modules.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    /**
     * 动态格式化时间差
     *
     * @param time 时间差
     * @return [d天][h小时]m分钟
     */
    public static String formatDhm(Long time) {
        String result = "";
        time = time / 60000;

        //分
        long surplus = time % 60 + 1; //多加1分钟
        if (surplus > 0) {
            result = surplus + "分钟";
        }
        time = time / 60;

        //时
        if (time == 0) return result;
        surplus = time % 24;
        if (surplus > 0) {
            result = surplus + "小时" + result;
        }
        time = time / 24;

        //天
        if (time > 0) {
            result = time + "天" + result;
        }
        return result;
    }

    public static String getDateStr(Long time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(new Date(time));
    }

    //取当前月的第一天，即每月1号
    public static String getFirstDayOfMonth() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //获取前月的第一天
        Calendar cal_1 = Calendar.getInstance();//获取当前日期
        cal_1.add(Calendar.MONTH, 0);
        cal_1.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
        return format.format(cal_1.getTime());
    }
    //取当天日期
    public static String getTodayDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal_1 = Calendar.getInstance();//获取当前日期
        return format.format(cal_1.getTime());
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.parse("2016-07-18 14:35:00").getTime());

        System.out.println(12 * 60 * 60 * 1000);

        System.out.println(sdf.format(new Date(1468817820000l)));
    }

}
