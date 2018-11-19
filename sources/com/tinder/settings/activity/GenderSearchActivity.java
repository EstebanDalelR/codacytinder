package com.tinder.settings.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.tinder.R;
import com.tinder.base.ActivityBase;
import com.tinder.dialogs.DialogError;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.presenter.C18074m;
import com.tinder.settings.targets.MoreGenderSearchTarget;
import com.tinder.settings.views.GenderSearchView;
import com.tinder.settings.views.GenderSearchView.OnGenderSelectedListener;
import com.tinder.utils.ad;
import javax.inject.Inject;

public class GenderSearchActivity extends ActivityBase implements MoreGenderSearchTarget, OnGenderSelectedListener {
    @Inject
    /* renamed from: a */
    C18074m f59974a;
    /* renamed from: b */
    private Unbinder f59975b;
    /* renamed from: c */
    private boolean f59976c;
    /* renamed from: d */
    private String f59977d;
    @BindView(2131362969)
    GenderSearchView mSearchView;

    /* renamed from: a */
    public static Intent m68648a(Context context) {
        return new Intent(context, GenderSearchActivity.class);
    }

    /* renamed from: a */
    public static Intent m68649a(Context context, boolean z) {
        context = m68648a(context);
        context.putExtra("onboarding", z);
        return context;
    }

    protected void onCreate(Bundle bundle) {
        ad.a();
        super.onCreate(bundle);
        setContentView(R.layout.activity_more_gender_search);
        ManagerApp.e().inject(this);
        this.f59975b = ButterKnife.a(this);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.enter_left_to_right);
        this.mSearchView.setListener(this);
        this.f59976c = getIntent().getBooleanExtra("onboarding", false);
    }

    protected void onStart() {
        super.onStart();
        this.f59974a.a(this);
    }

    protected void onStop() {
        super.onStop();
        this.f59974a.a();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.exit_left_to_right, R.anim.exit_right_to_left);
    }

    public void onPause() {
        super.onPause();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f59975b.unbind();
    }

    public void moreGenderSelected(@Nullable String str) {
        this.f59977d = str;
        if (this.f59976c) {
            m68651b();
        } else {
            this.f59974a.m65588a(str);
        }
    }

    public void saveMoreGenderSuccess() {
        m68651b();
    }

    public void saveMoreGenderError() {
        DialogError dialogError = new DialogError(this, R.string.oops, R.string.more_gender_invalid_char_error);
        dialogError.setOnDismissListener(C14848g.f46481a);
        dialogError.show();
    }

    /* renamed from: b */
    private void m68651b() {
        Intent intent = new Intent();
        intent.putExtra("gender", this.f59977d);
        setResult(-1, intent);
        finish();
    }
}
