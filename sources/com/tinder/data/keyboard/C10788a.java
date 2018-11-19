package com.tinder.data.keyboard;

import android.content.SharedPreferences;
import com.tinder.domain.keyboard.KeyboardHeightRepository;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0016R2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/data/keyboard/KeyboardHeightDataRepository;", "Lcom/tinder/domain/keyboard/KeyboardHeightRepository;", "Lcom/tinder/data/keyboard/KeyboardHeightNotifier;", "Lcom/tinder/data/keyboard/KeyboardHeightProvider;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "currentHeightSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "clear", "", "observe", "Lio/reactivex/Single;", "observeCurrent", "Lio/reactivex/Observable;", "update", "height", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.keyboard.a */
public final class C10788a implements KeyboardHeightNotifier, KeyboardHeightProvider, KeyboardHeightRepository {
    /* renamed from: a */
    private final PublishSubject<Integer> f35222a = PublishSubject.a();
    /* renamed from: b */
    private final SharedPreferences f35223b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.keyboard.a$a */
    static final class C8670a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10788a f30524a;

        C8670a(C10788a c10788a) {
            this.f30524a = c10788a;
        }

        public /* synthetic */ Object call() {
            return Integer.valueOf(m36942a());
        }

        /* renamed from: a */
        public final int m36942a() {
            return this.f30524a.f35223b.getInt("KEYBOARD_RECENT_HEIGHT", 0);
        }
    }

    @Inject
    public C10788a(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f35223b = sharedPreferences;
    }

    @NotNull
    public C3960g<Integer> observe() {
        C3960g<Integer> c = C3960g.c(new C8670a(this));
        C2668g.a(c, "Single.fromCallable {\n  …E\n            )\n        }");
        return c;
    }

    @NotNull
    public C3959e<Integer> observeCurrent() {
        C3959e<Integer> hide = this.f35222a.hide();
        C2668g.a(hide, "currentHeightSubject.hide()");
        return hide;
    }

    public void update(int i) {
        if (i > 0) {
            this.f35223b.edit().putInt("KEYBOARD_RECENT_HEIGHT", i).apply();
        }
        this.f35222a.onNext(Integer.valueOf(Math.max(0, i)));
    }

    public void clear() {
        this.f35223b.edit().putInt("KEYBOARD_RECENT_HEIGHT", 0).apply();
    }
}
