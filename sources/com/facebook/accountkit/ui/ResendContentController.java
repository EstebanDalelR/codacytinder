package com.facebook.accountkit.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.content.C0436c;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.C1196d.C1193f;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.internal.C1220c;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.internal.Feature;
import com.facebook.accountkit.ui.C1327y.C4351a;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.LoginFlowBroadcastReceiver.Event;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class ResendContentController extends C3210g {
    /* renamed from: a */
    private static final LoginFlowState f13052a = LoginFlowState.RESEND;
    /* renamed from: b */
    private BottomFragment f13053b;
    /* renamed from: c */
    private C4351a f13054c;
    /* renamed from: d */
    private C4132a f13055d;
    /* renamed from: f */
    private C4132a f13056f;
    /* renamed from: g */
    private C4351a f13057g;
    /* renamed from: h */
    private C4351a f13058h;

    /* renamed from: com.facebook.accountkit.ui.ResendContentController$1 */
    class C32031 implements OnCompleteListener {
        /* renamed from: a */
        final /* synthetic */ ResendContentController f9797a;

        C32031(ResendContentController resendContentController) {
            this.f9797a = resendContentController;
        }

        public void onEdit(Context context) {
            C0436c.m1648a(context).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.PHONE_RESEND));
        }

        public void onResend(Context context) {
            C0436c.m1648a(context).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.PHONE_RESEND));
        }

        public void onFacebookNotification(Context context) {
            C0436c.m1648a(context).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.PHONE_RESEND_FACEBOOK_NOTIFICATION));
        }

        public void onConfirmationCodeCallback(Context context) {
            C0436c.m1648a(context).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.PHONE_RESEND_VOICE_CALL_NOTIFICATION));
        }
    }

    public static final class BottomFragment extends C4127h {
        /* renamed from: a */
        private static final String f14240a = "ResendContentController$BottomFragment";
        /* renamed from: b */
        private static final long f14241b = TimeUnit.SECONDS.toMillis(1);
        /* renamed from: i */
        private static final String f14242i;
        /* renamed from: j */
        private static final String f14243j;
        /* renamed from: k */
        private static final String f14244k;
        /* renamed from: c */
        private Handler f14245c;
        /* renamed from: d */
        private TextView f14246d;
        /* renamed from: g */
        private String f14247g;
        /* renamed from: h */
        private OnCompleteListener f14248h;

        /* renamed from: com.facebook.accountkit.ui.ResendContentController$BottomFragment$1 */
        class C12961 implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ BottomFragment f3434a;

            C12961(BottomFragment bottomFragment) {
                this.f3434a = bottomFragment;
            }

            public void onClick(View view) {
                C1219a.m4277c(Buttons.TRY_AGAIN.name());
                if (this.f3434a.f14248h != null) {
                    this.f3434a.f14248h.onResend(view.getContext());
                }
            }
        }

        /* renamed from: com.facebook.accountkit.ui.ResendContentController$BottomFragment$2 */
        class C12972 implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ BottomFragment f3435a;

            C12972(BottomFragment bottomFragment) {
                this.f3435a = bottomFragment;
            }

            public void onClick(View view) {
                C1219a.m4277c(Buttons.FB_NOTIFICATION.name());
                if (this.f3435a.f14248h != null) {
                    this.f3435a.f14248h.onFacebookNotification(view.getContext());
                }
            }
        }

        /* renamed from: com.facebook.accountkit.ui.ResendContentController$BottomFragment$4 */
        class C12994 extends ClickableSpan {
            /* renamed from: a */
            final /* synthetic */ BottomFragment f3438a;

            C12994(BottomFragment bottomFragment) {
                this.f3438a = bottomFragment;
            }

            public void onClick(View view) {
                C1219a.m4277c(Buttons.EDIT_NUMBER.name());
                if (this.f3438a.f14248h != null) {
                    this.f3438a.f14248h.onEdit(view.getContext());
                }
            }

            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(ag.m4617c(this.f3438a.getActivity(), this.f3438a.m4589n()));
                textPaint.setUnderlineText(false);
            }
        }

        public interface OnCompleteListener {
            void onConfirmationCodeCallback(Context context);

            void onEdit(Context context);

            void onFacebookNotification(Context context);

            void onResend(Context context);
        }

        /* renamed from: b */
        boolean mo3699b() {
            return false;
        }

        public /* bridge */ /* synthetic */ void onActivityCreated(Bundle bundle) {
            super.onActivityCreated(bundle);
        }

        public /* bridge */ /* synthetic */ void onCreate(Bundle bundle) {
            super.onCreate(bundle);
        }

        public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }

        public /* bridge */ /* synthetic */ void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
        }

        static {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f14240a);
            stringBuilder.append(".FACEBOOK_NOTIFICATION_CHANNEL");
            f14242i = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(f14240a);
            stringBuilder.append(".VOICE_CALLBACK_NOTIFICATION_CHANNEL");
            f14243j = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(f14240a);
            stringBuilder.append(".RESEND_TIME_KEY");
            f14244k = stringBuilder.toString();
        }

        /* renamed from: a */
        protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(C1193f.com_accountkit_fragment_resend_bottom, viewGroup, false);
        }

        public void onViewCreated(View view, Bundle bundle) {
            super.onViewCreated(view, bundle);
            this.f14245c = new Handler();
        }

        /* renamed from: a */
        LoginFlowState mo3698a() {
            return ResendContentController.f13052a;
        }

        /* renamed from: c */
        public boolean m17669c() {
            return m4590o().getBoolean(f14242i);
        }

        /* renamed from: d */
        public boolean m17670d() {
            return m4590o().getBoolean(f14243j);
        }

        /* renamed from: a */
        public void m17667a(List<NotificationChannel> list) {
            m4590o().putBoolean(f14242i, list.contains(NotificationChannel.FACEBOOK));
            m4590o().putBoolean(f14243j, list.contains(NotificationChannel.VOICE_CALLBACK));
            m17659k();
        }

        /* renamed from: e */
        public long m17671e() {
            return m4590o().getLong(f14244k);
        }

        /* renamed from: a */
        public void m17663a(long j) {
            m4590o().putLong(f14244k, j);
            m17660l();
        }

        /* renamed from: a */
        protected void mo3277a(View view, Bundle bundle) {
            int i;
            super.mo3277a(view, bundle);
            bundle = view.findViewById(C1192e.com_accountkit_resend_button);
            this.f14246d = (TextView) view.findViewById(C1192e.com_accountkit_accountkit_verify_number);
            if (bundle != null) {
                bundle.setOnClickListener(new C12961(this));
            }
            Button button = (Button) view.findViewById(C1192e.com_accountkit_send_in_fb_button);
            m17654a(button, C1194g.com_accountkit_button_send_code_in_fb, C1194g.com_accountkit_button_send_code_in_fb_details);
            button.setOnClickListener(new C12972(this));
            Button button2 = (Button) view.findViewById(C1192e.com_accountkit_send_in_phone_call);
            bundle = C1220c.m4307h();
            final boolean b = bundle.m4356b(Feature.CALLBACK_BUTTON_ALTERNATE_TEXT);
            if (bundle.m4354a() == null || !b) {
                i = C1194g.com_accountkit_button_send_code_in_call_details;
            } else {
                i = C1194g.com_accountkit_button_send_code_in_call_from_facebook_details;
            }
            m17654a(button2, C1194g.com_accountkit_button_send_code_in_call, i);
            button2.setOnClickListener(new OnClickListener(this) {
                /* renamed from: b */
                final /* synthetic */ BottomFragment f3437b;

                public void onClick(View view) {
                    String name;
                    if (b) {
                        name = Buttons.CONFIRMATION_CODE_CALLBACK.name();
                    } else {
                        name = Buttons.CONFIRMATION_CODE_CALLBACK_ALTERNATE.name();
                    }
                    C1219a.m4277c(name);
                    if (this.f3437b.f14248h != null) {
                        this.f3437b.f14248h.onConfirmationCodeCallback(view.getContext());
                    }
                }
            });
            m17657g();
        }

        /* renamed from: a */
        private void m17654a(Button button, @StringRes int i, @StringRes int i2) {
            i = new SpannableStringBuilder(getString(i)).append("\n");
            i.setSpan(new TypefaceSpan("sans-serif-medium"), 0, i.length(), 33);
            int length = i.length();
            i.append(getString(i2));
            i.setSpan(new TypefaceSpan("sans-serif-light"), length, i.length(), 33);
            i.setSpan(new ForegroundColorSpan(ag.m4593a(button.getContext(), m4589n())), length, i.length(), 33);
            button.setText(i);
        }

        /* renamed from: a */
        public void m17666a(String str) {
            this.f14247g = str;
            m17658j();
        }

        /* renamed from: a */
        public void m17665a(@Nullable OnCompleteListener onCompleteListener) {
            this.f14248h = onCompleteListener;
        }

        public void onStart() {
            super.onStart();
            m17657g();
        }

        /* renamed from: g */
        private void m17657g() {
            m17658j();
            m17659k();
            m17660l();
        }

        /* renamed from: j */
        private void m17658j() {
            if (isAdded()) {
                if (this.f14247g != null) {
                    CharSequence spannableString = new SpannableString(getString(C1194g.com_accountkit_code_sent_to, new Object[]{this.f14247g}));
                    C12994 c12994 = new C12994(this);
                    int indexOf = spannableString.toString().indexOf(this.f14247g);
                    spannableString.setSpan(c12994, indexOf, this.f14247g.length() + indexOf, 33);
                    this.f14246d.setText(spannableString);
                    this.f14246d.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }

        /* renamed from: k */
        private void m17659k() {
            View view = getView();
            if (view != null) {
                int i = 8;
                view.findViewById(C1192e.com_accountkit_send_in_fb_button).setVisibility(m17669c() ? 0 : 8);
                view.findViewById(C1192e.com_accountkit_send_in_phone_call).setVisibility(m17670d() ? 0 : 8);
                view = view.findViewById(C1192e.com_accountkit_other_ways_textview);
                if (m17669c() || m17670d()) {
                    i = 0;
                }
                view.setVisibility(i);
            }
        }

        /* renamed from: l */
        private void m17660l() {
            View view = getView();
            if (view != null) {
                view = view.findViewById(C1192e.com_accountkit_resend_button);
                if (view != null) {
                    final Button button = (Button) view;
                    final long e = m17671e();
                    this.f14245c.post(new Runnable(this) {
                        /* renamed from: c */
                        final /* synthetic */ BottomFragment f3441c;

                        public void run() {
                            if (this.f3441c.isAdded()) {
                                if (TimeUnit.MILLISECONDS.toSeconds(e - System.currentTimeMillis()) > 0) {
                                    button.setText(this.f3441c.getString(C1194g.com_accountkit_button_resend_code_in, new Object[]{Long.valueOf(r0)}));
                                    this.f3441c.f14245c.postDelayed(this, BottomFragment.f14241b);
                                    button.setEnabled(false);
                                } else {
                                    button.setText(C1194g.com_accountkit_button_resend_sms);
                                    button.setEnabled(true);
                                }
                            }
                        }
                    });
                }
            }
        }

        public void onPause() {
            super.onPause();
            this.f14245c.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: com.facebook.accountkit.ui.ResendContentController$a */
    public static final class C4339a extends C4132a {
        /* renamed from: a */
        public static C4339a m17672a(@NonNull UIManager uIManager, int i, @Nullable String... strArr) {
            C4339a c4339a = new C4339a();
            c4339a.m4590o().putParcelable(af.f3455f, uIManager);
            c4339a.m16233a(i, strArr);
            return c4339a;
        }

        /* renamed from: a */
        protected void mo3277a(View view, Bundle bundle) {
            super.mo3277a(view, bundle);
            this.d.setGravity(16);
        }
    }

    ResendContentController(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: b */
    public C4127h mo3259b() {
        if (this.f13053b == null) {
            mo3270a(new BottomFragment());
        }
        return this.f13053b;
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof BottomFragment) {
            this.f13053b = (BottomFragment) c4127h;
            this.f13053b.m4590o().putParcelable(af.f3455f, this.e.getUIManager());
            this.f13053b.m17665a(new C32031(this));
        }
    }

    /* renamed from: b */
    public void mo3260b(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13054c = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    public void mo3258a(@Nullable C4132a c4132a) {
        this.f13055d = c4132a;
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.f13056f == null) {
            mo3271b(C4339a.m17672a(this.e.getUIManager(), C1194g.com_accountkit_resend_title, new String[0]));
        }
        return this.f13056f;
    }

    /* renamed from: b */
    public void mo3271b(@Nullable C4132a c4132a) {
        this.f13056f = c4132a;
    }

    /* renamed from: d */
    public LoginFlowState mo3261d() {
        return f13052a;
    }

    /* renamed from: e */
    public C4127h mo3262e() {
        if (this.f13057g == null) {
            this.f13057g = C1327y.m4641a(this.e.getUIManager(), mo3261d());
        }
        return this.f13057g;
    }

    /* renamed from: f */
    public C4127h mo3263f() {
        if (this.f13058h == null) {
            mo3273c(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13058h;
    }

    /* renamed from: c */
    public void mo3273c(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13058h = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    protected void mo3256a() {
        C1219a.m4279c(true);
    }

    /* renamed from: a */
    public void m16101a(@Nullable String str) {
        if (this.f13053b != null) {
            this.f13053b.m17666a(str);
        }
    }

    /* renamed from: a */
    void m16102a(List<NotificationChannel> list) {
        if (this.f13053b != null) {
            this.f13053b.m17667a((List) list);
        }
    }

    /* renamed from: a */
    void m16098a(long j) {
        if (this.f13053b != null) {
            this.f13053b.m17663a(j);
        }
    }
}
