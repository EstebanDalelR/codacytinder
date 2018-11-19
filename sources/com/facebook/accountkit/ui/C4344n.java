package com.facebook.accountkit.ui;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.ConfirmationCodeContentController.C4335a;
import com.facebook.accountkit.ui.ConfirmationCodeContentController.C4335a.C1268a;
import com.facebook.accountkit.ui.ConfirmationCodeContentController.TitleFragment;
import com.facebook.accountkit.ui.ConfirmationCodeContentController.TitleFragment.OnCompleteListener;
import com.facebook.accountkit.ui.LoginFlowBroadcastReceiver.Event;

/* renamed from: com.facebook.accountkit.ui.n */
class C4344n extends ConfirmationCodeContentController {
    /* renamed from: f */
    private C3213a f14254f;

    /* renamed from: com.facebook.accountkit.ui.n$1 */
    class C32121 implements C1268a {
        /* renamed from: a */
        final /* synthetic */ C4344n f9813a;

        C32121(C4344n c4344n) {
            this.f9813a = c4344n;
        }

        /* renamed from: a */
        public void mo1625a() {
            this.f9813a.m16036i();
        }
    }

    /* renamed from: com.facebook.accountkit.ui.n$a */
    private class C3213a implements OnCompleteListener, PrivacyPolicyFragment.OnCompleteListener {
        /* renamed from: a */
        final /* synthetic */ C4344n f9814a;

        private C3213a(C4344n c4344n) {
            this.f9814a = c4344n;
        }

        public void onNext(Context context, String str) {
            if (this.f9814a.c != null) {
                if (this.f9814a.d != null) {
                    String d = this.f9814a.c.m17551d();
                    C1219a.m4264a(str, this.f9814a.c.m17552e(), d);
                    C0436c.m1648a(context).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.PHONE_CONFIRMATION_CODE_COMPLETE).putExtra(LoginFlowBroadcastReceiver.f3416e, d));
                }
            }
        }

        public void onRetry(Context context) {
            C0436c.m1648a(context).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.PHONE_CONFIRMATION_CODE_RETRY));
        }

        public void onEdit(Context context) {
            C0436c.m1648a(context).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.PHONE_RESEND));
        }
    }

    /* renamed from: com.facebook.accountkit.ui.n$b */
    public static final class C4442b extends TitleFragment {
        @Nullable
        /* renamed from: g */
        private NotificationChannel f14742g;

        /* renamed from: com.facebook.accountkit.ui.n$b$1 */
        class C13211 extends ClickableSpan {
            /* renamed from: a */
            final /* synthetic */ C4442b f3463a;

            C13211(C4442b c4442b) {
                this.f3463a = c4442b;
            }

            public void onClick(View view) {
                C1219a.m4277c(Buttons.PHONE_NUMBER.name());
                if (this.f3463a.a != null) {
                    this.f3463a.a.onEdit(view.getContext());
                }
            }

            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(ag.m4617c(this.f3463a.getActivity(), this.f3463a.m4589n()));
                textPaint.setUnderlineText(false);
            }
        }

        /* renamed from: a */
        public static C4442b m18469a(UIManager uIManager, int i, @Nullable String... strArr) {
            C4442b c4442b = new C4442b();
            c4442b.m4590o().putParcelable(af.f3455f, uIManager);
            c4442b.m16233a(i, strArr);
            return c4442b;
        }

        /* renamed from: a */
        void m18471a(NotificationChannel notificationChannel) {
            this.f14742g = notificationChannel;
            mo3697a();
        }

        /* renamed from: a */
        void mo3697a() {
            if (isAdded() && this.f14742g != null) {
                switch (this.f14742g) {
                    case FACEBOOK:
                        m16233a(C1194g.com_accountkit_facebook_code_entry_title, new String[0]);
                        break;
                    case VOICE_CALLBACK:
                        m16233a(C1194g.com_accountkit_voice_call_code_entry_title, new String[0]);
                        break;
                    default:
                        if (this.b != null) {
                            CharSequence stringBuilder;
                            if (this.c) {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(getString(C1194g.com_accountkit_verify_confirmation_code_title));
                                stringBuilder2.append("\n");
                                stringBuilder2.append(this.b.toString());
                                stringBuilder = stringBuilder2.toString();
                            } else {
                                stringBuilder = getString(C1194g.com_accountkit_enter_code_sent_to, new Object[]{this.b.toString()});
                            }
                            CharSequence spannableString = new SpannableString(stringBuilder);
                            C13211 c13211 = new C13211(this);
                            int indexOf = spannableString.toString().indexOf(this.b.toString());
                            spannableString.setSpan(c13211, indexOf, this.b.toString().length() + indexOf, 33);
                            this.d.setText(spannableString);
                            this.d.setMovementMethod(LinkMovementMethod.getInstance());
                            break;
                        }
                        return;
                }
            }
        }
    }

    C4344n(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof PrivacyPolicyFragment) {
            this.d = (PrivacyPolicyFragment) c4127h;
            this.d.m17647a(m17702k());
            m16036i();
        }
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.b == null) {
            mo3271b(C4442b.m18469a(this.e.getUIManager(), C1194g.com_accountkit_confirmation_code_title, new String[0]));
        }
        return this.b;
    }

    /* renamed from: b */
    public void mo3271b(@Nullable C4132a c4132a) {
        if (c4132a instanceof C4442b) {
            this.b = (C4442b) c4132a;
            this.b.m17527a(m17702k());
        }
    }

    /* renamed from: c */
    public void mo3273c(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4335a) {
            this.c = (C4335a) c4127h;
            this.c.m4590o().putParcelable(af.f3455f, this.e.getUIManager());
            this.c.m17546a(new C32121(this));
            this.c.m17547a(m17702k());
        }
    }

    /* renamed from: a */
    void m17703a(NotificationChannel notificationChannel) {
        if (this.b != null) {
            ((C4442b) this.b).m18471a(notificationChannel);
        }
    }

    /* renamed from: k */
    private C3213a m17702k() {
        if (this.f14254f == null) {
            this.f14254f = new C3213a();
        }
        return this.f14254f;
    }
}
