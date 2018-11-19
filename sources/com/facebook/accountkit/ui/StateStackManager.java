package com.facebook.accountkit.ui;

import android.app.Activity;
import android.app.FragmentManager.OnBackStackChangedListener;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.ui.AdvancedUIManager.AdvancedUIManagerListener;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.UIManager.UIManagerListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class StateStackManager implements OnBackStackChangedListener, AdvancedUIManagerListener, UIManagerListener {
    /* renamed from: a */
    private final WeakReference<AccountKitActivity> f13059a;
    /* renamed from: b */
    private final UIManager f13060b;
    /* renamed from: c */
    private final AccountKitConfiguration f13061c;
    /* renamed from: d */
    private C1314f f13062d;
    /* renamed from: e */
    private final Map<LoginFlowState, C1314f> f13063e = new HashMap();
    /* renamed from: f */
    private final List<C1304a> f13064f = new ArrayList();
    /* renamed from: g */
    private final List<C1305b> f13065g = new ArrayList();

    private enum FragmentType {
        BODY,
        FOOTER,
        HEADER
    }

    /* renamed from: com.facebook.accountkit.ui.StateStackManager$a */
    interface C1304a {
        /* renamed from: a */
        void mo1593a();
    }

    /* renamed from: com.facebook.accountkit.ui.StateStackManager$b */
    interface C1305b {
        /* renamed from: a */
        void mo1607a();

        /* renamed from: a */
        void mo1608a(C1314f c1314f);
    }

    StateStackManager(AccountKitActivity accountKitActivity, AccountKitConfiguration accountKitConfiguration) {
        this.f13059a = new WeakReference(accountKitActivity);
        accountKitActivity.getFragmentManager().addOnBackStackChangedListener(this);
        this.f13061c = accountKitConfiguration;
        if (accountKitConfiguration == null) {
            accountKitActivity = null;
        } else {
            accountKitActivity = accountKitConfiguration.getUIManager();
        }
        this.f13060b = accountKitActivity;
        if ((this.f13060b instanceof AdvancedUIManagerWrapper) != null) {
            ((AdvancedUIManagerWrapper) this.f13060b).getAdvancedUIManager().setAdvancedUIManagerListener(this);
        } else if (this.f13060b != null) {
            this.f13060b.setUIManagerListener(this);
        }
    }

    public void onBack() {
        AccountKitActivity accountKitActivity = (AccountKitActivity) this.f13059a.get();
        if (accountKitActivity != null) {
            accountKitActivity.onBackPressed();
        }
    }

    public void onBackStackChanged() {
        AccountKitActivity accountKitActivity = (AccountKitActivity) this.f13059a.get();
        if (accountKitActivity != null) {
            m16116a(accountKitActivity);
        }
    }

    public void onCancel() {
        AccountKitActivity accountKitActivity = (AccountKitActivity) this.f13059a.get();
        if (accountKitActivity != null) {
            accountKitActivity.m18735d();
        }
    }

    @Nullable
    /* renamed from: a */
    C1314f m16115a() {
        return this.f13062d;
    }

    /* renamed from: a */
    void m16119a(LoginFlowState loginFlowState, @Nullable C1304a c1304a) {
        AccountKitActivity accountKitActivity = (AccountKitActivity) this.f13059a.get();
        if (accountKitActivity != null) {
            if (c1304a != null) {
                this.f13064f.add(c1304a);
            }
            c1304a = m16111a(accountKitActivity, loginFlowState, LoginFlowState.NONE, false);
            if (loginFlowState != LoginFlowState.PHONE_NUMBER_INPUT) {
                if (loginFlowState != LoginFlowState.EMAIL_INPUT) {
                    accountKitActivity.getFragmentManager().popBackStack();
                    accountKitActivity.m18690b(c1304a);
                }
            }
            accountKitActivity.getFragmentManager().popBackStack(0, 0);
            accountKitActivity.m18690b(c1304a);
        }
    }

    /* renamed from: a */
    void m16120a(C1304a c1304a) {
        AccountKitActivity accountKitActivity = (AccountKitActivity) this.f13059a.get();
        if (accountKitActivity != null) {
            if (c1304a != null) {
                this.f13064f.add(c1304a);
            }
            accountKitActivity.getFragmentManager().popBackStack();
            accountKitActivity.m18690b(null);
        }
    }

    /* renamed from: a */
    void m16117a(AccountKitActivity accountKitActivity, LoginFlowManager loginFlowManager, LoginFlowState loginFlowState, AccountKitError accountKitError, @Nullable C1305b c1305b) {
        this.f13060b.onError(accountKitError);
        m16113a(accountKitActivity, loginFlowManager, loginFlowState, c1305b);
    }

    /* renamed from: a */
    C1305b m16114a(@Nullable final String str) {
        return new C1305b(this) {
            /* renamed from: b */
            final /* synthetic */ StateStackManager f9799b;

            /* renamed from: a */
            public void mo1607a() {
            }

            /* renamed from: a */
            public void mo1608a(C1314f c1314f) {
                if (c1314f instanceof C4346o) {
                    ((C4346o) c1314f).m16196a(str);
                }
            }
        };
    }

    /* renamed from: a */
    void m16118a(AccountKitActivity accountKitActivity, LoginFlowManager loginFlowManager, @Nullable C1305b c1305b) {
        m16113a(accountKitActivity, loginFlowManager, LoginFlowState.NONE, c1305b);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m16113a(com.facebook.accountkit.ui.AccountKitActivity r12, com.facebook.accountkit.ui.LoginFlowManager r13, com.facebook.accountkit.ui.LoginFlowState r14, @android.support.annotation.Nullable com.facebook.accountkit.ui.StateStackManager.C1305b r15) {
        /*
        r11 = this;
        r0 = r13.getFlowState();
        r1 = r11.m16115a();
        r2 = 0;
        r14 = r11.m16111a(r12, r0, r14, r2);
        if (r14 == 0) goto L_0x0181;
    L_0x000f:
        if (r1 != r14) goto L_0x0013;
    L_0x0011:
        goto L_0x0181;
    L_0x0013:
        r3 = r13 instanceof com.facebook.accountkit.ui.PhoneLoginFlowManager;
        r4 = 0;
        if (r3 == 0) goto L_0x0020;
    L_0x0018:
        r3 = r13;
        r3 = (com.facebook.accountkit.ui.PhoneLoginFlowManager) r3;
        r3 = r3.getNotificationChannel();
        goto L_0x0021;
    L_0x0020:
        r3 = r4;
    L_0x0021:
        r5 = r11.f13060b;
        com.facebook.accountkit.internal.C1220c.C1219a.m4259a(r5);
        r5 = com.facebook.accountkit.ui.LoginFlowState.RESEND;
        r6 = 1;
        if (r0 != r5) goto L_0x002f;
    L_0x002b:
        r5 = r14 instanceof com.facebook.accountkit.ui.ResendContentController;
        if (r5 != 0) goto L_0x003b;
    L_0x002f:
        r5 = com.facebook.accountkit.ui.LoginFlowState.CODE_INPUT;
        if (r0 != r5) goto L_0x0037;
    L_0x0033:
        r5 = r14 instanceof com.facebook.accountkit.ui.C4344n;
        if (r5 != 0) goto L_0x003b;
    L_0x0037:
        r5 = r14 instanceof com.facebook.accountkit.ui.C4346o;
        if (r5 == 0) goto L_0x0040;
    L_0x003b:
        r5 = r14.mo3272c();
        goto L_0x005a;
    L_0x0040:
        r5 = r11.f13060b;
        r5 = r5.getHeaderFragment(r0);
        r7 = r11.f13061c;
        r7 = r7.getLoginType();
        r8 = com.facebook.accountkit.ui.StateStackManager.FragmentType.HEADER;
        r8 = r8.name();
        if (r5 == 0) goto L_0x0056;
    L_0x0054:
        r9 = 1;
        goto L_0x0057;
    L_0x0056:
        r9 = 0;
    L_0x0057:
        com.facebook.accountkit.internal.C1220c.C1219a.m4258a(r7, r8, r9);
    L_0x005a:
        r7 = r11.f13060b;
        r7 = r7.getBodyFragment(r0);
        r8 = r11.f13061c;
        r8 = r8.getLoginType();
        r9 = com.facebook.accountkit.ui.StateStackManager.FragmentType.BODY;
        r9 = r9.name();
        if (r7 == 0) goto L_0x0070;
    L_0x006e:
        r10 = 1;
        goto L_0x0071;
    L_0x0070:
        r10 = 0;
    L_0x0071:
        com.facebook.accountkit.internal.C1220c.C1219a.m4258a(r8, r9, r10);
        r8 = r11.f13060b;
        r8 = r8.getFooterFragment(r0);
        r9 = r11.f13061c;
        r9 = r9.getLoginType();
        r10 = com.facebook.accountkit.ui.StateStackManager.FragmentType.FOOTER;
        r10 = r10.name();
        if (r8 == 0) goto L_0x0089;
    L_0x0088:
        goto L_0x008a;
    L_0x0089:
        r6 = 0;
    L_0x008a:
        com.facebook.accountkit.internal.C1220c.C1219a.m4258a(r9, r10, r6);
        if (r5 != 0) goto L_0x0099;
    L_0x008f:
        r5 = r11.f13060b;
        r13 = r13.getLoginType();
        r5 = com.facebook.accountkit.ui.BaseUIManager.getDefaultHeaderFragment(r5, r0, r13, r3);
    L_0x0099:
        if (r7 != 0) goto L_0x00a1;
    L_0x009b:
        r13 = r11.f13060b;
        r7 = com.facebook.accountkit.ui.BaseUIManager.getDefaultBodyFragment(r13, r0);
    L_0x00a1:
        if (r8 != 0) goto L_0x00a9;
    L_0x00a3:
        r13 = r11.f13060b;
        r8 = com.facebook.accountkit.ui.BaseUIManager.getDefaultFooterFragment(r13);
    L_0x00a9:
        r13 = r11.f13060b;
        r13 = r13.getTextPosition(r0);
        r3 = r14 instanceof com.facebook.accountkit.ui.C1313d;
        if (r3 == 0) goto L_0x00c1;
    L_0x00b3:
        r3 = r11.f13060b;
        r0 = r3.getButtonType(r0);
        if (r0 == 0) goto L_0x00c1;
    L_0x00bb:
        r3 = r14;
        r3 = (com.facebook.accountkit.ui.C1313d) r3;
        r3.mo3257a(r0);
    L_0x00c1:
        r0 = r14.mo3263f();
        r3 = r14.mo3262e();
        r6 = r14.mo3259b();
        if (r15 == 0) goto L_0x00d7;
    L_0x00cf:
        r9 = r11.f13065g;
        r9.add(r15);
        r15.mo1608a(r14);
    L_0x00d7:
        if (r13 != 0) goto L_0x00db;
    L_0x00d9:
        r13 = com.facebook.accountkit.ui.TextPosition.BELOW_BODY;
    L_0x00db:
        if (r3 == 0) goto L_0x0117;
    L_0x00dd:
        r15 = com.facebook.accountkit.ui.StateStackManager.C13032.f3443a;
        r9 = r13.ordinal();
        r15 = r15[r9];
        switch(r15) {
            case 1: goto L_0x00f0;
            case 2: goto L_0x00eb;
            default: goto L_0x00e8;
        };
    L_0x00e8:
        r15 = 0;
    L_0x00e9:
        r9 = 0;
        goto L_0x00f3;
    L_0x00eb:
        r15 = com.facebook.accountkit.C1196d.C1191d.com_accountkit_vertical_spacer_small_height;
        r9 = r15;
        r15 = 0;
        goto L_0x00f3;
    L_0x00f0:
        r15 = com.facebook.accountkit.C1196d.C1191d.com_accountkit_vertical_spacer_small_height;
        goto L_0x00e9;
    L_0x00f3:
        if (r15 != 0) goto L_0x00f7;
    L_0x00f5:
        r15 = 0;
        goto L_0x00ff;
    L_0x00f7:
        r10 = r12.getResources();
        r15 = r10.getDimensionPixelSize(r15);
    L_0x00ff:
        if (r9 != 0) goto L_0x0102;
    L_0x0101:
        goto L_0x010a;
    L_0x0102:
        r2 = r12.getResources();
        r2 = r2.getDimensionPixelSize(r9);
    L_0x010a:
        r9 = r3 instanceof com.facebook.accountkit.ui.TextContentFragment;
        if (r9 == 0) goto L_0x0117;
    L_0x010e:
        r9 = r3;
        r9 = (com.facebook.accountkit.ui.TextContentFragment) r9;
        r9.mo3966a(r15);
        r9.mo3968b(r2);
    L_0x0117:
        r15 = r12.getFragmentManager();
        if (r1 == 0) goto L_0x0129;
    L_0x011d:
        r12.m18730a(r1);
        r1 = r1.mo1632h();
        if (r1 == 0) goto L_0x0129;
    L_0x0126:
        r15.popBackStack();
    L_0x0129:
        r1 = r11.f13060b;
        r2 = com.facebook.accountkit.ui.SkinManager.Skin.CONTEMPORARY;
        r1 = com.facebook.accountkit.ui.ag.m4612a(r1, r2);
        if (r1 == 0) goto L_0x0136;
    L_0x0133:
        r12.m18690b(r14);
    L_0x0136:
        r15 = r15.beginTransaction();
        r1 = com.facebook.accountkit.C1196d.C1192e.com_accountkit_header_fragment;
        r12.m18689a(r15, r1, r5);
        r1 = com.facebook.accountkit.C1196d.C1192e.com_accountkit_content_top_fragment;
        r12.m18689a(r15, r1, r0);
        r0 = com.facebook.accountkit.C1196d.C1192e.com_accountkit_content_top_text_fragment;
        r1 = com.facebook.accountkit.ui.TextPosition.ABOVE_BODY;
        if (r13 != r1) goto L_0x014c;
    L_0x014a:
        r1 = r3;
        goto L_0x014d;
    L_0x014c:
        r1 = r4;
    L_0x014d:
        r12.m18689a(r15, r0, r1);
        r0 = com.facebook.accountkit.C1196d.C1192e.com_accountkit_content_center_fragment;
        r12.m18689a(r15, r0, r7);
        r0 = com.facebook.accountkit.C1196d.C1192e.com_accountkit_content_bottom_text_fragment;
        r1 = com.facebook.accountkit.ui.TextPosition.BELOW_BODY;
        if (r13 != r1) goto L_0x015c;
    L_0x015b:
        goto L_0x015d;
    L_0x015c:
        r3 = r4;
    L_0x015d:
        r12.m18689a(r15, r0, r3);
        r13 = r11.f13060b;
        r0 = com.facebook.accountkit.ui.SkinManager.Skin.CONTEMPORARY;
        r13 = com.facebook.accountkit.ui.ag.m4612a(r13, r0);
        if (r13 != 0) goto L_0x0174;
    L_0x016a:
        r13 = com.facebook.accountkit.C1196d.C1192e.com_accountkit_content_bottom_fragment;
        r12.m18689a(r15, r13, r6);
        r13 = com.facebook.accountkit.C1196d.C1192e.com_accountkit_footer_fragment;
        r12.m18689a(r15, r13, r8);
    L_0x0174:
        r15.addToBackStack(r4);
        com.facebook.accountkit.ui.ag.m4598a(r12);
        r15.commit();
        r14.mo1630a(r12);
        return;
    L_0x0181:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.ui.StateStackManager.a(com.facebook.accountkit.ui.AccountKitActivity, com.facebook.accountkit.ui.LoginFlowManager, com.facebook.accountkit.ui.LoginFlowState, com.facebook.accountkit.ui.StateStackManager$b):void");
    }

    /* renamed from: a */
    void m16116a(AccountKitActivity accountKitActivity) {
        C4127h a = m16112a(accountKitActivity, C1192e.com_accountkit_content_top_fragment);
        if (a != null) {
            accountKitActivity = m16111a(accountKitActivity, a.mo3698a(), LoginFlowState.NONE, true);
            if (accountKitActivity != null) {
                this.f13062d = accountKitActivity;
                AccountKitActivity<C1304a> arrayList = new ArrayList(this.f13064f);
                this.f13064f.clear();
                for (C1304a a2 : arrayList) {
                    a2.mo1593a();
                }
                AccountKitActivity<C1305b> arrayList2 = new ArrayList(this.f13065g);
                this.f13065g.clear();
                for (C1305b a3 : arrayList2) {
                    a3.mo1607a();
                }
            }
        }
    }

    @Nullable
    /* renamed from: a */
    private C4127h m16112a(AccountKitActivity accountKitActivity, int i) {
        accountKitActivity = accountKitActivity.getFragmentManager().findFragmentById(i);
        if ((accountKitActivity instanceof C4127h) == 0) {
            return null;
        }
        return (C4127h) accountKitActivity;
    }

    @Nullable
    /* renamed from: a */
    private C1314f m16111a(AccountKitActivity accountKitActivity, LoginFlowState loginFlowState, LoginFlowState loginFlowState2, boolean z) {
        C1314f c1314f = (C1314f) this.f13063e.get(loginFlowState);
        if (c1314f != null) {
            return c1314f;
        }
        switch (loginFlowState) {
            case NONE:
                return null;
            case PHONE_NUMBER_INPUT:
                loginFlowState2 = new C4347q(this.f13061c);
                break;
            case SENDING_CODE:
                loginFlowState2 = new C4130v(this.f13061c);
                break;
            case SENT_CODE:
                switch (this.f13061c.getLoginType()) {
                    case PHONE:
                        loginFlowState2 = new C4348s(this.f13061c);
                        break;
                    case EMAIL:
                        loginFlowState2 = new C4342k(this.f13061c);
                        break;
                    default:
                        loginFlowState = new StringBuilder();
                        loginFlowState.append("Unexpected login type: ");
                        loginFlowState.append(this.f13061c.getLoginType().toString());
                        throw new RuntimeException(loginFlowState.toString());
                }
            case ACCOUNT_VERIFIED:
                loginFlowState2 = new C4125b(this.f13061c);
                break;
            case CONFIRM_ACCOUNT_VERIFIED:
                loginFlowState2 = new C4126e(this.f13061c);
                break;
            case CONFIRM_INSTANT_VERIFICATION_LOGIN:
                loginFlowState2 = new ae(this.f13061c);
                break;
            case CODE_INPUT:
                loginFlowState2 = new C4344n(this.f13061c);
                break;
            case VERIFYING_CODE:
                loginFlowState2 = new ae(this.f13061c);
                break;
            case VERIFIED:
                loginFlowState2 = new ad(this.f13061c);
                break;
            case ERROR:
                loginFlowState2 = new C4346o(loginFlowState2, this.f13061c);
                break;
            case EMAIL_INPUT:
                loginFlowState2 = new EmailLoginContentController(this.f13061c);
                break;
            case EMAIL_VERIFY:
                loginFlowState2 = new C4128l(this.f13061c);
                break;
            case RESEND:
                loginFlowState2 = new ResendContentController(this.f13061c);
                break;
            default:
                return null;
        }
        if (z) {
            z = accountKitActivity.getFragmentManager().findFragmentById(C1192e.com_accountkit_header_fragment);
            if (z instanceof C4132a) {
                loginFlowState2.mo3271b((C4132a) z);
            }
            loginFlowState2.mo3273c(m16112a(accountKitActivity, C1192e.com_accountkit_content_top_fragment));
            loginFlowState2.mo3260b(m16112a(accountKitActivity, C1192e.com_accountkit_content_center_fragment));
            loginFlowState2.mo3270a(m16112a(accountKitActivity, C1192e.com_accountkit_content_bottom_fragment));
            z = accountKitActivity.getFragmentManager().findFragmentById(C1192e.com_accountkit_footer_fragment);
            if (z instanceof C4132a) {
                loginFlowState2.mo3258a((C4132a) z);
            }
            loginFlowState2.mo1630a((Activity) accountKitActivity);
        }
        this.f13063e.put(loginFlowState, loginFlowState2);
        return loginFlowState2;
    }
}
