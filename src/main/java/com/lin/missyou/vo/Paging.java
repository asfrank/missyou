package com.lin.missyou.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Paging<T> {
    private Long total;
    private Integer count;
    private Integer page;
    private Integer totalPage;
    private List<T> items;

    public Paging(Page<T> pageT) {
        initPageParameters(pageT);
        items = pageT.getContent();
    }

    void initPageParameters(Page<T> pageT) {
        total = pageT.getTotalElements();
        count = pageT.getSize();
        page = pageT.getNumber();
        totalPage = pageT.getTotalPages();
    }
}
