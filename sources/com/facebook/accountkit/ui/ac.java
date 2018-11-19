package com.facebook.accountkit.ui;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKitUpdateResult.UpdateResult;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.UpdateFlowBroadcastReceiver;
import com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event;
import com.facebook.accountkit.internal.C1220c;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class ac extends UpdateFlowBroadcastReceiver {
    /* renamed from: g */
    private final WeakReference<AccountKitUpdateActivity> f9805g;
    /* renamed from: h */
    private final AccountKitConfiguration f9806h;
    /* renamed from: i */
    private final Map<UpdateFlowState, C1314f> f9807i = new HashMap();
    @Nullable
    /* renamed from: j */
    private C1314f f9808j;
    /* renamed from: k */
    private UpdateFlowState f9809k;

    ac(AccountKitUpdateActivity accountKitUpdateActivity, AccountKitConfiguration accountKitConfiguration) {
        this.f9805g = new WeakReference(accountKitUpdateActivity);
        this.f9806h = accountKitConfiguration;
        m12248a(UpdateFlowState.PHONE_NUMBER_INPUT);
    }

    @Nullable
    /* renamed from: b */
    C1314f m12253b() {
        return this.f9808j;
    }

    public void onReceive(Context context, Intent intent) {
        if (UpdateFlowBroadcastReceiver.f3151a.contentEquals(intent.getAction()) != null) {
            Event event = (Event) intent.getSerializableExtra(b);
            String stringExtra = intent.getStringExtra(d);
            switch (event) {
                case UPDATE_START:
                    PhoneNumber phoneNumber = (PhoneNumber) intent.getParcelableExtra(c);
                    m12248a(UpdateFlowState.SENDING_CODE);
                    C1220c.m4291a(phoneNumber, this.f9806h.getInitialAuthState());
                    break;
                case SENT_CODE:
                    m12248a(UpdateFlowState.SENT_CODE);
                    break;
                case SENT_CODE_COMPLETE:
                    m12248a(UpdateFlowState.CODE_INPUT);
                    break;
                case CONFIRMATION_CODE_COMPLETE:
                    m12248a(UpdateFlowState.VERIFYING_CODE);
                    C1220c.m4298b(intent.getStringExtra(e));
                    break;
                case ACCOUNT_UPDATE_COMPLETE:
                    m12248a(UpdateFlowState.VERIFIED);
                    context = intent.getStringExtra(f);
                    new Handler().postDelayed(new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ ac f3450b;

                        public void run() {
                            this.f3450b.m12251a(context);
                        }
                    }, DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
                    break;
                case ERROR_UPDATE:
                    m12249a(UpdateFlowState.PHONE_NUMBER_INPUT_ERROR, stringExtra);
                    break;
                case ERROR_CONFIRMATION_CODE:
                    m12249a(UpdateFlowState.CODE_INPUT_ERROR, stringExtra);
                    break;
                case RETRY_CONFIRMATION_CODE:
                    m12254c();
                    ((aa) this.f9808j).m16027a(true);
                    break;
                case RETRY:
                    m12254c();
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: c */
    void m12254c() {
        AccountKitUpdateActivity accountKitUpdateActivity = (AccountKitUpdateActivity) this.f9805g.get();
        if (accountKitUpdateActivity != null) {
            UpdateFlowState updateFlowState = this.f9809k;
            UpdateFlowState backState = UpdateFlowState.getBackState(updateFlowState);
            this.f9809k = backState;
            this.f9808j = m12252b(this.f9809k);
            switch (backState) {
                case NONE:
                    if (updateFlowState != UpdateFlowState.VERIFIED) {
                        accountKitUpdateActivity.m18738a();
                        break;
                    } else {
                        accountKitUpdateActivity.mo4067e();
                        break;
                    }
                case PHONE_NUMBER_INPUT:
                    C1220c.m4306g();
                    break;
                default:
                    break;
            }
            accountKitUpdateActivity.getFragmentManager().popBackStack();
            accountKitUpdateActivity.m18690b(this.f9808j);
        }
    }

    /* renamed from: a */
    private void m12251a(String str) {
        AccountKitUpdateActivity accountKitUpdateActivity = (AccountKitUpdateActivity) this.f9805g.get();
        if (accountKitUpdateActivity != null) {
            accountKitUpdateActivity.m18741a(str);
            accountKitUpdateActivity.m18739a(UpdateResult.SUCCESS);
            accountKitUpdateActivity.mo4067e();
        }
    }

    /* renamed from: a */
    private void m12248a(UpdateFlowState updateFlowState) {
        m12249a(updateFlowState, null);
    }

    /* renamed from: a */
    private void m12249a(UpdateFlowState updateFlowState, String str) {
        Activity activity = (AccountKitUpdateActivity) this.f9805g.get();
        if (activity != null) {
            this.f9809k = updateFlowState;
            C1314f b = m12253b();
            this.f9808j = m12252b(this.f9809k);
            if (this.f9808j != null) {
                if (b != this.f9808j) {
                    FragmentManager fragmentManager = activity.getFragmentManager();
                    if (b != null) {
                        b.mo1631b(activity);
                        if (b.mo1632h()) {
                            fragmentManager.popBackStack();
                        }
                    }
                    activity.m18740a(this.f9809k, this.f9808j);
                    if ((updateFlowState == UpdateFlowState.PHONE_NUMBER_INPUT_ERROR || updateFlowState == UpdateFlowState.CODE_INPUT_ERROR) && str != null) {
                        ((ab) this.f9808j).m16196a(str);
                    }
                }
            }
        }
    }

    @Nullable
    /* renamed from: b */
    private C1314f m12252b(UpdateFlowState updateFlowState) {
        C1314f c1314f = (C1314f) this.f9807i.get(updateFlowState);
        if (c1314f != null) {
            return c1314f;
        }
        switch (updateFlowState) {
            case NONE:
                return null;
            case PHONE_NUMBER_INPUT:
                c1314f = new C4349t(this.f9806h);
                break;
            case SENDING_CODE:
                c1314f = new C4130v(this.f9806h);
                break;
            case SENT_CODE:
                c1314f = new C4350u(this.f9806h);
                break;
            case CODE_INPUT:
                c1314f = new aa(this.f9806h);
                break;
            case VERIFYING_CODE:
                c1314f = new ae(this.f9806h);
                break;
            case VERIFIED:
                c1314f = new ad(this.f9806h);
                break;
            case CODE_INPUT_ERROR:
            case PHONE_NUMBER_INPUT_ERROR:
                c1314f = new ab(this.f9806h);
                break;
            default:
                return null;
        }
        this.f9807i.put(updateFlowState, c1314f);
        return c1314f;
    }
}
