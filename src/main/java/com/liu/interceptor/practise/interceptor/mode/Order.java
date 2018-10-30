package com.liu.interceptor.practise.interceptor.mode;

public class Order {

    private Long orderId;

    private String orderName;

    private CarDriver carDriver;


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", carDriver=" + carDriver +
                '}';
    }

    public Long getOrderId() {
        return orderId;
    }

    public Order setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderName() {
        return orderName;
    }

    public Order setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }

    public CarDriver getCarDriver() {
        return carDriver;
    }

    public Order setCarDriver(CarDriver carDriver) {
        this.carDriver = carDriver;
        return this;
    }
}
