package com.facebook.accountkit.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.C1196d.C1193f;
import com.facebook.accountkit.internal.C1251w;
import com.tinder.api.ManagerWebServices;

/* renamed from: com.facebook.accountkit.ui.z */
final class C1328z {

    /* renamed from: com.facebook.accountkit.ui.z$a */
    public static class C4132a extends C3214p {
        /* renamed from: d */
        protected TextView f13124d;

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

        /* renamed from: a */
        private String mo3697a() {
            return m4590o().getString(ManagerWebServices.PARAM_JOB_TITLE);
        }

        /* renamed from: a */
        public void m16235a(@Nullable String str) {
            m4590o().putString(ManagerWebServices.PARAM_JOB_TITLE, str);
            m16231d();
        }

        @Nullable
        /* renamed from: b */
        private String[] m16229b() {
            return m4590o().getStringArray("titleResourceArgs");
        }

        /* renamed from: c */
        private int m16230c() {
            return m4590o().getInt("titleResourceId");
        }

        /* renamed from: a */
        public void m16233a(int i, @Nullable String... strArr) {
            Bundle o = m4590o();
            o.putInt("titleResourceId", i);
            o.putStringArray("titleResourceArgs", strArr);
            m16231d();
        }

        /* renamed from: a */
        protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(C1193f.com_accountkit_fragment_title, viewGroup, false);
        }

        /* renamed from: a */
        protected void mo3277a(View view, Bundle bundle) {
            super.mo3277a(view, bundle);
            this.f13124d = (TextView) view.findViewById(C1192e.com_accountkit_title);
            m16231d();
        }

        /* renamed from: d */
        private void m16231d() {
            if (this.f13124d != null) {
                int c;
                String a = mo3697a();
                if (C1251w.m4500a(a)) {
                    c = m16230c();
                    String[] b = m16229b();
                    if (!(c <= 0 || b == null || b.length == 0 || getActivity() == null)) {
                        a = getString(c, (Object[]) b);
                    }
                    if (!C1251w.m4500a(a)) {
                        this.f13124d.setText(a);
                        this.f13124d.setVisibility(0);
                    } else if (c <= 0) {
                        this.f13124d.setText(c);
                        this.f13124d.setVisibility(0);
                    } else {
                        this.f13124d.setVisibility(8);
                    }
                }
                c = 0;
                if (!C1251w.m4500a(a)) {
                    this.f13124d.setText(a);
                    this.f13124d.setVisibility(0);
                } else if (c <= 0) {
                    this.f13124d.setVisibility(8);
                } else {
                    this.f13124d.setText(c);
                    this.f13124d.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: a */
    public static C4132a m4643a(@NonNull UIManager uIManager) {
        C4132a c4132a = new C4132a();
        c4132a.m4590o().putParcelable(af.f3455f, uIManager);
        return c4132a;
    }

    /* renamed from: a */
    public static C4132a m4644a(@NonNull UIManager uIManager, int i, @Nullable String... strArr) {
        uIManager = C1328z.m4643a(uIManager);
        uIManager.m16233a(i, strArr);
        return uIManager;
    }
}
