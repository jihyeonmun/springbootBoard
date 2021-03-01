package com.example.demo.repository;

import com.example.demo.model.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board,Long> {
    List<Board> findByTitle(String title);
    List<Board> findByTitleOrContent(String title, String content);
//    docs.spring.io/spring-data/jap/docs/2.3.1.RELEASE/reference/html/#reference
    Page<Board> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);

}
