package com.wx.server.entity;

import java.io.Serializable;

public class TbOrderWithBLOBs extends TbOrder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.goods_name
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order.goods_img
     *
     * @mbg.generated
     */
    private String goodsImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_order
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.goods_name
     *
     * @return the value of tb_order.goods_name
     *
     * @mbg.generated
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.goods_name
     *
     * @param goodsName the value for tb_order.goods_name
     *
     * @mbg.generated
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order.goods_img
     *
     * @return the value of tb_order.goods_img
     *
     * @mbg.generated
     */
    public String getGoodsImg() {
        return goodsImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order.goods_img
     *
     * @param goodsImg the value for tb_order.goods_img
     *
     * @mbg.generated
     */
    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }
}