package entities;

import java.sql.Date;

import entities_enums.OrderStatus;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order() { }

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() { return id; }
    public Date getMoment() { return moment; }
    public OrderStatus getStatus() { return status; }
    public void setId(Integer id) { this.id = id; }
    public void setMoment(Date moment) { this.moment = moment; }
    public void setOrderStatus(OrderStatus status) { this.status = status; }

    public String toString() {
        return "OrderStatus [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }
}
