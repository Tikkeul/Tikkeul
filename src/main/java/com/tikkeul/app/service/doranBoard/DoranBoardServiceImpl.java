package com.tikkeul.app.service.doranBoard;

import com.tikkeul.app.dao.DoranBoardDAO;
import com.tikkeul.app.domain.dto.DoranBoardDTO;
import com.tikkeul.app.domain.dto.Pagination;
import com.tikkeul.app.domain.dto.Search;
import com.tikkeul.app.domain.vo.DoranBoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Qualifier("doranBoard") @Primary
public class DoranBoardServiceImpl implements DoranBoardService {
    /*도란보드 최보근*/
    private final DoranBoardDAO doranBoardDAO;

    /*게시글 목록*/
    @Override
    public List<DoranBoardDTO> getList(Pagination pagination, Search search) {
        return doranBoardDAO.findAll(pagination, search);
    }
    /*게시글 추가*/
    @Override
    public void write(DoranBoardDTO doranBoardDTO) {
        doranBoardDAO.save(doranBoardDTO);
    }

    /*게시글 조회*/
    @Override
    public Optional<DoranBoardDTO> read(Long id) {
        return doranBoardDAO.findById(id);
    }

    /*게시글 수정*/
    @Override
    public void modify(DoranBoardVO doranBoardVO) {
        doranBoardDAO.setPostDTO(doranBoardVO);
    }

    /*게시글 삭제*/
    @Override
    public void remove(Long id) {
        doranBoardDAO.delete(id);
    }

    /*게시글 */
    @Override
    public int getTotal(Search search) {
        return doranBoardDAO.findCountOfPost(search);
    }
    
}
