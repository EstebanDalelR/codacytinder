package com.tinder.deadshot;

public class Deadshot {
    private static Deadshot instance;

    void dropTargetInternal(Object obj) {
    }

    void takeTargetInternal(Object obj, Object obj2) {
    }

    public static void take(Object obj, Object obj2) {
        getInstance().takeTargetInternal(obj, obj2);
    }

    public static void drop(Object obj) {
        getInstance().dropTargetInternal(obj);
    }

    private static Deadshot getInstance() {
        if (instance == null) {
            try {
                instance = (Deadshot) Deadshot.class.getClassLoader().loadClass("com.tinder.deadshot.DeadshotInternal").newInstance();
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        return instance;
    }
}
