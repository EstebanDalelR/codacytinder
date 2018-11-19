package com.tinder.reactions.common;

import android.content.Context;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0788c.C0787a;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.Cancellable;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.OnCompositionLoadedListener;
import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.reactions.gestures.viewmodel.C14679j;
import com.tinder.utils.RxUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Single;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.FuncN;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0003J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002J\u0006\u0010\u001f\u001a\u00020\u0018J\b\u0010 \u001a\u00020\u0018H\u0002J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000bJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u000bH\u0002J\u000e\u0010(\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u000bJ\u0006\u0010)\u001a\u00020\u0018J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u000bH\u0002J\b\u0010,\u001a\u00020\u0018H\u0002J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0.2\u0006\u0010%\u001a\u00020\u000bJ\u001a\u0010/\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\u0013H\u0003J\u0010\u00101\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000bH\u0003R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/tinder/reactions/common/ReactionCompositionCache;", "", "reactionViewModelFactory", "Lcom/tinder/reactions/gestures/viewmodel/ReactionViewModelFactory;", "context", "Landroid/content/Context;", "cacheStateProvider", "Lcom/tinder/reactions/common/ReactionCompositionCacheStateProvider;", "(Lcom/tinder/reactions/gestures/viewmodel/ReactionViewModelFactory;Landroid/content/Context;Lcom/tinder/reactions/common/ReactionCompositionCacheStateProvider;)V", "animationCacheStateMap", "", "", "Lrx/subjects/BehaviorSubject;", "Lcom/tinder/reactions/common/AnimationCompositionCacheState;", "animationFileNames", "", "cacheStateMapSubscription", "Lrx/Subscription;", "compositionCache", "Lcom/airbnb/lottie/LottieComposition;", "compositionLoaders", "", "Lcom/airbnb/lottie/Cancellable;", "addAllAnimations", "", "animationFilenames", "addAnimation", "animationFilename", "buildLottieDrawable", "Lcom/airbnb/lottie/LottieDrawable;", "animationFile", "clear", "clearLoaderTasks", "isNewComposition", "", "lottieAnimationView", "Lcom/airbnb/lottie/LottieAnimationView;", "animationFileName", "existingLottieComposition", "newAnimationFile", "isPresent", "load", "loadCompositionIntoCache", "animationName", "observeCacheStatesForAllAnimations", "observeLottieDrawableFor", "Lrx/Single;", "updateCache", "composition", "updateCacheStateForAnimation", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.common.a */
public final class C14608a {
    /* renamed from: a */
    private final List<Cancellable> f46106a = ((List) new ArrayList());
    /* renamed from: b */
    private final Map<String, C0788c> f46107b = ((Map) new LinkedHashMap());
    /* renamed from: c */
    private final List<String> f46108c;
    /* renamed from: d */
    private final Map<String, C19785a<AnimationCompositionCacheState>> f46109d;
    /* renamed from: e */
    private Subscription f46110e;
    /* renamed from: f */
    private final Context f46111f;
    /* renamed from: g */
    private final C14613b f46112g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/airbnb/lottie/LottieDrawable;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.a$f */
    static final class C14607f<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C14608a f46104a;
        /* renamed from: b */
        final /* synthetic */ String f46105b;

        C14607f(C14608a c14608a, String str) {
            this.f46104a = c14608a;
            this.f46105b = str;
        }

        public /* synthetic */ Object call() {
            return m55738a();
        }

        @NotNull
        /* renamed from: a */
        public final C0792d m55738a() {
            return this.f46104a.m55745c(this.f46105b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "onCompositionLoaded"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.a$a */
    static final class C16312a implements OnCompositionLoadedListener {
        /* renamed from: a */
        final /* synthetic */ C14608a f50749a;
        /* renamed from: b */
        final /* synthetic */ String f50750b;

        C16312a(C14608a c14608a, String str) {
            this.f50749a = c14608a;
            this.f50750b = str;
        }

        public final void onCompositionLoaded(@Nullable C0788c c0788c) {
            this.f50749a.m55742a(this.f50750b, c0788c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "call", "([Ljava/lang/Object;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.a$b */
    static final class C17957b<R> implements FuncN<R> {
        /* renamed from: a */
        public static final C17957b f55887a = new C17957b();

        C17957b() {
        }

        /* renamed from: a */
        public final void m65286a(Object[] objArr) {
        }

        public /* synthetic */ Object call(Object[] objArr) {
            m65286a(objArr);
            return C15813i.f49016a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/reactions/common/AnimationCompositionCacheState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.a$e */
    static final class C17958e<T, R> implements Func1<AnimationCompositionCacheState, Boolean> {
        /* renamed from: a */
        public static final C17958e f55888a = new C17958e();

        C17958e() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65287a((AnimationCompositionCacheState) obj));
        }

        /* renamed from: a */
        public final boolean m65287a(AnimationCompositionCacheState animationCompositionCacheState) {
            return animationCompositionCacheState == AnimationCompositionCacheState.LOADED ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.a$c */
    static final class C18690c<T> implements Action1<C15813i> {
        /* renamed from: a */
        final /* synthetic */ C14608a f58169a;

        C18690c(C14608a c14608a) {
            this.f58169a = c14608a;
        }

        public /* synthetic */ void call(Object obj) {
            m67123a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m67123a(C15813i c15813i) {
            this.f58169a.f46112g.m55764a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.a$d */
    static final class C18691d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18691d f58170a = new C18691d();

        C18691d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67124a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67124a(Throwable th) {
            C0001a.c(th, "Couldn't observe animation composition cache states", new Object[0]);
        }
    }

    @Inject
    public C14608a(@NotNull C14679j c14679j, @NotNull Context context, @NotNull C14613b c14613b) {
        C2668g.b(c14679j, "reactionViewModelFactory");
        C2668g.b(context, "context");
        C2668g.b(c14613b, "cacheStateProvider");
        this.f46111f = context;
        this.f46112g = c14613b;
        this.f46108c = c14679j.m55933a();
        this.f46109d = (Map) new LinkedHashMap();
        m55743a(this.f46108c);
    }

    /* renamed from: a */
    public final void m55752a() {
        m55747d();
        for (String e : this.f46108c) {
            m55749e(e);
        }
    }

    /* renamed from: b */
    public final void m55754b() {
        RxUtils.b(this.f46110e);
        m55746c();
        this.f46107b.clear();
    }

    @NotNull
    /* renamed from: a */
    public final Single<C0792d> m55751a(@NotNull String str) {
        C2668g.b(str, "animationFileName");
        str = Single.a(new C14607f(this, str));
        C2668g.a(str, "Single.fromCallable({\n  …ationFileName)\n        })");
        return str;
    }

    /* renamed from: b */
    public final boolean m55755b(@NotNull String str) {
        C2668g.b(str, "animationFile");
        return this.f46107b.containsKey(str);
    }

    /* renamed from: a */
    public final boolean m55753a(@NotNull LottieAnimationView lottieAnimationView, @NotNull String str) {
        C2668g.b(lottieAnimationView, "lottieAnimationView");
        C2668g.b(str, "animationFileName");
        lottieAnimationView = lottieAnimationView.getDrawable();
        if (lottieAnimationView == null || !(lottieAnimationView instanceof C0792d)) {
            return true;
        }
        C0788c n = ((C0792d) lottieAnimationView).n();
        C2668g.a(n, "drawable.composition");
        return m55744a(n, str);
    }

    /* renamed from: c */
    private final C0792d m55745c(String str) {
        C0792d c0792d = new C0792d();
        if (!this.f46107b.containsKey(str)) {
            return c0792d;
        }
        c0792d.a((C0788c) this.f46107b.get(str));
        return c0792d;
    }

    /* renamed from: c */
    private final void m55746c() {
        Iterable<Cancellable> iterable = this.f46106a;
        for (Cancellable cancel : iterable) {
            cancel.cancel();
        }
        ((List) iterable).clear();
    }

    /* renamed from: d */
    private final void m55748d(String str) {
        C19785a f = C19785a.f(AnimationCompositionCacheState.LOADING);
        Map map = this.f46109d;
        C2668g.a(f, "compositionCacheStateSubject");
        map.put(str, f);
    }

    /* renamed from: e */
    private final void m55749e(String str) {
        List list = this.f46106a;
        str = C0787a.a(this.f46111f, str, new C16312a(this, str));
        C2668g.a(str, "LottieComposition.Factor…omposition)\n            }");
        list.add(str);
    }

    /* renamed from: a */
    private final synchronized void m55742a(String str, C0788c c0788c) {
        if (!(this.f46107b.containsKey(str) || c0788c == null)) {
            this.f46107b.put(str, c0788c);
            m55750f(str);
        }
    }

    /* renamed from: a */
    private final synchronized void m55743a(List<String> list) {
        for (String d : list) {
            m55748d(d);
        }
    }

    /* renamed from: f */
    private final synchronized void m55750f(String str) {
        C19785a c19785a = (C19785a) this.f46109d.get(str);
        if (c19785a != null) {
            c19785a.onNext(AnimationCompositionCacheState.LOADED);
        }
    }

    /* renamed from: a */
    private final boolean m55744a(C0788c c0788c, String str) {
        return C2668g.a((C0788c) this.f46107b.get(str), c0788c) ^ 1;
    }

    /* renamed from: d */
    private final void m55747d() {
        Iterable<C19785a> l = C19299w.m68840l(this.f46109d.values());
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) l, 10));
        for (C19785a e : l) {
            arrayList.add(e.e().f(C17958e.f55888a).h().a());
        }
        this.f46110e = Single.a((List) arrayList, C17957b.f55887a).a(RxUtils.a().m67518a()).a(new C18690c(this), C18691d.f58170a);
    }
}
