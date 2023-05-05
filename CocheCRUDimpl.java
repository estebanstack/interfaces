package com.examples.poo.interfaces;

import java.util.List;

public class CocheCRUDimpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Este es el metodo guardar");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Este es el metodo findAll");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Este es el metodo delete");
    }
}
