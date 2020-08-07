package com.cql.blog.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Types {

  private Integer id;
  private String name;
  private Date createTime;
  private Date updateTime;

}
