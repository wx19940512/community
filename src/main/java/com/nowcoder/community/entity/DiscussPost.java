package com.nowcoder.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author weixin
 * @create 2022 -03 -18 -14:39
 **/
@AllArgsConstructor
@ToString
@Data
public class DiscussPost {

    private int id;
    private int userId;
    private String title;
    private String content;

    //'0-普通; 1-置顶;',
    private int type;

    //'0-正常; 1-精华; 2-拉黑;',
    private int status;
    private Date createTime;
    private int commentCount;
    private int score;


}
