package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.login.C1780f.C1774b;
import com.facebook.login.C1780f.C1775c;
import com.facebook.login.C1780f.C1776d;
import java.lang.ref.WeakReference;

public class ToolTipPopup {
    /* renamed from: a */
    private final String f4892a;
    /* renamed from: b */
    private final WeakReference<View> f4893b;
    /* renamed from: c */
    private final Context f4894c;
    /* renamed from: d */
    private C1791a f4895d;
    /* renamed from: e */
    private PopupWindow f4896e;
    /* renamed from: f */
    private Style f4897f = Style.BLUE;
    /* renamed from: g */
    private long f4898g = 6000;
    /* renamed from: h */
    private final OnScrollChangedListener f4899h = new C17881(this);

    /* renamed from: com.facebook.login.widget.ToolTipPopup$1 */
    class C17881 implements OnScrollChangedListener {
        /* renamed from: a */
        final /* synthetic */ ToolTipPopup f4884a;

        C17881(ToolTipPopup toolTipPopup) {
            this.f4884a = toolTipPopup;
        }

        public void onScrollChanged() {
            if (this.f4884a.f4893b.get() != null && this.f4884a.f4896e != null && this.f4884a.f4896e.isShowing()) {
                if (this.f4884a.f4896e.isAboveAnchor()) {
                    this.f4884a.f4895d.m6170b();
                } else {
                    this.f4884a.f4895d.m6169a();
                }
            }
        }
    }

    /* renamed from: com.facebook.login.widget.ToolTipPopup$2 */
    class C17892 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ToolTipPopup f4885a;

        C17892(ToolTipPopup toolTipPopup) {
            this.f4885a = toolTipPopup;
        }

        public void run() {
            this.f4885a.m6180b();
        }
    }

    /* renamed from: com.facebook.login.widget.ToolTipPopup$3 */
    class C17903 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ToolTipPopup f4886a;

        C17903(ToolTipPopup toolTipPopup) {
            this.f4886a = toolTipPopup;
        }

        public void onClick(View view) {
            this.f4886a.m6180b();
        }
    }

    public enum Style {
        BLUE,
        BLACK
    }

    /* renamed from: com.facebook.login.widget.ToolTipPopup$a */
    private class C1791a extends FrameLayout {
        /* renamed from: a */
        final /* synthetic */ ToolTipPopup f4887a;
        /* renamed from: b */
        private ImageView f4888b;
        /* renamed from: c */
        private ImageView f4889c;
        /* renamed from: d */
        private View f4890d;
        /* renamed from: e */
        private ImageView f4891e;

        public C1791a(ToolTipPopup toolTipPopup, Context context) {
            this.f4887a = toolTipPopup;
            super(context);
            m6167c();
        }

        /* renamed from: c */
        private void m6167c() {
            LayoutInflater.from(getContext()).inflate(C1776d.com_facebook_tooltip_bubble, this);
            this.f4888b = (ImageView) findViewById(C1775c.com_facebook_tooltip_bubble_view_top_pointer);
            this.f4889c = (ImageView) findViewById(C1775c.com_facebook_tooltip_bubble_view_bottom_pointer);
            this.f4890d = findViewById(C1775c.com_facebook_body_frame);
            this.f4891e = (ImageView) findViewById(C1775c.com_facebook_button_xout);
        }

        /* renamed from: a */
        public void m6169a() {
            this.f4888b.setVisibility(0);
            this.f4889c.setVisibility(4);
        }

        /* renamed from: b */
        public void m6170b() {
            this.f4888b.setVisibility(4);
            this.f4889c.setVisibility(0);
        }
    }

    public ToolTipPopup(String str, View view) {
        this.f4892a = str;
        this.f4893b = new WeakReference(view);
        this.f4894c = view.getContext();
    }

    /* renamed from: a */
    public void m6179a(Style style) {
        this.f4897f = style;
    }

    /* renamed from: a */
    public void m6177a() {
        if (this.f4893b.get() != null) {
            this.f4895d = new C1791a(this, this.f4894c);
            ((TextView) this.f4895d.findViewById(C1775c.com_facebook_tooltip_bubble_view_text_body)).setText(this.f4892a);
            if (this.f4897f == Style.BLUE) {
                this.f4895d.f4890d.setBackgroundResource(C1774b.com_facebook_tooltip_blue_background);
                this.f4895d.f4889c.setImageResource(C1774b.com_facebook_tooltip_blue_bottomnub);
                this.f4895d.f4888b.setImageResource(C1774b.com_facebook_tooltip_blue_topnub);
                this.f4895d.f4891e.setImageResource(C1774b.com_facebook_tooltip_blue_xout);
            } else {
                this.f4895d.f4890d.setBackgroundResource(C1774b.com_facebook_tooltip_black_background);
                this.f4895d.f4889c.setImageResource(C1774b.com_facebook_tooltip_black_bottomnub);
                this.f4895d.f4888b.setImageResource(C1774b.com_facebook_tooltip_black_topnub);
                this.f4895d.f4891e.setImageResource(C1774b.com_facebook_tooltip_black_xout);
            }
            View decorView = ((Activity) this.f4894c).getWindow().getDecorView();
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            m6175d();
            this.f4895d.measure(MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
            this.f4896e = new PopupWindow(this.f4895d, this.f4895d.getMeasuredWidth(), this.f4895d.getMeasuredHeight());
            this.f4896e.showAsDropDown((View) this.f4893b.get());
            m6174c();
            if (this.f4898g > 0) {
                this.f4895d.postDelayed(new C17892(this), this.f4898g);
            }
            this.f4896e.setTouchable(true);
            this.f4895d.setOnClickListener(new C17903(this));
        }
    }

    /* renamed from: a */
    public void m6178a(long j) {
        this.f4898g = j;
    }

    /* renamed from: c */
    private void m6174c() {
        if (this.f4896e != null && this.f4896e.isShowing()) {
            if (this.f4896e.isAboveAnchor()) {
                this.f4895d.m6170b();
            } else {
                this.f4895d.m6169a();
            }
        }
    }

    /* renamed from: b */
    public void m6180b() {
        m6176e();
        if (this.f4896e != null) {
            this.f4896e.dismiss();
        }
    }

    /* renamed from: d */
    private void m6175d() {
        m6176e();
        if (this.f4893b.get() != null) {
            ((View) this.f4893b.get()).getViewTreeObserver().addOnScrollChangedListener(this.f4899h);
        }
    }

    /* renamed from: e */
    private void m6176e() {
        if (this.f4893b.get() != null) {
            ((View) this.f4893b.get()).getViewTreeObserver().removeOnScrollChangedListener(this.f4899h);
        }
    }
}
