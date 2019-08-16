package lzl.test.junitdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * created by 兰自良
 * on 2019/8/16
 */
@RunWith(Parameterized.class)
public class DateUtilTest1 {

    private String time;

    public DateUtilTest1(String time) {
        this.time = time;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers(){
        return new ArrayList(){{
           add("2017-10-15");
           add("2017-10-15 16:00:02");
           add("2017年10月15日 16时00分02秒");
        }};
    }

    @Test(expected = ParseException.class)
    public void dateToStampTest1() throws Exception{
        DateUtil.dateToStamp(time);
    }
}
