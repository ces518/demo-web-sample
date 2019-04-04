package me.june.demoweb;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-04-04
 * Time: 22:59
 **/
public interface PostRepository extends JpaRepository<Post,Long> {
}
