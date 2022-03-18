package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author weixin
 * @create 2022 -03 -18 -14:42
 **/
@Mapper
public interface DiscussPostMapper {


    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    int selectDiscussPostsRows(@Param("userId") int userId);
}
