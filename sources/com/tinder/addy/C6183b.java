package com.tinder.addy;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\tJ\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u000e\u001a\u00020\tR\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/addy/LoaderBroker;", "", "()V", "iterator", "", "Lcom/tinder/addy/AdLoader;", "loaders", "Ljava/util/Queue;", "addLoader", "", "loader", "clear", "", "nextLoader", "reset", "LoaderComparator", "PriorityComparator", "addy_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.addy.b */
public final class C6183b {
    /* renamed from: a */
    private final Queue<AdLoader> f22726a = new PriorityQueue(5, new C6181a());
    /* renamed from: b */
    private Iterator<? extends AdLoader> f22727b = this.f22726a.iterator();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/addy/LoaderBroker$LoaderComparator;", "Ljava/util/Comparator;", "Lcom/tinder/addy/AdLoader;", "()V", "priorityComparator", "Lcom/tinder/addy/LoaderBroker$PriorityComparator;", "compare", "", "o1", "o2", "addy_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.b$a */
    public static final class C6181a implements Comparator<AdLoader> {
        /* renamed from: a */
        private final C6182b f22725a = new C6182b();

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m26783a((AdLoader) obj, (AdLoader) obj2);
        }

        /* renamed from: a */
        public int m26783a(@NotNull AdLoader adLoader, @NotNull AdLoader adLoader2) {
            C2668g.b(adLoader, "o1");
            C2668g.b(adLoader2, "o2");
            return this.f22725a.m26784a(adLoader.priority(), adLoader2.priority());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/addy/LoaderBroker$PriorityComparator;", "Ljava/util/Comparator;", "Lcom/tinder/addy/LoaderPriority;", "()V", "compare", "", "o1", "o2", "addy_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.b$b */
    public static final class C6182b implements Comparator<LoaderPriority> {
        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m26784a((LoaderPriority) obj, (LoaderPriority) obj2);
        }

        /* renamed from: a */
        public int m26784a(@NotNull LoaderPriority loaderPriority, @NotNull LoaderPriority loaderPriority2) {
            C2668g.b(loaderPriority, "o1");
            C2668g.b(loaderPriority2, "o2");
            return C2668g.a(loaderPriority.getPriority$addy_release(), loaderPriority2.getPriority$addy_release());
        }
    }

    public C6183b() {
        this.f22726a.addAll(C19301m.a());
    }

    @Nullable
    /* renamed from: a */
    public final AdLoader m26785a() {
        if (this.f22726a.isEmpty()) {
            return null;
        }
        synchronized (this) {
            Iterator it = this.f22727b;
            if (it == null) {
                C2668g.a();
            }
            if (it.hasNext()) {
                it = this.f22727b;
                if (it == null) {
                    C2668g.a();
                }
                AdLoader adLoader = (AdLoader) it.next();
                return adLoader;
            }
            this.f22727b = this.f22726a.iterator();
            return null;
        }
    }

    /* renamed from: a */
    public final void m26786a(@NotNull AdLoader adLoader) {
        C2668g.b(adLoader, "loader");
        synchronized (this) {
            this.f22726a.add(adLoader);
            this.f22727b = this.f22726a.iterator();
            adLoader = C15813i.f49016a;
        }
    }

    /* renamed from: b */
    public final void m26787b() {
        synchronized (this) {
            this.f22726a.clear();
            m26788c();
            C15813i c15813i = C15813i.f49016a;
        }
    }

    /* renamed from: c */
    public final void m26788c() {
        synchronized (this) {
            this.f22727b = this.f22726a.iterator();
            C15813i c15813i = C15813i.f49016a;
        }
    }
}
