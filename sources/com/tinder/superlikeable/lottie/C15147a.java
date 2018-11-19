package com.tinder.superlikeable.lottie;

import android.content.Context;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0788c.C0787a;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/superlikeable/lottie/LottieCompositionLoader;", "", "lottieCompositionFactoryProxy", "Lcom/tinder/superlikeable/lottie/LottieCompositionLoader$LottieCompositionFactoryProxy;", "(Lcom/tinder/superlikeable/lottie/LottieCompositionLoader$LottieCompositionFactoryProxy;)V", "load", "Lrx/Observable;", "Lcom/airbnb/lottie/LottieComposition;", "context", "Landroid/content/Context;", "fileName", "", "LottieCompositionFactoryProxy", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.lottie.a */
public final class C15147a {
    /* renamed from: a */
    private final C15145a f47133a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/tinder/superlikeable/lottie/LottieCompositionLoader$LottieCompositionFactoryProxy;", "", "()V", "fromFileSync", "Lcom/airbnb/lottie/LottieComposition;", "context", "Landroid/content/Context;", "fileName", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.lottie.a$a */
    public static final class C15145a {
        @NotNull
        /* renamed from: a */
        public final C0788c m56999a(@NotNull Context context, @NotNull String str) {
            C2668g.b(context, "context");
            C2668g.b(str, "fileName");
            context = C0787a.a(context, str);
            C2668g.a(context, "LottieComposition.Factor…leSync(context, fileName)");
            return context;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/airbnb/lottie/LottieComposition;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.lottie.a$b */
    static final class C15146b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C15147a f47130a;
        /* renamed from: b */
        final /* synthetic */ Context f47131b;
        /* renamed from: c */
        final /* synthetic */ String f47132c;

        C15146b(C15147a c15147a, Context context, String str) {
            this.f47130a = c15147a;
            this.f47131b = context;
            this.f47132c = str;
        }

        public /* synthetic */ Object call() {
            return m57000a();
        }

        @Nullable
        /* renamed from: a */
        public final C0788c m57000a() {
            try {
                return this.f47130a.f47133a.m56999a(this.f47131b, this.f47132c);
            } catch (Throwable th) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error loading composition ");
                stringBuilder.append(this.f47132c);
                C0001a.c(th, stringBuilder.toString(), new Object[0]);
                return null;
            }
        }
    }

    public C15147a() {
        this(null, 1, null);
    }

    public C15147a(@NotNull C15145a c15145a) {
        C2668g.b(c15145a, "lottieCompositionFactoryProxy");
        this.f47133a = c15145a;
    }

    public /* synthetic */ C15147a(C15145a c15145a, int i, C15823e c15823e) {
        if ((i & 1) != 0) {
            c15145a = new C15145a();
        }
        this(c15145a);
    }

    @NotNull
    /* renamed from: a */
    public final Observable<C0788c> m57002a(@NotNull Context context, @NotNull String str) {
        C2668g.b(context, "context");
        C2668g.b(str, "fileName");
        context = Observable.a(new C15146b(this, context, str));
        C2668g.a(context, "Observable.fromCallable …l\n            }\n        }");
        return context;
    }
}
