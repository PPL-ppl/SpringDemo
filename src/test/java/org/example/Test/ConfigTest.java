package org.example.Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)//加载spring提供的测试环境
@ContextConfiguration(classes = {Config.class})//配置类
@ActiveProfiles("pro")//指定环境
public class ConfigTest {
    @Autowired
    AService aService;

    @Test
    public void testApp() {
        String expect = "pro";
        String actual = aService.getName();
        Assert.assertEquals(expect, actual);
    }
}