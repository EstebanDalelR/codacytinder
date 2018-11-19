package com.leanplum;

public enum LeanplumLocationAccuracyType {
    IP(0),
    CELL(1),
    GPS(2);
    
    /* renamed from: a */
    private int f7852a;

    private LeanplumLocationAccuracyType(int i) {
        this.f7852a = i;
    }

    public final int value() {
        return this.f7852a;
    }
}
