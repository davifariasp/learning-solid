package com.davifariasp.isp.ex1.violacao;

public class Redis implements DatabaseOperations {
    @Override
    public void create(String data) {
        System.out.println("Creating data in Redis");
    }

    @Override
    public void read(String id) {
        System.out.println("Reading data in Redis");
    }

    @Override
    public void update(String id, String data) {
        System.out.println("Updating data in Redis");
    }

    @Override
    public void delete(String id) {
        System.out.println("Deleting data in Redis");
    }

    @Override
    public void backup() {
        throw new UnsupportedOperationException("Redis does not support backup operation");
    }
}
