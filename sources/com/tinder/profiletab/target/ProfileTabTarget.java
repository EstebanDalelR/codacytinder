package com.tinder.profiletab.target;

import com.tinder.loops.analytics.TutorialAction;
import com.tinder.profiletab.p370d.C14470b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/tinder/profiletab/target/ProfileTabTarget;", "", "bindUserInfoViewModel", "", "viewModel", "Lcom/tinder/profiletab/viewmodel/UserInfoViewModel;", "dismissTooltip", "tooltipAction", "Lcom/tinder/loops/analytics/TutorialAction;", "hideMediaButton", "navigateToCurrentUser", "resetEditButtonToOriginalUi", "showEditProfile", "showMediaSelector", "showProfileAddLoopsToolTip", "startEditButtonAnimation", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ProfileTabTarget {
    void bindUserInfoViewModel(@NotNull C14470b c14470b);

    void dismissTooltip(@NotNull TutorialAction tutorialAction);

    void hideMediaButton();

    void navigateToCurrentUser();

    void resetEditButtonToOriginalUi();

    void showEditProfile();

    void showMediaSelector();

    void showProfileAddLoopsToolTip();

    void startEditButtonAnimation();
}
