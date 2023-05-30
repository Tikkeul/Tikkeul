package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.vo.ReviewVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {

    //열매목록
    public List<ReviewVO> selectAll(Long id);

    //열매후기작성
    public void insert(ReviewVO reviewVO);

    //열매후기수정
    public void update(ReviewVO reviewVO);

    //열매후기삭제
    public void delete(Long id);

}
