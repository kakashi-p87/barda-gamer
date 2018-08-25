package com.bardagamer.web.ui.Layout;

import com.bardagamer.web.service.MenuService;
import com.bardagamer.web.ui.component.MenuBar;
import com.bardagamer.web.ui.view.RegisterView;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.RouterLayout;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;


public class MainLayout extends Div implements RouterLayout {

    @Autowired
    private MenuService menuService;

    private MenuBar menuBar;

    public MainLayout() {
//        setPadding(false);
    }

    @PostConstruct
    public void init(){
        menuBar = new MenuBar(null, menuService.getMenus());

        menuBar.getSignUpButton().addClickListener(e ->{
            menuBar.getSignUpButton().getUI().ifPresent(ui -> ui.navigate(RegisterView.PATH));
        });

        Div ad = new Div();
        ad.setClassName("ad-div");

        Div ad2 = new Div();
        ad2.setClassName("ad-div2");

        Div ad3 = new Div();
        ad3.setClassName("ad-div3");

        add(menuBar);
        add(ad);
        add(ad2);
        add(ad3);
    }

}
