package com.wx.server.entity;

import java.io.Serializable;
import java.util.Date;

public class TbUser implements Serializable {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.user_id
   * @mbg.generated
   */
  private Integer userId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.union_id
   * @mbg.generated
   */
  private String unionId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.open_id
   * @mbg.generated
   */
  private String openId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.phone
   * @mbg.generated
   */
  private String phone;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.username
   * @mbg.generated
   */
  private String username;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.nickname
   * @mbg.generated
   */
  private String nickname;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.realname
   * @mbg.generated
   */
  private String realname;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.password
   * @mbg.generated
   */
  private String password;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.head_img
   * @mbg.generated
   */
  private String headImg;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.sex
   * @mbg.generated
   */
  private Integer sex;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.car_models
   * @mbg.generated
   */
  private String carModels;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.num_plates
   * @mbg.generated
   */
  private String numPlates;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.country
   * @mbg.generated
   */
  private String country;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.province
   * @mbg.generated
   */
  private String province;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.city
   * @mbg.generated
   */
  private String city;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.status
   * @mbg.generated
   */
  private Integer status;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.create_time
   * @mbg.generated
   */
  private Date createTime;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.update_time
   * @mbg.generated
   */
  private Date updateTime;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.member_time
   * @mbg.generated
   */
  private Date memberTime;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.type
   * @mbg.generated
   */
  private Integer type;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.access_token
   * @mbg.generated
   */
  private String accessToken;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.expires_in
   * @mbg.generated
   */
  private Integer expiresIn;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.refresh_token
   * @mbg.generated
   */
  private String refreshToken;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column tb_user.scope
   * @mbg.generated
   */
  private String scope;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table tb_user
   * @mbg.generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.user_id
   * @return  the value of tb_user.user_id
   * @mbg.generated
   */
  public Integer getUserId() {
    return userId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.user_id
   * @param userId  the value for tb_user.user_id
   * @mbg.generated
   */
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.union_id
   * @return  the value of tb_user.union_id
   * @mbg.generated
   */
  public String getUnionId() {
    return unionId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.union_id
   * @param unionId  the value for tb_user.union_id
   * @mbg.generated
   */
  public void setUnionId(String unionId) {
    this.unionId = unionId == null ? null : unionId.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.open_id
   * @return  the value of tb_user.open_id
   * @mbg.generated
   */
  public String getOpenId() {
    return openId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.open_id
   * @param openId  the value for tb_user.open_id
   * @mbg.generated
   */
  public void setOpenId(String openId) {
    this.openId = openId == null ? null : openId.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.phone
   * @return  the value of tb_user.phone
   * @mbg.generated
   */
  public String getPhone() {
    return phone;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.phone
   * @param phone  the value for tb_user.phone
   * @mbg.generated
   */
  public void setPhone(String phone) {
    this.phone = phone == null ? null : phone.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.username
   * @return  the value of tb_user.username
   * @mbg.generated
   */
  public String getUsername() {
    return username;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.username
   * @param username  the value for tb_user.username
   * @mbg.generated
   */
  public void setUsername(String username) {
    this.username = username == null ? null : username.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.nickname
   * @return  the value of tb_user.nickname
   * @mbg.generated
   */
  public String getNickname() {
    return nickname;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.nickname
   * @param nickname  the value for tb_user.nickname
   * @mbg.generated
   */
  public void setNickname(String nickname) {
    this.nickname = nickname == null ? null : nickname.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.realname
   * @return  the value of tb_user.realname
   * @mbg.generated
   */
  public String getRealname() {
    return realname;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.realname
   * @param realname  the value for tb_user.realname
   * @mbg.generated
   */
  public void setRealname(String realname) {
    this.realname = realname == null ? null : realname.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.password
   * @return  the value of tb_user.password
   * @mbg.generated
   */
  public String getPassword() {
    return password;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.password
   * @param password  the value for tb_user.password
   * @mbg.generated
   */
  public void setPassword(String password) {
    this.password = password == null ? null : password.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.head_img
   * @return  the value of tb_user.head_img
   * @mbg.generated
   */
  public String getHeadImg() {
    return headImg;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.head_img
   * @param headImg  the value for tb_user.head_img
   * @mbg.generated
   */
  public void setHeadImg(String headImg) {
    this.headImg = headImg == null ? null : headImg.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.sex
   * @return  the value of tb_user.sex
   * @mbg.generated
   */
  public Integer getSex() {
    return sex;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.sex
   * @param sex  the value for tb_user.sex
   * @mbg.generated
   */
  public void setSex(Integer sex) {
    this.sex = sex;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.car_models
   * @return  the value of tb_user.car_models
   * @mbg.generated
   */
  public String getCarModels() {
    return carModels;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.car_models
   * @param carModels  the value for tb_user.car_models
   * @mbg.generated
   */
  public void setCarModels(String carModels) {
    this.carModels = carModels == null ? null : carModels.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.num_plates
   * @return  the value of tb_user.num_plates
   * @mbg.generated
   */
  public String getNumPlates() {
    return numPlates;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.num_plates
   * @param numPlates  the value for tb_user.num_plates
   * @mbg.generated
   */
  public void setNumPlates(String numPlates) {
    this.numPlates = numPlates == null ? null : numPlates.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.country
   * @return  the value of tb_user.country
   * @mbg.generated
   */
  public String getCountry() {
    return country;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.country
   * @param country  the value for tb_user.country
   * @mbg.generated
   */
  public void setCountry(String country) {
    this.country = country == null ? null : country.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.province
   * @return  the value of tb_user.province
   * @mbg.generated
   */
  public String getProvince() {
    return province;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.province
   * @param province  the value for tb_user.province
   * @mbg.generated
   */
  public void setProvince(String province) {
    this.province = province == null ? null : province.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.city
   * @return  the value of tb_user.city
   * @mbg.generated
   */
  public String getCity() {
    return city;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.city
   * @param city  the value for tb_user.city
   * @mbg.generated
   */
  public void setCity(String city) {
    this.city = city == null ? null : city.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.status
   * @return  the value of tb_user.status
   * @mbg.generated
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.status
   * @param status  the value for tb_user.status
   * @mbg.generated
   */
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.create_time
   * @return  the value of tb_user.create_time
   * @mbg.generated
   */
  public Date getCreateTime() {
    return createTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.create_time
   * @param createTime  the value for tb_user.create_time
   * @mbg.generated
   */
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.update_time
   * @return  the value of tb_user.update_time
   * @mbg.generated
   */
  public Date getUpdateTime() {
    return updateTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.update_time
   * @param updateTime  the value for tb_user.update_time
   * @mbg.generated
   */
  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.member_time
   * @return  the value of tb_user.member_time
   * @mbg.generated
   */
  public Date getMemberTime() {
    return memberTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.member_time
   * @param memberTime  the value for tb_user.member_time
   * @mbg.generated
   */
  public void setMemberTime(Date memberTime) {
    this.memberTime = memberTime;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.type
   * @return  the value of tb_user.type
   * @mbg.generated
   */
  public Integer getType() {
    return type;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.type
   * @param type  the value for tb_user.type
   * @mbg.generated
   */
  public void setType(Integer type) {
    this.type = type;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.access_token
   * @return  the value of tb_user.access_token
   * @mbg.generated
   */
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.access_token
   * @param accessToken  the value for tb_user.access_token
   * @mbg.generated
   */
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken == null ? null : accessToken.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.expires_in
   * @return  the value of tb_user.expires_in
   * @mbg.generated
   */
  public Integer getExpiresIn() {
    return expiresIn;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.expires_in
   * @param expiresIn  the value for tb_user.expires_in
   * @mbg.generated
   */
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.refresh_token
   * @return  the value of tb_user.refresh_token
   * @mbg.generated
   */
  public String getRefreshToken() {
    return refreshToken;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.refresh_token
   * @param refreshToken  the value for tb_user.refresh_token
   * @mbg.generated
   */
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken == null ? null : refreshToken.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column tb_user.scope
   * @return  the value of tb_user.scope
   * @mbg.generated
   */
  public String getScope() {
    return scope;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column tb_user.scope
   * @param scope  the value for tb_user.scope
   * @mbg.generated
   */
  public void setScope(String scope) {
    this.scope = scope == null ? null : scope.trim();
  }
}