package com.tinder.settings.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.tinder.R;
import com.tinder.base.ActivityBase;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.views.ShowMeView;

public class ShowMeActivity extends ActivityBase {
    /* renamed from: a */
    private Unbinder f59978a;
    @BindView(2131363578)
    ShowMeView mShowMe;
    @BindView(2131363824)
    Toolbar mToolbar;
    @BindString(2131821863)
    String mToolbarTitle;

    /* renamed from: a */
    public boolean m68658a() {
        return true;
    }

    /* renamed from: a */
    public static Intent m68655a(Context context) {
        return new Intent(context, ShowMeActivity.class);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_show_me);
        ManagerApp.e().inject(this);
        this.f59978a = ButterKnife.a(this);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.enter_left_to_right);
        m68656b();
    }

    public void onPause() {
        super.onPause();
        this.mShowMe.m62173a();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f59978a.unbind();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.exit_left_to_right, R.anim.exit_right_to_left);
    }

    /* renamed from: b */
    private void m68656b() {
        setSupportActionBar(this.mToolbar);
        getSupportActionBar().setTitle(this.mToolbarTitle);
        this.mToolbar.setNavigationOnClickListener(new C14856q(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m68657a(View view) {
        onBackPressed();
    }
}
