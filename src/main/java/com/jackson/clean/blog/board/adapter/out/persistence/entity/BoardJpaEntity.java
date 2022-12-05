package com.jackson.clean.blog.board.adapter.out.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "BOARD")
public class BoardJpaEntity {

    @Id
    public String id;
}
