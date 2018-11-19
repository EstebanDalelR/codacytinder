package com.tinder.analytics.p152a;

import com.tinder.analytics.fireworks.C2632i;
import com.tinder.analytics.fireworks.C2633r;
import com.tinder.analytics.p153b.C6211a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/analytics/adapter/LeanplumFireworksEventAdapter;", "", "()V", "from", "Lcom/tinder/analytics/leanplum/CrmEvent;", "fireworksEvent", "Lcom/tinder/analytics/fireworks/FireworksEvent;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.a.a */
public final class C6208a {
    @NotNull
    /* renamed from: a */
    public final C6211a m26834a(@NotNull C2632i c2632i) {
        C2668g.b(c2632i, "fireworksEvent");
        Map c = c2632i.c();
        C2668g.a(c, "fireworksEvent.fieldValues");
        Collection arrayList = new ArrayList(c.size());
        for (Entry entry : c.entrySet()) {
            Object key = entry.getKey();
            C2668g.a(key, "it.key");
            arrayList.add(C15811g.a(((C2633r) key).a(), entry.getValue()));
        }
        c = ae.a((List) arrayList);
        c2632i = c2632i.b();
        C2668g.a(c2632i, "fireworksEvent.eventName");
        return new C6211a(c2632i, c);
    }
}
