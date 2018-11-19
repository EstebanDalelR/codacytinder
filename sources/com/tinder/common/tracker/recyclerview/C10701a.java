package com.tinder.common.tracker.recyclerview;

import android.graphics.Rect;
import android.support.annotation.UiThread;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.jakewharton.rxbinding.support.p133b.p134a.C5703d;
import com.jakewharton.rxbinding.support.p133b.p134a.C5704e;
import com.jakewharton.rxbinding.support.p133b.p134a.C7016b;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.common.tracker.recyclerview.p199b.C10702a;
import com.tinder.common.tracker.recyclerview.p199b.C10703b;
import com.tinder.common.tracker.recyclerview.p199b.C8569h;
import com.tinder.common.tracker.recyclerview.p199b.C8570i;
import com.tinder.common.tracker.recyclerview.p199b.C8571j;
import com.tinder.common.tracker.recyclerview.p200c.C8575e;
import com.tinder.common.tracker.recyclerview.p200c.C8576g;
import com.tinder.common.tracker.recyclerview.p200c.C8577i;
import com.tinder.common.tracker.recyclerview.rx.ViewVisibleObserver;
import com.tinder.common.view.extension.C8585e;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.BackpressureStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C15811g;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.collections.ab;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020%0 2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010&\u001a\u00020\u0014H\u0003J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003J\u001e\u0010)\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J$\u0010+\u001a\u00020\r*\u00020\u00192\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0010H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/tinder/common/tracker/recyclerview/LinearLayoutItemTracker;", "Lcom/tinder/common/tracker/recyclerview/RecyclerViewItemTracker;", "listVisibleItemProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleItemProvider;", "listVisibleRangeProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleRangeProvider;", "listVisibleStateProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleStateProvider;", "listViewVisibleObserver", "Lcom/tinder/common/tracker/recyclerview/rx/ViewVisibleObserver;", "(Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleItemProvider;Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleRangeProvider;Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleStateProvider;Lcom/tinder/common/tracker/recyclerview/rx/ViewVisibleObserver;)V", "lastVisibleElements", "", "Lcom/tinder/common/tracker/recyclerview/model/VisibleItemState;", "lastVisibleElementsMap", "", "", "rect", "Landroid/graphics/Rect;", "bind", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "getVisibleElementsAndUpdateVisibleItemProvider", "layoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "visibleRange", "Lcom/tinder/common/tracker/recyclerview/model/ListVisibleRangeUpdate;", "handleListViewVisibilityChanged", "isVisible", "", "observeAdapterUpdates", "Lrx/Observable;", "adapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "observeScrollEvents", "Lcom/jakewharton/rxbinding/support/v7/widget/RecyclerViewScrollEvent;", "updateNotVisibleState", "updateVisibleRangeProvider", "updateVisibleState", "updateVisibleStateProvider", "visibleElements", "toVisibleItemState", "position", "firstVisiblePosition", "lastVisiblePosition", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.tracker.recyclerview.a */
public final class C10701a implements RecyclerViewItemTracker {
    /* renamed from: a */
    private final Rect f35049a = new Rect();
    /* renamed from: b */
    private List<C8571j> f35050b = C19301m.a();
    /* renamed from: c */
    private Map<Integer, C8571j> f35051c = ae.a();
    /* renamed from: d */
    private final C8575e f35052d;
    /* renamed from: e */
    private final C8576g f35053e;
    /* renamed from: f */
    private final C8577i f35054f;
    /* renamed from: g */
    private final ViewVisibleObserver f35055g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/common/tracker/recyclerview/model/ListVisibleRangeUpdate;", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.a$a */
    static final class C12794a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ LinearLayoutManager f41194a;

        C12794a(LinearLayoutManager linearLayoutManager) {
            this.f41194a = linearLayoutManager;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50287a(obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8570i m50287a(Object obj) {
            return new C8570i(this.f41194a.findFirstVisibleItemPosition(), this.f41194a.findLastVisibleItemPosition());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/common/tracker/recyclerview/model/ListVisibleRangeUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.a$b */
    static final class C12795b<T, R> implements Func1<C8570i, Boolean> {
        /* renamed from: a */
        public static final C12795b f41195a = new C12795b();

        C12795b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50288a((C8570i) obj));
        }

        /* renamed from: a */
        public final boolean m50288a(C8570i c8570i) {
            return (c8570i.m36571a() == -1 || c8570i.m36572b() == -1) ? null : true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lcom/tinder/common/tracker/recyclerview/model/ListVisibleRangeUpdate;", "isVisible", "visibleRange", "call", "(Ljava/lang/Boolean;Lcom/tinder/common/tracker/recyclerview/model/ListVisibleRangeUpdate;)Lkotlin/Pair;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.a$e */
    static final class C12796e<T1, T2, R> implements Func2<T, U, R> {
        /* renamed from: a */
        public static final C12796e f41196a = new C12796e();

        C12796e() {
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m50289a((Boolean) obj, (C8570i) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final Pair<Boolean, C8570i> m50289a(Boolean bool, C8570i c8570i) {
            return C15811g.a(bool, c8570i);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.a$h */
    static final class C12797h<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12797h f41197a = new C12797h();

        C12797h() {
        }

        /* renamed from: a */
        public final void m50290a(Adapter<ViewHolder> adapter) {
        }

        public /* synthetic */ Object call(Object obj) {
            m50290a((Adapter) obj);
            return C15813i.f49016a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/common/tracker/recyclerview/model/ListVisibleRangeUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.a$c */
    static final class C13773c<T> implements Action1<C8570i> {
        /* renamed from: a */
        final /* synthetic */ C10701a f43764a;
        /* renamed from: b */
        final /* synthetic */ LinearLayoutManager f43765b;

        C13773c(C10701a c10701a, LinearLayoutManager linearLayoutManager) {
            this.f43764a = c10701a;
            this.f43765b = linearLayoutManager;
        }

        public /* synthetic */ void call(Object obj) {
            m53345a((C8570i) obj);
        }

        /* renamed from: a */
        public final void m53345a(C8570i c8570i) {
            C10701a c10701a = this.f43764a;
            LinearLayoutManager linearLayoutManager = this.f43765b;
            C2668g.a(c8570i, "it");
            c10701a.m43030a(linearLayoutManager, c8570i);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.a$d */
    static final class C13774d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13774d f43766a = new C13774d();

        C13774d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53346a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53346a(Throwable th) {
            C0001a.c(th, "Error observing scroll and adapter events", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lcom/tinder/common/tracker/recyclerview/model/ListVisibleRangeUpdate;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.a$f */
    static final class C13775f<T> implements Action1<Pair<? extends Boolean, ? extends C8570i>> {
        /* renamed from: a */
        final /* synthetic */ C10701a f43767a;
        /* renamed from: b */
        final /* synthetic */ LinearLayoutManager f43768b;

        C13775f(C10701a c10701a, LinearLayoutManager linearLayoutManager) {
            this.f43767a = c10701a;
            this.f43768b = linearLayoutManager;
        }

        public /* synthetic */ void call(Object obj) {
            m53347a((Pair) obj);
        }

        /* renamed from: a */
        public final void m53347a(Pair<Boolean, C8570i> pair) {
            Boolean bool = (Boolean) pair.c();
            C8570i c8570i = (C8570i) pair.d();
            C10701a c10701a = this.f43767a;
            C2668g.a(bool, "isVisible");
            boolean booleanValue = bool.booleanValue();
            C2668g.a(c8570i, "visibleRange");
            c10701a.m43035a(booleanValue, c8570i, this.f43768b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.tracker.recyclerview.a$g */
    static final class C13776g<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13776g f43769a = new C13776g();

        C13776g() {
        }

        public /* synthetic */ void call(Object obj) {
            m53348a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53348a(Throwable th) {
            C0001a.c(th, "Error observing list visible items events", new Object[0]);
        }
    }

    public C10701a(@NotNull C8575e c8575e, @NotNull C8576g c8576g, @NotNull C8577i c8577i, @NotNull ViewVisibleObserver viewVisibleObserver) {
        C2668g.b(c8575e, "listVisibleItemProvider");
        C2668g.b(c8576g, "listVisibleRangeProvider");
        C2668g.b(c8577i, "listVisibleStateProvider");
        C2668g.b(viewVisibleObserver, "listViewVisibleObserver");
        this.f35052d = c8575e;
        this.f35053e = c8576g;
        this.f35054f = c8577i;
        this.f35055g = viewVisibleObserver;
    }

    public void bind(@NotNull RecyclerView recyclerView) {
        C2668g.b(recyclerView, "recyclerView");
        LinearLayoutManager b = C8585e.m36611b(recyclerView);
        Adapter adapter = recyclerView.getAdapter();
        C2668g.a(adapter, "adapter");
        View view = recyclerView;
        Observable.b(m43027a(adapter), m43028a(recyclerView)).j(C5707b.a(view)).k(new C12794a(b)).f(C12795b.f41195a).a(new C13773c(this, b), C13774d.f43766a);
        RxJavaInteropExtKt.toV1Observable(this.f35055g.observe(), BackpressureStrategy.DROP).a(this.f35053e.m36592a(), C12796e.f41196a).j(C5707b.a(view)).a(new C13775f(this, b), C13776g.f43769a);
    }

    /* renamed from: a */
    private final Observable<C15813i> m43027a(Adapter<ViewHolder> adapter) {
        adapter = C5704e.a(adapter).k(C12797h.f41197a);
        C2668g.a(adapter, "RxRecyclerViewAdapter.da…ges(adapter).map { Unit }");
        return adapter;
    }

    /* renamed from: a */
    private final Observable<C7016b> m43028a(RecyclerView recyclerView) {
        recyclerView = C5703d.a(recyclerView).m().e(100, TimeUnit.MILLISECONDS).a(C19397a.a());
        C2668g.a(recyclerView, "RxRecyclerView.scrollEve…dSchedulers.mainThread())");
        return recyclerView;
    }

    @UiThread
    /* renamed from: a */
    private final void m43035a(boolean z, C8570i c8570i, LinearLayoutManager linearLayoutManager) {
        if (z) {
            m43030a(linearLayoutManager, c8570i);
        } else {
            m43029a();
        }
    }

    @UiThread
    /* renamed from: a */
    private final void m43030a(LinearLayoutManager linearLayoutManager, C8570i c8570i) {
        List b = m43036b(linearLayoutManager, c8570i);
        m43033a(c8570i);
        m43034a(c8570i, b);
        this.f35050b = b;
    }

    @UiThread
    /* renamed from: a */
    private final void m43029a() {
        for (C8571j a : this.f35050b) {
            this.f35052d.m36591a(new C10702a(a.m36573a()));
        }
        this.f35050b = C19301m.a();
        this.f35051c = ae.a();
    }

    /* renamed from: b */
    private final List<C8571j> m43036b(LinearLayoutManager linearLayoutManager, C8570i c8570i) {
        List<C8571j> arrayList = new ArrayList();
        Map linkedHashMap = new LinkedHashMap();
        Iterator it = new C18461c(c8570i.m36571a(), c8570i.m36572b()).iterator();
        while (it.hasNext()) {
            int b = ((ab) it).b();
            C8571j a = m43026a(linearLayoutManager, b, c8570i.m36571a(), c8570i.m36572b());
            arrayList.add(a);
            linkedHashMap.put(Integer.valueOf(b), a);
            if (!this.f35051c.containsKey(Integer.valueOf(b))) {
                this.f35052d.m36591a(new C10703b(b));
            }
        }
        for (C8571j a2 : (Iterable) this.f35050b) {
            c8570i = a2.m36573a();
            if (!linkedHashMap.containsKey(Integer.valueOf(c8570i))) {
                this.f35052d.m36591a(new C10702a(c8570i));
            }
        }
        this.f35051c = linkedHashMap;
        return arrayList;
    }

    /* renamed from: a */
    private final void m43033a(C8570i c8570i) {
        this.f35053e.m36593a(c8570i);
    }

    /* renamed from: a */
    private final void m43034a(C8570i c8570i, List<C8571j> list) {
        this.f35054f.m36595a(new C8569h(c8570i.m36571a(), c8570i.m36572b(), list));
    }

    /* renamed from: a */
    private final C8571j m43026a(@NotNull LinearLayoutManager linearLayoutManager, int i, int i2, int i3) {
        if (i != i2) {
            if (i != i3) {
                return new C8571j(i, 1120403456);
            }
        }
        linearLayoutManager = linearLayoutManager.findViewByPosition(i);
        i2 = 0;
        if (linearLayoutManager == null) {
            i3 = new StringBuilder();
            i3.append("Could not find view in position ");
            i3.append(i);
            C0001a.b((Throwable) new IllegalStateException(i3.toString()));
            return new C8571j(i, 0.0f);
        }
        i3 = linearLayoutManager.getMeasuredHeight();
        if (i3 != 0) {
            linearLayoutManager.getGlobalVisibleRect(this.f35049a);
            i2 = ((float) 100) * (((float) (this.f35049a.bottom - this.f35049a.top)) / ((float) i3));
        }
        return new C8571j(i, i2);
    }
}
