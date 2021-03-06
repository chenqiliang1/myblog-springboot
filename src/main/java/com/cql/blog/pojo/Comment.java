package com.cql.blog.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

  private Integer id;
  private String name;
  private String comment;
  private String adminComment;
  private Integer articleId;
  private Integer parentCommentId;
  private Date createTime;
  private Date updateTime;
}
