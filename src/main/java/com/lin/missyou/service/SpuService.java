package com.lin.missyou.service;

import com.lin.missyou.model.Spu;
import com.lin.missyou.repository.SpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpuService {

    @Autowired
    private SpuRepository spuRepository;

    public Spu getSpuById(Long id) {
        return spuRepository.findOneById(id);
    }

    public List<Spu> getLatestPagingSpu() {
        return spuRepository.findAll();
    }
}
