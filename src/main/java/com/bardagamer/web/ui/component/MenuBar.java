package com.bardagamer.web.ui.component;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;

import java.util.List;


public class MenuBar extends HorizontalLayout {

    public static final String MENU_CSS = "menu-bar";
    public static final String LOGO_PATH = "frontend/images/logo.png";

    private Image logo;
    private Tabs tabs;
    private Button signUpButton;
    private Button loginButton;


    public MenuBar(String url, List<? extends MenuItem> menuItems){
        this(new Image( url != null ? url : LOGO_PATH, "logo"), new Tabs(), new Button(), new Button());

        logo.setHeight("60px");
        logo.setWidth("70px");


        menuItems.forEach(m -> {
            Tab tab = new Tab(new IronIcon("vaadin", null), new Span(m.getName()));
            tab.getElement().setAttribute("theme", "icon-on-top");
//            tab.addAttachListener(attachEvent -> "signIn"

            tabs.add(tab);

        });

        HorizontalLayout buttons = new HorizontalLayout();
        buttons.setAlignItems(Alignment.END);

        signUpButton.setText("Registrarse");


        loginButton.setText("Login");

        buttons.add(signUpButton, loginButton);
        buttons.setWidth("10%");

        tabs.setWidth("90%");

        add(logo);
        add(tabs);
        add(buttons);
    }

    public MenuBar( Image logo, Tabs tabs, Button signUpButton, Button loginButton) {
        this.logo = logo;
        this.tabs = tabs;
        this.signUpButton = signUpButton;
        this.loginButton = loginButton;

        setHeight("60px");
        setWidth("100%");
        setClassName(MENU_CSS);
    }

    public Image getLogo() {
        return logo;
    }

    public void setLogo(Image logo) {
        this.logo = logo;
    }

    public Tabs getTabs() {
        return tabs;
    }

    public void setTabs(Tabs tabs) {
        this.tabs = tabs;
    }

    public Button getSignUpButton() {
        return signUpButton;
    }

    public void setSignUpButton(Button signUpButton) {
        this.signUpButton = signUpButton;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(Button loginButton) {
        this.loginButton = loginButton;
    }
}
