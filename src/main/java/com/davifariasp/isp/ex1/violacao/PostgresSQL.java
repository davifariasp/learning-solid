package com.davifariasp.isp.ex1.violacao;

public class PostgresSQL implements DatabaseOperations {
    @Override
    public void create(String data) {
        System.out.println("Creating data in PostgresSQL");
    }

    @Override
    public void read(String id) {
        System.out.println("Reading data in PostgresSQL");
    }

    @Override
    public void update(String id, String data) {
        System.out.println("Updating data in PostgresSQL");
    }

    @Override
    public void delete(String id) {
        System.out.println("Deleting data in PostgresSQL");
    }

    @Override
    public void backup() {
        System.out.println("Backing up data in PostgresSQL");
    }
}
