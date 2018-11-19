package com.tinder.recs.data;

import android.content.SharedPreferences;
import com.f2prateek.rx.preferences.C1159e;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/recs/data/SwipeCountSharedPreferencesRepository;", "Lcom/tinder/recs/domain/repository/SwipeCountRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "rxSharedPreferences", "Lcom/f2prateek/rx/preferences/RxSharedPreferences;", "incrementSwipeCount", "Lio/reactivex/Completable;", "observeSwipeCount", "Lio/reactivex/Observable;", "", "setSwipeCount", "", "count", "updateSwipeCount", "data_release"}, k = 1, mv = {1, 1, 10})
public final class SwipeCountSharedPreferencesRepository implements SwipeCountRepository {
    private final C1159e rxSharedPreferences = C1159e.a(this.sharedPreferences);
    private final SharedPreferences sharedPreferences;

    public SwipeCountSharedPreferencesRepository(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @NotNull
    public C3959e<Integer> observeSwipeCount() {
        Observable c = this.rxSharedPreferences.a("total_swipe_count", Integer.valueOf(0)).c();
        C2668g.a(c, "rxSharedPreferences.getI…_COUNT, 0).asObservable()");
        return RxJavaInteropExtKt.toV2Observable(c);
    }

    @NotNull
    public C3956a updateSwipeCount(int i) {
        i = C3956a.a(new SwipeCountSharedPreferencesRepository$updateSwipeCount$1(this, i));
        C2668g.a(i, "Completable.fromAction {…ipeCount(count)\n        }");
        return i;
    }

    @NotNull
    public C3956a incrementSwipeCount() {
        C3956a a = C3956a.a(new SwipeCountSharedPreferencesRepository$incrementSwipeCount$1(this));
        C2668g.a(a, "Completable.fromAction {…eCount.plus(1))\n        }");
        return a;
    }

    private final void setSwipeCount(int i) {
        this.sharedPreferences.edit().putInt("total_swipe_count", i).apply();
    }
}
