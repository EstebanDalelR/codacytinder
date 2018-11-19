package com.tinder.fastmatch.view;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import com.tinder.views.AvatarView;
import com.tinder.views.CustomTextView;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u000205R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001e\u0010#\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R\u001e\u0010&\u001a\u00020\u00148\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001e\u0010)\u001a\u00020*8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001e¨\u00066"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchNotificationView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "avatarView", "Lcom/tinder/views/AvatarView;", "getAvatarView$Tinder_release", "()Lcom/tinder/views/AvatarView;", "setAvatarView$Tinder_release", "(Lcom/tinder/views/AvatarView;)V", "errorBackgroundColor", "", "errorTapToViewIcon", "Landroid/graphics/drawable/Drawable;", "getErrorTapToViewIcon$Tinder_release", "()Landroid/graphics/drawable/Drawable;", "setErrorTapToViewIcon$Tinder_release", "(Landroid/graphics/drawable/Drawable;)V", "errorTitleText", "", "getErrorTitleText$Tinder_release", "()Ljava/lang/String;", "setErrorTitleText$Tinder_release", "(Ljava/lang/String;)V", "messageTextView", "Lcom/tinder/views/CustomTextView;", "getMessageTextView$Tinder_release", "()Lcom/tinder/views/CustomTextView;", "setMessageTextView$Tinder_release", "(Lcom/tinder/views/CustomTextView;)V", "padding", "successBackgroundGradient", "getSuccessBackgroundGradient$Tinder_release", "setSuccessBackgroundGradient$Tinder_release", "successTapToViewIcon", "getSuccessTapToViewIcon$Tinder_release", "setSuccessTapToViewIcon$Tinder_release", "successTitleText", "getSuccessTitleText$Tinder_release", "setSuccessTitleText$Tinder_release", "tapToViewIconImageView", "Landroid/widget/ImageView;", "getTapToViewIconImageView$Tinder_release", "()Landroid/widget/ImageView;", "setTapToViewIconImageView$Tinder_release", "(Landroid/widget/ImageView;)V", "titleTextView", "getTitleTextView$Tinder_release", "setTitleTextView$Tinder_release", "bindViewModel", "", "viewModel", "Lcom/tinder/views/grid/viewmodel/GridNotificationViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchNotificationView extends LinearLayout {
    @NotNull
    @BindView(2131362905)
    public AvatarView avatarView;
    @BindColor(2131100166)
    @JvmField
    public int errorBackgroundColor;
    @NotNull
    @BindDrawable(2131231248)
    public Drawable errorTapToViewIcon;
    @BindString(2131820943)
    @NotNull
    public String errorTitleText;
    @NotNull
    @BindView(2131363023)
    public CustomTextView messageTextView;
    @BindDimen(2131165739)
    @JvmField
    public int padding;
    @NotNull
    @BindDrawable(2131231117)
    public Drawable successBackgroundGradient;
    @NotNull
    @BindDrawable(2131231249)
    public Drawable successTapToViewIcon;
    @BindString(2131821249)
    @NotNull
    public String successTitleText;
    @NotNull
    @BindView(2131363019)
    public ImageView tapToViewIconImageView;
    @NotNull
    @BindView(2131363026)
    public CustomTextView titleTextView;

    @NotNull
    public final AvatarView getAvatarView$Tinder_release() {
        AvatarView avatarView = this.avatarView;
        if (avatarView == null) {
            C2668g.b("avatarView");
        }
        return avatarView;
    }

    public final void setAvatarView$Tinder_release(@NotNull AvatarView avatarView) {
        C2668g.b(avatarView, "<set-?>");
        this.avatarView = avatarView;
    }

    @NotNull
    public final CustomTextView getTitleTextView$Tinder_release() {
        CustomTextView customTextView = this.titleTextView;
        if (customTextView == null) {
            C2668g.b("titleTextView");
        }
        return customTextView;
    }

    public final void setTitleTextView$Tinder_release(@NotNull CustomTextView customTextView) {
        C2668g.b(customTextView, "<set-?>");
        this.titleTextView = customTextView;
    }

    @NotNull
    public final CustomTextView getMessageTextView$Tinder_release() {
        CustomTextView customTextView = this.messageTextView;
        if (customTextView == null) {
            C2668g.b("messageTextView");
        }
        return customTextView;
    }

    public final void setMessageTextView$Tinder_release(@NotNull CustomTextView customTextView) {
        C2668g.b(customTextView, "<set-?>");
        this.messageTextView = customTextView;
    }

    @NotNull
    public final ImageView getTapToViewIconImageView$Tinder_release() {
        ImageView imageView = this.tapToViewIconImageView;
        if (imageView == null) {
            C2668g.b("tapToViewIconImageView");
        }
        return imageView;
    }

    public final void setTapToViewIconImageView$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.tapToViewIconImageView = imageView;
    }

    @NotNull
    public final String getSuccessTitleText$Tinder_release() {
        String str = this.successTitleText;
        if (str == null) {
            C2668g.b("successTitleText");
        }
        return str;
    }

    public final void setSuccessTitleText$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.successTitleText = str;
    }

    @NotNull
    public final String getErrorTitleText$Tinder_release() {
        String str = this.errorTitleText;
        if (str == null) {
            C2668g.b("errorTitleText");
        }
        return str;
    }

    public final void setErrorTitleText$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.errorTitleText = str;
    }

    @NotNull
    public final Drawable getSuccessBackgroundGradient$Tinder_release() {
        Drawable drawable = this.successBackgroundGradient;
        if (drawable == null) {
            C2668g.b("successBackgroundGradient");
        }
        return drawable;
    }

    public final void setSuccessBackgroundGradient$Tinder_release(@NotNull Drawable drawable) {
        C2668g.b(drawable, "<set-?>");
        this.successBackgroundGradient = drawable;
    }

    @NotNull
    public final Drawable getSuccessTapToViewIcon$Tinder_release() {
        Drawable drawable = this.successTapToViewIcon;
        if (drawable == null) {
            C2668g.b("successTapToViewIcon");
        }
        return drawable;
    }

    public final void setSuccessTapToViewIcon$Tinder_release(@NotNull Drawable drawable) {
        C2668g.b(drawable, "<set-?>");
        this.successTapToViewIcon = drawable;
    }

    @NotNull
    public final Drawable getErrorTapToViewIcon$Tinder_release() {
        Drawable drawable = this.errorTapToViewIcon;
        if (drawable == null) {
            C2668g.b("errorTapToViewIcon");
        }
        return drawable;
    }

    public final void setErrorTapToViewIcon$Tinder_release(@NotNull Drawable drawable) {
        C2668g.b(drawable, "<set-?>");
        this.errorTapToViewIcon = drawable;
    }
}
