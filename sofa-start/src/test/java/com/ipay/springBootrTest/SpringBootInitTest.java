package com.ipay.springBootrTest;


import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.ipay.common.facade.TestService;
import com.ipay.upms.UpmsApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = UpmsApplication.class)
@RunWith(SpringRunner.class)
public class SpringBootInitTest {

    @SofaReference
    private TestService testService;
    @Test
    public   void initTest(){

        testService.test();

    }

}
