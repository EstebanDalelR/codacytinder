package com.esotericsoftware.kryo.serializers;

import java.util.HashMap;
import java.util.Map;

final class Generics {
    private Map<String, Class> typeVar2class;

    public Generics() {
        this.typeVar2class = new HashMap();
    }

    public Generics(Map<String, Class> map) {
        this.typeVar2class = new HashMap(map);
    }

    public void add(String str, Class cls) {
        this.typeVar2class.put(str, cls);
    }

    public Class getConcreteClass(String str) {
        return (Class) this.typeVar2class.get(str);
    }

    public Map<String, Class> getMappings() {
        return this.typeVar2class;
    }

    public String toString() {
        return this.typeVar2class.toString();
    }
}
