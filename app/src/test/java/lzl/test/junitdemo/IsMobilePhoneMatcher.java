package lzl.test.junitdemo;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * created by 兰自良
 * on 2019/8/16
 * 自定义断言匹配器
 */
public class IsMobilePhoneMatcher extends BaseMatcher<String> {

    /**
     * 进行断言判定，返回true则断言成功，否则断言失败
     * @param item
     * @return
     */
    @Override
    public boolean matches(Object item) {
        if (item==null){
            return false;
        }

        Pattern pattern=Pattern.compile("(1|861)(3|5|7|8)\\d{9}$");
        Matcher matcher=pattern.matcher((String) item);

        return matcher.find();
    }

    /**
     * 给期待断言成功的对象增加描述
     * @param description
     */
    @Override
    public void describeTo(Description description) {
        description.appendText("预计此字符串是手机号码!");
    }

    /**
     * 给断言失败的对象增加描述
     */
    @Override
    public void describeMismatch(Object item, Description description) {
        description.appendText(item.toString()+"不是手机号码！");
    }
}
