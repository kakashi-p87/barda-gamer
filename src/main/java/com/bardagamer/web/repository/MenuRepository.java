package com.bardagamer.web.repository;

import com.bardagamer.web.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MenuRepository {

    public List<Menu> getMenus(){
        List<Menu> menus = new ArrayList<>();

        setMenus(menus);
        return menus;
    }

    public void setMenus(List<Menu> list){
        list.add(new Menu("Home"));
        list.add(new Menu("menu1"));
        list.add(new Menu("menu2"));
    }
}
