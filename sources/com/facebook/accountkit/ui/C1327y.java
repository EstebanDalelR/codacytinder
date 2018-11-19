package com.facebook.accountkit.ui;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.accountkit.C1196d.C1189b;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.C1196d.C1193f;

/* renamed from: com.facebook.accountkit.ui.y */
final class C1327y {

    /* renamed from: com.facebook.accountkit.ui.y$a */
    public static final class C4351a extends C4127h {
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

        /* renamed from: a */
        protected View mo3276a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(m4590o().getInt("layoutResourceId", C1193f.com_accountkit_fragment_static_content), viewGroup, false);
        }

        /* renamed from: a */
        LoginFlowState mo3698a() {
            return LoginFlowState.valueOf(m4590o().getString("loginFlowState", LoginFlowState.NONE.name()));
        }

        /* renamed from: a */
        protected void mo3277a(View view, Bundle bundle) {
            super.mo3277a(view, bundle);
            view = view.findViewById(C1192e.com_accountkit_icon_view);
            if (view != null) {
                int a;
                if (ag.m4611a(m4589n())) {
                    a = ag.m4592a(getActivity(), C1189b.com_accountkit_icon_color, -1);
                } else {
                    a = ag.m4619d(getActivity(), m4589n());
                }
                if (view instanceof ImageView) {
                    ImageView imageView = (ImageView) view;
                    ag.m4600a(getActivity(), imageView, a);
                    bundle.getString("loginFlowState");
                    if ((imageView.getDrawable() instanceof Animatable) != null) {
                        ((Animatable) imageView.getDrawable()).start();
                        return;
                    }
                    return;
                }
                ag.m4599a(getActivity(), view.getBackground(), a);
            }
        }
    }

    /* renamed from: a */
    static C4351a m4642a(@NonNull UIManager uIManager, LoginFlowState loginFlowState, int i) {
        uIManager = C1327y.m4641a(uIManager, loginFlowState);
        uIManager.m4590o().putInt("layoutResourceId", i);
        return uIManager;
    }

    /* renamed from: a */
    static C4351a m4641a(@NonNull UIManager uIManager, LoginFlowState loginFlowState) {
        C4351a c4351a = new C4351a();
        Bundle o = c4351a.m4590o();
        o.putParcelable(af.f3455f, uIManager);
        o.putString("loginFlowState", loginFlowState.name());
        return c4351a;
    }
}
