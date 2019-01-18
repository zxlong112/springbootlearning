package com.zxl.bean;

import com.zxl.groups.Groups;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class Book {

    @NotNull(message = "不能为空",groups = Groups.Update.class)
    private Integer id;
    @NotBlank(message = "name不能为空",groups = Groups.Default.class)
    @Length(max = Integer.MAX_VALUE,min = Integer.MIN_VALUE,message = "yinggaizai")
    private String name;

    private BigDecimal price;
}
