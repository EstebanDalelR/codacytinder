package com.tinder.paywall.p304b;

import android.content.res.Resources;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.C0600i;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.managers.ManagerApp;
import com.tinder.paywall.viewmodels.C10093o;
import com.tinder.paywall.viewmodels.PaywallPerk;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;

/* renamed from: com.tinder.paywall.b.d */
public abstract class C12265d extends C0600i {
    @Inject
    /* renamed from: a */
    protected Resources f39676a;
    @Inject
    /* renamed from: b */
    LikeStatusProvider f39677b;
    @Inject
    /* renamed from: c */
    C15071e f39678c;
    /* renamed from: d */
    protected int f39679d;
    /* renamed from: e */
    protected int f39680e;
    /* renamed from: f */
    private List<C10093o> f39681f = new ArrayList();
    /* renamed from: g */
    private final HashMap<PaywallPerk, CountDownTimer> f39682g = new HashMap(2);

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    protected C12265d(@NonNull List<C10093o> list) {
        ManagerApp.e().inject(this);
        this.f39681f = list;
    }

    public int getCount() {
        return this.f39681f.size();
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        m48461b(i);
        viewGroup.removeView((View) obj);
    }

    @Nullable
    /* renamed from: a */
    protected C10093o m48462a(int i) {
        return (C10093o) this.f39681f.get(i);
    }

    /* renamed from: a */
    protected void m48463a(View view) {
        TextView textView = (TextView) view.findViewById(R.id.paywall_perk_title);
        if (((TextView) view.findViewById(R.id.paywall_perk_timer_text)).getVisibility() == 8) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), (int) view.getResources().getDimension(R.dimen.space_xxs));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected void m48464a(android.view.View r13, int r14) {
        /*
        r12 = this;
        r7 = r12.m48462a(r14);
        r1 = com.tinder.paywall.p304b.C12265d.C100512.f32951a;
        r2 = r7.mo10767a();
        r2 = r2.ordinal();
        r1 = r1[r2];
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = 0;
        switch(r1) {
            case 1: goto L_0x0033;
            case 2: goto L_0x0018;
            default: goto L_0x0017;
        };
    L_0x0017:
        return;
    L_0x0018:
        r1 = 2131821559; // 0x7f1103f7 float:1.9275865E38 double:1.0532597954E-314;
        r6 = 2131821532; // 0x7f1103dc float:1.927581E38 double:1.053259782E-314;
        r8 = r12.f39678c;
        r8 = r8.c();
        if (r8 == 0) goto L_0x004e;
    L_0x0026:
        r8 = r12.f39678c;
        r8 = r8.b();
        r8 = r8.resetDateInMillis();
        r10 = r8 + r2;
        goto L_0x004f;
    L_0x0033:
        r1 = 2131821558; // 0x7f1103f6 float:1.9275863E38 double:1.053259795E-314;
        r6 = 2131821531; // 0x7f1103db float:1.9275808E38 double:1.0532597815E-314;
        r8 = r12.f39677b;
        r8 = r8.isOutOfLikes();
        if (r8 == 0) goto L_0x004e;
    L_0x0041:
        r8 = r12.f39677b;
        r8 = r8.currentStatus();
        r8 = r8.millisRateLimitedUntil();
        r10 = r8 + r2;
        goto L_0x004f;
    L_0x004e:
        r10 = r4;
    L_0x004f:
        r2 = java.lang.System.currentTimeMillis();
        r8 = r10 - r2;
        r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x005a;
    L_0x0059:
        return;
    L_0x005a:
        r2 = 2131363156; // 0x7f0a0554 float:1.8346113E38 double:1.053033314E-314;
        r2 = r13.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = 2131363148; // 0x7f0a054c float:1.8346097E38 double:1.05303331E-314;
        r3 = r13.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r4 = 2131363155; // 0x7f0a0553 float:1.834611E38 double:1.0530333137E-314;
        r0 = r13.findViewById(r4);
        r10 = r0;
        r10 = (android.widget.TextView) r10;
        r2.setText(r1);
        r3.setText(r6);
        r0 = 0;
        r10.setVisibility(r0);
        r0 = com.tinder.utils.DateUtils.a(r8);
        r10.setText(r0);
        r0 = r12.f39679d;
        r10.setTextColor(r0);
        r11 = new com.tinder.paywall.b.d$1;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r11;
        r1 = r12;
        r2 = r8;
        r6 = r10;
        r0.<init>(r1, r2, r4, r6);
        r11.start();
        r0 = r12.f39682g;
        r1 = r7.mo10767a();
        r0.put(r1, r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.paywall.b.d.a(android.view.View, int):void");
    }

    /* renamed from: b */
    private void m48461b(int i) {
        CountDownTimer countDownTimer = (CountDownTimer) this.f39682g.get(m48462a(i).mo10767a());
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
