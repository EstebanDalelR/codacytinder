package com.tinder.module;

import com.tinder.core.experiment.C8597m;
import com.tinder.data.updates.C8809l;
import com.tinder.domain.injection.qualifiers.Poll;
import com.tinder.domain.injection.qualifiers.Push;
import com.tinder.domain.updates.UpdateSignalRepository;
import com.tinder.updates.C17218a;
import com.tinder.updates.UpdatesScheduler;
import com.tinder.updates.p443a.C15341i;
import com.tinder.updates.p443a.C15342k;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class fj {
    @Singleton
    @Provides
    /* renamed from: a */
    UpdatesScheduler m40902a(C8809l c8809l) {
        return new C17218a(c8809l);
    }

    @Provides
    /* renamed from: a */
    UpdateSignalRepository m40901a(@Poll Lazy<UpdateSignalRepository> lazy, @Push Lazy<UpdateSignalRepository> lazy2, Lazy<C15341i> lazy3, Lazy<C15342k> lazy4, C8597m c8597m) {
        if (c8597m.m36697a() == null) {
            return (UpdateSignalRepository) lazy.get();
        }
        ((C15341i) lazy3.get()).a();
        ((C15342k) lazy4.get()).a();
        return (UpdateSignalRepository) lazy2.get();
    }
}
