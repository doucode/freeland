package com.douxiangwei.blog.repository;

import com.douxiangwei.blog.model.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<Blog,Integer> {

}
