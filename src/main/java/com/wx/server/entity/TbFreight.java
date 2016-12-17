package com.wx.server.entity;

import java.io.Serializable;

public class TbFreight implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight.fgt_price
     *
     * @mbg.generated
     */
    private Float fgtPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight.free_price
     *
     * @mbg.generated
     */
    private Float freePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_freight
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight.id
     *
     * @return the value of tb_freight.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight.id
     *
     * @param id the value for tb_freight.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight.fgt_price
     *
     * @return the value of tb_freight.fgt_price
     *
     * @mbg.generated
     */
    public Float getFgtPrice() {
        return fgtPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight.fgt_price
     *
     * @param fgtPrice the value for tb_freight.fgt_price
     *
     * @mbg.generated
     */
    public void setFgtPrice(Float fgtPrice) {
        this.fgtPrice = fgtPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight.free_price
     *
     * @return the value of tb_freight.free_price
     *
     * @mbg.generated
     */
    public Float getFreePrice() {
        return freePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight.free_price
     *
     * @param freePrice the value for tb_freight.free_price
     *
     * @mbg.generated
     */
    public void setFreePrice(Float freePrice) {
        this.freePrice = freePrice;
    }
}