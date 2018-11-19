package com.facebook.share.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.C0436c;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.FacebookException;
import com.facebook.internal.C1725l;
import com.facebook.internal.C1745t;
import com.facebook.internal.Utility;
import com.facebook.share.internal.C3459b;
import com.facebook.share.internal.LikeActionController;
import com.facebook.share.internal.LikeActionController.CreationCallback;
import com.facebook.share.internal.LikeBoxCountView;
import com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition;
import com.tinder.model.analytics.AnalyticsConstants;

@Deprecated
public class LikeView extends FrameLayout {
    /* renamed from: a */
    private String f5028a;
    /* renamed from: b */
    private ObjectType f5029b;
    /* renamed from: c */
    private LinearLayout f5030c;
    /* renamed from: d */
    private C3459b f5031d;
    /* renamed from: e */
    private LikeBoxCountView f5032e;
    /* renamed from: f */
    private TextView f5033f;
    /* renamed from: g */
    private LikeActionController f5034g;
    /* renamed from: h */
    private OnErrorListener f5035h;
    /* renamed from: i */
    private BroadcastReceiver f5036i;
    /* renamed from: j */
    private C3475a f5037j;
    /* renamed from: k */
    private Style f5038k;
    /* renamed from: l */
    private HorizontalAlignment f5039l;
    /* renamed from: m */
    private AuxiliaryViewPosition f5040m;
    /* renamed from: n */
    private int f5041n;
    /* renamed from: o */
    private int f5042o;
    /* renamed from: p */
    private int f5043p;
    /* renamed from: q */
    private C1725l f5044q;
    /* renamed from: r */
    private boolean f5045r;

    /* renamed from: com.facebook.share.widget.LikeView$1 */
    class C18601 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ LikeView f5025a;

        public void onClick(View view) {
            this.f5025a.m6522a();
        }
    }

    @Deprecated
    public enum AuxiliaryViewPosition {
        BOTTOM("bottom", 0),
        INLINE("inline", 1),
        TOP("top", 2);
        
        static AuxiliaryViewPosition DEFAULT;
        private int intValue;
        private String stringValue;

        static {
            DEFAULT = BOTTOM;
        }

        static AuxiliaryViewPosition fromInt(int i) {
            for (AuxiliaryViewPosition auxiliaryViewPosition : values()) {
                if (auxiliaryViewPosition.getValue() == i) {
                    return auxiliaryViewPosition;
                }
            }
            return 0;
        }

        private AuxiliaryViewPosition(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public String toString() {
            return this.stringValue;
        }

        private int getValue() {
            return this.intValue;
        }
    }

    @Deprecated
    public enum HorizontalAlignment {
        CENTER("center", 0),
        LEFT("left", 1),
        RIGHT("right", 2);
        
        static HorizontalAlignment DEFAULT;
        private int intValue;
        private String stringValue;

        static {
            DEFAULT = CENTER;
        }

        static HorizontalAlignment fromInt(int i) {
            for (HorizontalAlignment horizontalAlignment : values()) {
                if (horizontalAlignment.getValue() == i) {
                    return horizontalAlignment;
                }
            }
            return 0;
        }

        private HorizontalAlignment(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public String toString() {
            return this.stringValue;
        }

        private int getValue() {
            return this.intValue;
        }
    }

    @Deprecated
    public enum ObjectType {
        UNKNOWN("unknown", 0),
        OPEN_GRAPH("open_graph", 1),
        PAGE("page", 2);
        
        public static ObjectType DEFAULT;
        private int intValue;
        private String stringValue;

        static {
            DEFAULT = UNKNOWN;
        }

        public static ObjectType fromInt(int i) {
            for (ObjectType objectType : values()) {
                if (objectType.getValue() == i) {
                    return objectType;
                }
            }
            return 0;
        }

        private ObjectType(String str, int i) {
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

    public interface OnErrorListener {
        void onError(FacebookException facebookException);
    }

    @Deprecated
    public enum Style {
        STANDARD("standard", 0),
        BUTTON(AnalyticsConstants.VALUE_SHARE_METHOD_BUTTON, 1),
        BOX_COUNT("box_count", 2);
        
        static Style DEFAULT;
        private int intValue;
        private String stringValue;

        static {
            DEFAULT = STANDARD;
        }

        static Style fromInt(int i) {
            for (Style style : values()) {
                if (style.getValue() == i) {
                    return style;
                }
            }
            return 0;
        }

        private Style(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public String toString() {
            return this.stringValue;
        }

        private int getValue() {
            return this.intValue;
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$b */
    private class C1862b extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ LikeView f5027a;

        private C1862b(LikeView likeView) {
            this.f5027a = likeView;
        }

        public void onReceive(Context context, Intent intent) {
            context = intent.getAction();
            Bundle extras = intent.getExtras();
            Object obj = 1;
            if (extras != null) {
                Object string = extras.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
                if (!Utility.m5785a((String) string)) {
                    if (!Utility.m5784a(this.f5027a.f5028a, string)) {
                        obj = null;
                    }
                }
            }
            if (obj != null) {
                if ("com.facebook.sdk.LikeActionController.UPDATED".equals(context)) {
                    this.f5027a.m6530c();
                } else if ("com.facebook.sdk.LikeActionController.DID_ERROR".equals(context)) {
                    if (this.f5027a.f5035h != null) {
                        this.f5027a.f5035h.onError(C1745t.m6028a(extras));
                    }
                } else if ("com.facebook.sdk.LikeActionController.DID_RESET".equals(context) != null) {
                    this.f5027a.m6529b(this.f5027a.f5028a, this.f5027a.f5029b);
                    this.f5027a.m6530c();
                }
            }
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$a */
    private class C3475a implements CreationCallback {
        /* renamed from: a */
        final /* synthetic */ LikeView f10499a;
        /* renamed from: b */
        private boolean f10500b;

        private C3475a(LikeView likeView) {
            this.f10499a = likeView;
        }

        /* renamed from: a */
        public void m13198a() {
            this.f10500b = true;
        }

        public void onComplete(LikeActionController likeActionController, FacebookException facebookException) {
            if (!this.f10500b) {
                if (likeActionController != null) {
                    if (!likeActionController.m6339e()) {
                        facebookException = new FacebookException("Cannot use LikeView. The device may not be supported.");
                    }
                    this.f10499a.m6523a(likeActionController);
                    this.f10499a.m6530c();
                }
                if (!(facebookException == null || this.f10499a.f5035h == null)) {
                    this.f10499a.f5035h.onError(facebookException);
                }
                this.f10499a.f5037j = null;
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public void m6536a(String str, ObjectType objectType) {
        Object a = Utility.m5758a(str, null);
        if (objectType == null) {
            objectType = ObjectType.DEFAULT;
        }
        if (!Utility.m5784a(a, this.f5028a) || objectType != this.f5029b) {
            m6529b(a, objectType);
            m6530c();
        }
    }

    @Deprecated
    public void setLikeViewStyle(Style style) {
        if (style == null) {
            style = Style.DEFAULT;
        }
        if (this.f5038k != style) {
            this.f5038k = style;
            m6533d();
        }
    }

    @Deprecated
    public void setAuxiliaryViewPosition(AuxiliaryViewPosition auxiliaryViewPosition) {
        if (auxiliaryViewPosition == null) {
            auxiliaryViewPosition = AuxiliaryViewPosition.DEFAULT;
        }
        if (this.f5040m != auxiliaryViewPosition) {
            this.f5040m = auxiliaryViewPosition;
            m6533d();
        }
    }

    @Deprecated
    public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
        if (horizontalAlignment == null) {
            horizontalAlignment = HorizontalAlignment.DEFAULT;
        }
        if (this.f5039l != horizontalAlignment) {
            this.f5039l = horizontalAlignment;
            m6533d();
        }
    }

    @Deprecated
    public void setForegroundColor(int i) {
        if (this.f5041n != i) {
            this.f5033f.setTextColor(i);
        }
    }

    @Deprecated
    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.f5035h = onErrorListener;
    }

    @Deprecated
    public OnErrorListener getOnErrorListener() {
        return this.f5035h;
    }

    @Deprecated
    public void setFragment(Fragment fragment) {
        this.f5044q = new C1725l(fragment);
    }

    @Deprecated
    public void setFragment(android.app.Fragment fragment) {
        this.f5044q = new C1725l(fragment);
    }

    @Deprecated
    public void setEnabled(boolean z) {
        this.f5045r = true;
        m6530c();
    }

    protected void onDetachedFromWindow() {
        m6536a(null, ObjectType.UNKNOWN);
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void m6522a() {
        if (this.f5034g != null) {
            Activity activity = null;
            if (this.f5044q == null) {
                activity = getActivity();
            }
            this.f5034g.m6335a(activity, this.f5044q, getAnalyticsParameters());
        }
    }

    private Activity getActivity() {
        Context context = getContext();
        while (true) {
            boolean z = context instanceof Activity;
            if (!z && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            } else if (z) {
                return (Activity) context;
            } else {
                throw new FacebookException("Unable to get Activity.");
            }
        }
        if (z) {
            return (Activity) context;
        }
        throw new FacebookException("Unable to get Activity.");
    }

    private Bundle getAnalyticsParameters() {
        Bundle bundle = new Bundle();
        bundle.putString("style", this.f5038k.toString());
        bundle.putString("auxiliary_position", this.f5040m.toString());
        bundle.putString("horizontal_alignment", this.f5039l.toString());
        bundle.putString("object_id", Utility.m5758a(this.f5028a, ""));
        bundle.putString("object_type", this.f5029b.toString());
        return bundle;
    }

    /* renamed from: b */
    private void m6529b(String str, ObjectType objectType) {
        m6528b();
        this.f5028a = str;
        this.f5029b = objectType;
        if (!Utility.m5785a(str)) {
            this.f5037j = new C3475a();
            if (!isInEditMode()) {
                LikeActionController.m6282a(str, objectType, this.f5037j);
            }
        }
    }

    /* renamed from: a */
    private void m6523a(LikeActionController likeActionController) {
        this.f5034g = likeActionController;
        this.f5036i = new C1862b();
        likeActionController = C0436c.m1648a(getContext());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        likeActionController.m1652a(this.f5036i, intentFilter);
    }

    /* renamed from: b */
    private void m6528b() {
        if (this.f5036i != null) {
            C0436c.m1648a(getContext()).m1651a(this.f5036i);
            this.f5036i = null;
        }
        if (this.f5037j != null) {
            this.f5037j.m13198a();
            this.f5037j = null;
        }
        this.f5034g = null;
    }

    /* renamed from: c */
    private void m6530c() {
        boolean z = this.f5045r ^ 1;
        if (this.f5034g == null) {
            this.f5031d.setSelected(false);
            this.f5033f.setText(null);
            this.f5032e.setText(null);
        } else {
            this.f5031d.setSelected(this.f5034g.m6338d());
            this.f5033f.setText(this.f5034g.m6337c());
            this.f5032e.setText(this.f5034g.m6336b());
            z &= this.f5034g.m6339e();
        }
        super.setEnabled(z);
        this.f5031d.setEnabled(z);
        m6533d();
    }

    /* renamed from: d */
    private void m6533d() {
        View view;
        LayoutParams layoutParams = (LayoutParams) this.f5030c.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f5031d.getLayoutParams();
        int i = this.f5039l == HorizontalAlignment.LEFT ? 3 : this.f5039l == HorizontalAlignment.CENTER ? 1 : 5;
        layoutParams.gravity = i | 48;
        layoutParams2.gravity = i;
        this.f5033f.setVisibility(8);
        this.f5032e.setVisibility(8);
        if (this.f5038k == Style.STANDARD && this.f5034g != null && !Utility.m5785a(this.f5034g.m6337c())) {
            view = this.f5033f;
        } else if (this.f5038k == Style.BOX_COUNT && this.f5034g != null && !Utility.m5785a(this.f5034g.m6336b())) {
            m6535e();
            view = this.f5032e;
        } else {
            return;
        }
        int i2 = 0;
        view.setVisibility(0);
        ((LinearLayout.LayoutParams) view.getLayoutParams()).gravity = i;
        LinearLayout linearLayout = this.f5030c;
        if (this.f5040m != AuxiliaryViewPosition.INLINE) {
            i2 = 1;
        }
        linearLayout.setOrientation(i2);
        if (this.f5040m != AuxiliaryViewPosition.TOP) {
            if (this.f5040m != AuxiliaryViewPosition.INLINE || this.f5039l != HorizontalAlignment.RIGHT) {
                this.f5030c.removeView(view);
                this.f5030c.addView(view);
                switch (this.f5040m) {
                    case TOP:
                        view.setPadding(this.f5042o, this.f5042o, this.f5042o, this.f5043p);
                        break;
                    case BOTTOM:
                        view.setPadding(this.f5042o, this.f5043p, this.f5042o, this.f5042o);
                        break;
                    case INLINE:
                        if (this.f5039l != HorizontalAlignment.RIGHT) {
                            view.setPadding(this.f5043p, this.f5042o, this.f5042o, this.f5042o);
                            break;
                        } else {
                            view.setPadding(this.f5042o, this.f5042o, this.f5043p, this.f5042o);
                            break;
                        }
                    default:
                        break;
                }
            }
        }
        this.f5030c.removeView(this.f5031d);
        this.f5030c.addView(this.f5031d);
        switch (this.f5040m) {
            case TOP:
                view.setPadding(this.f5042o, this.f5042o, this.f5042o, this.f5043p);
                break;
            case BOTTOM:
                view.setPadding(this.f5042o, this.f5043p, this.f5042o, this.f5042o);
                break;
            case INLINE:
                if (this.f5039l != HorizontalAlignment.RIGHT) {
                    view.setPadding(this.f5042o, this.f5042o, this.f5043p, this.f5042o);
                    break;
                } else {
                    view.setPadding(this.f5043p, this.f5042o, this.f5042o, this.f5042o);
                    break;
                }
            default:
                break;
        }
    }

    /* renamed from: e */
    private void m6535e() {
        switch (this.f5040m) {
            case TOP:
                this.f5032e.setCaretPosition(LikeBoxCountViewCaretPosition.BOTTOM);
                return;
            case BOTTOM:
                this.f5032e.setCaretPosition(LikeBoxCountViewCaretPosition.TOP);
                return;
            case INLINE:
                this.f5032e.setCaretPosition(this.f5039l == HorizontalAlignment.RIGHT ? LikeBoxCountViewCaretPosition.RIGHT : LikeBoxCountViewCaretPosition.LEFT);
                return;
            default:
                return;
        }
    }
}
