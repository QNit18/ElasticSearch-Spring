package com.qnit18.springelastichsearch.service;

import com.qnit18.springelastichsearch.entity.Info;
import com.qnit18.springelastichsearch.repo.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {
    @Autowired
    private InfoRepository infoRepository;

    public Info save(Info info) {
        return infoRepository.save(info);
    }

    public Iterable<Info> findAll() {
        return infoRepository.findAll();
    }

    public Info findById(Integer id) {
        return infoRepository.findById(id).orElse(null);
    }

    public void delete(Integer id) {
        infoRepository.deleteById(id);
    }

    public List<Info> findByName(String name) {
        return infoRepository.findByName(name);
    }
}
