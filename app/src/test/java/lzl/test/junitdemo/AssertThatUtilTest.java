package lzl.test.junitdemo;

import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.assertThat;

/**
 * created by 兰自良
 * on 2019/8/16
 * 演示assert的具体用法
 */

public class AssertThatUtilTest {
    @Rule
    public MyRule rule=new MyRule();

    @Test
    public void testAssertThat1(){
        assertThat("2",notNullValue());
    }

    @Test
    public void testAssertThat2(){
        assertThat("hello ut",both(startsWith("hello")).and(endsWith("aut")));
    }

    @Test
    public void testAssertThat3(){
        assertThat("18050899539",new IsMobilePhoneMatcher());
    }


}
