package com.wx.server.entity;

import java.io.Serializable;

public class TbRepairShop implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repair_shop.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repair_shop.shop_name
     *
     * @mbg.generated
     */
    private String shopName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repair_shop.shop_description
     *
     * @mbg.generated
     */
    private String shopDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repair_shop.shop_tel
     *
     * @mbg.generated
     */
    private String shopTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repair_shop.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repair_shop.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repair_shop.province
     *
     * @mbg.generated
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repair_shop.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repair_shop.area
     *
     * @mbg.generated
     */
    private String area;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_repair_shop
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repair_shop.id
     *
     * @return the value of tb_repair_shop.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repair_shop.id
     *
     * @param id the value for tb_repair_shop.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repair_shop.shop_name
     *
     * @return the value of tb_repair_shop.shop_name
     *
     * @mbg.generated
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repair_shop.shop_name
     *
     * @param shopName the value for tb_repair_shop.shop_name
     *
     * @mbg.generated
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repair_shop.shop_description
     *
     * @return the value of tb_repair_shop.shop_description
     *
     * @mbg.generated
     */
    public String getShopDescription() {
        return shopDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repair_shop.shop_description
     *
     * @param shopDescription the value for tb_repair_shop.shop_description
     *
     * @mbg.generated
     */
    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription == null ? null : shopDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repair_shop.shop_tel
     *
     * @return the value of tb_repair_shop.shop_tel
     *
     * @mbg.generated
     */
    public String getShopTel() {
        return shopTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repair_shop.shop_tel
     *
     * @param shopTel the value for tb_repair_shop.shop_tel
     *
     * @mbg.generated
     */
    public void setShopTel(String shopTel) {
        this.shopTel = shopTel == null ? null : shopTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repair_shop.user_id
     *
     * @return the value of tb_repair_shop.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repair_shop.user_id
     *
     * @param userId the value for tb_repair_shop.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repair_shop.address
     *
     * @return the value of tb_repair_shop.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repair_shop.address
     *
     * @param address the value for tb_repair_shop.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repair_shop.province
     *
     * @return the value of tb_repair_shop.province
     *
     * @mbg.generated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repair_shop.province
     *
     * @param province the value for tb_repair_shop.province
     *
     * @mbg.generated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repair_shop.city
     *
     * @return the value of tb_repair_shop.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repair_shop.city
     *
     * @param city the value for tb_repair_shop.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repair_shop.area
     *
     * @return the value of tb_repair_shop.area
     *
     * @mbg.generated
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repair_shop.area
     *
     * @param area the value for tb_repair_shop.area
     *
     * @mbg.generated
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }
}