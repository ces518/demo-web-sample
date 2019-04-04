package me.june.demoweb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-04-04
 * Time: 22:59
 **/
@Entity
@Getter @Setter
public class Comment {
    @Id @GeneratedValue
    private Long id;

    private String comment;

    @ManyToOne
    private Post post;
}
