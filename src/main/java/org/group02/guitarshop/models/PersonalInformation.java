package org.group02.guitarshop.models;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("session")
public class PersonalInformation {
    public int id;
    public String name;
    public String phone;
    public String email;
    public String address;
    public String avatar;

    public PersonalInformation() {
        this.id = 0;
        this.name = "";
        this.phone = "";
        this.email = "";
        this.address = "";
        this.avatar = "";
    }
    public PersonalInformation(String name, String phone, String email, String address, String avatar) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.avatar = avatar;
    }
    public PersonalInformation(Integer id, String name, String phone, String email, String address, String avatar) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.avatar = avatar;
    }
}