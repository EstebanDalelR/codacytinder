package de.greenrobot.event;

import java.lang.reflect.Method;

/* renamed from: de.greenrobot.event.j */
final class C15532j {
    /* renamed from: a */
    final Method f47990a;
    /* renamed from: b */
    final ThreadMode f47991b;
    /* renamed from: c */
    final Class<?> f47992c;
    /* renamed from: d */
    String f47993d;

    C15532j(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f47990a = method;
        this.f47991b = threadMode;
        this.f47992c = cls;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C15532j)) {
            return null;
        }
        m58023a();
        C15532j c15532j = (C15532j) obj;
        c15532j.m58023a();
        return this.f47993d.equals(c15532j.f47993d);
    }

    /* renamed from: a */
    private synchronized void m58023a() {
        if (this.f47993d == null) {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append(this.f47990a.getDeclaringClass().getName());
            stringBuilder.append('#');
            stringBuilder.append(this.f47990a.getName());
            stringBuilder.append('(');
            stringBuilder.append(this.f47992c.getName());
            this.f47993d = stringBuilder.toString();
        }
    }

    public int hashCode() {
        return this.f47990a.hashCode();
    }
}
