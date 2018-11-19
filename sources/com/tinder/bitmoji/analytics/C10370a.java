package com.tinder.bitmoji.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory.TutorialAction;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory.TutorialContext;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory.TutorialName;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory.TutorialType;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/bitmoji/analytics/AddAppTutorialEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/bitmoji/analytics/AddAppTutorialEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "appTutorialEventFactory", "Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory;Lio/reactivex/Scheduler;)V", "execute", "", "request", "Request", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.analytics.a */
public final class C10370a implements VoidUseCase<C8322a> {
    /* renamed from: a */
    private final C2630h f33847a;
    /* renamed from: b */
    private final AppTutorialEventFactory f33848b;
    /* renamed from: c */
    private final C15679f f33849c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/tinder/bitmoji/analytics/AddAppTutorialEvent$Request;", "", "tutorialAction", "Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialAction;", "tutorialContext", "Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialContext;", "tutorialName", "Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialName;", "tutorialType", "Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialType;", "(Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialAction;Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialContext;Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialName;Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialType;)V", "getTutorialAction", "()Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialAction;", "getTutorialContext", "()Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialContext;", "getTutorialName", "()Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialName;", "getTutorialType", "()Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.analytics.a$a */
    public static final class C8322a {
        @NotNull
        /* renamed from: a */
        private final TutorialAction f29602a;
        @NotNull
        /* renamed from: b */
        private final TutorialContext f29603b;
        @NotNull
        /* renamed from: c */
        private final TutorialName f29604c;
        @NotNull
        /* renamed from: d */
        private final TutorialType f29605d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8322a) {
                    C8322a c8322a = (C8322a) obj;
                    if (C2668g.a(this.f29602a, c8322a.f29602a) && C2668g.a(this.f29603b, c8322a.f29603b) && C2668g.a(this.f29604c, c8322a.f29604c) && C2668g.a(this.f29605d, c8322a.f29605d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            TutorialAction tutorialAction = this.f29602a;
            int i = 0;
            int hashCode = (tutorialAction != null ? tutorialAction.hashCode() : 0) * 31;
            TutorialContext tutorialContext = this.f29603b;
            hashCode = (hashCode + (tutorialContext != null ? tutorialContext.hashCode() : 0)) * 31;
            TutorialName tutorialName = this.f29604c;
            hashCode = (hashCode + (tutorialName != null ? tutorialName.hashCode() : 0)) * 31;
            TutorialType tutorialType = this.f29605d;
            if (tutorialType != null) {
                i = tutorialType.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(tutorialAction=");
            stringBuilder.append(this.f29602a);
            stringBuilder.append(", tutorialContext=");
            stringBuilder.append(this.f29603b);
            stringBuilder.append(", tutorialName=");
            stringBuilder.append(this.f29604c);
            stringBuilder.append(", tutorialType=");
            stringBuilder.append(this.f29605d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8322a(@NotNull TutorialAction tutorialAction, @NotNull TutorialContext tutorialContext, @NotNull TutorialName tutorialName, @NotNull TutorialType tutorialType) {
            C2668g.b(tutorialAction, "tutorialAction");
            C2668g.b(tutorialContext, "tutorialContext");
            C2668g.b(tutorialName, "tutorialName");
            C2668g.b(tutorialType, "tutorialType");
            this.f29602a = tutorialAction;
            this.f29603b = tutorialContext;
            this.f29604c = tutorialName;
            this.f29605d = tutorialType;
        }

        @NotNull
        /* renamed from: a */
        public final TutorialAction m35432a() {
            return this.f29602a;
        }

        @NotNull
        /* renamed from: b */
        public final TutorialContext m35433b() {
            return this.f29603b;
        }

        @NotNull
        /* renamed from: c */
        public final TutorialName m35434c() {
            return this.f29604c;
        }

        @NotNull
        /* renamed from: d */
        public final TutorialType m35435d() {
            return this.f29605d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.analytics.a$b */
    static final class C10368b implements Action {
        /* renamed from: a */
        final /* synthetic */ C10370a f33844a;
        /* renamed from: b */
        final /* synthetic */ C8322a f33845b;

        C10368b(C10370a c10370a, C8322a c8322a) {
            this.f33844a = c10370a;
            this.f33845b = c8322a;
        }

        public final void run() {
            this.f33844a.f33847a.a(this.f33844a.f33848b.m35431a(this.f33845b.m35432a(), this.f33845b.m35433b(), this.f33845b.m35434c(), this.f33845b.m35435d()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.analytics.a$c */
    static final class C10369c implements Action {
        /* renamed from: a */
        final /* synthetic */ C8322a f33846a;

        C10369c(C8322a c8322a) {
            this.f33846a = c8322a;
        }

        public final void run() {
            C0001a.b("App.Tutorial event added for action %s, context %s, name %s, type %s", new Object[]{this.f33846a.m35432a(), this.f33846a.m35433b(), this.f33846a.m35434c(), this.f33846a.m35435d()});
        }
    }

    @Inject
    public C10370a(@NotNull C2630h c2630h, @NotNull AppTutorialEventFactory appTutorialEventFactory, @NotNull @IoScheduler C15679f c15679f) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(appTutorialEventFactory, "appTutorialEventFactory");
        C2668g.b(c15679f, "ioScheduler");
        this.f33847a = c2630h;
        this.f33848b = appTutorialEventFactory;
        this.f33849c = c15679f;
    }

    public /* synthetic */ void execute(Object obj) {
        m42202a((C8322a) obj);
    }

    /* renamed from: a */
    public void m42202a(@NotNull C8322a c8322a) {
        C2668g.b(c8322a, "request");
        C3956a b = C3956a.a(new C10368b(this, c8322a)).b(this.f33849c);
        Action c10369c = new C10369c(c8322a);
        c8322a = (Function1) AddAppTutorialEvent$execute$3.f45097a;
        if (c8322a != null) {
            c8322a = new C10371b(c8322a);
        }
        b.a(c10369c, (Consumer) c8322a);
    }
}
