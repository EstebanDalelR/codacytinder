package com.tinder.loops.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.ax;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/loops/analytics/AddAppTutorialMediaSelectorEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/loops/analytics/AddAppTutorialMediaSelectorEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "schedulers", "Lcom/tinder/common/reactivex/schedulers/Schedulers;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/common/reactivex/schedulers/Schedulers;)V", "createEvent", "Lcom/tinder/etl/event/AppTutorialEvent;", "request", "execute", "", "Request", "loops_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.analytics.a */
public final class C11912a implements VoidUseCase<C9759a> {
    /* renamed from: a */
    private final C2630h f38809a;
    /* renamed from: b */
    private final Schedulers f38810b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/tinder/loops/analytics/AddAppTutorialMediaSelectorEvent$Request;", "", "tutorialAction", "Lcom/tinder/loops/analytics/TutorialAction;", "tutorialContext", "Lcom/tinder/loops/analytics/TutorialContext;", "tutorialName", "Lcom/tinder/loops/analytics/TutorialName;", "tutorialType", "Lcom/tinder/loops/analytics/TutorialType;", "(Lcom/tinder/loops/analytics/TutorialAction;Lcom/tinder/loops/analytics/TutorialContext;Lcom/tinder/loops/analytics/TutorialName;Lcom/tinder/loops/analytics/TutorialType;)V", "getTutorialAction", "()Lcom/tinder/loops/analytics/TutorialAction;", "getTutorialContext", "()Lcom/tinder/loops/analytics/TutorialContext;", "getTutorialName", "()Lcom/tinder/loops/analytics/TutorialName;", "getTutorialType", "()Lcom/tinder/loops/analytics/TutorialType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "loops_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.analytics.a$a */
    public static final class C9759a {
        @NotNull
        /* renamed from: a */
        private final TutorialAction f32378a;
        @NotNull
        /* renamed from: b */
        private final TutorialContext f32379b;
        @NotNull
        /* renamed from: c */
        private final TutorialName f32380c;
        @NotNull
        /* renamed from: d */
        private final TutorialType f32381d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9759a) {
                    C9759a c9759a = (C9759a) obj;
                    if (C2668g.a(this.f32378a, c9759a.f32378a) && C2668g.a(this.f32379b, c9759a.f32379b) && C2668g.a(this.f32380c, c9759a.f32380c) && C2668g.a(this.f32381d, c9759a.f32381d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            TutorialAction tutorialAction = this.f32378a;
            int i = 0;
            int hashCode = (tutorialAction != null ? tutorialAction.hashCode() : 0) * 31;
            TutorialContext tutorialContext = this.f32379b;
            hashCode = (hashCode + (tutorialContext != null ? tutorialContext.hashCode() : 0)) * 31;
            TutorialName tutorialName = this.f32380c;
            hashCode = (hashCode + (tutorialName != null ? tutorialName.hashCode() : 0)) * 31;
            TutorialType tutorialType = this.f32381d;
            if (tutorialType != null) {
                i = tutorialType.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(tutorialAction=");
            stringBuilder.append(this.f32378a);
            stringBuilder.append(", tutorialContext=");
            stringBuilder.append(this.f32379b);
            stringBuilder.append(", tutorialName=");
            stringBuilder.append(this.f32380c);
            stringBuilder.append(", tutorialType=");
            stringBuilder.append(this.f32381d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9759a(@NotNull TutorialAction tutorialAction, @NotNull TutorialContext tutorialContext, @NotNull TutorialName tutorialName, @NotNull TutorialType tutorialType) {
            C2668g.b(tutorialAction, "tutorialAction");
            C2668g.b(tutorialContext, "tutorialContext");
            C2668g.b(tutorialName, "tutorialName");
            C2668g.b(tutorialType, "tutorialType");
            this.f32378a = tutorialAction;
            this.f32379b = tutorialContext;
            this.f32380c = tutorialName;
            this.f32381d = tutorialType;
        }

        @NotNull
        /* renamed from: a */
        public final TutorialAction m40273a() {
            return this.f32378a;
        }

        @NotNull
        /* renamed from: b */
        public final TutorialContext m40274b() {
            return this.f32379b;
        }

        @NotNull
        /* renamed from: c */
        public final TutorialName m40275c() {
            return this.f32380c;
        }

        @NotNull
        /* renamed from: d */
        public final TutorialType m40276d() {
            return this.f32381d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.analytics.a$b */
    static final class C11909b implements Action {
        /* renamed from: a */
        final /* synthetic */ C11912a f38805a;
        /* renamed from: b */
        final /* synthetic */ C9759a f38806b;

        C11909b(C11912a c11912a, C9759a c9759a) {
            this.f38805a = c11912a;
            this.f38806b = c9759a;
        }

        public final void run() {
            this.f38805a.f38809a.a(this.f38805a.m47916b(this.f38806b));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.analytics.a$c */
    static final class C11910c implements Action {
        /* renamed from: a */
        final /* synthetic */ C9759a f38807a;

        C11910c(C9759a c9759a) {
            this.f38807a = c9759a;
        }

        public final void run() {
            C0001a.b("App.Tutorial event added for action %s, context %s, name %s, type %s", new Object[]{this.f38807a.m40273a(), this.f38807a.m40274b(), this.f38807a.m40275c(), this.f38807a.m40276d()});
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.analytics.a$d */
    static final class C11911d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C9759a f38808a;

        C11911d(C9759a c9759a) {
            this.f38808a = c9759a;
        }

        public /* synthetic */ void accept(Object obj) {
            m47913a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47913a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error firing AddAppTutorialMediaSelectorEvent for ");
            stringBuilder.append(this.f38808a.m40274b());
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public C11912a(@NotNull C2630h c2630h, @NotNull Schedulers schedulers) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(schedulers, "schedulers");
        this.f38809a = c2630h;
        this.f38810b = schedulers;
    }

    public /* synthetic */ void execute(Object obj) {
        m47917a((C9759a) obj);
    }

    /* renamed from: a */
    public void m47917a(@NotNull C9759a c9759a) {
        C2668g.b(c9759a, "request");
        C3956a.a(new C11909b(this, c9759a)).b(this.f38810b.io()).a(new C11910c(c9759a), new C11911d(c9759a));
    }

    /* renamed from: b */
    private final ax m47916b(C9759a c9759a) {
        c9759a = ax.m44195a().m37852a(c9759a.m40273a().getValue()).m37854b(c9759a.m40274b().getValue()).m37855c(c9759a.m40275c().getValue()).m37856d(c9759a.m40276d().getValue()).m37853a();
        C2668g.a(c9759a, "AppTutorialEvent.builder…\n                .build()");
        C2668g.a(c9759a, "with(request) {\n        …       .build()\n        }");
        return c9759a;
    }
}
