package com.tinder.profile.module;

import android.support.v7.app.AppCompatActivity;
import com.tinder.messageads.activity.MessageAdMatchProfileActivity;
import com.tinder.profile.activities.CurrentUserProfileActivity;
import com.tinder.profile.activities.MatchProfileActivity;
import com.tinder.profile.activities.ProfileInstagramAuthActivity;
import com.tinder.profile.activities.ProfileSpotifyAuthActivity;
import com.tinder.profile.dialogs.CensorMenuDialog;
import com.tinder.profile.dialogs.InstagramPhotoViewerDialog;
import com.tinder.profile.view.BasicInfoShareRecView;
import com.tinder.profile.view.BasicInfoView;
import com.tinder.profile.view.CurrentUserProfileView;
import com.tinder.profile.view.MatchProfileView;
import com.tinder.profile.view.ProfileAnthemView;
import com.tinder.profile.view.ProfileInstagramConnectView;
import com.tinder.profile.view.ProfileInstagramView;
import com.tinder.profile.view.ProfilePhotosView;
import com.tinder.profile.view.ProfileRecommendToFriendView;
import com.tinder.profile.view.ProfileReportUserView;
import com.tinder.profile.view.ProfileTopArtistsView;
import com.tinder.profile.view.ProfileView;
import com.tinder.profile.view.UserRecProfileView;
import com.tinder.profile.view.tappy.TappyProfileGamePadView;
import com.tinder.scope.ActivityScope;
import dagger.BindsInstance;
import dagger.Subcomponent;
import org.jetbrains.annotations.NotNull;

@Subcomponent(modules = {C14421a.class})
@ActivityScope
public interface ProfileComponent {

    @dagger.Subcomponent.Builder
    public interface Builder {
        ProfileComponent build();

        @BindsInstance
        Builder profileActivityContext(AppCompatActivity appCompatActivity);
    }

    void inject(@NotNull MessageAdMatchProfileActivity messageAdMatchProfileActivity);

    void inject(CurrentUserProfileActivity currentUserProfileActivity);

    void inject(MatchProfileActivity matchProfileActivity);

    void inject(ProfileInstagramAuthActivity profileInstagramAuthActivity);

    void inject(ProfileSpotifyAuthActivity profileSpotifyAuthActivity);

    void inject(CensorMenuDialog censorMenuDialog);

    void inject(InstagramPhotoViewerDialog instagramPhotoViewerDialog);

    void inject(BasicInfoShareRecView basicInfoShareRecView);

    void inject(BasicInfoView basicInfoView);

    void inject(CurrentUserProfileView currentUserProfileView);

    void inject(MatchProfileView matchProfileView);

    void inject(ProfileAnthemView profileAnthemView);

    void inject(ProfileInstagramConnectView profileInstagramConnectView);

    void inject(ProfileInstagramView profileInstagramView);

    void inject(ProfilePhotosView profilePhotosView);

    void inject(ProfileRecommendToFriendView profileRecommendToFriendView);

    void inject(ProfileReportUserView profileReportUserView);

    void inject(ProfileTopArtistsView profileTopArtistsView);

    void inject(ProfileView profileView);

    void inject(UserRecProfileView userRecProfileView);

    void inject(TappyProfileGamePadView tappyProfileGamePadView);
}
