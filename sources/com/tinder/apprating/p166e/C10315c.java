package com.tinder.apprating.p166e;

import com.tinder.api.TinderUserApi;
import com.tinder.api.request.FeedbackRequestBody;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.interactors.C2647c;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.C15367r;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/apprating/usecase/SendFeedback;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/apprating/usecase/SendFeedback$Request;", "tinderUserApi", "Lcom/tinder/api/TinderUserApi;", "connectivityInteractor", "Lcom/tinder/interactors/ConnectivityInteractor;", "(Lcom/tinder/api/TinderUserApi;Lcom/tinder/interactors/ConnectivityInteractor;)V", "execute", "Lrx/Completable;", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.apprating.e.c */
public final class C10315c implements CompletableUseCase<C8265a> {
    /* renamed from: a */
    private final TinderUserApi f33706a;
    /* renamed from: b */
    private final C2647c f33707b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/apprating/usecase/SendFeedback$Request;", "", "stars", "", "feedbackMessage", "", "(ILjava/lang/String;)V", "getFeedbackMessage", "()Ljava/lang/String;", "getStars", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.apprating.e.c$a */
    public static final class C8265a {
        /* renamed from: a */
        private final int f29512a;
        @NotNull
        /* renamed from: b */
        private final String f29513b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8265a) {
                C8265a c8265a = (C8265a) obj;
                return (this.f29512a == c8265a.f29512a ? 1 : null) != null && C2668g.a(this.f29513b, c8265a.f29513b);
            }
        }

        public int hashCode() {
            int i = this.f29512a * 31;
            String str = this.f29513b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(stars=");
            stringBuilder.append(this.f29512a);
            stringBuilder.append(", feedbackMessage=");
            stringBuilder.append(this.f29513b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8265a(int i, @NotNull String str) {
            C2668g.b(str, "feedbackMessage");
            this.f29512a = i;
            this.f29513b = str;
        }

        /* renamed from: a */
        public final int m35285a() {
            return this.f29512a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35286b() {
            return this.f29513b;
        }
    }

    @Inject
    public C10315c(@NotNull TinderUserApi tinderUserApi, @NotNull C2647c c2647c) {
        C2668g.b(tinderUserApi, "tinderUserApi");
        C2668g.b(c2647c, "connectivityInteractor");
        this.f33706a = tinderUserApi;
        this.f33707b = c2647c;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m42095a((C8265a) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m42095a(@NotNull C8265a c8265a) {
        C2668g.b(c8265a, "request");
        String a = this.f33707b.a();
        String c = C15367r.c();
        C2668g.a(c, "DeviceUtils.getModel()");
        String b = C15367r.b();
        C2668g.a(b, "DeviceUtils.getManufacturer()");
        String d = C15367r.d();
        C2668g.a(d, "DeviceUtils.getOsVersion()");
        String c2 = ManagerApp.c();
        C2668g.a(c2, "ManagerApp.getAppVersion()");
        c8265a = this.f33706a.sendUserFeedback(new FeedbackRequestBody(c8265a.m35286b(), c, a, b, d, c2, c8265a.m35285a()));
        C2668g.a(c8265a, "tinderUserApi.sendUserFe…back(feedbackRequestBody)");
        return c8265a;
    }
}
