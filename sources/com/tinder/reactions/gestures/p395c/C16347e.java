package com.tinder.reactions.gestures.p395c;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.data.ObservingProvider;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.navigation.viewmodel.GrandGestureNavigationItem.Type;
import com.tinder.reactions.p385c.C16288h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Single;
import rx.functions.Action1;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0012J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0012H\u0002J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0002H\u0016J\u000e\u0010#\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0013\u001a&\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00020\u0002 \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00140\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/tinder/reactions/gestures/provider/GesturePositionProvider;", "Lcom/tinder/data/ObservingProvider;", "Lcom/tinder/reactions/gestures/provider/GesturePositionProvider$PositionEvent;", "currentChatBubbleProvider", "Lcom/tinder/reactions/gestures/provider/CurrentChatBubbleProvider;", "matchId", "", "getNextStrikeId", "Lcom/tinder/reactions/usecase/GetNextStrikeId;", "(Lcom/tinder/reactions/gestures/provider/CurrentChatBubbleProvider;Ljava/lang/String;Lcom/tinder/reactions/usecase/GetNextStrikeId;)V", "grandGestureNavigationItemValues", "", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem$Type;", "[Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem$Type;", "grandGestureTypeValues", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "[Lcom/tinder/domain/reactions/model/GrandGestureType;", "initialPosition", "", "subject", "Lrx/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "totalGesturesAvailable", "bindTotalGesturesAvailable", "", "get", "getCurrentGestureType", "Lrx/Single;", "position", "isPositionValid", "", "observe", "Lrx/Observable;", "update", "event", "updatePosition", "PositionEvent", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.gestures.c.e */
public final class C16347e implements ObservingProvider<C14659a> {
    /* renamed from: a */
    private final C19785a<C14659a> f50846a = C19785a.w();
    /* renamed from: b */
    private int f50847b;
    /* renamed from: c */
    private final int f50848c;
    /* renamed from: d */
    private final Type[] f50849d = Type.values();
    /* renamed from: e */
    private final GrandGestureType[] f50850e = GrandGestureType.values();
    /* renamed from: f */
    private final C16345a f50851f;
    /* renamed from: g */
    private final String f50852g;
    /* renamed from: h */
    private final C16288h f50853h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/tinder/reactions/gestures/provider/GesturePositionProvider$PositionEvent;", "", "gesturePosition", "", "totalGesturesAvailable", "gestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "(IILcom/tinder/domain/reactions/model/GrandGestureType;)V", "getGesturePosition", "()I", "getGestureType", "()Lcom/tinder/domain/reactions/model/GrandGestureType;", "getTotalGesturesAvailable", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.c.e$a */
    public static final class C14659a {
        /* renamed from: a */
        private final int f46220a;
        /* renamed from: b */
        private final int f46221b;
        @NotNull
        /* renamed from: c */
        private final GrandGestureType f46222c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14659a) {
                C14659a c14659a = (C14659a) obj;
                if ((this.f46220a == c14659a.f46220a ? 1 : null) != null) {
                    return (this.f46221b == c14659a.f46221b ? 1 : null) != null && C2668g.a(this.f46222c, c14659a.f46222c);
                }
            }
        }

        public int hashCode() {
            int i = ((this.f46220a * 31) + this.f46221b) * 31;
            GrandGestureType grandGestureType = this.f46222c;
            return i + (grandGestureType != null ? grandGestureType.hashCode() : 0);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PositionEvent(gesturePosition=");
            stringBuilder.append(this.f46220a);
            stringBuilder.append(", totalGesturesAvailable=");
            stringBuilder.append(this.f46221b);
            stringBuilder.append(", gestureType=");
            stringBuilder.append(this.f46222c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14659a(int i, int i2, @NotNull GrandGestureType grandGestureType) {
            C2668g.b(grandGestureType, "gestureType");
            this.f46220a = i;
            this.f46221b = i2;
            this.f46222c = grandGestureType;
        }

        /* renamed from: a */
        public final int m55887a() {
            return this.f46220a;
        }

        /* renamed from: b */
        public final int m55888b() {
            return this.f46221b;
        }

        @NotNull
        /* renamed from: c */
        public final GrandGestureType m55889c() {
            return this.f46222c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "gestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.c.e$b */
    static final class C18743b<T> implements Action1<GrandGestureType> {
        /* renamed from: a */
        final /* synthetic */ C16347e f58233a;
        /* renamed from: b */
        final /* synthetic */ int f58234b;

        C18743b(C16347e c16347e, int i) {
            this.f58233a = c16347e;
            this.f58234b = i;
        }

        public /* synthetic */ void call(Object obj) {
            m67167a((GrandGestureType) obj);
        }

        /* renamed from: a */
        public final void m67167a(GrandGestureType grandGestureType) {
            C16347e c16347e = this.f58233a;
            int i = this.f58234b;
            int a = this.f58233a.f50847b;
            C2668g.a(grandGestureType, "gestureType");
            c16347e.m61662a(new C14659a(i, a, grandGestureType));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.c.e$c */
    static final class C18744c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18744c f58235a = new C18744c();

        C18744c() {
        }

        public /* synthetic */ void call(Object obj) {
            m67168a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67168a(Throwable th) {
            C0001a.c(th, "Error updating gesture position", new Object[0]);
        }
    }

    @Inject
    public C16347e(@NotNull C16345a c16345a, @NotNull String str, @NotNull C16288h c16288h) {
        C2668g.b(c16345a, "currentChatBubbleProvider");
        C2668g.b(str, "matchId");
        C2668g.b(c16288h, "getNextStrikeId");
        this.f50851f = c16345a;
        this.f50852g = str;
        this.f50853h = c16288h;
    }

    public /* synthetic */ Object get() {
        return m61660a();
    }

    public /* synthetic */ void update(Object obj) {
        m61662a((C14659a) obj);
    }

    @NotNull
    /* renamed from: a */
    public C14659a m61660a() {
        C19785a c19785a = this.f50846a;
        C2668g.a(c19785a, "subject");
        Object A = c19785a.A();
        C2668g.a(A, "subject.value");
        return (C14659a) A;
    }

    @NotNull
    public Observable<C14659a> observe() {
        Observable<C14659a> e = this.f50846a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    /* renamed from: a */
    public void m61662a(@NotNull C14659a c14659a) {
        C2668g.b(c14659a, "event");
        C19785a c19785a = this.f50846a;
        C2668g.a(c19785a, "subject");
        if (!C2668g.a(c14659a, (C14659a) c19785a.A())) {
            this.f50846a.onNext(c14659a);
        }
    }

    /* renamed from: a */
    public final void m61661a(int i) {
        this.f50847b = i;
        m61662a(new C14659a(this.f50848c, i, this.f50850e[this.f50848c]));
    }

    /* renamed from: b */
    public final void m61663b(int i) {
        if (m61659d(i)) {
            m61658c(i).a(new C18743b(this, i), (Action1) C18744c.f58235a);
        }
    }

    /* renamed from: c */
    private final Single<GrandGestureType> m61658c(int i) {
        switch (C14660f.f46223a[this.f50849d[i].ordinal()]) {
            case 1:
                i = Single.a(GrandGestureType.HEART);
                C2668g.a(i, "Single.just(GrandGestureType.HEART)");
                return i;
            case 2:
                i = Single.a(GrandGestureType.LAUGH);
                C2668g.a(i, "Single.just(GrandGestureType.LAUGH)");
                return i;
            case 3:
                i = Single.a(GrandGestureType.CLAP);
                C2668g.a(i, "Single.just(GrandGestureType.CLAP)");
                return i;
            case 4:
                i = Single.a(this.f50851f.m61653a());
                C2668g.a(i, "Single.just(currentChatBubbleProvider.get())");
                return i;
            case 5:
                i = Single.a(GrandGestureType.MARTINI);
                C2668g.a(i, "Single.just(GrandGestureType.MARTINI)");
                return i;
            case 6:
                return this.f50853h.m61478a(this.f50852g);
            case 7:
                i = Single.a(GrandGestureType.EYEROLL);
                C2668g.a(i, "Single.just(GrandGestureType.EYEROLL)");
                return i;
            case 8:
                i = Single.a(GrandGestureType.BALL_IN_COURT);
                C2668g.a(i, "Single.just(GrandGestureType.BALL_IN_COURT)");
                return i;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    private final boolean m61659d(int i) {
        return i >= 0 && i < this.f50849d.length;
    }
}
