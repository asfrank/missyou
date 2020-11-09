package com.lin.missyou.service;

import com.lin.missyou.model.Spu;
import com.lin.missyou.repository.SpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class SpuService {

    @Autowired
    private SpuRepository spuRepository;

    public Spu getSpuById(Long id) {
        return spuRepository.findOneById(id);
    }

    public Page<Spu> getLatestPagingSpu(Integer pageNum, Integer size) {
        // 分页
        PageRequest request = PageRequest.of(pageNum, size, Sort.by("createTime").descending());

        return spuRepository.findAll(request);
    }
}
