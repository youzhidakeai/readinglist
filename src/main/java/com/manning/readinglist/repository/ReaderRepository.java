package com.manning.readinglist.repository;

import com.manning.readinglist.dataobject.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: kkc
 * Date: 2019/1/28
 * Time: 14:57
 * code change world
 */
//通过JPA持久化读者
public interface ReaderRepository extends JpaRepository<Reader,String> {

}
