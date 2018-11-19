package com.tinder.data.p326h.p327a;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.tracker.ListItemViewDurationData;
import com.tinder.domain.tracker.ListItemViewDurationRepository;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.Observable;
import rx.functions.Action0;
import rx.subjects.C19785a;
import rx.subjects.C19786b;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000bH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b0\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0006H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000RN\u0010\u0007\u001aB\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u0006 \t* \u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R¯\u0001\u0010\n\u001a¢\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \t*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b0\u000b\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \t*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b0\u000b \t*P\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \t*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b0\u000b\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \t*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b0\u000b\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/data/tracker/repository/ListItemViewDurationDataRepository;", "Lcom/tinder/domain/tracker/ListItemViewDurationRepository;", "()V", "itemDurationMap", "", "", "Lcom/tinder/domain/tracker/ListItemViewDurationData;", "itemVisibleSubject", "Lrx/subjects/SerializedSubject;", "kotlin.jvm.PlatformType", "subject", "", "clear", "Lrx/Completable;", "dispatchUpdate", "", "map", "get", "itemId", "observe", "Lrx/Observable;", "observeItemVisible", "put", "data", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.h.a.a */
public final class C10786a implements ListItemViewDurationRepository {
    /* renamed from: a */
    private final Map<String, ListItemViewDurationData> f35218a = new LinkedHashMap();
    /* renamed from: b */
    private final C19786b<Map<String, ListItemViewDurationData>, Map<String, ListItemViewDurationData>> f35219b = C19785a.w().B();
    /* renamed from: c */
    private final C19786b<ListItemViewDurationData, ListItemViewDurationData> f35220c = PublishSubject.w().B();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.h.a.a$a */
    static final class C13820a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10786a f43837a;

        C13820a(C10786a c10786a) {
            this.f43837a = c10786a;
        }

        public final void call() {
            Map b;
            synchronized (this.f43837a.f35218a) {
                this.f43837a.f35218a.clear();
                b = ae.b(this.f43837a.f35218a);
            }
            this.f43837a.m43241a(b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.h.a.a$b */
    static final class C13821b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10786a f43838a;
        /* renamed from: b */
        final /* synthetic */ ListItemViewDurationData f43839b;
        /* renamed from: c */
        final /* synthetic */ String f43840c;

        C13821b(C10786a c10786a, ListItemViewDurationData listItemViewDurationData, String str) {
            this.f43838a = c10786a;
            this.f43839b = listItemViewDurationData;
            this.f43840c = str;
        }

        public final void call() {
            Map b;
            synchronized (this.f43838a.f35218a) {
                this.f43838a.f35218a.put(this.f43840c, this.f43839b);
                b = ae.b(this.f43838a.f35218a);
            }
            this.f43838a.m43241a(b);
        }
    }

    @NotNull
    public Observable<Map<String, ListItemViewDurationData>> observe() {
        Observable<Map<String, ListItemViewDurationData>> e = this.f35219b.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    @NotNull
    public Observable<ListItemViewDurationData> observeItemVisible() {
        Observable<ListItemViewDurationData> e = this.f35220c.e();
        C2668g.a(e, "itemVisibleSubject.asObservable()");
        return e;
    }

    @Nullable
    public ListItemViewDurationData get(@NotNull String str) {
        C2668g.b(str, "itemId");
        return (ListItemViewDurationData) this.f35218a.get(str);
    }

    @NotNull
    public Completable put(@NotNull String str, @NotNull ListItemViewDurationData listItemViewDurationData) {
        C2668g.b(str, "itemId");
        C2668g.b(listItemViewDurationData, ManagerWebServices.FB_DATA);
        if (listItemViewDurationData.getItemVisible()) {
            this.f35220c.onNext(listItemViewDurationData);
        }
        str = Completable.a(new C13821b(this, listItemViewDurationData, str));
        C2668g.a(str, "Completable.fromAction {…)\n            }\n        }");
        return str;
    }

    @NotNull
    public Completable clear() {
        Completable a = Completable.a(new C13820a(this));
        C2668g.a(a, "Completable.fromAction {…)\n            }\n        }");
        return a;
    }

    /* renamed from: a */
    private final void m43241a(Map<String, ListItemViewDurationData> map) {
        this.f35219b.onNext(map);
    }
}
