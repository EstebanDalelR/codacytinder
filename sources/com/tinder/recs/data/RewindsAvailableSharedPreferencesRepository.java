package com.tinder.recs.data;

import android.content.SharedPreferences;
import com.f2prateek.rx.preferences.C1159e;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.recs.domain.repository.RewindsAvailableRepository;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/recs/data/RewindsAvailableSharedPreferencesRepository;", "Lcom/tinder/recs/domain/repository/RewindsAvailableRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "rxSharedPreferences", "Lcom/f2prateek/rx/preferences/RxSharedPreferences;", "observeRewindsAvailable", "Lio/reactivex/Flowable;", "", "updateRewindCount", "Lio/reactivex/Completable;", "rewindCount", "data_release"}, k = 1, mv = {1, 1, 10})
public final class RewindsAvailableSharedPreferencesRepository implements RewindsAvailableRepository {
    private final C1159e rxSharedPreferences = C1159e.a(this.sharedPreferences);
    private final SharedPreferences sharedPreferences;

    public RewindsAvailableSharedPreferencesRepository(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @NotNull
    public C3957b<Integer> observeRewindsAvailable() {
        Observable c = this.rxSharedPreferences.a("rewinds_available", Integer.valueOf(0)).c();
        C2668g.a(c, "rxSharedPreferences.getI…ILABLE, 0).asObservable()");
        return RxJavaInteropExtKt.toV2Flowable(c);
    }

    @NotNull
    public C3956a updateRewindCount(int i) {
        i = C3956a.a(new RewindsAvailableSharedPreferencesRepository$updateRewindCount$1(this, i));
        C2668g.a(i, "Completable.fromCallable…dCount).apply()\n        }");
        return i;
    }
}
