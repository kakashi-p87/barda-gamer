package com.bardagamer.web.ui.view;


import com.bardagamer.web.component.SessionComponent;
import com.bardagamer.web.model.User;
import com.bardagamer.web.ui.Layout.MainLayout;
import com.bardagamer.web.ui.Layout.form.UserForm;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@HtmlImport(MainLayout.CSS)
@Route(value = LogInView.PATH, layout = MainLayout.class)
public class LogInView extends VerticalLayout {

    public static final String PATH = "login.html";

    @Autowired
    private SessionComponent sessionComponent;

    private FormLayout userForm = new FormLayout();
    private TextField userText = new TextField();
    private Label userLabel = new Label("usuario");
    private PasswordField passField = new PasswordField();
    private Label passLabel = new Label("password");


    public LogInView() {
        setPadding(true);
        setSizeFull();
        setClassName("content");
    }

    @PostConstruct
    public void init(){
        userForm.addFormItem(userText, userLabel);
        userForm.addFormItem(passField, passLabel );

        Button loginBtn = new Button("Entrar",
                event -> {
                    User user = new User();



                });


        Button resetBtn = new Button("Reset",
                event -> {
                    userText.setValue("");
                    passField.setValue("");
                });

        userForm.addFormItem(loginBtn, resetBtn);

        add(userForm);
    }


}
