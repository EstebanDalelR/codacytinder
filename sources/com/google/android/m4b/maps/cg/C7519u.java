package com.google.android.m4b.maps.cg;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.accessibility.C0586b;
import android.support.v4.widget.C2911h;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.m4b.maps.cg.ba.C5145a;
import com.google.android.m4b.maps.p125y.C5579p;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.cg.u */
public final class C7519u extends C2911h {
    /* renamed from: b */
    private static final Rect f28091b = new Rect(-2, -2, -1, -1);
    /* renamed from: a */
    private final C5145a f28092a;
    /* renamed from: c */
    private List<az> f28093c;

    /* renamed from: b */
    protected final boolean m33162b(int i, int i2, Bundle bundle) {
        return false;
    }

    public C7519u(View view, C5145a c5145a) {
        super(view);
        this.f28092a = c5145a;
    }

    /* renamed from: a */
    protected final int m33157a(float f, float f2) {
        if (this.f28093c != null) {
            for (int i = 0; i < this.f28093c.size(); i++) {
                Rect t = ((az) this.f28093c.get(i)).m32887t();
                if (t != null && t.contains((int) f, (int) f2)) {
                    return i;
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: a */
    protected final void m33160a(List<Integer> list) {
        this.f28093c = this.f28092a.mo4937d();
        if (this.f28093c != null) {
            int size = this.f28093c.size();
            for (int i = 0; i < size; i++) {
                list.add(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: a */
    protected final void m33159a(int i, AccessibilityEvent accessibilityEvent) {
        if (this.f28093c == null || i >= this.f28093c.size()) {
            this.f28093c = this.f28092a.mo4937d();
        }
        if (this.f28093c != null) {
            if (i < this.f28093c.size()) {
                accessibilityEvent.setContentDescription(C7519u.m33156a((az) this.f28093c.get(i)));
                return;
            }
        }
        accessibilityEvent.setContentDescription("");
    }

    /* renamed from: b */
    public final void m33161b() {
        a();
        if (this.f28093c != null) {
            for (int i = 0; i < this.f28093c.size(); i++) {
                a(i);
            }
        }
    }

    /* renamed from: a */
    private static String m33156a(az azVar) {
        if (azVar == null) {
            return "";
        }
        String str = "";
        String title = azVar.getTitle();
        azVar = azVar.getSnippet();
        if (!C5579p.m24319b(title)) {
            str = String.valueOf(title).concat(". ");
        }
        if (!C5579p.m24319b(azVar)) {
            str = String.valueOf(str);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(azVar).length());
            stringBuilder.append(str);
            stringBuilder.append(azVar);
            stringBuilder.append(".");
            str = stringBuilder.toString();
        }
        return str;
    }

    /* renamed from: a */
    protected final void m33158a(int i, C0586b c0586b) {
        if (this.f28093c != null) {
            if (i < this.f28093c.size()) {
                az azVar = (az) this.f28093c.get(i);
                c0586b.d(C7519u.m33156a(azVar));
                c0586b.a(16);
                i = azVar.m32887t();
                if (i == 0) {
                    c0586b.b(f28091b);
                    return;
                }
                c0586b.b(i);
                c0586b.c(1);
                return;
            }
        }
        c0586b.d("");
        c0586b.b(f28091b);
    }
}
