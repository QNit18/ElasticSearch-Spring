package com.qnit18.springelastichsearch.controller;

import com.qnit18.springelastichsearch.entity.Info;
import com.qnit18.springelastichsearch.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/info")
public class InfoController {

    private final InfoService infoService;

    @GetMapping("")
    public Iterable<Info> getInfo() {
        return infoService.findAll();
    }

    @GetMapping("/{id}")
    public Info getInfo(@PathVariable Integer id) {
        return infoService.findById(id);
    }

    @PostMapping
    public Info addInfo(@RequestBody Info info) {
        return infoService.save(info);
    }

    @PutMapping("/{id}")
    public Info updateInfo(@RequestBody Info info, @PathVariable Integer id) {
        Info info1 = infoService.findById(id);
        info1.setName(info.getName());
        info1.setAddress(info.getAddress());
        info1.setAge(info.getAge());
        info1.setAccounts(info.getAccounts());
        return infoService.save(info1);
    }

    @GetMapping("/find/{name}")
    public List<Info> findByBrand(@PathVariable String name) {
        return infoService.findByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteInfo(@PathVariable Integer id) {
        infoService.delete(id);
    }
}
