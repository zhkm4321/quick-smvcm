package com.wx.server.dao;

import com.wx.server.entity.TbService;
import com.wx.server.entity.TbServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbServiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    long countByExample(TbServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    int deleteByExample(TbServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    int insert(TbService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    int insertSelective(TbService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    List<TbService> selectByExample(TbServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    TbService selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbService record, @Param("example") TbServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbService record, @Param("example") TbServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbService record);
}