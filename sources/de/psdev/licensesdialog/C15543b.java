package de.psdev.licensesdialog;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.webkit.WebView;
import com.facebook.ads.AudienceNetworkActivity;
import de.psdev.licensesdialog.C15548e.C15547b;
import de.psdev.licensesdialog.licenses.ApacheSoftwareLicense20;
import de.psdev.licensesdialog.model.Notice;
import de.psdev.licensesdialog.model.Notices;
import javax.annotation.Nullable;

/* renamed from: de.psdev.licensesdialog.b */
public class C15543b {
    /* renamed from: a */
    public static final Notice f48019a = new Notice("LicensesDialog", "http://psdev.de/LicensesDialog", "Copyright 2013 Philip Schiffer", new ApacheSoftwareLicense20());
    /* renamed from: b */
    private final Context f48020b;
    /* renamed from: c */
    private final String f48021c;
    /* renamed from: d */
    private final String f48022d;
    /* renamed from: e */
    private final String f48023e;
    /* renamed from: f */
    private final int f48024f;
    /* renamed from: g */
    private final int f48025g;
    /* renamed from: h */
    private OnDismissListener f48026h;

    /* renamed from: de.psdev.licensesdialog.b$1 */
    class C155391 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C15543b f48004a;

        C155391(C15543b c15543b) {
            this.f48004a = c15543b;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: de.psdev.licensesdialog.b$2 */
    class C155402 implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ C15543b f48005a;

        C155402(C15543b c15543b) {
            this.f48005a = c15543b;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f48005a.f48026h != null) {
                this.f48005a.f48026h.onDismiss(dialogInterface);
            }
        }
    }

    /* renamed from: de.psdev.licensesdialog.b$a */
    public static final class C15542a {
        /* renamed from: a */
        private final Context f48008a;
        /* renamed from: b */
        private String f48009b;
        /* renamed from: c */
        private String f48010c;
        @Nullable
        /* renamed from: d */
        private Integer f48011d;
        @Nullable
        /* renamed from: e */
        private Notices f48012e;
        @Nullable
        /* renamed from: f */
        private String f48013f;
        /* renamed from: g */
        private String f48014g;
        /* renamed from: h */
        private boolean f48015h = false;
        /* renamed from: i */
        private boolean f48016i = false;
        /* renamed from: j */
        private int f48017j = 0;
        /* renamed from: k */
        private int f48018k = 0;

        public C15542a(Context context) {
            this.f48008a = context;
            this.f48009b = context.getString(C15547b.notices_title);
            this.f48010c = context.getString(C15547b.notices_close);
            this.f48014g = context.getString(C15547b.notices_default_style);
        }

        /* renamed from: a */
        public C15542a m58030a(int i) {
            this.f48009b = this.f48008a.getString(i);
            return this;
        }

        /* renamed from: a */
        public C15542a m58031a(Notices notices) {
            this.f48012e = notices;
            this.f48011d = null;
            return this;
        }

        /* renamed from: a */
        public C15542a m58032a(boolean z) {
            this.f48016i = z;
            return this;
        }

        /* renamed from: a */
        public C15543b m58033a() {
            String a;
            if (this.f48012e != null) {
                a = C15543b.m58039b(this.f48008a, this.f48012e, this.f48015h, this.f48016i, this.f48014g);
            } else if (this.f48011d != null) {
                a = C15543b.m58039b(this.f48008a, C15543b.m58038b(this.f48008a, this.f48011d.intValue()), this.f48015h, this.f48016i, this.f48014g);
            } else if (this.f48013f != null) {
                a = this.f48013f;
            } else {
                throw new IllegalStateException("Notices have to be provided, see setNotices");
            }
            return new C15543b(this.f48008a, a, this.f48009b, this.f48010c, this.f48017j, this.f48018k);
        }
    }

    private C15543b(Context context, String str, String str2, String str3, int i, int i2) {
        this.f48020b = context;
        this.f48021c = str2;
        this.f48022d = str;
        this.f48023e = str3;
        this.f48024f = i;
        this.f48025g = i2;
    }

    /* renamed from: a */
    public Dialog m58041a() {
        Builder builder;
        View webView = new WebView(this.f48020b);
        webView.loadDataWithBaseURL(null, this.f48022d, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
        if (this.f48024f != 0) {
            builder = new Builder(new ContextThemeWrapper(this.f48020b, this.f48024f));
        } else {
            builder = new Builder(this.f48020b);
        }
        builder.setTitle(this.f48021c).setView(webView).setPositiveButton(this.f48023e, new C155391(this));
        final Dialog create = builder.create();
        create.setOnDismissListener(new C155402(this));
        create.setOnShowListener(new OnShowListener(this) {
            /* renamed from: b */
            final /* synthetic */ C15543b f48007b;

            public void onShow(DialogInterface dialogInterface) {
                if (this.f48007b.f48025g != null) {
                    dialogInterface = create.findViewById(this.f48007b.f48020b.getResources().getIdentifier("titleDivider", "id", "android"));
                    if (dialogInterface != null) {
                        dialogInterface.setBackgroundColor(this.f48007b.f48025g);
                    }
                }
            }
        });
        return create;
    }

    /* renamed from: b */
    public Dialog m58042b() {
        Dialog a = m58041a();
        a.show();
        return a;
    }

    /* renamed from: b */
    private static Notices m58038b(Context context, int i) {
        try {
            context = context.getResources();
            if ("raw".equals(context.getResourceTypeName(i))) {
                return C15545d.m58052a(context.openRawResource(i));
            }
            throw new IllegalStateException("not a raw resource");
        } catch (Context context2) {
            throw new IllegalStateException(context2);
        }
    }

    /* renamed from: b */
    private static String m58039b(Context context, Notices notices, boolean z, boolean z2, String str) {
        if (z2) {
            try {
                notices.getNotices().add(f48019a);
            } catch (Context context2) {
                throw new IllegalStateException(context2);
            }
        }
        return C15544c.m58043a(context2).m58050a(z).m58048a(notices).m58049a(str).m58051a();
    }
}
