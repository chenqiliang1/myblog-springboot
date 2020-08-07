package com.cql.blog.pojo;


import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("b_types")
public class Types implements Serializable {

  @TableId(value = "id", type = IdType.AUTO)
  private Integer id;
  private String name;

  @TableField(fill = FieldFill.INSERT)
  private Date createTime;


  @TableField(fill = FieldFill.INSERT_UPDATE)
  private Date updateTime;

  @Override
  public String toString() {
    return "Types{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            '}';
  }
}
