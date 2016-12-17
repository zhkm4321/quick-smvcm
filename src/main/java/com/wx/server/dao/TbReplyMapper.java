package com.wx.server.dao;

import com.wx.server.entity.TbReply;
import com.wx.server.entity.TbReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbReplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reply
     *
     * @mbg.generated
     */
    long countByExample(TbReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reply
     *
     * @mbg.generated
     */
    int deleteByExample(TbReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reply
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reply
     *
     * @mbg.generated
     */
    int insert(TbReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reply
     *
     * @mbg.generated
     */
    int insertSelective(TbReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reply
     *
     * @mbg.generated
     */
    List<TbReply> selectByExample(TbReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reply
     *
     * @mbg.generated
     */
    TbReply selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reply
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbReply record, @Param("example") TbReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reply
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbReply record, @Param("example") TbReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reply
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reply
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbReply record);
}