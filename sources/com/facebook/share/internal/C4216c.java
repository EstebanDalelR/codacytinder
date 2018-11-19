package com.facebook.share.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookCallback;
import com.facebook.internal.C1697a;
import com.facebook.internal.C1725l;
import com.facebook.internal.C3412d;
import com.facebook.internal.C3412d.C1703a;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.DialogPresenter.ParameterProvider;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.facebook.share.internal.c */
public class C4216c extends C3412d<LikeContent, C1830b> {
    /* renamed from: b */
    private static final int f13474b = RequestCodeOffset.Like.toRequestCode();

    @Deprecated
    /* renamed from: com.facebook.share.internal.c$b */
    public static final class C1830b {
        /* renamed from: a */
        private final Bundle f5016a;

        public C1830b(Bundle bundle) {
            this.f5016a = bundle;
        }
    }

    /* renamed from: com.facebook.share.internal.c$a */
    private class C3463a extends C1703a {
        /* renamed from: b */
        final /* synthetic */ C4216c f10488b;

        /* renamed from: a */
        public boolean m13181a(LikeContent likeContent, boolean z) {
            return false;
        }

        private C3463a(C4216c c4216c) {
            this.f10488b = c4216c;
            super(c4216c);
        }

        /* renamed from: a */
        public C1697a m13179a(final LikeContent likeContent) {
            C1697a d = this.f10488b.mo3371d();
            DialogPresenter.m5715a(d, new ParameterProvider(this) {
                /* renamed from: b */
                final /* synthetic */ C3463a f10487b;

                public Bundle getParameters() {
                    return C4216c.m16688c(likeContent);
                }

                public Bundle getLegacyParameters() {
                    Log.e("LikeDialog", "Attempting to present the Like Dialog with an outdated Facebook app on the device");
                    return new Bundle();
                }
            }, C4216c.m16692h());
            return d;
        }
    }

    /* renamed from: com.facebook.share.internal.c$c */
    private class C3464c extends C1703a {
        /* renamed from: b */
        final /* synthetic */ C4216c f10489b;

        /* renamed from: a */
        public boolean m13185a(LikeContent likeContent, boolean z) {
            return false;
        }

        private C3464c(C4216c c4216c) {
            this.f10489b = c4216c;
            super(c4216c);
        }

        /* renamed from: a */
        public C1697a m13183a(LikeContent likeContent) {
            C1697a d = this.f10489b.mo3371d();
            DialogPresenter.m5713a(d, C4216c.m16688c(likeContent), C4216c.m16692h());
            return d;
        }
    }

    @Deprecated
    /* renamed from: e */
    public static boolean m16689e() {
        return false;
    }

    @Deprecated
    /* renamed from: f */
    public static boolean m16690f() {
        return false;
    }

    @Deprecated
    /* renamed from: a */
    public void m16694a(LikeContent likeContent) {
    }

    @Deprecated
    public /* synthetic */ void show(Object obj) {
        m16694a((LikeContent) obj);
    }

    @Deprecated
    public C4216c(Activity activity) {
        super(activity, f13474b);
    }

    @Deprecated
    public C4216c(C1725l c1725l) {
        super(c1725l, f13474b);
    }

    /* renamed from: d */
    protected C1697a mo3371d() {
        return new C1697a(m13090a());
    }

    /* renamed from: c */
    protected List<C1703a> mo3370c() {
        List arrayList = new ArrayList();
        arrayList.add(new C3463a());
        arrayList.add(new C3464c());
        return arrayList;
    }

    /* renamed from: a */
    protected void mo3369a(CallbackManagerImpl callbackManagerImpl, final FacebookCallback<C1830b> facebookCallback) {
        facebookCallback = facebookCallback == null ? null : new C1834g(this, facebookCallback) {
            /* renamed from: b */
            final /* synthetic */ C4216c f10483b;

            /* renamed from: a */
            public void mo1894a(C1697a c1697a, Bundle bundle) {
                facebookCallback.onSuccess(new C1830b(bundle));
            }
        };
        callbackManagerImpl.m13083b(m13090a(), new Callback(this) {
            /* renamed from: b */
            final /* synthetic */ C4216c f10485b;

            public boolean onActivityResult(int i, Intent intent) {
                return C1838i.m6471a(this.f10485b.m13090a(), i, intent, facebookCallback);
            }
        });
    }

    /* renamed from: h */
    private static DialogFeature m16692h() {
        return LikeDialogFeature.LIKE_DIALOG;
    }

    /* renamed from: c */
    private static Bundle m16688c(LikeContent likeContent) {
        Bundle bundle = new Bundle();
        bundle.putString("object_id", likeContent.getObjectId());
        bundle.putString("object_type", likeContent.getObjectType());
        return bundle;
    }
}
