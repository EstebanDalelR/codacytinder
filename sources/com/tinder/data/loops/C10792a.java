package com.tinder.data.loops;

import android.content.SharedPreferences;
import com.f2prateek.rx.preferences.C1159e;
import com.f2prateek.rx.preferences.Preference;
import com.tinder.domain.settings.loops.model.AutoPlayVideoSettingsOption;
import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/data/loops/AutoPlayVideoSettingsPreferenceRepository;", "Lcom/tinder/domain/settings/loops/repository/AutoPlayVideoSettingsRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "autoPlaySettingsOption", "Lcom/f2prateek/rx/preferences/Preference;", "Lcom/tinder/domain/settings/loops/model/AutoPlayVideoSettingsOption;", "kotlin.jvm.PlatformType", "rxPreferences", "Lcom/f2prateek/rx/preferences/RxSharedPreferences;", "clear", "Lio/reactivex/Completable;", "observe", "Lio/reactivex/Observable;", "update", "option", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.loops.a */
public final class C10792a implements AutoPlayVideoSettingsRepository {
    /* renamed from: a */
    private final C1159e f35228a;
    /* renamed from: b */
    private final Preference<AutoPlayVideoSettingsOption> f35229b = this.f35228a.a("auto-play-video-settings", AutoPlayVideoSettingsOption.ON_WIFI_AND_MOBILE_DATA, AutoPlayVideoSettingsOption.class);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.loops.a$a */
    static final class C10790a implements Action {
        /* renamed from: a */
        final /* synthetic */ C10792a f35225a;

        C10790a(C10792a c10792a) {
            this.f35225a = c10792a;
        }

        public final void run() {
            this.f35225a.f35229b.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.loops.a$b */
    static final class C10791b implements Action {
        /* renamed from: a */
        final /* synthetic */ C10792a f35226a;
        /* renamed from: b */
        final /* synthetic */ AutoPlayVideoSettingsOption f35227b;

        C10791b(C10792a c10792a, AutoPlayVideoSettingsOption autoPlayVideoSettingsOption) {
            this.f35226a = c10792a;
            this.f35227b = autoPlayVideoSettingsOption;
        }

        public final void run() {
            this.f35226a.f35229b.a(this.f35227b);
        }
    }

    @Inject
    public C10792a(@NotNull @AutoPlayVideoPreferences SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f35228a = C1159e.a(sharedPreferences);
    }

    @NotNull
    public C3959e<AutoPlayVideoSettingsOption> observe() {
        Observable c = this.f35229b.c();
        C2668g.a(c, "autoPlaySettingsOption.asObservable()");
        return RxJavaInteropExtKt.toV2Observable(c);
    }

    @NotNull
    public C3956a update(@NotNull AutoPlayVideoSettingsOption autoPlayVideoSettingsOption) {
        C2668g.b(autoPlayVideoSettingsOption, "option");
        autoPlayVideoSettingsOption = C3956a.a(new C10791b(this, autoPlayVideoSettingsOption));
        C2668g.a(autoPlayVideoSettingsOption, "Completable.fromAction {…tingsOption.set(option) }");
        return autoPlayVideoSettingsOption;
    }

    @NotNull
    public C3956a clear() {
        C3956a a = C3956a.a(new C10790a(this));
        C2668g.a(a, "Completable.fromAction {…SettingsOption.delete() }");
        return a;
    }
}
