package com.tinder.bitmoji.di;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.bitmoji.p177a.C10366a;
import com.tinder.bitmoji.repository.BitmojiAuthRepository;
import com.tinder.bitmoji.repository.BitmojiImageUrlRepository;
import com.tinder.bitmoji.view.BitmojiIconView;
import com.tinder.domain.injection.modules.RxSchedulersModule;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import dagger.Component;
import io.reactivex.C15679f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Component(dependencies = {Parent.class}, modules = {RxSchedulersModule.class})
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/tinder/bitmoji/di/BitmojiComponent;", "", "inject", "", "dialog", "Lcom/tinder/bitmoji/dialog/BitmojiIntroDialog;", "view", "Lcom/tinder/bitmoji/view/BitmojiIconView;", "Parent", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
@BitmojiScope
public interface BitmojiComponent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/tinder/bitmoji/di/BitmojiComponent$Parent;", "", "bitmojiAuthRepository", "Lcom/tinder/bitmoji/repository/BitmojiAuthRepository;", "bitmojiImageUrlRepository", "Lcom/tinder/bitmoji/repository/BitmojiImageUrlRepository;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "profileLocalRepository", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
    public interface Parent {
        @NotNull
        BitmojiAuthRepository bitmojiAuthRepository();

        @NotNull
        BitmojiImageUrlRepository bitmojiImageUrlRepository();

        @NotNull
        C2630h fireworks();

        @NotNull
        @MainThreadScheduler
        C15679f mainThreadScheduler();

        @NotNull
        ProfileLocalRepository profileLocalRepository();
    }

    void inject(@NotNull C10366a c10366a);

    void inject(@NotNull BitmojiIconView bitmojiIconView);
}
