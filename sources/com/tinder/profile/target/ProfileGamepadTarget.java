package com.tinder.profile.target;

import android.view.View.OnClickListener;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\b\u0010\u0018\u001a\u00020\u0003H&¨\u0006\u0019"}, d2 = {"Lcom/tinder/profile/target/ProfileGamepadTarget;", "", "enterWithAnimation", "", "enterWithoutAnimation", "exitWithAnimation", "exitWithoutAnimation", "hide", "setEnabled", "enabled", "", "setLikeButtonEnabled", "setLikeClickListener", "clickListener", "Landroid/view/View$OnClickListener;", "setLikePercentRemaining", "likePercentRemaining", "", "setPassButtonEnabled", "setPassClickListener", "setSuperLikeButtonVisible", "visible", "setSuperlikeButtonEnabled", "setSuperlikeClickListener", "show", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ProfileGamepadTarget {
    void enterWithAnimation();

    void enterWithoutAnimation();

    void exitWithAnimation();

    void exitWithoutAnimation();

    void hide();

    void setEnabled(boolean z);

    void setLikeButtonEnabled(boolean z);

    void setLikeClickListener(@Nullable OnClickListener onClickListener);

    void setLikePercentRemaining(int i);

    void setPassButtonEnabled(boolean z);

    void setPassClickListener(@Nullable OnClickListener onClickListener);

    void setSuperLikeButtonVisible(boolean z);

    void setSuperlikeButtonEnabled(boolean z);

    void setSuperlikeClickListener(@Nullable OnClickListener onClickListener);

    void show();
}
