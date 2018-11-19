package com.tinder.profile.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.res.C0441a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.common.p076a.C2640a;
import com.tinder.deadshot.Deadshot;
import com.tinder.overflow.analytics.RecommendProfileBroadcastReceiver;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.ProfileShareAction;
import com.tinder.profile.model.ProfileShareSource;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.p363b.C16093z;
import com.tinder.profile.p363b.aj.C14373a;
import com.tinder.profile.p365d.C14398a;
import com.tinder.profile.presenter.ax;
import com.tinder.profile.target.ProfileRecommendToFriendTarget;
import com.tinder.utils.at;
import com.tinder.views.CustomTextView;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;

public class ProfileRecommendToFriendView extends FrameLayout implements ProfileRecommendToFriendTarget {
    @Inject
    /* renamed from: a */
    ax f50282a;
    @Inject
    /* renamed from: b */
    C16093z f50283b;
    @BindString(2131821712)
    String recommendFriendTextTemplate;
    @BindView(2131363403)
    ViewGroup recommendToFriendTextGroup;
    @BindView(2131363643)
    ProgressBar spinner;
    @BindView(2131363400)
    CustomTextView textRecommendSubTitle;
    @BindView(2131363401)
    CustomTextView textRecommendTitle;

    public ProfileRecommendToFriendView(Context context) {
        this(context, null);
    }

    public ProfileRecommendToFriendView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() == null) {
            ((ProfileComponentProvider) C14398a.m54830a(context)).provideComponent().inject(this);
        }
        inflate(context, R.layout.recommend_to_friend_view, this);
        ButterKnife.a(this, this);
        this.spinner.setVisibility(8);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Deadshot.take(this, this.f50282a);
    }

    /* renamed from: a */
    public void m61038a(@NonNull Profile profile, ProfileScreenSource profileScreenSource) {
        Deadshot.take(this, this.f50282a);
        this.f50282a.m55012a(this.recommendFriendTextTemplate, profile.mo11653c());
        this.f50282a.m55008a(profileScreenSource);
        setOnClickListener(new C14455s(this, profile));
    }

    /* renamed from: a */
    final /* synthetic */ void m61037a(@NonNull Profile profile, View view) {
        if (this.spinner.getVisibility() == 8) {
            this.spinner.setVisibility(0);
            this.f50282a.m55009a(profile);
        }
    }

    public void setTitle(String str) {
        this.textRecommendTitle.setText(str);
    }

    public void setSubTitle(String str) {
        this.textRecommendSubTitle.setText(str);
    }

    public void setSubTitleVisibility(boolean z) {
        this.textRecommendSubTitle.setVisibility(z ? false : true);
    }

    public void setColorFilter(@ColorRes int i) {
        i = C0441a.b(getResources(), i, null);
        this.textRecommendTitle.setTextColor(i);
        this.textRecommendSubTitle.setTextColor(i);
    }

    public void startShareRecIntent(String str, Profile profile, ProfileShareSource profileShareSource, ProfileShareAction profileShareAction) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.f50283b.m60896a(profile.mo11651a()).subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C16165t(this, intent, profile, profileShareSource, profileShareAction), C16167u.f50358a);
    }

    /* renamed from: a */
    final /* synthetic */ void m61036a(Intent intent, Profile profile, ProfileShareSource profileShareSource, ProfileShareAction profileShareAction, String str) throws Exception {
        if (VERSION.SDK_INT >= 22) {
            m61034a(getContext(), intent, (String) C2640a.a(str), profile, profileShareSource, profileShareAction);
            return;
        }
        m61035b(getContext(), intent, (String) C2640a.a(str), profile, profileShareSource, profileShareAction);
    }

    public void showUserHasSharingDisabledError() {
        if (getContext() instanceof Activity) {
            at.m57644b((Activity) getContext(), (int) R.string.cannot_share_rec);
        }
    }

    public void showGenericError() {
        if (getContext() instanceof Activity) {
            at.m57638a((Activity) getContext(), (int) R.string.reported_warning_accept_agreement_error);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void setShareComplete() {
        this.spinner.setVisibility(8);
        this.recommendToFriendTextGroup.setVisibility(0);
    }

    public void setShareInProgress() {
        this.spinner.setVisibility(0);
        this.recommendToFriendTextGroup.setVisibility(4);
    }

    @RequiresApi(api = 22)
    /* renamed from: a */
    private void m61034a(Context context, Intent intent, String str, Profile profile, ProfileShareSource profileShareSource, ProfileShareAction profileShareAction) {
        new RecommendProfileBroadcastReceiver().a(context, intent, profile.mo11652b().trim().replace(",", ""), str, profile.mo11651a(), profileShareSource, profileShareAction, profile);
    }

    /* renamed from: b */
    private void m61035b(Context context, Intent intent, String str, Profile profile, ProfileShareSource profileShareSource, ProfileShareAction profileShareAction) {
        String replace = profile.mo11652b().trim().replace(",", "");
        context.startActivity(Intent.createChooser(intent, String.format(context.getString(R.string.share_sheet_title), new Object[]{replace})));
        this.f50282a.m55010a(profile, new C14373a("N/A", true, str, profileShareSource, profileShareAction));
    }
}
