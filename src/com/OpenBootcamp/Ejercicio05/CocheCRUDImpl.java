package com.OpenBootcamp.Ejercicio05;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save(Coche coche) {
        System.out.println("Metodo save");

    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Metodo findAll");

        return null;
    }

    @Override
    public void delete() {
        System.out.println("Metodo delete");

    }
}
