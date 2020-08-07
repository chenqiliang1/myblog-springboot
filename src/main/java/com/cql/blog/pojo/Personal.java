package com.cql.blog.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal {

  private Integer id;
  private String content;
  private String feel;
  private String flag;
  private Date createTime;
  private Date updateTime;

}
