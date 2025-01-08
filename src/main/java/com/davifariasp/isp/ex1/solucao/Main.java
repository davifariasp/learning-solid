package com.davifariasp.isp.ex1.solucao;

public class Main {
    public static void main(String[] args) {
        Postgres postgresSQL = new Postgres();
        Redis redis = new Redis();

        redis.create("data");
        redis.read("id");
        redis.update("id", "data");
        redis.delete("id");

        postgresSQL.create("data");
        postgresSQL.read("id");
        postgresSQL.update("id", "data");
        postgresSQL.delete("id");
        postgresSQL.backup();
    }
}
