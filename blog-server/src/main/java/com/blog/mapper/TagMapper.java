package com.blog.mapper;

import com.api.dto.tag.TagAdminDTO;
import com.api.dto.tag.TagDTO;
import com.api.vo.other.ConditionVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.modle.entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TagMapper extends BaseMapper<Tag> {

    List<TagDTO> listTags();

    List<TagDTO> listTopTenTags();

    List<String> listTagNamesByArticleId(Integer articleId);

    List<TagAdminDTO> listTagsAdmin(@Param("current") Long current, @Param("size") Long size, @Param("conditionVO") ConditionVO conditionVO);

}
