package com.tinder.app.dagger.module;

import android.content.SharedPreferences;
import com.tinder.module.Default;
import com.tinder.recs.data.SwipeCountSharedPreferencesRepository;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import com.tinder.recs.domain.rule.SwipeCountSwipeTerminationRule;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/tinder/app/dagger/module/SwipeCountModule;", "", "()V", "provideSwipeCountRepository", "Lcom/tinder/recs/domain/repository/SwipeCountRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideSwipeCountRule", "Lcom/tinder/recs/domain/rule/SwipeCountSwipeTerminationRule;", "swipeCountRepository", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
public final class aa {
    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final SwipeCountRepository m35148a(@Default @NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        return new SwipeCountSharedPreferencesRepository(sharedPreferences);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final SwipeCountSwipeTerminationRule m35149a(@NotNull SwipeCountRepository swipeCountRepository) {
        C2668g.b(swipeCountRepository, "swipeCountRepository");
        return new SwipeCountSwipeTerminationRule(swipeCountRepository);
    }
}
