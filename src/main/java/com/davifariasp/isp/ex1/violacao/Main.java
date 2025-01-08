package com.davifariasp.isp.ex1.violacao;

public class Main {
    public static void main(String[] args) {
        Redis redis = new Redis();
        PostgresSQL postgresSQL = new PostgresSQL();

        redis.create("data");
        redis.read("id");
        redis.update("id", "data");
        redis.delete("id");
        redis.backup();

        postgresSQL.create("data");
        postgresSQL.read("id");
        postgresSQL.update("id", "data");
        postgresSQL.delete("id");
        postgresSQL.backup();
    }
}
