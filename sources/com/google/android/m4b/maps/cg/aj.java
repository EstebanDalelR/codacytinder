package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.AbsListView.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.ay.ab;
import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;

public final class aj extends ListView implements ad {
    /* renamed from: a */
    private int f24755a;
    /* renamed from: b */
    private C5196z f24756b;
    /* renamed from: c */
    private ac f24757c;
    /* renamed from: d */
    private int f24758d;
    /* renamed from: e */
    private volatile C4701c f24759e;
    /* renamed from: f */
    private C5132a f24760f;
    /* renamed from: g */
    private final Set<C4701c> f24761g;
    /* renamed from: h */
    private final Resources f24762h;
    /* renamed from: i */
    private final aa f24763i;

    /* renamed from: com.google.android.m4b.maps.cg.aj$1 */
    class C51271 implements AnimationListener {
        /* renamed from: a */
        private /* synthetic */ aj f19042a;

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        C51271(aj ajVar) {
            this.f19042a = ajVar;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f19042a.m29478b();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.aj$2 */
    class C51282 implements AnimationListener {
        /* renamed from: a */
        private /* synthetic */ aj f19043a;

        public final void onAnimationRepeat(Animation animation) {
        }

        C51282(aj ajVar) {
            this.f19043a = ajVar;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f19043a.setVisibility(8);
        }

        public final void onAnimationStart(Animation animation) {
            this.f19043a.setVisibility(0);
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.aj$3 */
    class C51293 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ aj f19044a;

        C51293(aj ajVar) {
            this.f19044a = ajVar;
        }

        public final void run() {
            if (this.f19044a.f24757c != null) {
                this.f19044a.m29489b(this.f19044a.f24757c);
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.aj$5 */
    class C51315 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ aj f19047a;

        C51315(aj ajVar) {
            this.f19047a = ajVar;
        }

        public final void run() {
            this.f19047a.m29478b();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.aj$a */
    class C5132a extends ArrayAdapter<C5133b> {
        /* renamed from: a */
        private /* synthetic */ aj f19048a;

        public final boolean hasStableIds() {
            return true;
        }

        C5132a(aj ajVar, Context context, C5196z c5196z) {
            this.f19048a = ajVar;
            super(context, -1);
            if (c5196z.mo5141e() != null) {
                add(new C5133b(null));
            }
            for (ab c5133b : c5196z.mo5138b()) {
                add(new C5133b(c5133b));
            }
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            viewGroup = (RelativeLayout) view;
            if (view == null) {
                viewGroup = new RelativeLayout(getContext());
                viewGroup.setLayoutParams(new LayoutParams(-1, m22849a(44)));
            }
            view = (C5134c) viewGroup.getTag();
            int i2 = 0;
            if (view == null) {
                view = new TextView(getContext());
                view.setPadding(0, 0, 0, 0);
                view.setClickable(false);
                view.setTextSize(2, 18.0f);
                view.setTextColor(this.f19048a.f24762h.getColor(C4513R.color.maps_floorpicker_text));
                view.setGravity(17);
                ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, m22849a(36));
                layoutParams.addRule(10);
                viewGroup.addView(view, layoutParams);
                View linearLayout = new LinearLayout(getContext());
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12);
                layoutParams.addRule(14);
                viewGroup.addView(linearLayout, layoutParams);
                C5134c c5134c = new C5134c(view, m22850a(linearLayout, this.f19048a.f24762h.getDrawable(C4513R.drawable.maps_floorpicker_mylocation)), m22850a(linearLayout, this.f19048a.f24762h.getDrawable(C4513R.drawable.maps_floorpicker_search)));
                viewGroup.setTag(c5134c);
                view = c5134c;
            }
            view.f19050a.setText(((C5133b) getItem(i)).toString());
            view.f19050a.setContentDescription(MessageFormat.format(this.f19048a.f24762h.getString(C4513R.string.maps_LEVEL_ALT_TEXT), new Object[]{r0}));
            if (i == this.f19048a.f24755a) {
                view.f19050a.setTextColor(this.f19048a.f24762h.getColor(C4513R.color.maps_floorpicker_black));
                viewGroup.setBackgroundDrawable(this.f19048a.f24762h.getDrawable(C4513R.drawable.maps_floorpicker_bg_selected));
                viewGroup.destroyDrawingCache();
            } else {
                view.f19050a.setTextColor(this.f19048a.f24762h.getColor(C4513R.color.maps_floorpicker_text));
                if (viewGroup.getBackground() != null) {
                    viewGroup.setBackgroundDrawable(null);
                    viewGroup.destroyDrawingCache();
                }
            }
            if (i == this.f19048a.f24758d) {
                view.f19051b.setVisibility(0);
            } else {
                view.f19051b.setVisibility(8);
            }
            i = ((C5133b) getItem(i)).m22851a();
            if (i == 0 || this.f19048a.f24761g.contains(i.mo5142a()) == 0) {
                i2 = 8;
            }
            view.f19052c.setVisibility(i2);
            return viewGroup;
        }

        /* renamed from: a */
        private ImageView m22850a(ViewGroup viewGroup, Drawable drawable) {
            View imageView = new ImageView(getContext());
            imageView.setLayoutParams(new LayoutParams(-2, m22849a(16)));
            imageView.setPadding(m22849a(1), 0, m22849a(1), 0);
            imageView.setImageDrawable(drawable);
            viewGroup.addView(imageView);
            return imageView;
        }

        /* renamed from: a */
        private int m22849a(int i) {
            return Math.round(TypedValue.applyDimension(1, (float) i, this.f19048a.getResources().getDisplayMetrics()));
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.aj$b */
    static class C5133b {
        /* renamed from: a */
        private final ab f19049a;

        C5133b(ab abVar) {
            this.f19049a = abVar;
        }

        /* renamed from: a */
        public final ab m22851a() {
            return this.f19049a;
        }

        public final String toString() {
            if (this.f19049a == null) {
                return "1";
            }
            return this.f19049a.mo5145e();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.aj$c */
    static class C5134c {
        /* renamed from: a */
        public final TextView f19050a;
        /* renamed from: b */
        public final View f19051b;
        /* renamed from: c */
        public final View f19052c;

        C5134c(TextView textView, View view, View view2) {
            this.f19050a = textView;
            this.f19051b = view;
            this.f19052c = view2;
        }
    }

    public aj(Context context, Resources resources) {
        this(context, null, resources);
    }

    private aj(Context context, AttributeSet attributeSet, Resources resources) {
        super(context, null);
        this.f24755a = -1;
        this.f24758d = -1;
        this.f24761g = new HashSet();
        this.f24763i = ab.m27950c();
        this.f24762h = resources;
    }

    /* renamed from: a */
    public final void m29487a(ac acVar) {
        if (this.f24757c != null) {
            this.f24757c.mo4972b((ad) this);
        }
        if (acVar != null) {
            mo4964a();
            acVar.mo4969a((ad) this);
        }
        this.f24757c = acVar;
    }

    /* renamed from: b */
    private static boolean m29479b(C5196z c5196z, C5196z c5196z2) {
        if (c5196z == c5196z2) {
            return true;
        }
        if (c5196z != null) {
            if (c5196z2 != null) {
                return c5196z.mo5136a().equals(c5196z2.mo5136a());
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo4964a() {
        post(new C51293(this));
    }

    /* renamed from: a */
    public final void mo4965a(final C5196z c5196z) {
        post(new Runnable(this) {
            /* renamed from: b */
            private /* synthetic */ aj f19046b;

            public final void run() {
                if (this.f19046b.f24757c != null) {
                    C4701c a = this.f19046b.f24757c.mo4967a(c5196z.mo5136a());
                    if (C4728u.m21050a("INDOOR", 3)) {
                        String valueOf = String.valueOf(c5196z);
                        String valueOf2 = String.valueOf(a);
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 26) + String.valueOf(valueOf2).length());
                        stringBuilder.append("onIndoorLevelActivated: ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(", ");
                        stringBuilder.append(valueOf2);
                        Log.d("INDOOR", stringBuilder.toString());
                    }
                    if (aj.m29479b(this.f19046b.f24756b, c5196z)) {
                        this.f19046b.m29475a(this.f19046b.f24756b, a);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    final void m29489b(ac acVar) {
        C5196z c = acVar.mo4973c();
        C4701c a = c != null ? acVar.mo4967a(c.mo5136a()) : null;
        if (C4728u.m21050a("INDOOR", 3)) {
            String valueOf = String.valueOf(c);
            String valueOf2 = String.valueOf(a);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(valueOf2).length());
            stringBuilder.append("onIndoorBuildingFocused: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", ");
            stringBuilder.append(valueOf2);
            Log.d("INDOOR", stringBuilder.toString());
        }
        m29475a(c, a);
    }

    /* renamed from: a */
    private void m29475a(C5196z c5196z, C4701c c4701c) {
        this.f24763i.mo4875a();
        int i = 0;
        int i2 = -1;
        if (!m29479b(c5196z, this.f24756b)) {
            clearAnimation();
            this.f24756b = null;
            this.f24758d = -1;
            this.f24755a = -1;
            if (c5196z != null) {
                Object obj;
                if (c5196z != null) {
                    if (c5196z.mo5138b().size() >= (c5196z.mo5141e() ? 1 : 2)) {
                        obj = 1;
                        if (obj != null) {
                            this.f24756b = c5196z;
                            setVisibility(0);
                            c5196z = new AlphaAnimation(0.0f, 1.0f);
                            c5196z.setFillAfter(true);
                            c5196z.setDuration(500);
                            c5196z.setAnimationListener(new C51271(this));
                            startAnimation(c5196z);
                            this.f24760f = new C5132a(this, getContext(), this.f24756b);
                            setAdapter(this.f24760f);
                            this.f24763i.mo4875a();
                            if (this.f24756b != null) {
                                c5196z = this.f24759e;
                                if (-1 != this.f24758d) {
                                    this.f24758d = -1;
                                    this.f24760f.notifyDataSetChanged();
                                }
                            }
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                    this.f24756b = c5196z;
                    setVisibility(0);
                    c5196z = new AlphaAnimation(0.0f, 1.0f);
                    c5196z.setFillAfter(true);
                    c5196z.setDuration(500);
                    c5196z.setAnimationListener(new C51271(this));
                    startAnimation(c5196z);
                    this.f24760f = new C5132a(this, getContext(), this.f24756b);
                    setAdapter(this.f24760f);
                    this.f24763i.mo4875a();
                    if (this.f24756b != null) {
                        c5196z = this.f24759e;
                        if (-1 != this.f24758d) {
                            this.f24758d = -1;
                            this.f24760f.notifyDataSetChanged();
                        }
                    }
                }
            }
            if (this.f24756b == null && getVisibility() == null) {
                setVisibility(8);
                c5196z = new AlphaAnimation(1.0f, 0.0f);
                c5196z.setDuration(500);
                c5196z.setAnimationListener(new C51282(this));
                startAnimation(c5196z);
            }
        }
        if (this.f24756b != null) {
            c5196z = this.f24756b;
            if (c5196z != null) {
                if (c4701c != null) {
                    i = c5196z.mo5137b(c4701c);
                    if (i >= 0 && c5196z.mo5141e() != null) {
                        i++;
                    }
                } else if (c5196z.mo5141e() == null) {
                    i = -1;
                }
                if (i >= 0) {
                    i2 = i;
                }
            }
            m29486a(i2);
            m29478b();
        }
    }

    /* renamed from: b */
    private void m29478b() {
        if (this.f24755a != -1) {
            smoothScrollToPosition(this.f24755a);
        }
    }

    /* renamed from: a */
    public final void m29486a(int i) {
        if (i != this.f24755a) {
            this.f24755a = i;
            this.f24760f.notifyDataSetChanged();
            if (i != -1) {
                C5133b c5133b = (C5133b) getItemAtPosition(i);
                if (c5133b == null) {
                    if (C4728u.m21050a("INDOOR", 3)) {
                        StringBuilder stringBuilder = new StringBuilder(44);
                        stringBuilder.append("getItemAtPosition(");
                        stringBuilder.append(i);
                        stringBuilder.append(") returned null");
                        Log.d("INDOOR", stringBuilder.toString());
                    }
                    return;
                }
                i = c5133b.m22851a();
                if (this.f24757c != null) {
                    if (i == 0) {
                        this.f24757c.mo4975d(this.f24756b);
                        return;
                    }
                    this.f24757c.mo4968a(i.mo5142a());
                }
            }
        }
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new C51315(this));
    }
}
