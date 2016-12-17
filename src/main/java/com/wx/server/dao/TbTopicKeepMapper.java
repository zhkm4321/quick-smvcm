package com.wx.server.dao;

import com.wx.server.entity.TbTopicKeep;
import com.wx.server.entity.TbTopicKeepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTopicKeepMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_topic_keep
     *
     * @mbg.generated
     */
    int deleteByExample(TbTopicKeepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_topic_keep
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_topic_keep
     *
     * @mbg.generated
     */
    int insert(TbTopicKeep record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_topic_keep
     *
     * @mbg.generated
     */
    int insertSelective(TbTopicKeep record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_topic_keep
     *
     * @mbg.generated
     */
    List<TbTopicKeep> selectByExample(TbTopicKeepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_topic_keep
     *
     * @mbg.generated
     */
    TbTopicKeep selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_topic_keep
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbTopicKeep record, @Param("example") TbTopicKeepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_topic_keep
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbTopicKeep record, @Param("example") TbTopicKeepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_topic_keep
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbTopicKeep record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_topic_keep
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbTopicKeep record);
}