package com.tinder.profile.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.profile.activities.ProfileInstagramAuthActivity;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomTextView;
import p000a.p001a.C0001a;

public class ProfileInstagramConnectView extends LinearLayout {
    @NonNull
    /* renamed from: a */
    private Source f45772a;
    @BindView(2131362746)
    CustomButton instagramLoginButton;
    @BindView(2131362747)
    CustomTextView instagramShareTextView;

    public ProfileInstagramConnectView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.instagram_connect_view, this);
        if (isInEditMode() == null) {
            ((ProfileComponentProvider) C14398a.m54830a(context)).provideComponent().inject(this);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ButterKnife.a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public void m55153a(@NonNull Source source) {
        this.f45772a = source;
    }

    @OnClick({2131362746})
    void onInstagramLoginClick() {
        switch (this.f45772a) {
            case REC:
            case FASTMATCH:
            case TOP_PICKS:
            case PLACES:
                m55152a(3);
                return;
            case MATCH:
                m55152a(2);
                return;
            case USER:
                m55152a(1);
                return;
            default:
                m55152a(0);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown Profile view Source: ");
                stringBuilder.append(this.f45772a);
                C0001a.e(stringBuilder.toString(), new Object[0]);
                return;
        }
    }

    /* renamed from: a */
    public void m55152a(int i) {
        Intent intent = new Intent(getContext(), ProfileInstagramAuthActivity.class);
        intent.putExtra("instagramConnectValue", i);
        intent.addFlags(537001984);
        Activity activity = (Activity) C14398a.m54830a(getContext());
        if (activity != null) {
            activity.startActivity(intent);
        }
    }
}
