package com.facebook.accountkit.ui;

import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.C1196d.C1193f;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.ui.C1316j.C1315a;

abstract class TextContentFragment extends C4127h {
    /* renamed from: a */
    private NextButtonTextProvider f14249a;
    /* renamed from: b */
    private TextView f14250b;

    public interface NextButtonTextProvider {
        String getNextButtonText();
    }

    /* renamed from: com.facebook.accountkit.ui.TextContentFragment$1 */
    class C32051 implements C1315a {
        /* renamed from: a */
        final /* synthetic */ TextContentFragment f9800a;

        C32051(TextContentFragment textContentFragment) {
            this.f9800a = textContentFragment;
        }

        /* renamed from: a */
        public void mo1619a(String str) {
            C1219a.m4262a(Buttons.POLICY_LINKS.name(), str);
        }
    }

    /* renamed from: a */
    protected abstract Spanned mo3965a(String str);

    TextContentFragment() {
    }

    /* renamed from: d */
    public int mo3970d() {
        return m4590o().getInt("contentPaddingBottom", 0);
    }

    /* renamed from: b */
    public void mo3968b(int i) {
        m4590o().putInt("contentPaddingBottom", i);
        m17674f();
    }

    /* renamed from: c */
    public int mo3969c() {
        return m4590o().getInt("contentPaddingTop", 0);
    }

    /* renamed from: a */
    public void mo3966a(int i) {
        m4590o().putInt("contentPaddingTop", i);
        m17674f();
    }

    /* renamed from: a */
    protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1193f.com_accountkit_fragment_phone_login_text, viewGroup, false);
    }

    /* renamed from: a */
    public void mo3967a(NextButtonTextProvider nextButtonTextProvider) {
        this.f14249a = nextButtonTextProvider;
    }

    /* renamed from: a */
    protected void mo3277a(View view, Bundle bundle) {
        super.mo3277a(view, bundle);
        this.f14250b = (TextView) view.findViewById(C1192e.com_accountkit_text);
        if (this.f14250b != null) {
            this.f14250b.setMovementMethod(new C1316j(new C32051(this)));
        }
        m17674f();
        m17683e();
    }

    public void onStart() {
        super.onStart();
        m17683e();
    }

    /* renamed from: f */
    private void m17674f() {
        if (this.f14250b != null) {
            this.f14250b.setPadding(this.f14250b.getPaddingLeft(), mo3969c(), this.f14250b.getPaddingRight(), mo3970d());
        }
    }

    /* renamed from: e */
    void m17683e() {
        if (this.f14250b != null) {
            if (this.f14249a != null) {
                if (getActivity() != null) {
                    this.f14250b.setText(mo3965a(this.f14249a.getNextButtonText()));
                }
            }
        }
    }
}
