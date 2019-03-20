package com.jk;

import com.jk.constant.ConstanType;
import com.jk.pojo.AttractBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.format.DateTimeFormatter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DrugManageWebApplicationTests {

    @Test
    public void contextLoads() {
        AttractBean attractBean = new AttractBean();
        System.out.println(attractBean.getCreateTime());
    }

}
