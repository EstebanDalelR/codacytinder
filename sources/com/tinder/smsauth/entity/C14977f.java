package com.tinder.smsauth.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/smsauth/entity/OneTimePasswordInfo;", "", "expectedLength", "", "code", "", "(ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getExpectedLength", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "entity"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.entity.f */
public final class C14977f {
    /* renamed from: a */
    private final int f46743a;
    @Nullable
    /* renamed from: b */
    private final String f46744b;

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C14977f m56565a(C14977f c14977f, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c14977f.f46743a;
        }
        if ((i2 & 2) != 0) {
            str = c14977f.f46744b;
        }
        return c14977f.m56567a(i, str);
    }

    @NotNull
    /* renamed from: a */
    public final C14977f m56567a(int i, @Nullable String str) {
        return new C14977f(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14977f) {
            C14977f c14977f = (C14977f) obj;
            return (this.f46743a == c14977f.f46743a ? 1 : null) != null && C2668g.a(this.f46744b, c14977f.f46744b);
        }
    }

    public int hashCode() {
        int i = this.f46743a * 31;
        String str = this.f46744b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneTimePasswordInfo(expectedLength=");
        stringBuilder.append(this.f46743a);
        stringBuilder.append(", code=");
        stringBuilder.append(this.f46744b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14977f(int i, @Nullable String str) {
        this.f46743a = i;
        this.f46744b = str;
    }

    /* renamed from: a */
    public final int m56566a() {
        return this.f46743a;
    }

    @Nullable
    /* renamed from: b */
    public final String m56568b() {
        return this.f46744b;
    }
}
