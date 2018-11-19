package com.tinder.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.tinder.R;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import javax.inject.Inject;

public class as extends Fragment {
    /* renamed from: a */
    public static final String f42211a = "as";
    @Inject
    /* renamed from: b */
    LegacyBreadCrumbTracker f42212b;
    /* renamed from: c */
    private ProgressBar f42213c;
    /* renamed from: d */
    private WebView f42214d;

    /* renamed from: com.tinder.fragments.as$1 */
    class C96331 extends WebChromeClient {
        /* renamed from: a */
        final /* synthetic */ as f32176a;

        /* renamed from: com.tinder.fragments.as$1$1 */
        class C96321 extends AnimatorListenerAdapter {
            /* renamed from: a */
            final /* synthetic */ C96331 f32175a;

            C96321(C96331 c96331) {
                this.f32175a = c96331;
            }

            public void onAnimationEnd(Animator animator) {
                this.f32175a.f32176a.f42213c.setVisibility(8);
            }
        }

        C96331(as asVar) {
            this.f32176a = asVar;
        }

        public void onProgressChanged(WebView webView, int i) {
            this.f32176a.f42213c.setProgress(i);
            if (i == 100) {
                this.f32176a.f42213c.animate().alpha(0.0f).setListener(new C96321(this));
                this.f32176a.f42214d.setAlpha(0.0f);
                this.f32176a.f42214d.animate().alpha(1065353216);
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public static as m51516a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        str = new as();
        str.setArguments(bundle);
        return str;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.fragment_webview, viewGroup, false);
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f42214d = (WebView) view.findViewById(R.id.fragment_webview);
        this.f42213c = (ProgressBar) view.findViewById(R.id.fragment_webview_loading);
        view = getArguments().getString("url");
        bundle = this.f42214d.getSettings();
        bundle.setJavaScriptEnabled(true);
        bundle.setDomStorageEnabled(true);
        bundle.setAllowFileAccess(false);
        bundle.setAllowContentAccess(false);
        this.f42214d.setWebChromeClient(new C96331(this));
        this.f42214d.loadUrl(view);
    }

    public void onResume() {
        super.onResume();
        this.f42212b.m40475a((Fragment) this);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        ManagerApp.e().inject(this);
    }
}
