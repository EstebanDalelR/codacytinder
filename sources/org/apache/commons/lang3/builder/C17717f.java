package org.apache.commons.lang3.builder;

/* renamed from: org.apache.commons.lang3.builder.f */
public class C17717f implements Builder<String> {
    /* renamed from: a */
    private static volatile ToStringStyle f55131a = ToStringStyle.f49656a;
    /* renamed from: b */
    private final StringBuffer f55132b;
    /* renamed from: c */
    private final Object f55133c;
    /* renamed from: d */
    private final ToStringStyle f55134d;

    public /* synthetic */ Object build() {
        return m64556h();
    }

    /* renamed from: d */
    public static ToStringStyle m64551d() {
        return f55131a;
    }

    /* renamed from: c */
    public static String m64550c(Object obj) {
        return C18553e.m66975a(obj);
    }

    public C17717f(Object obj, ToStringStyle toStringStyle) {
        this(obj, toStringStyle, null);
    }

    public C17717f(Object obj, ToStringStyle toStringStyle, StringBuffer stringBuffer) {
        if (toStringStyle == null) {
            toStringStyle = C17717f.m64551d();
        }
        if (stringBuffer == null) {
            stringBuffer = new StringBuffer(512);
        }
        this.f55132b = stringBuffer;
        this.f55134d = toStringStyle;
        this.f55133c = obj;
        toStringStyle.m60664a(stringBuffer, obj);
    }

    /* renamed from: a */
    public C17717f m64552a(String str, Object obj) {
        this.f55134d.mo13448a(this.f55132b, str, obj, null);
        return this;
    }

    /* renamed from: e */
    public Object m64553e() {
        return this.f55133c;
    }

    /* renamed from: f */
    public StringBuffer m64554f() {
        return this.f55132b;
    }

    /* renamed from: g */
    public ToStringStyle m64555g() {
        return this.f55134d;
    }

    public String toString() {
        if (m64553e() == null) {
            m64554f().append(m64555g().m60725g());
        } else {
            this.f55134d.m60692b(m64554f(), m64553e());
        }
        return m64554f().toString();
    }

    /* renamed from: h */
    public String m64556h() {
        return toString();
    }
}
