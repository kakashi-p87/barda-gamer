package com.bardagamer.web.ui.Layout;

import com.bardagamer.web.component.SessionComponent;
import com.bardagamer.web.service.MenuService;
import com.bardagamer.web.ui.component.MenuBar;
import com.bardagamer.web.ui.view.LogInView;
import com.bardagamer.web.ui.view.RegisterView;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.router.RouterLayout;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;


public class MainLayout extends Div implements RouterLayout {

    public static final String CSS = "styles/shared-styles.html";

    @Autowired
    private SessionComponent sessionComponent;

    @Autowired
    private MenuService menuService;

    private MenuBar menuBar;

    public MainLayout() {
//        setPadding(false);
    }

    @PostConstruct
    public void init(){
        menuBar = new MenuBar(sessionComponent.getUser() != null,null, menuService.getMenus());

        menuBar.getSignUpButton().addClickListener(e ->{
            menuBar.getSignUpButton().getUI().ifPresent(ui -> ui.navigate(RegisterView.PATH));
        });

        menuBar.getLoginButton().addClickListener(e ->{
            menuBar.getLoginButton().getUI().ifPresent(ui -> ui.navigate(LogInView.PATH));
        });

        Div ad = new Div();
        ad.setClassName("ad-div");

        Div ad2 = new Div();
        ad2.setClassName("ad-div2");

        Div ad3 = new Div();
        ad3.setClassName("ad-div3");



        Nav nav = new Nav(menuBar);

        Header header = new Header(nav);

        add(header);
        add(ad);
        add(ad2);
        add(ad3);
    }

}
