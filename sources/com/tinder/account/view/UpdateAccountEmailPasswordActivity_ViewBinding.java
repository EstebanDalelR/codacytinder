package com.tinder.account.view;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.base.view.LockableViewPager;

public class UpdateAccountEmailPasswordActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private UpdateAccountEmailPasswordActivity f26173b;
    /* renamed from: c */
    private View f26174c;
    /* renamed from: d */
    private OnPageChangeListener f26175d;
    /* renamed from: e */
    private View f26176e;

    @UiThread
    public UpdateAccountEmailPasswordActivity_ViewBinding(final UpdateAccountEmailPasswordActivity updateAccountEmailPasswordActivity, View view) {
        this.f26173b = updateAccountEmailPasswordActivity;
        View a = C0761c.a(view, R.id.update_account_view_pager, "field 'viewPager' and method 'onPageSelected'");
        updateAccountEmailPasswordActivity.viewPager = (LockableViewPager) C0761c.c(a, R.id.update_account_view_pager, "field 'viewPager'", LockableViewPager.class);
        this.f26174c = a;
        this.f26175d = new OnPageChangeListener(this) {
            /* renamed from: b */
            final /* synthetic */ UpdateAccountEmailPasswordActivity_ViewBinding f26170b;

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                updateAccountEmailPasswordActivity.onPageSelected(i);
            }
        };
        ((ViewPager) a).addOnPageChangeListener(this.f26175d);
        updateAccountEmailPasswordActivity.titleTextView = (TextView) C0761c.b(view, R.id.update_account_title, "field 'titleTextView'", TextView.class);
        a = C0761c.a(view, R.id.update_account_action_button, "field 'actionButton' and method 'onActionButtonClicked'");
        updateAccountEmailPasswordActivity.actionButton = (Button) C0761c.c(a, R.id.update_account_action_button, "field 'actionButton'", Button.class);
        this.f26176e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ UpdateAccountEmailPasswordActivity_ViewBinding f26172b;

            public void doClick(View view) {
                updateAccountEmailPasswordActivity.onActionButtonClicked();
            }
        });
        updateAccountEmailPasswordActivity.toolbar = (Toolbar) C0761c.b(view, R.id.update_account_toolbar, "field 'toolbar'", Toolbar.class);
        view = view.getContext();
        Resources resources = view.getResources();
        updateAccountEmailPasswordActivity.navIconColor = C0432b.c(view, R.color.onboarding_cancel_button_color);
        updateAccountEmailPasswordActivity.closeIcon = C0432b.a(view, R.drawable.ic_close_48dp);
        updateAccountEmailPasswordActivity.loadingString = resources.getString(R.string.mad_ave_loading);
    }

    @CallSuper
    public void unbind() {
        UpdateAccountEmailPasswordActivity updateAccountEmailPasswordActivity = this.f26173b;
        if (updateAccountEmailPasswordActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26173b = null;
        updateAccountEmailPasswordActivity.viewPager = null;
        updateAccountEmailPasswordActivity.titleTextView = null;
        updateAccountEmailPasswordActivity.actionButton = null;
        updateAccountEmailPasswordActivity.toolbar = null;
        ((ViewPager) this.f26174c).removeOnPageChangeListener(this.f26175d);
        this.f26175d = null;
        this.f26174c = null;
        this.f26176e.setOnClickListener(null);
        this.f26176e = null;
    }
}
