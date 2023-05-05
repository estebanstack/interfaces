package com.examples.poo.interfaces;


public class Main {

       //static CocheCRUD cocheCRUD;

    public static void main(String[] args) {
        CocheCRUDimpl cocheCRUDimpl = new CocheCRUDimpl();

       cocheCRUDimpl.save();
       cocheCRUDimpl.findAll();
       cocheCRUDimpl.delete();

    }
}
