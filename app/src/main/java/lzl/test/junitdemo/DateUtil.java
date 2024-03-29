package lzl.test.junitdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * created by 兰自良
 * on 2019/8/16
 */
public class DateUtil {
    /**
     * 如:2017-11-01 22:11:00
     */
    public static String FORMAT_YMDHMS="yyyy-MM-dd HH:mm:ss";

    /**
     * 掉此方法输入所要转换的时间输入例如(2017-11-01 22:11:00)返回时间戳
     */
    public static String dateToStamp(String time) throws ParseException{
        SimpleDateFormat sdr=new SimpleDateFormat(FORMAT_YMDHMS, Locale.CHINA);
        Date date=sdr.parse(time);
        return date.getTime()+"";
    }

    /**
     * 将时间戳转换为时间
     */
    public static String stampToDate(long lt){
        String res;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(FORMAT_YMDHMS,Locale.CHINA);
        Date date=new Date(lt);
        res=simpleDateFormat.format(date);
        return res;
    }
}
