package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Bundle;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.lifecycle.k */
public class C0025k extends Fragment {
    /* renamed from: a */
    private C0024a f54a;

    /* renamed from: android.arch.lifecycle.k$a */
    interface C0024a {
        /* renamed from: a */
        void mo41a();

        /* renamed from: b */
        void mo42b();

        /* renamed from: c */
        void mo43c();
    }

    /* renamed from: a */
    public static void m111a(Activity activity) {
        activity = activity.getFragmentManager();
        if (activity.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            activity.beginTransaction().add(new C0025k(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            activity.executePendingTransactions();
        }
    }

    /* renamed from: b */
    static C0025k m113b(Activity activity) {
        return (C0025k) activity.getFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: b */
    private void m114b(C0024a c0024a) {
        if (c0024a != null) {
            c0024a.mo41a();
        }
    }

    /* renamed from: c */
    private void m115c(C0024a c0024a) {
        if (c0024a != null) {
            c0024a.mo42b();
        }
    }

    /* renamed from: d */
    private void m116d(C0024a c0024a) {
        if (c0024a != null) {
            c0024a.mo43c();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m114b(this.f54a);
        m112a(Event.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        m115c(this.f54a);
        m112a(Event.ON_START);
    }

    public void onResume() {
        super.onResume();
        m116d(this.f54a);
        m112a(Event.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        m112a(Event.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        m112a(Event.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        m112a(Event.ON_DESTROY);
        this.f54a = null;
    }

    /* renamed from: a */
    private void m112a(Event event) {
        Activity activity = getActivity();
        if (activity instanceof LifecycleRegistryOwner) {
            ((LifecycleRegistryOwner) activity).getLifecycle().m10469a(event);
            return;
        }
        if (activity instanceof LifecycleOwner) {
            Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
            if (lifecycle instanceof C2684e) {
                ((C2684e) lifecycle).m10469a(event);
            }
        }
    }

    /* renamed from: a */
    void m117a(C0024a c0024a) {
        this.f54a = c0024a;
    }
}
