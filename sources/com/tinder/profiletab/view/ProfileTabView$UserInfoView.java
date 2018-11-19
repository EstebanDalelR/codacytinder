package com.tinder.profiletab.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.Transformation;
import com.tinder.R;
import com.tinder.common.p192e.p193a.C10659a.C8531a;
import com.tinder.profiletab.p370d.C14470b;
import com.tinder.utils.au;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\r\u0010\u001e\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020\u001bH\u0001¢\u0006\u0002\b!J\r\u0010\"\u001a\u00020\u001bH\u0001¢\u0006\u0002\b#J\r\u0010$\u001a\u00020\u001bH\u0001¢\u0006\u0002\b%J\u0010\u0010&\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0015\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0018\u0010\u0010¨\u0006("}, d2 = {"Lcom/tinder/profiletab/view/ProfileTabView$UserInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "avatarView", "Landroid/widget/ImageView;", "getAvatarView", "()Landroid/widget/ImageView;", "avatarView$delegate", "Lkotlin/Lazy;", "jobView", "Landroid/widget/TextView;", "getJobView", "()Landroid/widget/TextView;", "jobView$delegate", "listener", "Lcom/tinder/profiletab/view/ProfileTabView$UserInfoView$Listener;", "nameAgeView", "getNameAgeView", "nameAgeView$delegate", "schoolPassportingView", "getSchoolPassportingView", "schoolPassportingView$delegate", "bindModel", "", "viewModel", "Lcom/tinder/profiletab/viewmodel/UserInfoViewModel;", "onAvatarClick", "onAvatarClick$Tinder_release", "onEditButtonClick", "onEditButtonClick$Tinder_release", "onMediaButtonClick", "onMediaButtonClick$Tinder_release", "onSettingsButtonClick", "onSettingsButtonClick$Tinder_release", "setListener", "Listener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileTabView$UserInfoView extends LinearLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f45850a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ProfileTabView$UserInfoView.class), "avatarView", "getAvatarView()Landroid/widget/ImageView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ProfileTabView$UserInfoView.class), "nameAgeView", "getNameAgeView()Landroid/widget/TextView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ProfileTabView$UserInfoView.class), "jobView", "getJobView()Landroid/widget/TextView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ProfileTabView$UserInfoView.class), "schoolPassportingView", "getSchoolPassportingView()Landroid/widget/TextView;"))};
    /* renamed from: b */
    private final Lazy f45851b = C15810e.m59832a(LazyThreadSafetyMode.NONE, new ProfileTabView$UserInfoView$$special$$inlined$bindView$1(this, R.id.profile_tab_user_info_avatar));
    /* renamed from: c */
    private final Lazy f45852c = C15810e.m59832a(LazyThreadSafetyMode.NONE, new ProfileTabView$UserInfoView$$special$$inlined$bindView$2(this, R.id.profile_tab_user_info_name_age));
    /* renamed from: d */
    private final Lazy f45853d = C15810e.m59832a(LazyThreadSafetyMode.NONE, new ProfileTabView$UserInfoView$$special$$inlined$bindView$3(this, R.id.profile_tab_user_info_job));
    /* renamed from: e */
    private final Lazy f45854e = C15810e.m59832a(LazyThreadSafetyMode.NONE, new ProfileTabView$UserInfoView$$special$$inlined$bindView$4(this, R.id.profile_tab_info_school_passporting));
    /* renamed from: f */
    private Listener f45855f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/profiletab/view/ProfileTabView$UserInfoView$Listener;", "", "onAvatarClick", "", "onEditButtonClick", "onMediaButtonClick", "onSettingsButtonClick", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.view.ProfileTabView$UserInfoView$Listener */
    public interface Listener {
        void onAvatarClick();

        void onEditButtonClick();

        void onMediaButtonClick();

        void onSettingsButtonClick();
    }

    private final ImageView getAvatarView() {
        Lazy lazy = this.f45851b;
        KProperty kProperty = f45850a[0];
        return (ImageView) lazy.getValue();
    }

    private final TextView getJobView() {
        Lazy lazy = this.f45853d;
        KProperty kProperty = f45850a[2];
        return (TextView) lazy.getValue();
    }

    private final TextView getNameAgeView() {
        Lazy lazy = this.f45852c;
        KProperty kProperty = f45850a[1];
        return (TextView) lazy.getValue();
    }

    private final TextView getSchoolPassportingView() {
        Lazy lazy = this.f45854e;
        KProperty kProperty = f45850a[3];
        return (TextView) lazy.getValue();
    }

    public ProfileTabView$UserInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        setOrientation(1);
        View.inflate(context, R.layout.profile_tab_user_info_merge, this);
        ButterKnife.a(this);
    }

    /* renamed from: a */
    public final void m55296a(@NotNull C14470b c14470b) {
        Object obj;
        String d;
        CharSequence charSequence;
        C2668g.b(c14470b, "viewModel");
        RequestManager b = C0994i.b(getContext());
        int a = (int) au.m57647a((View) this, (int) R.dimen.profile_tab_user_avatar);
        Drawable b2 = au.m57651b(this, R.drawable.profile_tab_ic_plane);
        int c = au.m57652c(this, 17170444);
        int c2 = au.m57652c(this, R.color.profile_tab_passporting_color);
        if (c14470b.mo11801c() != null) {
            b.a(c14470b.mo11801c()).a(new Transformation[]{new C8531a(getContext()).a().b()}).a(a, a).a(getAvatarView());
        } else {
            b.a(Integer.valueOf(R.drawable.ic_match_placeholder)).l().a(getAvatarView());
        }
        getNameAgeView().setText(c14470b.mo11800b());
        CharSequence e = c14470b.mo11803e();
        if (e != null) {
            if (!C19296q.m68673a(e)) {
                obj = null;
                if (obj != null) {
                    getJobView().setVisibility(0);
                    getJobView().setText(e);
                } else {
                    getJobView().setVisibility(8);
                }
                d = c14470b.mo11802d();
                c14470b = c14470b.mo11804f();
                charSequence = d;
                if (charSequence != null) {
                    if (C19296q.m68673a(charSequence)) {
                        obj = null;
                        if (obj != null) {
                            charSequence = (CharSequence) c14470b;
                            if (charSequence != null) {
                                if (!C19296q.m68673a(charSequence)) {
                                    obj = null;
                                    if (obj != null) {
                                        getSchoolPassportingView().setVisibility(8);
                                        return;
                                    }
                                }
                            }
                            obj = 1;
                            if (obj != null) {
                                getSchoolPassportingView().setVisibility(8);
                                return;
                            }
                        }
                        getSchoolPassportingView().setVisibility(0);
                        a = TextUtils.isEmpty((CharSequence) c14470b) ^ 1;
                        if (a != 0) {
                            c = c2;
                        }
                        if (a == 0) {
                            c14470b = d;
                        }
                        if (a == 0) {
                            b2 = null;
                        }
                        getSchoolPassportingView().setTextColor(c);
                        getSchoolPassportingView().setText((CharSequence) c14470b);
                        getSchoolPassportingView().setCompoundDrawablesWithIntrinsicBounds(b2, null, null, null);
                    }
                }
                obj = 1;
                if (obj != null) {
                    charSequence = (CharSequence) c14470b;
                    if (charSequence != null) {
                        if (!C19296q.m68673a(charSequence)) {
                            obj = null;
                            if (obj != null) {
                                getSchoolPassportingView().setVisibility(8);
                                return;
                            }
                        }
                    }
                    obj = 1;
                    if (obj != null) {
                        getSchoolPassportingView().setVisibility(8);
                        return;
                    }
                }
                getSchoolPassportingView().setVisibility(0);
                a = TextUtils.isEmpty((CharSequence) c14470b) ^ 1;
                if (a != 0) {
                    c = c2;
                }
                if (a == 0) {
                    c14470b = d;
                }
                if (a == 0) {
                    b2 = null;
                }
                getSchoolPassportingView().setTextColor(c);
                getSchoolPassportingView().setText((CharSequence) c14470b);
                getSchoolPassportingView().setCompoundDrawablesWithIntrinsicBounds(b2, null, null, null);
            }
        }
        obj = 1;
        if (obj != null) {
            getJobView().setVisibility(8);
        } else {
            getJobView().setVisibility(0);
            getJobView().setText(e);
        }
        d = c14470b.mo11802d();
        c14470b = c14470b.mo11804f();
        charSequence = d;
        if (charSequence != null) {
            if (C19296q.m68673a(charSequence)) {
                obj = null;
                if (obj != null) {
                    charSequence = (CharSequence) c14470b;
                    if (charSequence != null) {
                        if (!C19296q.m68673a(charSequence)) {
                            obj = null;
                            if (obj != null) {
                                getSchoolPassportingView().setVisibility(8);
                                return;
                            }
                        }
                    }
                    obj = 1;
                    if (obj != null) {
                        getSchoolPassportingView().setVisibility(8);
                        return;
                    }
                }
                getSchoolPassportingView().setVisibility(0);
                a = TextUtils.isEmpty((CharSequence) c14470b) ^ 1;
                if (a != 0) {
                    c = c2;
                }
                if (a == 0) {
                    c14470b = d;
                }
                if (a == 0) {
                    b2 = null;
                }
                getSchoolPassportingView().setTextColor(c);
                getSchoolPassportingView().setText((CharSequence) c14470b);
                getSchoolPassportingView().setCompoundDrawablesWithIntrinsicBounds(b2, null, null, null);
            }
        }
        obj = 1;
        if (obj != null) {
            charSequence = (CharSequence) c14470b;
            if (charSequence != null) {
                if (!C19296q.m68673a(charSequence)) {
                    obj = null;
                    if (obj != null) {
                        getSchoolPassportingView().setVisibility(8);
                        return;
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                getSchoolPassportingView().setVisibility(8);
                return;
            }
        }
        getSchoolPassportingView().setVisibility(0);
        a = TextUtils.isEmpty((CharSequence) c14470b) ^ 1;
        if (a != 0) {
            c = c2;
        }
        if (a == 0) {
            c14470b = d;
        }
        if (a == 0) {
            b2 = null;
        }
        getSchoolPassportingView().setTextColor(c);
        getSchoolPassportingView().setText((CharSequence) c14470b);
        getSchoolPassportingView().setCompoundDrawablesWithIntrinsicBounds(b2, null, null, null);
    }

    public final void setListener(@Nullable Listener listener) {
        this.f45855f = listener;
    }

    @OnClick({2131363322})
    public final void onAvatarClick$Tinder_release() {
        Listener listener = this.f45855f;
        if (listener != null) {
            listener.onAvatarClick();
        }
    }

    @OnClick({2131363323})
    public final void onEditButtonClick$Tinder_release() {
        Listener listener = this.f45855f;
        if (listener != null) {
            listener.onEditButtonClick();
        }
    }

    @OnClick({2131363327})
    public final void onSettingsButtonClick$Tinder_release() {
        Listener listener = this.f45855f;
        if (listener != null) {
            listener.onSettingsButtonClick();
        }
    }

    @OnClick({2131363325})
    public final void onMediaButtonClick$Tinder_release() {
        Listener listener = this.f45855f;
        if (listener != null) {
            listener.onMediaButtonClick();
        }
    }
}
