package com.lin.missyou.model;

import com.lin.missyou.util.ListAndJson;
import com.lin.missyou.util.MapAndJson;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Sku extends BaseEntity {
    @Id
    private Long id;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private Boolean online;
    private String img;
    private String title;
    private Long spuId;

//    @Convert(converter = MapAndJson.class)
//    private Map<String, Object> test;  // 测试单体json用

    @Convert(converter = ListAndJson.class)
    private List<Object> specs; // 规格 json字段

    private String code; // 前端使用，按规则拼接
    private Long stock;
    private Long categoryId; // 冗余
    private Long rootCategoryId;
}
