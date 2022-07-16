package cn.edu.whut.binary.health.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Spring-_-Bear
 * @datetime 2022-07-16 16:49 Saturday
 */
public class OrderSetting implements Serializable {
    private static final long serialVersionUID = -3951857524748863364L;

    private Integer id ;
    /**
     * 预约设置日期
     */
    private Date orderDate;
    /**
     * 可预约人数
     */
    private int number;
    /**
     * 已预约人数
     */
    private int reservations;

    public OrderSetting() {
    }

    public OrderSetting(Date orderDate, int number) {
        this.orderDate = orderDate;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getReservations() {
        return reservations;
    }

    public void setReservations(int reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "OrderSetting{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", number=" + number +
                ", reservations=" + reservations +
                '}';
    }
}
