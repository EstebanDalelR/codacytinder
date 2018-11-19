package com.facebook.accountkit.ui;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.facebook.accountkit.AccountKitUpdateResult;
import com.facebook.accountkit.AccountKitUpdateResult.UpdateResult;
import com.facebook.accountkit.C1196d.C1191d;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.UpdateFlowBroadcastReceiver;
import com.facebook.accountkit.internal.C1220c;
import com.facebook.accountkit.ui.SkinManager.Skin;
import com.facebook.accountkit.ui.UIManager.UIManagerListener;

public final class AccountKitUpdateActivity extends C4461a implements UIManagerListener {
    /* renamed from: e */
    private static final IntentFilter f14885e = UpdateFlowBroadcastReceiver.m4129a();
    /* renamed from: f */
    private String f14886f;
    /* renamed from: g */
    private UpdateResult f14887g = UpdateResult.CANCELLED;
    /* renamed from: h */
    private ac f14888h;

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.c.setUIManagerListener(this);
        this.f14888h = new ac(this, this.b);
        C1220c.m4301c(this, bundle);
        C0436c.m1648a((Context) this).m1652a(this.f14888h, f14885e);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    protected void onPause() {
        super.onPause();
        C1314f b = this.f14888h.m12253b();
        if (b != null) {
            b.mo1631b((Activity) this);
        }
    }

    public void onBackPressed() {
        if (this.f14888h.m12253b() == null) {
            super.onBackPressed();
        } else {
            this.f14888h.m12254c();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        C1220c.m4303d(this, bundle);
        super.onSaveInstanceState(bundle);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C1314f b = this.f14888h.m12253b();
        if (b != null) {
            b.mo1629a(i, i2, intent);
        }
    }

    protected void onResume() {
        super.onResume();
        C1314f b = this.f14888h.m12253b();
        if (b != null) {
            b.mo1630a((Activity) this);
        }
    }

    protected void onDestroy() {
        C0436c.m1648a((Context) this).m1651a(this.f14888h);
        super.onDestroy();
        C1220c.m4296b((Activity) this);
    }

    public void onBack() {
        onBackPressed();
    }

    public void onCancel() {
        m18738a();
    }

    /* renamed from: e */
    void mo4067e() {
        m18737a(this.f14887g == UpdateResult.SUCCESS ? -1 : 0, new AccountKitUpdateResultImpl(this.f14886f, this.d, false));
    }

    /* renamed from: a */
    void m18738a() {
        m18737a(0, new AccountKitUpdateResultImpl(null, null, true));
    }

    /* renamed from: a */
    void m18741a(String str) {
        this.f14886f = str;
    }

    /* renamed from: a */
    void m18739a(UpdateResult updateResult) {
        this.f14887g = updateResult;
    }

    /* renamed from: a */
    void m18740a(UpdateFlowState updateFlowState, C1314f c1314f) {
        Fragment defaultHeaderFragment;
        Fragment defaultFooterFragment;
        Fragment f;
        Fragment e;
        Fragment b;
        int dimensionPixelSize;
        FragmentTransaction beginTransaction;
        if (updateFlowState != UpdateFlowState.CODE_INPUT_ERROR) {
            if (updateFlowState != UpdateFlowState.PHONE_NUMBER_INPUT_ERROR) {
                defaultHeaderFragment = BaseUIManager.getDefaultHeaderFragment(this.c, updateFlowState);
                updateFlowState = BaseUIManager.getDefaultBodyFragment(this.c, updateFlowState);
                defaultFooterFragment = BaseUIManager.getDefaultFooterFragment(this.c);
                f = c1314f.mo3263f();
                e = c1314f.mo3262e();
                b = c1314f.mo3259b();
                if (e != null) {
                    dimensionPixelSize = getResources().getDimensionPixelSize(C1191d.com_accountkit_vertical_spacer_small_height);
                    if (e instanceof TextContentFragment) {
                        TextContentFragment textContentFragment = (TextContentFragment) e;
                        textContentFragment.mo3966a(dimensionPixelSize);
                        textContentFragment.mo3968b(0);
                    }
                }
                m18690b(c1314f);
                beginTransaction = getFragmentManager().beginTransaction();
                m18689a(beginTransaction, C1192e.com_accountkit_header_fragment, defaultHeaderFragment);
                m18689a(beginTransaction, C1192e.com_accountkit_content_top_fragment, f);
                m18689a(beginTransaction, C1192e.com_accountkit_content_top_text_fragment, null);
                m18689a(beginTransaction, C1192e.com_accountkit_content_center_fragment, updateFlowState);
                m18689a(beginTransaction, C1192e.com_accountkit_content_bottom_text_fragment, e);
                if (ag.m4612a(this.c, Skin.CONTEMPORARY) == null) {
                    m18689a(beginTransaction, C1192e.com_accountkit_content_bottom_fragment, b);
                    m18689a(beginTransaction, C1192e.com_accountkit_footer_fragment, defaultFooterFragment);
                }
                beginTransaction.addToBackStack(null);
                ag.m4598a((Activity) this);
                beginTransaction.commit();
                c1314f.mo1630a((Activity) this);
            }
        }
        defaultHeaderFragment = c1314f.mo3272c();
        updateFlowState = BaseUIManager.getDefaultBodyFragment(this.c, updateFlowState);
        defaultFooterFragment = BaseUIManager.getDefaultFooterFragment(this.c);
        f = c1314f.mo3263f();
        e = c1314f.mo3262e();
        b = c1314f.mo3259b();
        if (e != null) {
            dimensionPixelSize = getResources().getDimensionPixelSize(C1191d.com_accountkit_vertical_spacer_small_height);
            if (e instanceof TextContentFragment) {
                TextContentFragment textContentFragment2 = (TextContentFragment) e;
                textContentFragment2.mo3966a(dimensionPixelSize);
                textContentFragment2.mo3968b(0);
            }
        }
        m18690b(c1314f);
        beginTransaction = getFragmentManager().beginTransaction();
        m18689a(beginTransaction, C1192e.com_accountkit_header_fragment, defaultHeaderFragment);
        m18689a(beginTransaction, C1192e.com_accountkit_content_top_fragment, f);
        m18689a(beginTransaction, C1192e.com_accountkit_content_top_text_fragment, null);
        m18689a(beginTransaction, C1192e.com_accountkit_content_center_fragment, updateFlowState);
        m18689a(beginTransaction, C1192e.com_accountkit_content_bottom_text_fragment, e);
        if (ag.m4612a(this.c, Skin.CONTEMPORARY) == null) {
            m18689a(beginTransaction, C1192e.com_accountkit_content_bottom_fragment, b);
            m18689a(beginTransaction, C1192e.com_accountkit_footer_fragment, defaultFooterFragment);
        }
        beginTransaction.addToBackStack(null);
        ag.m4598a((Activity) this);
        beginTransaction.commit();
        c1314f.mo1630a((Activity) this);
    }

    /* renamed from: a */
    private void m18737a(int i, AccountKitUpdateResultImpl accountKitUpdateResultImpl) {
        Intent intent = new Intent();
        intent.putExtra(AccountKitUpdateResult.RESULT_KEY, accountKitUpdateResultImpl);
        setResult(i, intent);
        finish();
    }
}
