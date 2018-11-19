package com.tinder.profile.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.dialogs.C8858i;
import com.tinder.dialogs.C8858i.C8857a;
import com.tinder.managers.ManagerApp;
import com.tinder.profile.presenter.C14426e;
import com.tinder.profile.target.BitmojiAuthTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020,H\u0016J\b\u0010.\u001a\u00020,H\u0014J\r\u0010/\u001a\u00020,H\u0001¢\u0006\u0002\b0J\b\u00101\u001a\u00020,H\u0014J\b\u00102\u001a\u00020,H\u0016J\b\u00103\u001a\u00020,H\u0016J\b\u00104\u001a\u00020,H\u0016J\b\u00105\u001a\u00020,H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020\u001b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u00020\u001b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u0012\u0010(\u001a\u00020)8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010*\u001a\u00020)8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/tinder/profile/view/ProfileBitmojiAuthView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/profile/target/BitmojiAuthTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bitmojiAuthPresenter", "Lcom/tinder/profile/presenter/BitmojiAuthPresenter;", "getBitmojiAuthPresenter$Tinder_release", "()Lcom/tinder/profile/presenter/BitmojiAuthPresenter;", "setBitmojiAuthPresenter$Tinder_release", "(Lcom/tinder/profile/presenter/BitmojiAuthPresenter;)V", "bitmojiButton", "Landroid/support/constraint/ConstraintLayout;", "getBitmojiButton$Tinder_release", "()Landroid/support/constraint/ConstraintLayout;", "setBitmojiButton$Tinder_release", "(Landroid/support/constraint/ConstraintLayout;)V", "bitmojiKeyboardString", "", "getBitmojiKeyboardString$Tinder_release", "()Ljava/lang/String;", "setBitmojiKeyboardString$Tinder_release", "(Ljava/lang/String;)V", "bitmojiTitle", "Landroid/widget/TextView;", "getBitmojiTitle$Tinder_release", "()Landroid/widget/TextView;", "setBitmojiTitle$Tinder_release", "(Landroid/widget/TextView;)V", "connectTextBitmoji", "getConnectTextBitmoji$Tinder_release", "setConnectTextBitmoji$Tinder_release", "disconnectDialog", "Lcom/tinder/dialogs/DialogBinaryBase;", "disconnectTextBitmoji", "getDisconnectTextBitmoji$Tinder_release", "setDisconnectTextBitmoji$Tinder_release", "instagramLoggedInNameColor", "", "tinderRedColor", "hideBitmojiContainer", "", "navigateToMatchList", "onAttachedToWindow", "onBitmojiAuthClick", "onBitmojiAuthClick$Tinder_release", "onDetachedFromWindow", "showBitmojiConnected", "showBitmojiContainer", "showBitmojiDisconnectDialog", "showBitmojiDisconnected", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileBitmojiAuthView extends LinearLayout implements BitmojiAuthTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14426e f50251a;
    /* renamed from: b */
    private C8858i f50252b;
    @NotNull
    @BindView(2131361933)
    public ConstraintLayout bitmojiButton;
    @BindString(2131820644)
    @NotNull
    public String bitmojiKeyboardString;
    @NotNull
    @BindView(2131361941)
    public TextView bitmojiTitle;
    @NotNull
    @BindView(2131362196)
    public TextView connectTextBitmoji;
    @NotNull
    @BindView(2131362328)
    public TextView disconnectTextBitmoji;
    @BindColor(2131099974)
    @JvmField
    public int instagramLoggedInNameColor;
    @BindColor(2131100253)
    @JvmField
    public int tinderRedColor;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/tinder/profile/view/ProfileBitmojiAuthView$showBitmojiDisconnectDialog$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.ProfileBitmojiAuthView$a */
    static final class C14444a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ProfileBitmojiAuthView f45769a;

        C14444a(ProfileBitmojiAuthView profileBitmojiAuthView) {
            this.f45769a = profileBitmojiAuthView;
        }

        public final void onClick(View view) {
            this.f45769a.getBitmojiAuthPresenter$Tinder_release().m55071h();
            view = this.f45769a.f50252b;
            if (view != null) {
                view.dismiss();
            }
        }
    }

    public ProfileBitmojiAuthView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        attributeSet = ManagerApp.a(context);
        C2668g.a(attributeSet, "ManagerApp.from(context)");
        attributeSet.h().inject(this);
        View.inflate(context, R.layout.view_bitmoji_auth, this);
        ButterKnife.a(this);
    }

    @NotNull
    public final TextView getBitmojiTitle$Tinder_release() {
        TextView textView = this.bitmojiTitle;
        if (textView == null) {
            C2668g.b("bitmojiTitle");
        }
        return textView;
    }

    public final void setBitmojiTitle$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.bitmojiTitle = textView;
    }

    @NotNull
    public final TextView getConnectTextBitmoji$Tinder_release() {
        TextView textView = this.connectTextBitmoji;
        if (textView == null) {
            C2668g.b("connectTextBitmoji");
        }
        return textView;
    }

    public final void setConnectTextBitmoji$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.connectTextBitmoji = textView;
    }

    @NotNull
    public final TextView getDisconnectTextBitmoji$Tinder_release() {
        TextView textView = this.disconnectTextBitmoji;
        if (textView == null) {
            C2668g.b("disconnectTextBitmoji");
        }
        return textView;
    }

    public final void setDisconnectTextBitmoji$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.disconnectTextBitmoji = textView;
    }

    @NotNull
    public final ConstraintLayout getBitmojiButton$Tinder_release() {
        ConstraintLayout constraintLayout = this.bitmojiButton;
        if (constraintLayout == null) {
            C2668g.b("bitmojiButton");
        }
        return constraintLayout;
    }

    public final void setBitmojiButton$Tinder_release(@NotNull ConstraintLayout constraintLayout) {
        C2668g.b(constraintLayout, "<set-?>");
        this.bitmojiButton = constraintLayout;
    }

    @NotNull
    public final String getBitmojiKeyboardString$Tinder_release() {
        String str = this.bitmojiKeyboardString;
        if (str == null) {
            C2668g.b("bitmojiKeyboardString");
        }
        return str;
    }

    public final void setBitmojiKeyboardString$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.bitmojiKeyboardString = str;
    }

    @NotNull
    public final C14426e getBitmojiAuthPresenter$Tinder_release() {
        C14426e c14426e = this.f50251a;
        if (c14426e == null) {
            C2668g.b("bitmojiAuthPresenter");
        }
        return c14426e;
    }

    public final void setBitmojiAuthPresenter$Tinder_release(@NotNull C14426e c14426e) {
        C2668g.b(c14426e, "<set-?>");
        this.f50251a = c14426e;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14426e c14426e = this.f50251a;
        if (c14426e == null) {
            C2668g.b("bitmojiAuthPresenter");
        }
        Deadshot.take(this, c14426e);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void showBitmojiConnected() {
        TextView textView = this.disconnectTextBitmoji;
        if (textView == null) {
            C2668g.b("disconnectTextBitmoji");
        }
        textView.setVisibility(0);
        textView = this.connectTextBitmoji;
        if (textView == null) {
            C2668g.b("connectTextBitmoji");
        }
        String str = this.bitmojiKeyboardString;
        if (str == null) {
            C2668g.b("bitmojiKeyboardString");
        }
        textView.setText(str);
        textView = this.connectTextBitmoji;
        if (textView == null) {
            C2668g.b("connectTextBitmoji");
        }
        textView.setTextColor(this.instagramLoggedInNameColor);
    }

    public void showBitmojiDisconnected() {
        TextView textView = this.disconnectTextBitmoji;
        if (textView == null) {
            C2668g.b("disconnectTextBitmoji");
        }
        textView.setVisibility(8);
        textView = this.connectTextBitmoji;
        if (textView == null) {
            C2668g.b("connectTextBitmoji");
        }
        textView.setText(R.string.bitmoji_connect);
        textView = this.connectTextBitmoji;
        if (textView == null) {
            C2668g.b("connectTextBitmoji");
        }
        textView.setTextColor(this.tinderRedColor);
    }

    public void showBitmojiContainer() {
        setVisibility(0);
    }

    public void hideBitmojiContainer() {
        setVisibility(8);
    }

    public void showBitmojiDisconnectDialog() {
        C8858i c8858i = this.f50252b;
        if (c8858i != null) {
            c8858i.dismiss();
        }
        c8858i = new C8857a(getContext()).a(R.string.bitmoji_disconnect_dialog_title).b(R.string.bitmoji_disconnect_dialog_content).a();
        c8858i.b(R.string.ok, new C14444a(this));
        this.f50252b = c8858i;
        c8858i = this.f50252b;
        if (c8858i != null) {
            c8858i.show();
        }
    }

    public void navigateToMatchList() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("tinder://messagesfeed"));
        getContext().startActivity(intent);
    }

    @OnClick({2131361933})
    public final void onBitmojiAuthClick$Tinder_release() {
        C14426e c14426e = this.f50251a;
        if (c14426e == null) {
            C2668g.b("bitmojiAuthPresenter");
        }
        c14426e.m55070g();
    }
}
