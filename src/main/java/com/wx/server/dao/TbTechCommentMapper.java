package com.wx.server.dao;

import com.wx.server.entity.TbTechComment;
import com.wx.server.entity.TbTechCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTechCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    int deleteByExample(TbTechCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    int insert(TbTechComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    int insertSelective(TbTechComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    List<TbTechComment> selectByExampleWithBLOBs(TbTechCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    List<TbTechComment> selectByExample(TbTechCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    TbTechComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbTechComment record, @Param("example") TbTechCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") TbTechComment record, @Param("example") TbTechCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbTechComment record, @Param("example") TbTechCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbTechComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(TbTechComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tech_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbTechComment record);
}