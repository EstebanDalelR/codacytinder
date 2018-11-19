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
import com.facebook.accountkit.UpdateFlowBroadcastReceiver;
import com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.ConfirmationCodeContentController.C4335a;
import com.facebook.accountkit.ui.ConfirmationCodeContentController.C4335a.C1268a;
import com.facebook.accountkit.ui.ConfirmationCodeContentController.TitleFragment;
import com.facebook.accountkit.ui.ConfirmationCodeContentController.TitleFragment.OnCompleteListener;

final class aa extends ConfirmationCodeContentController {
    /* renamed from: f */
    private C3208a f14251f;

    /* renamed from: com.facebook.accountkit.ui.aa$1 */
    class C32071 implements C1268a {
        /* renamed from: a */
        final /* synthetic */ aa f9803a;

        C32071(aa aaVar) {
            this.f9803a = aaVar;
        }

        /* renamed from: a */
        public void mo1625a() {
            this.f9803a.m16036i();
        }
    }

    /* renamed from: com.facebook.accountkit.ui.aa$a */
    private class C3208a implements OnCompleteListener, PrivacyPolicyFragment.OnCompleteListener {
        /* renamed from: a */
        final /* synthetic */ aa f9804a;

        public void onRetry(Context context) {
        }

        private C3208a(aa aaVar) {
            this.f9804a = aaVar;
        }

        public void onNext(Context context, String str) {
            if (this.f9804a.c != null) {
                if (this.f9804a.d != null) {
                    String d = this.f9804a.c.m17551d();
                    C1219a.m4264a(str, this.f9804a.c.m17552e(), d);
                    C0436c.m1648a(context).m1653a(new Intent(UpdateFlowBroadcastReceiver.f3151a).putExtra(UpdateFlowBroadcastReceiver.f3152b, Event.CONFIRMATION_CODE_COMPLETE).putExtra(UpdateFlowBroadcastReceiver.f3155e, d));
                }
            }
        }

        public void onEdit(Context context) {
            C0436c.m1648a(context).m1653a(new Intent(UpdateFlowBroadcastReceiver.f3151a).putExtra(UpdateFlowBroadcastReceiver.f3152b, Event.ERROR_UPDATE));
        }
    }

    /* renamed from: com.facebook.accountkit.ui.aa$b */
    public static final class C4440b extends TitleFragment {

        /* renamed from: com.facebook.accountkit.ui.aa$b$1 */
        class C13071 extends ClickableSpan {
            /* renamed from: a */
            final /* synthetic */ C4440b f3447a;

            C13071(C4440b c4440b) {
                this.f3447a = c4440b;
            }

            public void onClick(View view) {
                C1219a.m4277c(Buttons.PHONE_NUMBER.name());
                if (this.f3447a.a != null) {
                    this.f3447a.a.onEdit(view.getContext());
                }
            }

            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(ag.m4617c(this.f3447a.getActivity(), this.f3447a.m4589n()));
                textPaint.setUnderlineText(false);
            }
        }

        /* renamed from: a */
        public static C4440b m18465a(UIManager uIManager, int i, @Nullable String... strArr) {
            C4440b c4440b = new C4440b();
            c4440b.m4590o().putParcelable(af.f3455f, uIManager);
            c4440b.m16233a(i, strArr);
            return c4440b;
        }

        /* renamed from: a */
        void mo3697a() {
            if (isAdded() && this.b != null) {
                CharSequence spannableString = new SpannableString(getString(C1194g.com_accountkit_enter_code_sent_to, new Object[]{this.b.toString()}));
                C13071 c13071 = new C13071(this);
                int indexOf = spannableString.toString().indexOf(this.b.toString());
                spannableString.setSpan(c13071, indexOf, this.b.toString().length() + indexOf, 33);
                this.d.setText(spannableString);
                this.d.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    aa(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.b == null) {
            mo3271b(C4440b.m18465a(this.e.getUIManager(), C1194g.com_accountkit_confirmation_code_title, new String[0]));
        }
        return this.b;
    }

    /* renamed from: b */
    public void mo3271b(@Nullable C4132a c4132a) {
        if (c4132a instanceof C4440b) {
            this.b = (C4440b) c4132a;
            this.b.m17527a(m17684k());
        }
    }

    /* renamed from: c */
    public void mo3273c(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4335a) {
            this.c = (C4335a) c4127h;
            this.c.m4590o().putParcelable(af.f3455f, this.e.getUIManager());
            this.c.m17546a(new C32071(this));
            this.c.m17547a(m17684k());
        }
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof PrivacyPolicyFragment) {
            this.d = (PrivacyPolicyFragment) c4127h;
            this.d.m17647a(m17684k());
            this.d.m17649b(false);
            m16036i();
        }
    }

    /* renamed from: k */
    private C3208a m17684k() {
        if (this.f14251f == null) {
            this.f14251f = new C3208a();
        }
        return this.f14251f;
    }
}
