package com.bardagamer.web.ui;

import com.bardagamer.web.service.MenuService;
import com.bardagamer.web.ui.Layout.MainLayout;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@HtmlImport("styles/shared-styles.html")
@Route(value = "", layout = MainLayout.class)
public class MainView extends VerticalLayout {


    public MainView(){
        setPadding(true);
        setSizeFull();
        setClassName("content");

        add(new Text("contet main"));

    }

    @PostConstruct
    public void init(){
//        add(new MenuBar(menuService.getMenus()));

    }




}
