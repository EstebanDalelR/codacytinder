package com.tinder.recs.provider;

import android.support.annotation.NonNull;
import com.tinder.domain.recs.model.RecSource;
import com.tinder.domain.recs.model.RecSource.Core;
import javax.inject.Singleton;
import rx.Observable;
import rx.subjects.C19785a;

@Singleton
public class RecSourceProvider {
    private final C19785a<RecSource> subject = C19785a.f(Core.INSTANCE);

    public RecSource getSource() {
        return (RecSource) this.subject.A();
    }

    public Observable<RecSource> observeChanges() {
        return this.subject.g().e();
    }

    public void updateSource(@NonNull RecSource recSource) {
        if (!recSource.equals(this.subject.A())) {
            this.subject.onNext(recSource);
        }
    }
}
