package com.geestion.pharmacier.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    private String nameProduct;
    private Double priceProduct;
    private Date dateCreate;

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Product() {
        super();
    }

    public Product(String nameProduct, Double priceProduct, Date dateCreate) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.dateCreate = dateCreate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", dateCreate=" + dateCreate +
                '}';
    }
}
