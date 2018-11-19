package com.tinder.superlikeable.provider;

import android.graphics.Rect;
import android.support.annotation.UiThread;
import com.airbnb.lottie.C0788c;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\f\r\u000eB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier;", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateNotifier;", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProvider;", "()V", "subject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$ViewProperty;", "notifyViewState", "", "viewProperty", "observe", "Lrx/Observable;", "Params", "State", "ViewProperty", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
@UiThread
public final class SuperLikeableViewStateProviderAndNotifier implements SuperLikeableViewStateNotifier, SuperLikeableViewStateProvider {
    /* renamed from: a */
    private final PublishSubject<C15149b> f52063a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$State;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "MOVED_TO_TOP", "LAYOUT_COMPLETE", "REMOVED_FROM_TOP", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public enum State {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JS\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$Params;", "", "cardCornerRadius", "", "cardBackGroundColor", "", "cardLocationOnScreen", "Landroid/graphics/Rect;", "logoLocationOnScreen", "exitAnimationViewLocationOnScreen", "logoLottieComposition", "Lcom/airbnb/lottie/LottieComposition;", "showIntoTutorialAnimation", "", "(FILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;Lcom/airbnb/lottie/LottieComposition;Z)V", "getCardBackGroundColor", "()I", "getCardCornerRadius", "()F", "getCardLocationOnScreen", "()Landroid/graphics/Rect;", "getExitAnimationViewLocationOnScreen", "getLogoLocationOnScreen", "getLogoLottieComposition", "()Lcom/airbnb/lottie/LottieComposition;", "getShowIntoTutorialAnimation", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier$a */
    public static final class C15148a {
        /* renamed from: a */
        private final float f47134a;
        /* renamed from: b */
        private final int f47135b;
        @NotNull
        /* renamed from: c */
        private final Rect f47136c;
        @NotNull
        /* renamed from: d */
        private final Rect f47137d;
        @Nullable
        /* renamed from: e */
        private final Rect f47138e;
        @Nullable
        /* renamed from: f */
        private final C0788c f47139f;
        /* renamed from: g */
        private final boolean f47140g;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15148a) {
                C15148a c15148a = (C15148a) obj;
                if (Float.compare(this.f47134a, c15148a.f47134a) == 0) {
                    if ((this.f47135b == c15148a.f47135b ? 1 : null) != null && C2668g.a(this.f47136c, c15148a.f47136c) && C2668g.a(this.f47137d, c15148a.f47137d) && C2668g.a(this.f47138e, c15148a.f47138e) && C2668g.a(this.f47139f, c15148a.f47139f)) {
                        if ((this.f47140g == c15148a.f47140g ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int floatToIntBits = ((Float.floatToIntBits(this.f47134a) * 31) + this.f47135b) * 31;
            Rect rect = this.f47136c;
            int i = 0;
            floatToIntBits = (floatToIntBits + (rect != null ? rect.hashCode() : 0)) * 31;
            rect = this.f47137d;
            floatToIntBits = (floatToIntBits + (rect != null ? rect.hashCode() : 0)) * 31;
            rect = this.f47138e;
            floatToIntBits = (floatToIntBits + (rect != null ? rect.hashCode() : 0)) * 31;
            C0788c c0788c = this.f47139f;
            if (c0788c != null) {
                i = c0788c.hashCode();
            }
            floatToIntBits = (floatToIntBits + i) * 31;
            int i2 = this.f47140g;
            if (i2 != 0) {
                i2 = 1;
            }
            return floatToIntBits + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Params(cardCornerRadius=");
            stringBuilder.append(this.f47134a);
            stringBuilder.append(", cardBackGroundColor=");
            stringBuilder.append(this.f47135b);
            stringBuilder.append(", cardLocationOnScreen=");
            stringBuilder.append(this.f47136c);
            stringBuilder.append(", logoLocationOnScreen=");
            stringBuilder.append(this.f47137d);
            stringBuilder.append(", exitAnimationViewLocationOnScreen=");
            stringBuilder.append(this.f47138e);
            stringBuilder.append(", logoLottieComposition=");
            stringBuilder.append(this.f47139f);
            stringBuilder.append(", showIntoTutorialAnimation=");
            stringBuilder.append(this.f47140g);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15148a(float f, int i, @NotNull Rect rect, @NotNull Rect rect2, @Nullable Rect rect3, @Nullable C0788c c0788c, boolean z) {
            C2668g.b(rect, "cardLocationOnScreen");
            C2668g.b(rect2, "logoLocationOnScreen");
            this.f47134a = f;
            this.f47135b = i;
            this.f47136c = rect;
            this.f47137d = rect2;
            this.f47138e = rect3;
            this.f47139f = c0788c;
            this.f47140g = z;
        }

        /* renamed from: a */
        public final float m57003a() {
            return this.f47134a;
        }

        /* renamed from: b */
        public final int m57004b() {
            return this.f47135b;
        }

        @NotNull
        /* renamed from: c */
        public final Rect m57005c() {
            return this.f47136c;
        }

        @NotNull
        /* renamed from: d */
        public final Rect m57006d() {
            return this.f47137d;
        }

        public /* synthetic */ C15148a(float f, int i, Rect rect, Rect rect2, Rect rect3, C0788c c0788c, boolean z, int i2, C15823e c15823e) {
            this(f, i, rect, rect2, (i2 & 16) != 0 ? (Rect) null : rect3, c0788c, (i2 & 64) != 0 ? true : z);
        }

        @Nullable
        /* renamed from: e */
        public final Rect m57007e() {
            return this.f47138e;
        }

        @Nullable
        /* renamed from: f */
        public final C0788c m57008f() {
            return this.f47139f;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$ViewProperty;", "", "state", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$State;", "params", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$Params;", "(Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$State;Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$Params;)V", "getParams", "()Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$Params;", "getState", "()Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$State;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier$b */
    public static final class C15149b {
        @NotNull
        /* renamed from: a */
        private final State f47141a;
        @NotNull
        /* renamed from: b */
        private final C15148a f47142b;

        @NotNull
        /* renamed from: a */
        public final State m57009a() {
            return this.f47141a;
        }

        @NotNull
        /* renamed from: b */
        public final C15148a m57010b() {
            return this.f47142b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15149b) {
                    C15149b c15149b = (C15149b) obj;
                    if (C2668g.a(this.f47141a, c15149b.f47141a) && C2668g.a(this.f47142b, c15149b.f47142b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            State state = this.f47141a;
            int i = 0;
            int hashCode = (state != null ? state.hashCode() : 0) * 31;
            C15148a c15148a = this.f47142b;
            if (c15148a != null) {
                i = c15148a.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewProperty(state=");
            stringBuilder.append(this.f47141a);
            stringBuilder.append(", params=");
            stringBuilder.append(this.f47142b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15149b(@NotNull State state, @NotNull C15148a c15148a) {
            C2668g.b(state, "state");
            C2668g.b(c15148a, "params");
            this.f47141a = state;
            this.f47142b = c15148a;
        }
    }

    public SuperLikeableViewStateProviderAndNotifier() {
        PublishSubject w = PublishSubject.w();
        C2668g.a(w, "PublishSubject.create<ViewProperty>()");
        this.f52063a = w;
    }

    @NotNull
    public Observable<C15149b> observe() {
        Observable<C15149b> g = this.f52063a.e().g();
        C2668g.a(g, "subject.asObservable().distinctUntilChanged()");
        return g;
    }

    public void notifyViewState(@NotNull C15149b c15149b) {
        C2668g.b(c15149b, "viewProperty");
        this.f52063a.onNext(c15149b);
    }
}
