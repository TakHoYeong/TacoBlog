package me.taco.springbootdeveloper.repository;

import me.taco.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 상속 받을 때 Article과 엔티티의 PK타입 Long을 인수로 넣는다.
@Repository
public interface BlogRepository extends JpaRepository<Article, Long> {
}
