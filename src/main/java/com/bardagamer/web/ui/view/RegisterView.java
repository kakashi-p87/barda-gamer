package com.bardagamer.web.ui.view;

import com.bardagamer.web.ui.Layout.MainLayout;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@HtmlImport("styles/shared-styles.html")
@Route(value = RegisterView.PATH, layout = MainLayout.class)
public class RegisterView extends VerticalLayout {

    public static final String PATH = "register.html";

    FormLayout newUser = new FormLayout();

    public RegisterView(){
        setPadding(true);
        setSizeFull();
        setClassName("content");

//        FormLayout.FormItem item = new FormLayout.FormItem();
//        Label username = ;
//        item.addFor(username);

        newUser.addFormItem(new TextField(),new Label("Username"));
        newUser.addFormItem(new TextField(),new Label("Nombre"));
        newUser.addFormItem(new TextField(),new Label("Apellido"));
        newUser.addFormItem(new TextField(),new Label("Apellido"));
        newUser.addFormItem(new TextField(),new Label("e-mail"));

        add(newUser);
    }
}
