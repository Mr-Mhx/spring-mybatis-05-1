package com.bdqn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Students {

    @Id @KeySql(useGeneratedKeys = true)
    private Long id;

    private String name;

    private Integer age;

}
