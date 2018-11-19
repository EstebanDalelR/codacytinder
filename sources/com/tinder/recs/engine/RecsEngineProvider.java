package com.tinder.recs.engine;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecSource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Singleton;
import rx.Observable;
import rx.subjects.C19785a;

@Singleton
public class RecsEngineProvider {
    private final C19785a<RecsEngine> engineSubject = C19785a.w();
    private final Map<RecSource, RecsEngine> enginesBySource = new HashMap();

    @Nullable
    public RecsEngine getCurrentEngine() {
        return (RecsEngine) this.engineSubject.A();
    }

    public Observable<RecsEngine> observeCurrentEngine() {
        return this.engineSubject.m().e();
    }

    @NonNull
    public RecsEngine getEngine(@NonNull Rec$Source rec$Source) {
        return (RecsEngine) this.enginesBySource.get(rec$Source);
    }

    @NonNull
    public Set<RecsEngine> getAllEngines() {
        return new HashSet(this.enginesBySource.values());
    }

    void updateCurrentEngine(@NonNull RecsEngine recsEngine) {
        this.engineSubject.onNext(recsEngine);
    }

    void setEngine(@NonNull RecSource recSource, @NonNull RecsEngine recsEngine) {
        this.enginesBySource.put(recSource, recsEngine);
    }
}
