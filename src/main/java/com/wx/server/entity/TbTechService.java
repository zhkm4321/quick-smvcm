package com.wx.server.entity;

import java.io.Serializable;

public class TbTechService implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_tech_service.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_tech_service.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_tech_service.service_id
     *
     * @mbg.generated
     */
    private Integer serviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_tech_service
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tech_service.id
     *
     * @return the value of tb_tech_service.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tech_service.id
     *
     * @param id the value for tb_tech_service.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tech_service.user_id
     *
     * @return the value of tb_tech_service.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tech_service.user_id
     *
     * @param userId the value for tb_tech_service.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tech_service.service_id
     *
     * @return the value of tb_tech_service.service_id
     *
     * @mbg.generated
     */
    public Integer getServiceId() {
        return serviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tech_service.service_id
     *
     * @param serviceId the value for tb_tech_service.service_id
     *
     * @mbg.generated
     */
    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }
}