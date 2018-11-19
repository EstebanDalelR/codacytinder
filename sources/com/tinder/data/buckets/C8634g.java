package com.tinder.data.buckets;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tinder.domain.experiments.Buckets;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.functions.Action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/data/buckets/BucketsStore;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "bucketsAdapter", "Lcom/tinder/data/buckets/BucketsAdapter;", "(Landroid/content/SharedPreferences;Lcom/tinder/data/buckets/BucketsAdapter;)V", "key", "", "load", "Lio/reactivex/Single;", "Lcom/tinder/domain/experiments/Buckets;", "save", "Lio/reactivex/Completable;", "buckets", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.buckets.g */
public final class C8634g {
    /* renamed from: a */
    private final SharedPreferences f30488a;
    /* renamed from: b */
    private final C8627a f30489b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/experiments/Buckets;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.buckets.g$a */
    static final class C8632a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C8634g f30485a;

        C8632a(C8634g c8634g) {
            this.f30485a = c8634g;
        }

        public /* synthetic */ Object call() {
            return m36781a();
        }

        @NotNull
        /* renamed from: a */
        public final Buckets m36781a() {
            Iterable<String> a = this.f30485a.f30489b.m36772a();
            Collection arrayList = new ArrayList(C19301m.a(a, 10));
            for (String str : a) {
                arrayList.add(C15811g.a(str, this.f30485a.f30488a.getString(this.f30485a.m36785a(str), null)));
            }
            return this.f30485a.f30489b.m36771a(ae.a((List) arrayList));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.buckets.g$b */
    static final class C10759b implements Action {
        /* renamed from: a */
        final /* synthetic */ C8634g f35157a;
        /* renamed from: b */
        final /* synthetic */ Buckets f35158b;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "key", "", "value", "accept", "com/tinder/data/buckets/BucketsStore$save$1$1$1"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.buckets.g$b$a */
        static final class C8633a<T, U> implements BiConsumer<String, String> {
            /* renamed from: a */
            final /* synthetic */ Editor f30486a;
            /* renamed from: b */
            final /* synthetic */ C10759b f30487b;

            C8633a(Editor editor, C10759b c10759b) {
                this.f30486a = editor;
                this.f30487b = c10759b;
            }

            public /* synthetic */ void accept(Object obj, Object obj2) {
                m36782a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            public final void m36782a(@NotNull String str, @NotNull String str2) {
                C2668g.b(str, "key");
                C2668g.b(str2, "value");
                this.f30486a.putString(this.f30487b.f35157a.m36785a(str), str2);
            }
        }

        C10759b(C8634g c8634g, Buckets buckets) {
            this.f35157a = c8634g;
            this.f35158b = buckets;
        }

        public final void run() {
            Editor edit = this.f35157a.f30488a.edit();
            this.f35157a.f30489b.m36773a(this.f35158b).forEach((BiConsumer) new C8633a(edit, this));
            edit.commit();
        }
    }

    @Inject
    public C8634g(@NotNull SharedPreferences sharedPreferences, @NotNull C8627a c8627a) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        C2668g.b(c8627a, "bucketsAdapter");
        this.f30488a = sharedPreferences;
        this.f30489b = c8627a;
    }

    @NotNull
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    public final C3956a m36787a(@NotNull Buckets buckets) {
        C2668g.b(buckets, "buckets");
        buckets = C3956a.a(new C10759b(this, buckets));
        C2668g.a(buckets, "Completable.fromAction {…)\n            }\n        }");
        return buckets;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<Buckets> m36788a() {
        C3960g<Buckets> c = C3960g.c(new C8632a(this));
        C2668g.a(c, "Single.fromCallable {\n  …er.fromMap(map)\n        }");
        return c;
    }

    /* renamed from: a */
    private final String m36785a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BUCKETS_");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
