package com.tinder.managers;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.tinder.domain.meta.usecase.FetchMeta;
import com.tinder.model.DefaultObserver;
import com.tinder.model.UserMeta;
import com.tinder.p238f.p243e.C9368a;
import com.tinder.p238f.p336c.C11600a;
import com.tinder.p238f.p337d.C11601a;
import javax.inject.Inject;
import rx.Emitter;
import rx.Emitter.BackpressureMode;
import rx.Observable;
import rx.functions.Actions;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Deprecated
public class bu implements UserMetaManager {
    @NonNull
    /* renamed from: a */
    private final FetchMeta f39077a;
    @NonNull
    /* renamed from: b */
    private final C11601a f39078b;
    @NonNull
    /* renamed from: c */
    private final C11600a f39079c;
    @NonNull
    /* renamed from: d */
    private final C9368a f39080d;

    @Inject
    public bu(@NonNull FetchMeta fetchMeta, @NonNull C11601a c11601a, @NonNull C11600a c11600a, @NonNull C9368a c9368a) {
        this.f39077a = fetchMeta;
        this.f39078b = c11601a;
        this.f39079c = c11600a;
        this.f39080d = c9368a;
    }

    public void clearMetadata() {
        this.f39079c.m47327b();
        this.f39080d.m39222b();
    }

    @Nullable
    public UserMeta getMetaUser() {
        return this.f39079c.m47325a();
    }

    /* renamed from: a */
    void m48074a(@Nullable final Listener<UserMeta> listener, @Nullable final ErrorListener errorListener) {
        this.f39080d.m39221a();
        this.f39077a.execute().b(Schedulers.io()).a(Actions.a(), bv.f44558a);
        this.f39078b.execute().b(Schedulers.io()).a(C19397a.a()).a(new DefaultObserver<UserMeta>(this) {
            /* renamed from: c */
            final /* synthetic */ bu f42517c;

            public /* synthetic */ void onNext(Object obj) {
                m51824a((UserMeta) obj);
            }

            /* renamed from: a */
            public void m51824a(UserMeta userMeta) {
                this.f42517c.f39079c.m47326a(userMeta);
                if (listener != null) {
                    listener.onResponse(userMeta);
                }
            }

            public void onError(Throwable th) {
                super.onError(th);
                if (errorListener != null) {
                    errorListener.onErrorResponse(new VolleyError(th));
                }
            }
        });
    }

    @NonNull
    public Observable<UserMeta> loadMetaData() {
        return Observable.a(new bw(this), BackpressureMode.BUFFER);
    }

    /* renamed from: a */
    final /* synthetic */ void m48075a(Emitter emitter) {
        Listener bxVar = new bx(emitter);
        emitter.getClass();
        m48074a(bxVar, by.m48076a(emitter));
    }

    /* renamed from: a */
    static final /* synthetic */ void m48073a(Emitter emitter, UserMeta userMeta) {
        emitter.onNext(userMeta);
        emitter.onCompleted();
    }

    public void fetchMetaData() {
        m48074a(null, null);
    }
}
