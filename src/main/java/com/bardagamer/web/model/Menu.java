package com.bardagamer.web.model;

import com.bardagamer.web.ui.component.MenuItem;

public class Menu implements MenuItem {

    private String name;
    private String url;

    public Menu() {
    }

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
