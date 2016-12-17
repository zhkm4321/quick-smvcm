package com.wx.server.dao;

import com.wx.server.entity.TbBanner;
import com.wx.server.entity.TbBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_banner
     *
     * @mbg.generated
     */
    int deleteByExample(TbBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_banner
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_banner
     *
     * @mbg.generated
     */
    int insert(TbBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_banner
     *
     * @mbg.generated
     */
    int insertSelective(TbBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_banner
     *
     * @mbg.generated
     */
    List<TbBanner> selectByExample(TbBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_banner
     *
     * @mbg.generated
     */
    TbBanner selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_banner
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbBanner record, @Param("example") TbBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_banner
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbBanner record, @Param("example") TbBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_banner
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_banner
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbBanner record);
}