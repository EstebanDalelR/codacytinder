package com.tinder.places.p311f;

import com.facebook.ads.internal.C1391d;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.domain.common.usecase.VoidUseCase;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/places/usecase/ShowPlacesErrorIfNeeded;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/places/usecase/ShowPlacesErrorIfNeeded$Request;", "()V", "execute", "", "request", "Companion", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.f.i */
public final class C12345i implements VoidUseCase<C10208b> {
    /* renamed from: a */
    public static final C10207a f39948a = new C10207a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0018\u0010\b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\tj\u0002`\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/tinder/places/usecase/ShowPlacesErrorIfNeeded$Companion;", "", "()V", "getCompletableObserver", "Lio/reactivex/CompletableObserver;", "successAction", "Lkotlin/Function0;", "", "errorAction", "Lkotlin/Function1;", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "Lcom/tinder/places/usecase/PlacesErrorAction;", "errorMessage", "", "getPlacesError", "throwable", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.f.i$a */
    public static final class C10207a {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/tinder/places/usecase/ShowPlacesErrorIfNeeded$Companion$getCompletableObserver$1", "Lio/reactivex/CompletableObserver;", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "onComplete", "", "onError", "e", "", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.places.f.i$a$a */
        public static final class C12344a implements CompletableObserver {
            /* renamed from: a */
            final /* synthetic */ Function0 f39945a;
            /* renamed from: b */
            final /* synthetic */ String f39946b;
            /* renamed from: c */
            final /* synthetic */ Function1 f39947c;

            public void onSubscribe(@NotNull Disposable disposable) {
                C2668g.b(disposable, C1391d.f3780a);
            }

            C12344a(Function0 function0, String str, Function1 function1) {
                this.f39945a = function0;
                this.f39946b = str;
                this.f39947c = function1;
            }

            public void onComplete() {
                this.f39945a.invoke();
            }

            public void onError(@NotNull Throwable th) {
                C2668g.b(th, "e");
                C0001a.c(th, this.f39946b, new Object[0]);
                this.f39947c.invoke(C12345i.f39948a.m41525a(th));
            }
        }

        private C10207a() {
        }

        @Nullable
        /* renamed from: a */
        public final PlacesApiException m41525a(@NotNull Throwable th) {
            C2668g.b(th, "throwable");
            if (!(th instanceof PlacesApiException)) {
                th = null;
            }
            PlacesApiException placesApiException = (PlacesApiException) th;
            if (placesApiException == null) {
                return null;
            }
            Object obj;
            Integer a = placesApiException.m37235a();
            if (a != null) {
                if (a.intValue() == 41201) {
                    obj = 1;
                    if (obj != null) {
                        return placesApiException;
                    }
                    return null;
                }
            }
            obj = null;
            if (obj != null) {
                return null;
            }
            return placesApiException;
        }

        @NotNull
        /* renamed from: a */
        public final CompletableObserver m41526a(@NotNull Function0<C15813i> function0, @NotNull Function1<? super PlacesApiException, C15813i> function1, @NotNull String str) {
            C2668g.b(function0, "successAction");
            C2668g.b(function1, "errorAction");
            C2668g.b(str, "errorMessage");
            return new C12344a(function0, str, function1);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bHÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bHÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R#\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/tinder/places/usecase/ShowPlacesErrorIfNeeded$Request;", "", "throwable", "", "showErrorAction", "Lkotlin/Function1;", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "", "Lcom/tinder/places/usecase/PlacesErrorAction;", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V", "getShowErrorAction", "()Lkotlin/jvm/functions/Function1;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.f.i$b */
    public static final class C10208b {
        @NotNull
        /* renamed from: a */
        private final Throwable f33274a;
        @NotNull
        /* renamed from: b */
        private final Function1<PlacesApiException, C15813i> f33275b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10208b) {
                    C10208b c10208b = (C10208b) obj;
                    if (C2668g.a(this.f33274a, c10208b.f33274a) && C2668g.a(this.f33275b, c10208b.f33275b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.f33274a;
            int i = 0;
            int hashCode = (th != null ? th.hashCode() : 0) * 31;
            Function1 function1 = this.f33275b;
            if (function1 != null) {
                i = function1.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(throwable=");
            stringBuilder.append(this.f33274a);
            stringBuilder.append(", showErrorAction=");
            stringBuilder.append(this.f33275b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10208b(@NotNull Throwable th, @NotNull Function1<? super PlacesApiException, C15813i> function1) {
            C2668g.b(th, "throwable");
            C2668g.b(function1, "showErrorAction");
            this.f33274a = th;
            this.f33275b = function1;
        }

        @NotNull
        /* renamed from: a */
        public final Throwable m41527a() {
            return this.f33274a;
        }

        @NotNull
        /* renamed from: b */
        public final Function1<PlacesApiException, C15813i> m41528b() {
            return this.f33275b;
        }
    }

    public /* synthetic */ void execute(Object obj) {
        m48726a((C10208b) obj);
    }

    /* renamed from: a */
    public void m48726a(@NotNull C10208b c10208b) {
        C2668g.b(c10208b, "request");
        PlacesApiException a = f39948a.m41525a(c10208b.m41527a());
        if (a != null) {
            c10208b.m41528b().invoke(a);
        } else {
            C15813i c15813i = (C15813i) c10208b.m41528b().invoke(null);
        }
    }
}
