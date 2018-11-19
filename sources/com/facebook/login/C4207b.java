package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.C1672a.C1668c;
import com.facebook.common.C1672a.C1669d;
import com.facebook.login.LoginClient.C1767a;
import com.facebook.login.LoginClient.OnCompletedListener;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;

/* renamed from: com.facebook.login.b */
public class C4207b extends Fragment {
    /* renamed from: a */
    private String f13447a;
    /* renamed from: b */
    private LoginClient f13448b;
    /* renamed from: c */
    private Request f13449c;

    /* renamed from: com.facebook.login.b$1 */
    class C34321 implements OnCompletedListener {
        /* renamed from: a */
        final /* synthetic */ C4207b f10423a;

        C34321(C4207b c4207b) {
            this.f10423a = c4207b;
        }

        public void onCompleted(Result result) {
            this.f10423a.m16659a(result);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f13448b = (LoginClient) bundle.getParcelable("loginClient");
            this.f13448b.setFragment(this);
        } else {
            this.f13448b = m16661a();
        }
        this.f13448b.setOnCompletedListener(new C34321(this));
        Activity activity = getActivity();
        if (activity != null) {
            m16658a(activity);
            bundle = activity.getIntent();
            if (bundle != null) {
                bundle = bundle.getBundleExtra("com.facebook.LoginFragment:Request");
                if (bundle != null) {
                    this.f13449c = (Request) bundle.getParcelable("request");
                }
            }
        }
    }

    /* renamed from: a */
    protected LoginClient m16661a() {
        return new LoginClient((Fragment) this);
    }

    public void onDestroy() {
        this.f13448b.cancelCurrentHandler();
        super.onDestroy();
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        layoutInflater = layoutInflater.inflate(C1669d.com_facebook_login_fragment, viewGroup, false);
        viewGroup = layoutInflater.findViewById(C1668c.com_facebook_login_fragment_progress_bar);
        this.f13448b.setBackgroundProcessingListener(new C1767a(this) {
            /* renamed from: b */
            final /* synthetic */ C4207b f10425b;

            /* renamed from: a */
            public void mo1869a() {
                viewGroup.setVisibility(0);
            }

            /* renamed from: b */
            public void mo1870b() {
                viewGroup.setVisibility(8);
            }
        });
        return layoutInflater;
    }

    /* renamed from: a */
    private void m16659a(Result result) {
        this.f13449c = null;
        int i = result.code == Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        result = new Intent();
        result.putExtras(bundle);
        if (isAdded()) {
            getActivity().setResult(i, result);
            getActivity().finish();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f13447a == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            return;
        }
        this.f13448b.startOrContinueAuth(this.f13449c);
    }

    public void onPause() {
        View view;
        super.onPause();
        if (getView() == null) {
            view = null;
        } else {
            view = getView().findViewById(C1668c.com_facebook_login_fragment_progress_bar);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f13448b.onActivityResult(i, i2, intent);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f13448b);
    }

    /* renamed from: a */
    private void m16658a(Activity activity) {
        activity = activity.getCallingActivity();
        if (activity != null) {
            this.f13447a = activity.getPackageName();
        }
    }

    /* renamed from: b */
    LoginClient m16662b() {
        return this.f13448b;
    }
}
