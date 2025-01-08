package com.davifariasp.isp.ex1.solucao;

public interface CRUDOperations {
    void create(String data);
    void read(String id);
    void update(String id, String data);
    void delete(String id);
}
