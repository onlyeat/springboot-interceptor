package com.liu.interceptor.practise.interceptor.mode;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.sun.org.apache.bcel.internal.generic.NEW;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.apache.el.parser.JJTELParserState;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class OrderTest {


    @Test
    public void testOrder() {
        Order order = new Order();
        CarDriver carDriver = new CarDriver();
        order.setCarDriver(carDriver);
        carDriver.setCarName("GTR");
        carDriver.setName("liu");
        carDriver.setNumber("123");
        System.out.println("#order:{}" + order);
    }

    @Test
    public void testGetLuckyNum() {

//        Map  map = new HashMap<>();
        for (int ii = 0; ii < 10; ii++) {

            String orderId = String.valueOf(ii);
            String index = orderId.substring(orderId.length() - 1);
            Integer i = Integer.parseInt(index);
            Integer t = 4;
            i = i.equals(0) ? 10 : i;
            t = i > t ? i : i + t;

            System.out.print(t+",");
//            Integer[] intergerArr = new Integer[]{};
//            intergerArr[ii] = t;
        }
//        System.out.println(intergerArr.length);
//        for(int jj = 0; jj < intergerArr.length; jj++){
//            map.put(intergerArr[jj], jj);
//        }
//
//        Iterator iterator = map.entrySet().iterator();
//        while(iterator.hasNext()){
//            Object key = iterator.next();
//            System.out.println("key:"+ key + "value:" + map.get(key));
//        }


    }

    @Test
    public void testInvokeLuckNum() {

        Integer index = 0;
        System.out.println(index.equals(0));

    }

}