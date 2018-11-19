package com.facebook.login.widget;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.AccessToken;
import com.facebook.C1665c;
import com.facebook.C1674d;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.common.C1672a.C1666a;
import com.facebook.internal.C1709i;
import com.facebook.internal.C1712j;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.LoginAuthorizationType;
import com.facebook.internal.Utility;
import com.facebook.login.C1771d;
import com.facebook.login.C1780f.C1774b;
import com.facebook.login.C1780f.C1777e;
import com.facebook.login.C1780f.C1778f;
import com.facebook.login.C1780f.C1779g;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.widget.ToolTipPopup.Style;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LoginButton extends C1674d {
    /* renamed from: a */
    private static final String f10432a = "com.facebook.login.widget.LoginButton";
    /* renamed from: b */
    private boolean f10433b;
    /* renamed from: c */
    private String f10434c;
    /* renamed from: d */
    private String f10435d;
    /* renamed from: e */
    private C1785a f10436e = new C1785a();
    /* renamed from: f */
    private String f10437f = "fb_login_view_usage";
    /* renamed from: g */
    private boolean f10438g;
    /* renamed from: h */
    private Style f10439h = Style.BLUE;
    /* renamed from: i */
    private ToolTipMode f10440i;
    /* renamed from: j */
    private long f10441j = 6000;
    /* renamed from: k */
    private ToolTipPopup f10442k;
    /* renamed from: l */
    private C1665c f10443l;
    /* renamed from: m */
    private C1771d f10444m;

    public enum ToolTipMode {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        
        public static ToolTipMode DEFAULT;
        private int intValue;
        private String stringValue;

        static {
            DEFAULT = AUTOMATIC;
        }

        public static ToolTipMode fromInt(int i) {
            for (ToolTipMode toolTipMode : values()) {
                if (toolTipMode.getValue() == i) {
                    return toolTipMode;
                }
            }
            return 0;
        }

        private ToolTipMode(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public String toString() {
            return this.stringValue;
        }

        public int getValue() {
            return this.intValue;
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$a */
    static class C1785a {
        /* renamed from: a */
        private DefaultAudience f4866a = DefaultAudience.FRIENDS;
        /* renamed from: b */
        private List<String> f4867b = Collections.emptyList();
        /* renamed from: c */
        private LoginAuthorizationType f4868c = null;
        /* renamed from: d */
        private LoginBehavior f4869d = LoginBehavior.NATIVE_WITH_FALLBACK;

        C1785a() {
        }

        /* renamed from: a */
        public void m6147a(DefaultAudience defaultAudience) {
            this.f4866a = defaultAudience;
        }

        /* renamed from: a */
        public DefaultAudience m6146a() {
            return this.f4866a;
        }

        /* renamed from: a */
        public void m6149a(List<String> list) {
            if (LoginAuthorizationType.PUBLISH.equals(this.f4868c)) {
                throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
            }
            this.f4867b = list;
            this.f4868c = LoginAuthorizationType.READ;
        }

        /* renamed from: b */
        public void m6151b(List<String> list) {
            if (LoginAuthorizationType.READ.equals(this.f4868c)) {
                throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
            } else if (Utility.m5786a((Collection) list)) {
                throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
            } else {
                this.f4867b = list;
                this.f4868c = LoginAuthorizationType.PUBLISH;
            }
        }

        /* renamed from: b */
        List<String> m6150b() {
            return this.f4867b;
        }

        /* renamed from: a */
        public void m6148a(LoginBehavior loginBehavior) {
            this.f4869d = loginBehavior;
        }

        /* renamed from: c */
        public LoginBehavior m6152c() {
            return this.f4869d;
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$b */
    protected class C1787b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ LoginButton f4872a;

        protected C1787b(LoginButton loginButton) {
            this.f4872a = loginButton;
        }

        public void onClick(View view) {
            this.f4872a.m5664a(view);
            view = AccessToken.getCurrentAccessToken();
            if (AccessToken.isCurrentAccessTokenActive()) {
                m6154a(this.f4872a.getContext());
            } else {
                m6153a();
            }
            AppEventsLogger newLogger = AppEventsLogger.newLogger(this.f4872a.getContext());
            Bundle bundle = new Bundle();
            bundle.putInt("logging_in", view != null ? null : true);
            bundle.putInt("access_token_expired", AccessToken.isCurrentAccessTokenActive());
            newLogger.logSdkEvent(this.f4872a.f10437f, null, bundle);
        }

        /* renamed from: a */
        protected void m6153a() {
            C1771d b = m6155b();
            if (LoginAuthorizationType.PUBLISH.equals(this.f4872a.f10436e.f4868c)) {
                if (this.f4872a.getFragment() != null) {
                    b.m6140b(this.f4872a.getFragment(), this.f4872a.f10436e.f4867b);
                } else if (this.f4872a.getNativeFragment() != null) {
                    b.m6139b(this.f4872a.getNativeFragment(), this.f4872a.f10436e.f4867b);
                } else {
                    b.m6138b(this.f4872a.getActivity(), this.f4872a.f10436e.f4867b);
                }
            } else if (this.f4872a.getFragment() != null) {
                b.m6133a(this.f4872a.getFragment(), this.f4872a.f10436e.f4867b);
            } else if (this.f4872a.getNativeFragment() != null) {
                b.m6132a(this.f4872a.getNativeFragment(), this.f4872a.f10436e.f4867b);
            } else {
                b.m6131a(this.f4872a.getActivity(), this.f4872a.f10436e.f4867b);
            }
        }

        /* renamed from: a */
        protected void m6154a(Context context) {
            final C1771d b = m6155b();
            if (this.f4872a.f10433b) {
                CharSequence string;
                CharSequence string2 = this.f4872a.getResources().getString(C1777e.com_facebook_loginview_log_out_action);
                CharSequence string3 = this.f4872a.getResources().getString(C1777e.com_facebook_loginview_cancel_action);
                Profile currentProfile = Profile.getCurrentProfile();
                if (currentProfile == null || currentProfile.getName() == null) {
                    string = this.f4872a.getResources().getString(C1777e.com_facebook_loginview_logged_in_using_facebook);
                } else {
                    string = String.format(this.f4872a.getResources().getString(C1777e.com_facebook_loginview_logged_in_as), new Object[]{currentProfile.getName()});
                }
                Builder builder = new Builder(context);
                builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new DialogInterface.OnClickListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C1787b f4871b;

                    public void onClick(DialogInterface dialogInterface, int i) {
                        b.m6137b();
                    }
                }).setNegativeButton(string3, null);
                builder.create().show();
                return;
            }
            b.m6137b();
        }

        /* renamed from: b */
        protected C1771d m6155b() {
            C1771d a = C1771d.m6112a();
            a.m6129a(this.f4872a.getDefaultAudience());
            a.m6130a(this.f4872a.getLoginBehavior());
            return a;
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$2 */
    class C34382 extends C1665c {
        /* renamed from: a */
        final /* synthetic */ LoginButton f10431a;

        C34382(LoginButton loginButton) {
            this.f10431a = loginButton;
        }

        /* renamed from: a */
        protected void mo1873a(AccessToken accessToken, AccessToken accessToken2) {
            this.f10431a.m13139c();
        }
    }

    public LoginButton(Context context) {
        super(context, null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public void setDefaultAudience(DefaultAudience defaultAudience) {
        this.f10436e.m6147a(defaultAudience);
    }

    public DefaultAudience getDefaultAudience() {
        return this.f10436e.m6146a();
    }

    public void setReadPermissions(List<String> list) {
        this.f10436e.m6149a((List) list);
    }

    public void setReadPermissions(String... strArr) {
        this.f10436e.m6149a(Arrays.asList(strArr));
    }

    public void setPublishPermissions(List<String> list) {
        this.f10436e.m6151b((List) list);
    }

    public void setPublishPermissions(String... strArr) {
        this.f10436e.m6151b(Arrays.asList(strArr));
    }

    public void setLoginBehavior(LoginBehavior loginBehavior) {
        this.f10436e.m6148a(loginBehavior);
    }

    public LoginBehavior getLoginBehavior() {
        return this.f10436e.m6152c();
    }

    public void setToolTipStyle(Style style) {
        this.f10439h = style;
    }

    public void setToolTipMode(ToolTipMode toolTipMode) {
        this.f10440i = toolTipMode;
    }

    public ToolTipMode getToolTipMode() {
        return this.f10440i;
    }

    public void setToolTipDisplayTime(long j) {
        this.f10441j = j;
    }

    public long getToolTipDisplayTime() {
        return this.f10441j;
    }

    /* renamed from: a */
    public void mo1874a() {
        if (this.f10442k != null) {
            this.f10442k.m6180b();
            this.f10442k = null;
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10443l != null && !this.f10443l.m5651c()) {
            this.f10443l.m5648a();
            m13139c();
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10438g == null && isInEditMode() == null) {
            this.f10438g = true;
            m13133b();
        }
    }

    /* renamed from: a */
    private void m13130a(C1709i c1709i) {
        if (c1709i != null && c1709i.m5898c() && getVisibility() == 0) {
            m13136b(c1709i.m5897b());
        }
    }

    /* renamed from: b */
    private void m13136b(String str) {
        this.f10442k = new ToolTipPopup(str, this);
        this.f10442k.m6179a(this.f10439h);
        this.f10442k.m6178a(this.f10441j);
        this.f10442k.m6177a();
    }

    /* renamed from: b */
    private void m13133b() {
        switch (this.f10440i) {
            case AUTOMATIC:
                final String a = Utility.m5755a(getContext());
                FacebookSdk.m3990c().execute(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ LoginButton f4864b;

                    public void run() {
                        final C1709i a = C1712j.m5909a(a, false);
                        this.f4864b.getActivity().runOnUiThread(new Runnable(this) {
                            /* renamed from: b */
                            final /* synthetic */ C17831 f4862b;

                            public void run() {
                                this.f4862b.f4864b.m13130a(a);
                            }
                        });
                    }
                });
                return;
            case DISPLAY_ALWAYS:
                m13136b(getResources().getString(C1777e.com_facebook_tooltip_default));
                return;
            default:
                return;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m13139c();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f10443l != null) {
            this.f10443l.m5650b();
        }
        mo1874a();
    }

    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            mo1874a();
        }
    }

    List<String> getPermissions() {
        return this.f10436e.m6150b();
    }

    void setProperties(C1785a c1785a) {
        this.f10436e = c1785a;
    }

    /* renamed from: a */
    protected void mo1875a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo1875a(context, attributeSet, i, i2);
        setInternalOnClickListener(getNewLoginClickListener());
        m13134b(context, attributeSet, i, i2);
        if (isInEditMode() != null) {
            setBackgroundColor(getResources().getColor(C1666a.com_facebook_blue));
            this.f10434c = "Continue with Facebook";
        } else {
            this.f10443l = new C34382(this);
        }
        m13139c();
        setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.getDrawable(getContext(), C1774b.com_facebook_button_login_logo), null, null, null);
    }

    protected C1787b getNewLoginClickListener() {
        return new C1787b(this);
    }

    protected int getDefaultStyleResource() {
        return C1778f.com_facebook_loginview_default_style;
    }

    /* renamed from: b */
    private void m13134b(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f10440i = ToolTipMode.DEFAULT;
        context = context.getTheme().obtainStyledAttributes(attributeSet, C1779g.com_facebook_login_view, i, i2);
        try {
            this.f10433b = context.getBoolean(C1779g.com_facebook_login_view_com_facebook_confirm_logout, 1);
            this.f10434c = context.getString(C1779g.com_facebook_login_view_com_facebook_login_text);
            this.f10435d = context.getString(C1779g.com_facebook_login_view_com_facebook_logout_text);
            this.f10440i = ToolTipMode.fromInt(context.getInt(C1779g.com_facebook_login_view_com_facebook_tooltip_mode, ToolTipMode.DEFAULT.getValue()));
        } finally {
            context.recycle();
        }
    }

    protected void onMeasure(int i, int i2) {
        i2 = getPaint().getFontMetrics();
        int compoundPaddingTop = (getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(i2.top) + Math.abs(i2.bottom))))) + getCompoundPaddingBottom();
        i2 = getResources();
        String str = this.f10434c;
        if (str == null) {
            str = i2.getString(C1777e.com_facebook_loginview_log_in_button_continue);
            int c = m13137c(str);
            if (resolveSize(c, i) < c) {
                str = i2.getString(C1777e.com_facebook_loginview_log_in_button);
            }
        }
        int c2 = m13137c(str);
        String str2 = this.f10435d;
        if (str2 == null) {
            str2 = i2.getString(C1777e.com_facebook_loginview_log_out_button);
        }
        setMeasuredDimension(resolveSize(Math.max(c2, m13137c(str2)), i), compoundPaddingTop);
    }

    /* renamed from: c */
    private int m13137c(String str) {
        return ((getCompoundPaddingLeft() + getCompoundDrawablePadding()) + m5662a(str)) + getCompoundPaddingRight();
    }

    /* renamed from: c */
    private void m13139c() {
        Resources resources = getResources();
        if (!isInEditMode() && AccessToken.isCurrentAccessTokenActive()) {
            CharSequence charSequence;
            if (this.f10435d != null) {
                charSequence = this.f10435d;
            } else {
                charSequence = resources.getString(C1777e.com_facebook_loginview_log_out_button);
            }
            setText(charSequence);
        } else if (this.f10434c != null) {
            setText(this.f10434c);
        } else {
            CharSequence string = resources.getString(C1777e.com_facebook_loginview_log_in_button_continue);
            int width = getWidth();
            if (width != 0 && m13137c((String) string) > width) {
                string = resources.getString(C1777e.com_facebook_loginview_log_in_button);
            }
            setText(string);
        }
    }

    protected int getDefaultRequestCode() {
        return RequestCodeOffset.Login.toRequestCode();
    }

    C1771d getLoginManager() {
        if (this.f10444m == null) {
            this.f10444m = C1771d.m6112a();
        }
        return this.f10444m;
    }

    void setLoginManager(C1771d c1771d) {
        this.f10444m = c1771d;
    }
}
