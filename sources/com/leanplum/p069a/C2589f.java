package com.leanplum.p069a;

import java.util.Map;

/* renamed from: com.leanplum.a.f */
public abstract class C2589f {
    /* renamed from: a */
    private boolean f8054a = false;
    protected Map<String, Object> args;
    protected boolean isRooted = true;
    protected String messageId = null;
    protected String originalMessageId = null;
    protected int priority;

    public C2589f(String str, String str2) {
        this.messageId = str;
        this.originalMessageId = str2;
    }

    /* renamed from: a */
    final void m9709a(boolean z) {
        this.isRooted = z;
    }

    /* renamed from: b */
    final void m9711b(boolean z) {
        this.f8054a = true;
    }

    /* renamed from: a */
    final boolean m9710a() {
        return this.f8054a;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getOriginalMessageId() {
        return this.originalMessageId;
    }

    public int getPriority() {
        return this.priority;
    }

    public Map<String, Object> getArgs() {
        return this.args;
    }
}
