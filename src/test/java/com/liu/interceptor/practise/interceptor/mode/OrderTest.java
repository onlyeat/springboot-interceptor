package com.liu.interceptor.practise.interceptor.mode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class OrderTest {


    @Test
    public void testOrder(){
       Order order = new Order();
       CarDriver carDriver = new CarDriver();
       order.setCarDriver(carDriver);
       carDriver.setCarName("GTR");
       carDriver.setName("liu");
       carDriver.setNumber("123");
       System.out.println("#order:{}"+order);
    }

}