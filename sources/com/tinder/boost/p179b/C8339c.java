package com.tinder.boost.p179b;

import android.support.annotation.NonNull;
import com.tinder.boost.p178a.C8337b;
import com.tinder.domain.profile.model.Tutorial.BoostReminder;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.managers.bk;
import io.reactivex.C3956a;
import javax.inject.Inject;

/* renamed from: com.tinder.boost.b.c */
public class C8339c {
    @NonNull
    /* renamed from: a */
    private final C8337b f29633a;
    @NonNull
    /* renamed from: b */
    private final ConfirmTutorialsViewed f29634b;
    @NonNull
    /* renamed from: c */
    private final bk f29635c;

    @Inject
    public C8339c(@NonNull C8337b c8337b, @NonNull ConfirmTutorialsViewed confirmTutorialsViewed, @NonNull bk bkVar) {
        this.f29633a = c8337b;
        this.f29634b = confirmTutorialsViewed;
        this.f29635c = bkVar;
    }

    @NonNull
    /* renamed from: a */
    public C3956a m35510a() {
        return this.f29634b.execute(BoostReminder.INSTANCE).b(C3956a.a(new C10401d(this)));
    }

    /* renamed from: b */
    final /* synthetic */ void m35511b() throws Exception {
        this.f29633a.m35504b();
        this.f29635c.A(true);
    }
}
