package com.tinder.discovery.p232b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tinder.discovery.domain.DiscoverySegmentDataStore;
import com.tinder.discovery.model.DiscoverySegment;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\u0010\nJ\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00130\u0012H\u0016J\"\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00130\u0012H\u0002J\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0004H\u0002R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/discovery/data/DiscoverySegmentDataStoreImpl;", "Lcom/tinder/discovery/domain/DiscoverySegmentDataStore;", "defaultState", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "allSegments", "", "(Ljava/util/Map;Landroid/content/SharedPreferences;[Lcom/tinder/discovery/model/DiscoverySegment;)V", "[Lcom/tinder/discovery/model/DiscoverySegment;", "createMapFromSharedPreference", "load", "Lio/reactivex/Single;", "update", "Lio/reactivex/Completable;", "updates", "", "Lkotlin/Pair;", "updateSharedPreference", "", "newState", "toSharedPreferenceString", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.b.a */
public final class C11132a implements DiscoverySegmentDataStore {
    /* renamed from: a */
    private final Map<DiscoverySegment, Boolean> f36016a;
    /* renamed from: b */
    private final SharedPreferences f36017b;
    /* renamed from: c */
    private final DiscoverySegment[] f36018c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.b.a$a */
    static final class C8882a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C11132a f31086a;

        C8882a(C11132a c11132a) {
            this.f31086a = c11132a;
        }

        public /* synthetic */ Object call() {
            return m37666a();
        }

        @NotNull
        /* renamed from: a */
        public final Map<DiscoverySegment, Boolean> m37666a() {
            return this.f31086a.m43872a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.b.a$b */
    static final class C8883b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C11132a f31087a;
        /* renamed from: b */
        final /* synthetic */ List f31088b;

        C8883b(C11132a c11132a, List list) {
            this.f31087a = c11132a;
            this.f31088b = list;
        }

        public /* synthetic */ Object call() {
            m37667a();
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m37667a() {
            this.f31087a.m43875a(this.f31088b);
        }
    }

    public C11132a(@NotNull Map<DiscoverySegment, Boolean> map, @NotNull SharedPreferences sharedPreferences, @NotNull DiscoverySegment[] discoverySegmentArr) {
        C2668g.b(map, "defaultState");
        C2668g.b(sharedPreferences, "sharedPreferences");
        C2668g.b(discoverySegmentArr, "allSegments");
        this.f36016a = map;
        this.f36017b = sharedPreferences;
        this.f36018c = discoverySegmentArr;
    }

    @NotNull
    public C3960g<Map<DiscoverySegment, Boolean>> load() {
        C3960g<Map<DiscoverySegment, Boolean>> c = C3960g.c(new C8882a(this));
        C2668g.a(c, "Single.fromCallable { cr…pFromSharedPreference() }");
        return c;
    }

    @NotNull
    public C3956a update(@NotNull List<? extends Pair<? extends DiscoverySegment, Boolean>> list) {
        C2668g.b(list, "updates");
        list = C3960g.c(new C8883b(this, list)).c();
        C2668g.a(list, "Single.fromCallable({ up…         .toCompletable()");
        return list;
    }

    /* renamed from: a */
    private final void m43875a(List<? extends Pair<? extends DiscoverySegment, Boolean>> list) {
        Editor edit = this.f36017b.edit();
        for (Pair pair : list) {
            edit.putBoolean(m43871a((DiscoverySegment) pair.a()), ((Boolean) pair.b()).booleanValue());
        }
        edit.apply();
    }

    /* renamed from: a */
    private final Map<DiscoverySegment, Boolean> m43872a() {
        HashMap hashMap = new HashMap();
        for (DiscoverySegment discoverySegment : this.f36018c) {
            Boolean bool = (Boolean) this.f36016a.get(discoverySegment);
            hashMap.put(discoverySegment, Boolean.valueOf(this.f36017b.getBoolean(m43871a(discoverySegment), bool != null ? bool.booleanValue() : false)));
        }
        return hashMap;
    }

    /* renamed from: a */
    private final String m43871a(@NotNull DiscoverySegment discoverySegment) {
        switch (C8884b.f31089a[discoverySegment.ordinal()]) {
            case 1:
                return "key_discovery_segment_toppicks";
            case 2:
                return "key_discovery_segment_places";
            case 3:
                return "key_discovery_segment_recs";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
