package com.wx.server.dao;

import com.wx.server.entity.TbAddress;
import com.wx.server.entity.TbAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated
     */
    int deleteByExample(TbAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated
     */
    int insert(TbAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated
     */
    int insertSelective(TbAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated
     */
    List<TbAddress> selectByExample(TbAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated
     */
    TbAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbAddress record, @Param("example") TbAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbAddress record, @Param("example") TbAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbAddress record);
}