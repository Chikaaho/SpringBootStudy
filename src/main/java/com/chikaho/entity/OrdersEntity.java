package com.chikaho.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Table(name = "orders", schema = "demo", catalog = "")
public class OrdersEntity {
    private long id;
    private long orderName;
    private long stock;
    private int price;
    private Byte isDeleted;
    private Timestamp createTime;
    private Timestamp updateTime;

    public OrdersEntity(long id, long orderName, long stock, int price, Byte isDeleted, Timestamp createTime, Timestamp updateTime) {
        this.id = id;
        this.orderName = orderName;
        this.stock = stock;
        this.price = price;
        this.isDeleted = isDeleted;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public OrdersEntity() {
    }

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_name")
    public long getOrderName() {
        return orderName;
    }

    public void setOrderName(long orderName) {
        this.orderName = orderName;
    }

    @Basic
    @Column(name = "stock")
    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "is_deleted")
    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return id == that.id &&
                orderName == that.orderName &&
                stock == that.stock &&
                price == that.price &&
                Objects.equals(isDeleted, that.isDeleted) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderName, stock, price, isDeleted, createTime, updateTime);
    }
}
