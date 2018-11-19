package de.greenrobot.event;

/* renamed from: de.greenrobot.event.l */
final class C15534l {
    /* renamed from: a */
    final Object f47996a;
    /* renamed from: b */
    final C15532j f47997b;
    /* renamed from: c */
    final int f47998c;
    /* renamed from: d */
    volatile boolean f47999d = true;

    C15534l(Object obj, C15532j c15532j, int i) {
        this.f47996a = obj;
        this.f47997b = c15532j;
        this.f47998c = i;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C15534l)) {
            return false;
        }
        C15534l c15534l = (C15534l) obj;
        if (this.f47996a == c15534l.f47996a && this.f47997b.equals(c15534l.f47997b) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.f47996a.hashCode() + this.f47997b.f47993d.hashCode();
    }
}
