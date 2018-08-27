package com.bardagamer.web.ui.view;

import com.bardagamer.web.component.SessionComponent;
import com.bardagamer.web.model.User;
import com.bardagamer.web.ui.Layout.MainLayout;
import com.bardagamer.web.ui.Layout.form.UserForm;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@HtmlImport("styles/shared-styles.html")
@Route(value = RegisterView.PATH, layout = MainLayout.class)
public class RegisterView extends VerticalLayout {

    public static final String PATH = "register.html";


    public RegisterView(){
        setPadding(true);
        setSizeFull();
        setClassName("content");

        UserForm userForm = new UserForm();



        add(userForm);
    }
}
