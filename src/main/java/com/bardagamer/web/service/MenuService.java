package com.bardagamer.web.service;

import com.bardagamer.web.model.Menu;
import com.bardagamer.web.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getMenus(){
        return menuRepository.getMenus();
    }

}
