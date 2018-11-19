package android.support.v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import java.util.Set;

/* renamed from: android.support.v4.app.w */
public final class C0424w {
    /* renamed from: a */
    private final String f1425a;
    /* renamed from: b */
    private final CharSequence f1426b;
    /* renamed from: c */
    private final CharSequence[] f1427c;
    /* renamed from: d */
    private final boolean f1428d;
    /* renamed from: e */
    private final Bundle f1429e;
    /* renamed from: f */
    private final Set<String> f1430f;

    /* renamed from: a */
    public String m1583a() {
        return this.f1425a;
    }

    /* renamed from: b */
    public CharSequence m1584b() {
        return this.f1426b;
    }

    /* renamed from: c */
    public CharSequence[] m1585c() {
        return this.f1427c;
    }

    /* renamed from: d */
    public Set<String> m1586d() {
        return this.f1430f;
    }

    /* renamed from: e */
    public boolean m1587e() {
        return this.f1428d;
    }

    /* renamed from: f */
    public Bundle m1588f() {
        return this.f1429e;
    }

    @RequiresApi(20)
    /* renamed from: a */
    static RemoteInput[] m1582a(C0424w[] c0424wArr) {
        if (c0424wArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c0424wArr.length];
        for (int i = 0; i < c0424wArr.length; i++) {
            remoteInputArr[i] = C0424w.m1581a(c0424wArr[i]);
        }
        return remoteInputArr;
    }

    @RequiresApi(20)
    /* renamed from: a */
    static RemoteInput m1581a(C0424w c0424w) {
        return new Builder(c0424w.m1583a()).setLabel(c0424w.m1584b()).setChoices(c0424w.m1585c()).setAllowFreeFormInput(c0424w.m1587e()).addExtras(c0424w.m1588f()).build();
    }
}
