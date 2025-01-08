package com.davifariasp.isp.ex1.solucao;

public class Postgres implements CRUDOperations, DBBackup {
    @Override
    public void create(String data) {
        System.out.println("Creating data in Postgres");
    }

    @Override
    public void read(String id) {
        System.out.println("Reading data in Postgres");
    }

    @Override
    public void update(String id, String data) {
        System.out.println("Updating data in Postgres");
    }

    @Override
    public void delete(String id) {
        System.out.println("Deleting data in Postgres");
    }

    @Override
    public void backup() {
        System.out.println("Backing up data in Postgres");
    }
}
