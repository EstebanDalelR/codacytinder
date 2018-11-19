package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.view.accessibility.C0586b;
import android.support.v4.view.accessibility.C0588c;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.view.a */
public class C0582a {
    private static final AccessibilityDelegate DEFAULT_DELEGATE = new AccessibilityDelegate();
    private static final C0578b IMPL;
    final AccessibilityDelegate mBridge = IMPL.mo590a(this);

    /* renamed from: android.support.v4.view.a$b */
    static class C0578b {
        /* renamed from: a */
        public C0588c mo589a(AccessibilityDelegate accessibilityDelegate, View view) {
            return null;
        }

        /* renamed from: a */
        public boolean mo591a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return false;
        }

        C0578b() {
        }

        /* renamed from: a */
        public AccessibilityDelegate mo590a(final C0582a c0582a) {
            return new AccessibilityDelegate(this) {
                /* renamed from: b */
                final /* synthetic */ C0578b f1779b;

                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return c0582a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0582a.onInitializeAccessibilityEvent(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    c0582a.onInitializeAccessibilityNodeInfo(view, C0586b.m2251a(accessibilityNodeInfo));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0582a.onPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0582a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }

                public void sendAccessibilityEvent(View view, int i) {
                    c0582a.sendAccessibilityEvent(view, i);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    c0582a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                }
            };
        }
    }

    @RequiresApi(16)
    /* renamed from: android.support.v4.view.a$a */
    static class C2888a extends C0578b {
        C2888a() {
        }

        /* renamed from: a */
        public AccessibilityDelegate mo590a(final C0582a c0582a) {
            return new AccessibilityDelegate(this) {
                /* renamed from: b */
                final /* synthetic */ C2888a f1777b;

                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return c0582a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0582a.onInitializeAccessibilityEvent(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    c0582a.onInitializeAccessibilityNodeInfo(view, C0586b.m2251a(accessibilityNodeInfo));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0582a.onPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0582a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }

                public void sendAccessibilityEvent(View view, int i) {
                    c0582a.sendAccessibilityEvent(view, i);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    c0582a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                }

                public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    view = c0582a.getAccessibilityNodeProvider(view);
                    return view != null ? (AccessibilityNodeProvider) view.m2302a() : null;
                }

                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    return c0582a.performAccessibilityAction(view, i, bundle);
                }
            };
        }

        /* renamed from: a */
        public C0588c mo589a(AccessibilityDelegate accessibilityDelegate, View view) {
            accessibilityDelegate = accessibilityDelegate.getAccessibilityNodeProvider(view);
            return accessibilityDelegate != null ? new C0588c(accessibilityDelegate) : null;
        }

        /* renamed from: a */
        public boolean mo591a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            IMPL = new C2888a();
        } else {
            IMPL = new C0578b();
        }
    }

    AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void sendAccessibilityEvent(View view, int i) {
        DEFAULT_DELEGATE.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        DEFAULT_DELEGATE.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return DEFAULT_DELEGATE.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        DEFAULT_DELEGATE.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        DEFAULT_DELEGATE.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C0586b c0586b) {
        DEFAULT_DELEGATE.onInitializeAccessibilityNodeInfo(view, c0586b.m2254a());
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return DEFAULT_DELEGATE.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public C0588c getAccessibilityNodeProvider(View view) {
        return IMPL.mo589a(DEFAULT_DELEGATE, view);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return IMPL.mo591a(DEFAULT_DELEGATE, view, i, bundle);
    }
}
