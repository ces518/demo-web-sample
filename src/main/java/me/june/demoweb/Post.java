package me.june.demoweb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-04-04
 * Time: 22:58
 **/
@Entity
@Getter @Setter
public class Post {
    @Id @GeneratedValue
    private Long id;

    private String title;

    private String contents;
}
