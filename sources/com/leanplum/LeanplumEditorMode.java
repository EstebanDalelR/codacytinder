package com.leanplum;

@Deprecated
public enum LeanplumEditorMode {
    LP_EDITOR_MODE_INTERFACE(0),
    LP_EDITOR_MODE_EVENT(1);
    
    /* renamed from: a */
    private final int f21125a;

    private LeanplumEditorMode(int i) {
        this.f21125a = i;
    }

    public final int getValue() {
        return this.f21125a;
    }
}
