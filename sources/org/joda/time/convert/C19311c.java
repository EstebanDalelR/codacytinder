package org.joda.time.convert;

import com.tinder.api.ManagerWebServices;

/* renamed from: org.joda.time.convert.c */
public final class C19311c {
    /* renamed from: a */
    private static C19311c f60171a;
    /* renamed from: b */
    private C19313d f60172b = new C19313d(new Converter[]{C19634i.f61404a, C19638m.f61408a, C19629b.f61399a, C19630e.f61400a, C19631f.f61401a, C19632g.f61402a});
    /* renamed from: c */
    private C19313d f60173c = new C19313d(new Converter[]{C19636k.f61406a, C19634i.f61404a, C19638m.f61408a, C19629b.f61399a, C19630e.f61400a, C19631f.f61401a, C19632g.f61402a});
    /* renamed from: d */
    private C19313d f60174d = new C19313d(new Converter[]{C19633h.f61403a, C19635j.f61405a, C19638m.f61408a, C19631f.f61401a, C19632g.f61402a});
    /* renamed from: e */
    private C19313d f60175e = new C19313d(new Converter[]{C19633h.f61403a, C19637l.f61407a, C19635j.f61405a, C19638m.f61408a, C19632g.f61402a});
    /* renamed from: f */
    private C19313d f60176f = new C19313d(new Converter[]{C19635j.f61405a, C19638m.f61408a, C19632g.f61402a});

    /* renamed from: a */
    public static C19311c m69066a() {
        if (f60171a == null) {
            f60171a = new C19311c();
        }
        return f60171a;
    }

    protected C19311c() {
    }

    /* renamed from: a */
    public InstantConverter m69067a(Object obj) {
        InstantConverter instantConverter = (InstantConverter) this.f60172b.m69072a(obj == null ? null : obj.getClass());
        if (instantConverter != null) {
            return instantConverter;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No instant converter found for type: ");
        stringBuilder.append(obj == null ? ManagerWebServices.NULL_STRING_VALUE : obj.getClass().getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public PartialConverter m69068b(Object obj) {
        PartialConverter partialConverter = (PartialConverter) this.f60173c.m69072a(obj == null ? null : obj.getClass());
        if (partialConverter != null) {
            return partialConverter;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No partial converter found for type: ");
        stringBuilder.append(obj == null ? ManagerWebServices.NULL_STRING_VALUE : obj.getClass().getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: c */
    public PeriodConverter m69069c(Object obj) {
        PeriodConverter periodConverter = (PeriodConverter) this.f60175e.m69072a(obj == null ? null : obj.getClass());
        if (periodConverter != null) {
            return periodConverter;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No period converter found for type: ");
        stringBuilder.append(obj == null ? ManagerWebServices.NULL_STRING_VALUE : obj.getClass().getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConverterManager[");
        stringBuilder.append(this.f60172b.m69071a());
        stringBuilder.append(" instant,");
        stringBuilder.append(this.f60173c.m69071a());
        stringBuilder.append(" partial,");
        stringBuilder.append(this.f60174d.m69071a());
        stringBuilder.append(" duration,");
        stringBuilder.append(this.f60175e.m69071a());
        stringBuilder.append(" period,");
        stringBuilder.append(this.f60176f.m69071a());
        stringBuilder.append(" interval]");
        return stringBuilder.toString();
    }
}
