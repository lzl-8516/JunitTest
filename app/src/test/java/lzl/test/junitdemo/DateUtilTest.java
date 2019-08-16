package lzl.test.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * created by 兰自良
 * on 2019/8/16
 */
public class DateUtilTest {
    private String time="2017-10-15 16:00:02";
    private long timeStamp=150805445000L;
    private Date date;

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
        date=new Date();
        date.setTime(timeStamp);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束!");
    }

    @Test
    public void stampToDate() {
        System.out.println(DateUtil.stampToDate(timeStamp));
        assertEquals("1974-10-12 18:24:03",DateUtil.stampToDate(timeStamp));

    }

    @Test
    public void stampToDate2(){
        assertNotEquals("1974-10-12 18:24:05",DateUtil.stampToDate(timeStamp));
    }

    @Test
    public void dateToStampTest() throws Exception{
        System.out.println("返回的时间戳:"+DateUtil.dateToStamp(time));
        assertNotEquals("1508054402000",DateUtil.dateToStamp(time));
    }

    @Test(expected = ParseException.class)
    public void dateToStampTest1() throws Exception{//校验传入的参数格式
        assertNotEquals("1508054402000",DateUtil.dateToStamp("2017-10-15"));
    }
}