package android.support.v4.view.accessibility;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.accessibility.c */
public class C0588c {
    /* renamed from: a */
    private final Object f1789a;

    @RequiresApi(16)
    /* renamed from: android.support.v4.view.accessibility.c$a */
    static class C0587a extends AccessibilityNodeProvider {
        /* renamed from: a */
        final C0588c f1788a;

        C0587a(C0588c c0588c) {
            this.f1788a = c0588c;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            i = this.f1788a.mo632a(i);
            if (i == 0) {
                return 0;
            }
            return i.m2254a();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            str = this.f1788a.m2303a(str, i);
            if (str == null) {
                return null;
            }
            i = new ArrayList();
            int size = str.size();
            for (int i2 = 0; i2 < size; i2++) {
                i.add(((C0586b) str.get(i2)).m2254a());
            }
            return i;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f1788a.mo633a(i, i2, bundle);
        }
    }

    @RequiresApi(19)
    /* renamed from: android.support.v4.view.accessibility.c$b */
    static class C2892b extends C0587a {
        C2892b(C0588c c0588c) {
            super(c0588c);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            i = this.a.mo634b(i);
            if (i == 0) {
                return 0;
            }
            return i.m2254a();
        }
    }

    @Nullable
    /* renamed from: a */
    public C0586b mo632a(int i) {
        return null;
    }

    @Nullable
    /* renamed from: a */
    public List<C0586b> m2303a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo633a(int i, int i2, Bundle bundle) {
        return false;
    }

    @Nullable
    /* renamed from: b */
    public C0586b mo634b(int i) {
        return null;
    }

    public C0588c() {
        if (VERSION.SDK_INT >= 19) {
            this.f1789a = new C2892b(this);
        } else if (VERSION.SDK_INT >= 16) {
            this.f1789a = new C0587a(this);
        } else {
            this.f1789a = null;
        }
    }

    public C0588c(Object obj) {
        this.f1789a = obj;
    }

    /* renamed from: a */
    public Object m2302a() {
        return this.f1789a;
    }
}
