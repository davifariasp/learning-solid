package com.davifariasp.isp.ex1.violacao;

interface DatabaseOperations {
    void create(String data);
    void read(String id);
    void update(String id, String data);
    void delete(String id);
    void backup();
}
