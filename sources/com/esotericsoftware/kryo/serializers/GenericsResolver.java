package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.minlog.Log;
import java.util.Iterator;
import java.util.LinkedList;

public final class GenericsResolver {
    private LinkedList<Generics> stack = new LinkedList();

    Class getConcreteClass(String str) {
        Iterator it = this.stack.iterator();
        while (it.hasNext()) {
            Class concreteClass = ((Generics) it.next()).getConcreteClass(str);
            if (concreteClass != null) {
                return concreteClass;
            }
        }
        return null;
    }

    boolean isSet() {
        return this.stack.isEmpty() ^ 1;
    }

    void pushScope(Class cls, Generics generics) {
        if (Log.TRACE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Settting a new generics scope for class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(": ");
            stringBuilder.append(generics);
            Log.trace("generics", stringBuilder.toString());
        }
        this.stack.addFirst(generics);
    }

    void popScope() {
        this.stack.removeFirst();
    }
}
