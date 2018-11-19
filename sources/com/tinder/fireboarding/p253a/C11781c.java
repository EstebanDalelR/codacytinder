package com.tinder.fireboarding.p253a;

import android.content.SharedPreferences;
import com.f2prateek.rx.preferences.C1159e;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.fireboarding.domain.CompletedLevelRepository;
import com.tinder.fireboarding.domain.Level;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function4;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/fireboarding/data/CompletedLevelSharedPreferencesRepository;", "Lcom/tinder/fireboarding/domain/CompletedLevelRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "levelKeyMap", "", "Lcom/tinder/fireboarding/domain/Level;", "", "rxSharedPreferences", "Lcom/f2prateek/rx/preferences/RxSharedPreferences;", "completeLevel", "Lio/reactivex/Completable;", "level", "createCompletedLevelSet", "", "isLikeAndPassComplete", "", "isRewindComplete", "isSuperlikeComplete", "isBoostComplete", "getCompletedLevels", "getPreferenceObservableForLevel", "Lio/reactivex/Observable;", "observeCompletedLevels", "saveLevelCompleted", "", "levelKey", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.a.c */
public final class C11781c implements CompletedLevelRepository {
    /* renamed from: a */
    private final C1159e f38494a = C1159e.a(this.f38496c);
    /* renamed from: b */
    private final Map<Level, String> f38495b = ae.a(new Pair[]{C15811g.a(Level.LIKE_AND_PASS, "is_like_and_pass_complete"), C15811g.a(Level.REWIND, "is_rewind_complete"), C15811g.a(Level.SUPERLIKE, "is_superlike_complete"), C15811g.a(Level.BOOST, "is_boost_complete")});
    /* renamed from: c */
    private final SharedPreferences f38496c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.a.c$a */
    static final class C11779a implements Action {
        /* renamed from: a */
        final /* synthetic */ C11781c f38491a;
        /* renamed from: b */
        final /* synthetic */ Level f38492b;

        C11779a(C11781c c11781c, Level level) {
            this.f38491a = c11781c;
            this.f38492b = level;
        }

        public final void run() {
            String str = (String) this.f38491a.f38495b.get(this.f38492b);
            if (str != null) {
                this.f38491a.m47698a(str);
                return;
            }
            throw new IllegalArgumentException("Saving this level is not supported yet");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "Lcom/tinder/fireboarding/domain/Level;", "isLikeAndPassComplete", "", "isRewindComplete", "isSuperLikeComplete", "isBoostComplete", "apply", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/util/Set;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.a.c$b */
    static final class C11780b<T1, T2, T3, T4, R> implements Function4<Boolean, Boolean, Boolean, Boolean, Set<? extends Level>> {
        /* renamed from: a */
        final /* synthetic */ C11781c f38493a;

        C11780b(C11781c c11781c) {
            this.f38493a = c11781c;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
            return m47692a((Boolean) obj, (Boolean) obj2, (Boolean) obj3, (Boolean) obj4);
        }

        @NotNull
        /* renamed from: a */
        public final Set<Level> m47692a(@NotNull Boolean bool, @NotNull Boolean bool2, @NotNull Boolean bool3, @NotNull Boolean bool4) {
            C2668g.b(bool, "isLikeAndPassComplete");
            C2668g.b(bool2, "isRewindComplete");
            C2668g.b(bool3, "isSuperLikeComplete");
            C2668g.b(bool4, "isBoostComplete");
            return this.f38493a.m47696a(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
        }
    }

    public C11781c(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f38496c = sharedPreferences;
    }

    @NotNull
    public C3959e<Set<Level>> observeCompletedLevels() {
        C3959e<Set<Level>> combineLatest = C3959e.combineLatest(m47693a(Level.LIKE_AND_PASS), m47693a(Level.REWIND), m47693a(Level.SUPERLIKE), m47693a(Level.BOOST), new C11780b(this));
        C2668g.a(combineLatest, "Observable.combineLatest…)\n            }\n        )");
        return combineLatest;
    }

    @NotNull
    public C3956a completeLevel(@NotNull Level level) {
        C2668g.b(level, "level");
        level = C3956a.a(new C11779a(this, level));
        C2668g.a(level, "Completable.fromAction {…supported yet\")\n        }");
        return level;
    }

    @NotNull
    public Set<Level> getCompletedLevels() {
        Set linkedHashSet = new LinkedHashSet();
        for (Entry entry : this.f38495b.entrySet()) {
            Level level = (Level) entry.getKey();
            if (this.f38496c.getBoolean((String) entry.getValue(), false)) {
                linkedHashSet.add(level);
            }
        }
        return C19301m.n(linkedHashSet);
    }

    /* renamed from: a */
    private final void m47698a(String str) {
        this.f38496c.edit().putBoolean(str, true).apply();
    }

    /* renamed from: a */
    private final C3959e<Boolean> m47693a(Level level) {
        String str = (String) this.f38495b.get(level);
        if (str != null) {
            level = this.f38494a.a(str, Boolean.valueOf(false)).c();
            C2668g.a(level, "rxSharedPreferences.getB…it, false).asObservable()");
            return RxJavaInteropExtKt.toV2Observable(level);
        }
        throw ((Throwable) new IllegalArgumentException("Getting the preference for this level is not supported"));
    }

    /* renamed from: a */
    private final Set<Level> m47696a(boolean z, boolean z2, boolean z3, boolean z4) {
        Set linkedHashSet = new LinkedHashSet();
        if (z) {
            linkedHashSet.add(Level.LIKE_AND_PASS);
        }
        if (z2) {
            linkedHashSet.add(Level.REWIND);
        }
        if (z3) {
            linkedHashSet.add(Level.SUPERLIKE);
        }
        if (z4) {
            linkedHashSet.add(Level.BOOST);
        }
        return C19301m.n(linkedHashSet);
    }
}
