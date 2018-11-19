package com.tinder.superlikeable.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.etl.event.xn;
import com.tinder.superlikeable.analytics.AddSuperLikeableInteractEvent.SuperLikeablePosition;
import com.tinder.superlikeable.analytics.AddSuperLikeableInteractEvent.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableProfileInteractEvent;", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent;", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableProfileInteractEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "superLikeableAnalyticsFactory", "Lcom/tinder/superlikeable/analytics/SuperLikeableAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/superlikeable/analytics/SuperLikeableAnalyticsFactory;)V", "execute", "", "request", "Request", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.analytics.b */
public final class C18198b extends AddSuperLikeableInteractEvent<C15092a> {
    /* renamed from: a */
    private final C2630h f56413a;
    /* renamed from: b */
    private final C15096f f56414b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0006\u0010 \u001a\u00020\u0005J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableProfileInteractEvent$Request;", "", "userId", "", "numOfPhotos", "", "superLikeablePosition", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$SuperLikeablePosition;", "(Ljava/lang/String;ILcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$SuperLikeablePosition;)V", "getNumOfPhotos", "()I", "photosViewed", "", "getSuperLikeablePosition", "()Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$SuperLikeablePosition;", "type", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$Type;", "getType", "()Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$Type;", "getUserId", "()Ljava/lang/String;", "addPhotoViewed", "", "index", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "numPhotosViewed", "toString", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.analytics.b$a */
    public static final class C15092a {
        @NotNull
        /* renamed from: a */
        private final Type f46949a = Type.PROFILE;
        /* renamed from: b */
        private final Set<Integer> f46950b = ((Set) new LinkedHashSet());
        @NotNull
        /* renamed from: c */
        private final String f46951c;
        /* renamed from: d */
        private final int f46952d;
        @NotNull
        /* renamed from: e */
        private final SuperLikeablePosition f46953e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15092a) {
                C15092a c15092a = (C15092a) obj;
                if (C2668g.a(this.f46951c, c15092a.f46951c)) {
                    return (this.f46952d == c15092a.f46952d ? 1 : null) != null && C2668g.a(this.f46953e, c15092a.f46953e);
                }
            }
        }

        public int hashCode() {
            String str = this.f46951c;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f46952d) * 31;
            SuperLikeablePosition superLikeablePosition = this.f46953e;
            if (superLikeablePosition != null) {
                i = superLikeablePosition.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(userId=");
            stringBuilder.append(this.f46951c);
            stringBuilder.append(", numOfPhotos=");
            stringBuilder.append(this.f46952d);
            stringBuilder.append(", superLikeablePosition=");
            stringBuilder.append(this.f46953e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15092a(@NotNull String str, int i, @NotNull SuperLikeablePosition superLikeablePosition) {
            C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
            C2668g.b(superLikeablePosition, "superLikeablePosition");
            this.f46951c = str;
            this.f46952d = i;
            this.f46953e = superLikeablePosition;
        }

        @NotNull
        /* renamed from: c */
        public final String m56854c() {
            return this.f46951c;
        }

        /* renamed from: d */
        public final int m56855d() {
            return this.f46952d;
        }

        @NotNull
        /* renamed from: e */
        public final SuperLikeablePosition m56856e() {
            return this.f46953e;
        }

        @NotNull
        /* renamed from: a */
        public final Type m56851a() {
            return this.f46949a;
        }

        /* renamed from: a */
        public final void m56852a(int i) {
            this.f46950b.add(Integer.valueOf(i));
        }

        /* renamed from: b */
        public final int m56853b() {
            return this.f46950b.size();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/SuperLikeableInteractEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.analytics.b$b */
    static final class C18197b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C18198b f56412a;

        C18197b(C18198b c18198b) {
            this.f56412a = c18198b;
        }

        public /* synthetic */ Object call(Object obj) {
            m65975a((xn) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m65975a(xn xnVar) {
            this.f56412a.f56413a.a(xnVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.analytics.b$c */
    static final class C18936c implements Action0 {
        /* renamed from: a */
        public static final C18936c f58593a = new C18936c();

        C18936c() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "t", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.analytics.b$d */
    static final class C18937d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18937d f58594a = new C18937d();

        C18937d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67427a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67427a(@NotNull Throwable th) {
            C2668g.b(th, "t");
            C0001a.c(th, "Error executing AddSuperLikeableProfileInteractEvent", new Object[0]);
        }
    }

    public /* synthetic */ void execute(Object obj) {
        m65977a((C15092a) obj);
    }

    @Inject
    public C18198b(@NotNull C2630h c2630h, @NotNull C15096f c15096f) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15096f, "superLikeableAnalyticsFactory");
        this.f56413a = c2630h;
        this.f56414b = c15096f;
    }

    /* renamed from: a */
    public void m65977a(@NotNull C15092a c15092a) {
        C2668g.b(c15092a, "request");
        this.f56414b.m56870a(c15092a).d(new C18197b(this)).b().b(Schedulers.io()).a(C18936c.f58593a, C18937d.f58594a);
    }
}
