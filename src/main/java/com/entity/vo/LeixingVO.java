package com.entity.vo;

import com.entity.LeixingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 类型表
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-02-19
 */
@TableName("leixing")
public class LeixingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 类型 Search
     */

    @TableField(value = "lxname")
    private String lxname;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：类型 Search
	 */
    public String getLxname() {
        return lxname;
    }


    /**
	 * 获取：类型 Search
	 */

    public void setLxname(String lxname) {
        this.lxname = lxname;
    }

}
