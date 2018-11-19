package com.tinder.scarlet;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/scarlet/ShutdownReason;", "", "code", "", "reason", "", "(ILjava/lang/String;)V", "getCode", "()I", "getReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "scarlet-core"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.f */
public final class C14796f {
    @NotNull
    @JvmField
    /* renamed from: a */
    public static final C14796f f46377a = new C14796f(f46378b.m56091a(), f46378b.m56093b());
    /* renamed from: b */
    public static final C14795a f46378b = new C14795a();
    /* renamed from: e */
    private static final int f46379e = 1000;
    /* renamed from: f */
    private static final String f46380f = "Normal closure";
    /* renamed from: c */
    private final int f46381c;
    @NotNull
    /* renamed from: d */
    private final String f46382d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/scarlet/ShutdownReason$Companion;", "", "()V", "GRACEFUL", "Lcom/tinder/scarlet/ShutdownReason;", "NORMAL_CLOSURE_REASON", "", "getNORMAL_CLOSURE_REASON", "()Ljava/lang/String;", "NORMAL_CLOSURE_STATUS_CODE", "", "getNORMAL_CLOSURE_STATUS_CODE", "()I", "scarlet-core"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.f$a */
    public static final class C14795a {
        private C14795a() {
        }

        /* renamed from: a */
        private final int m56091a() {
            return C14796f.f46379e;
        }

        /* renamed from: b */
        private final String m56093b() {
            return C14796f.f46380f;
        }
    }

    /* renamed from: d */
    public final int m56098d() {
        return this.f46381c;
    }

    @NotNull
    /* renamed from: e */
    public final String m56099e() {
        return this.f46382d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14796f) {
            C14796f c14796f = (C14796f) obj;
            return (this.f46381c == c14796f.f46381c ? 1 : null) != null && C2668g.a(this.f46382d, c14796f.f46382d);
        }
    }

    public int hashCode() {
        int i = this.f46381c * 31;
        String str = this.f46382d;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShutdownReason(code=");
        stringBuilder.append(this.f46381c);
        stringBuilder.append(", reason=");
        stringBuilder.append(this.f46382d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14796f(int i, @NotNull String str) {
        C2668g.b(str, "reason");
        this.f46381c = i;
        this.f46382d = str;
    }

    /* renamed from: a */
    public final int m56097a() {
        return this.f46381c;
    }
}
