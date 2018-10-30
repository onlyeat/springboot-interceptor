package com.liu.interceptor.practise.interceptor.mode;

import javax.naming.Name;
import java.security.PrivateKey;

public class CarDriver {

//                "name": "李师傅",
//                        "carName": "别克GL8 香槟金",
//                        "number": "川A*3Y9F",
//                        "distance": 0,
//                        "duration": 0
    private String name;

    private String carName;

    private String number;

    @Override
    public String toString() {
        return "CarDriver{" +
                "name='" + name + '\'' +
                ", carName='" + carName + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public CarDriver setName(String name) {
        this.name = name;
        return this;
    }

    public String getCarName() {
        return carName;
    }

    public CarDriver setCarName(String carName) {
        this.carName = carName;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public CarDriver setNumber(String number) {
        this.number = number;
        return this;
    }
}
