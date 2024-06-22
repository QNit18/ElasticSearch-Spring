package com.qnit18.springelastichsearch.repo;

import com.qnit18.springelastichsearch.entity.Info;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface InfoRepository extends ElasticsearchRepository<Info, Integer> {
    List<Info> findByName(String name);
}
