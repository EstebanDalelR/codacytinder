package com.tinder.webprofile.di;

import android.view.inputmethod.InputMethodManager;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.profile.repository.WebProfileRepository;
import com.tinder.webprofile.activity.WebProfileUsernameActivity;
import dagger.Component;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Component(dependencies = {Parent.class})
@WebProfileScope
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/webprofile/di/WebProfileComponent;", "", "inject", "", "activity", "Lcom/tinder/webprofile/activity/WebProfileUsernameActivity;", "Parent", "webprofile_release"}, k = 1, mv = {1, 1, 10})
public interface WebProfileComponent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/tinder/webprofile/di/WebProfileComponent$Parent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "profileLocalRepository", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "webProfileRepository", "Lcom/tinder/domain/profile/repository/WebProfileRepository;", "webprofile_release"}, k = 1, mv = {1, 1, 10})
    public interface Parent {
        @NotNull
        C2630h fireworks();

        @NotNull
        InputMethodManager inputMethodManager();

        @NotNull
        ProfileLocalRepository profileLocalRepository();

        @NotNull
        WebProfileRepository webProfileRepository();
    }

    void inject(@NotNull WebProfileUsernameActivity webProfileUsernameActivity);
}
