package io.paperdb;

import java.util.List;

interface Storage {
    void deleteIfExists(String str);

    void destroy();

    boolean exist(String str);

    List<String> getAllKeys();

    <E> void insert(String str, E e);

    long lastModified(String str);

    <E> E select(String str);

    void setLogLevel(int i);
}
