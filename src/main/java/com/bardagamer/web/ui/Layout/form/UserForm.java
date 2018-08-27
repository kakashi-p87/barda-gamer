package com.bardagamer.web.ui.Layout.form;

import com.bardagamer.web.model.User;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.data.value.ValueChangeMode;

public class UserForm extends FormLayout {
    private Binder<User> binder = new Binder<>();

    Label userNameLabel = new Label("Username");
    TextField userNameField = new TextField();

    TextField nameField = new TextField();
    Label nameLabel = new Label("Nombre");

    TextField lastField = new TextField();
    Label lastLabel = new Label("Apellido");

    TextField emailField = new TextField();
    Label emailLabel = new Label("e-mail");

    DatePicker birthDate = new DatePicker();
    Label birthLabel = new Label("Fecha de nacimiento");

    FormLayout.FormItem userNameItem = new FormLayout.FormItem(userNameLabel, userNameField);
    FormLayout.FormItem nameItem = new FormLayout.FormItem(nameLabel, nameField);
    FormLayout.FormItem lastItem = new FormLayout.FormItem(lastLabel, lastField);
    FormLayout.FormItem emailItem = new FormLayout.FormItem(emailLabel, emailField);
    FormLayout.FormItem birthItem = new FormLayout.FormItem(birthLabel, birthDate);

    User user;

    public UserForm() {
        super();
        if( user == null )
            user = new User();



        userNameField.setValueChangeMode(ValueChangeMode.EAGER);
        nameField.setValueChangeMode(ValueChangeMode.EAGER);
        lastField.setValueChangeMode(ValueChangeMode.EAGER);
        emailField.setValueChangeMode(ValueChangeMode.EAGER);


        add(userNameItem, nameItem, lastItem, emailItem, birthItem);

        binder.forField(userNameField)
                .bind(User::getName, User::setName);

        Button registerBtn = new Button("Registrar",
                event -> {
                    try {
                        binder.writeBean(this.user);
                        System.out.println("-------->" + this.user.getName());
                    } catch (ValidationException e) {

                    }
                });

        Button resetBtn = new Button("Reset",
                event ->{
                    binder.readBean(null);
                });

        add(registerBtn, resetBtn);


    }
}
