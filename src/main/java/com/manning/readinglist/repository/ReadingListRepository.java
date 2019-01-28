package com.manning.readinglist.repository;

import com.manning.readinglist.dataobject.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kkc
 * Date: 2019/1/27
 * Time: 23:31
 * code change world
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {

    List<Book> findByReader(String reader);
}
