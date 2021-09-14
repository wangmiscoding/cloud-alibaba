package com.wangm.springcloud.entity;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wangm
 * @since 2021/9/5
 */
@Setter
@Getter
public class Order {

    private Integer id;
    private BigDecimal amount;
}
