package com.tinder.data.updates;

import android.app.Application;
import com.tinder.api.keepalive.KeepAliveScarletApi;
import com.tinder.data.database.C8643b;
import com.tinder.data.match.C8675p;
import com.tinder.data.message.C8698t;
import com.tinder.data.p215d.C12853a;
import com.tinder.domain.auth.AuthStatusRepository;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import com.tinder.domain.injection.qualifiers.LoggedIn;
import com.tinder.domain.injection.qualifiers.Poll;
import com.tinder.domain.injection.qualifiers.Push;
import com.tinder.domain.updates.PollIntervalRepository;
import com.tinder.domain.updates.UpdateSignalRepository;
import com.tinder.scarlet.Lifecycle;
import com.tinder.scarlet.lifecycle.C18043d;
import dagger.Module;
import dagger.Provides;
import io.reactivex.C15679f;
import io.reactivex.schedulers.C15756a;
import javax.inject.Singleton;

@Module(includes = {C8643b.class, C8675p.class, C8698t.class})
/* renamed from: com.tinder.data.updates.p */
public abstract class C8811p {
    @Singleton
    @LoggedIn
    @Provides
    /* renamed from: a */
    static Lifecycle m37507a(AuthStatusRepository authStatusRepository) {
        Lifecycle c12853a = new C12853a(authStatusRepository, new C18043d(100));
        c12853a.m50475a();
        return c12853a;
    }

    @Poll
    @Provides
    /* renamed from: a */
    static UpdateSignalRepository m37506a(PollIntervalRepository pollIntervalRepository) {
        return new C11052g(pollIntervalRepository, C15756a.a());
    }

    @Push
    @Provides
    /* renamed from: a */
    static UpdateSignalRepository m37505a(KeepAliveScarletApi keepAliveScarletApi, PollIntervalRepository pollIntervalRepository, C8803e c8803e, @ComputationScheduler C15679f c15679f) {
        c8803e.m37485a(keepAliveScarletApi.observeNudge());
        return new C11059h(keepAliveScarletApi, pollIntervalRepository, c8803e, c15679f);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    static LastActivityDateRepository m37504a(Application application) {
        return new C11047c(application);
    }

    @Provides
    /* renamed from: a */
    static C8809l m37503a(C8805i c8805i, UpdateSignalRepository updateSignalRepository) {
        return new C8809l(c8805i, new C11062k(C15756a.b()), C15756a.b(), updateSignalRepository);
    }
}
