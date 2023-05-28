package com.tikkeul.app.service.item;

import com.tikkeul.app.domain.dto.ItemDTO;
import com.tikkeul.app.domain.dto.OrderDTO;

import java.util.List;
import java.util.Optional;

public interface ItemService {
//    김보령 작업공간
//    열매샵 제품 목록 가져오기 : list.html
    public List<ItemDTO> getList();

//    열매샵 제품 상세 보기 : readDetail.html
    public Optional<ItemDTO> readDetail(Long id);

//    제품 후기 수, 별점
    public Optional<OrderDTO> readReviw(Long id);
}
