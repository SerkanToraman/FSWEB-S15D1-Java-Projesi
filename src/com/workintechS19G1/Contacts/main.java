package com.workintechS19G1.Contacts;

import com.workintechS19G1.Contacts.model.Contact;
import com.workintechS19G1.Contacts.model.MobilePhone;

public class main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("542222222");
        Contact serkan = new Contact("Serkan", "533230");
        phone.addNewContact(serkan);
        Contact sami = new Contact("Sami", "533235");
        Contact mine = new Contact("Mine","52130123");
        phone.addNewContact(mine);
        phone.addNewContact(new Contact("Mehmet", "546234665"));
        phone.addNewContact(new Contact("Hasan", "1231232"));
        phone.addNewContact(new Contact("Veli", "1231232"));
        phone.addNewContact(new Contact("Hasan", "1231233"));
        phone.printContact();
        phone.updateContact(serkan,sami);
        phone.printContact();
        phone.removeContact(sami);
        phone.printContact();
        System.out.println(phone.findContact(mine));
        System.out.println(phone.findContact("Mine"));
        System.out.println(phone.findContact("Ece"));



    }
}
