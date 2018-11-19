package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.annotation.AttrRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C3714d.C2254a;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C2251c;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride;
import com.google.android.exoplayer2.ui.C2273b.C2270d;
import com.google.android.exoplayer2.ui.C2273b.C2271e;
import com.google.android.exoplayer2.util.C2289a;
import java.util.Arrays;

public class TrackSelectionView extends LinearLayout {
    /* renamed from: a */
    private final int f6771a;
    /* renamed from: b */
    private final LayoutInflater f6772b;
    /* renamed from: c */
    private final CheckedTextView f6773c;
    /* renamed from: d */
    private final CheckedTextView f6774d;
    /* renamed from: e */
    private final C2266a f6775e;
    /* renamed from: f */
    private boolean f6776f;
    /* renamed from: g */
    private TrackNameProvider f6777g;
    /* renamed from: h */
    private CheckedTextView[][] f6778h;
    /* renamed from: i */
    private DefaultTrackSelector f6779i;
    /* renamed from: j */
    private int f6780j;
    /* renamed from: k */
    private TrackGroupArray f6781k;
    /* renamed from: l */
    private boolean f6782l;
    @Nullable
    /* renamed from: m */
    private SelectionOverride f6783m;

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$1 */
    static class C22651 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ TrackSelectionView f6769a;

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f6769a.m8224c();
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$a */
    private class C2266a implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ TrackSelectionView f6770a;

        private C2266a(TrackSelectionView trackSelectionView) {
            this.f6770a = trackSelectionView;
        }

        public void onClick(View view) {
            this.f6770a.m8217a(view);
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        attributeSet = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        this.f6771a = attributeSet.getResourceId(0, 0);
        attributeSet.recycle();
        this.f6772b = LayoutInflater.from(context);
        this.f6775e = new C2266a();
        this.f6777g = new C3715a(getResources());
        this.f6773c = (CheckedTextView) this.f6772b.inflate(17367055, this, false);
        this.f6773c.setBackgroundResource(this.f6771a);
        this.f6773c.setText(C2271e.exo_track_selection_none);
        this.f6773c.setEnabled(false);
        this.f6773c.setFocusable(true);
        this.f6773c.setOnClickListener(this.f6775e);
        this.f6773c.setVisibility(8);
        addView(this.f6773c);
        addView(this.f6772b.inflate(C2270d.exo_list_divider, this, false));
        this.f6774d = (CheckedTextView) this.f6772b.inflate(17367055, this, false);
        this.f6774d.setBackgroundResource(this.f6771a);
        this.f6774d.setText(C2271e.exo_track_selection_auto);
        this.f6774d.setEnabled(false);
        this.f6774d.setFocusable(true);
        this.f6774d.setOnClickListener(this.f6775e);
        addView(this.f6774d);
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f6776f != z) {
            this.f6776f = z;
            m8216a();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f6773c.setVisibility(z ? false : true);
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
        this.f6777g = (TrackNameProvider) C2289a.m8309a((Object) trackNameProvider);
        m8216a();
    }

    /* renamed from: a */
    private void m8216a() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f6779i == null) {
            this.f6773c.setEnabled(false);
            this.f6774d.setEnabled(false);
            return;
        }
        this.f6773c.setEnabled(true);
        this.f6774d.setEnabled(true);
        C2254a c = this.f6779i.m14047c();
        this.f6781k = c.m8122b(this.f6780j);
        Parameters a = this.f6779i.m17061a();
        this.f6782l = a.getRendererDisabled(this.f6780j);
        this.f6783m = a.getSelectionOverride(this.f6780j, this.f6781k);
        this.f6778h = new CheckedTextView[this.f6781k.length][];
        for (int i = 0; i < this.f6781k.length; i++) {
            TrackGroup trackGroup = this.f6781k.get(i);
            Object obj = (!this.f6776f || this.f6781k.get(i).length <= 1 || c.m8120a(this.f6780j, i, false) == 0) ? null : 1;
            this.f6778h[i] = new CheckedTextView[trackGroup.length];
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                if (i2 == 0) {
                    addView(this.f6772b.inflate(C2270d.exo_list_divider, this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f6772b.inflate(obj != null ? 17367056 : 17367055, this, false);
                checkedTextView.setBackgroundResource(this.f6771a);
                checkedTextView.setText(this.f6777g.getTrackName(trackGroup.getFormat(i2)));
                if (c.m8119a(this.f6780j, i, i2) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setTag(Pair.create(Integer.valueOf(i), Integer.valueOf(i2)));
                    checkedTextView.setOnClickListener(this.f6775e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f6778h[i][i2] = checkedTextView;
                addView(checkedTextView);
            }
        }
        m8221b();
    }

    /* renamed from: b */
    private void m8221b() {
        this.f6773c.setChecked(this.f6782l);
        CheckedTextView checkedTextView = this.f6774d;
        boolean z = !this.f6782l && this.f6783m == null;
        checkedTextView.setChecked(z);
        int i = 0;
        while (i < this.f6778h.length) {
            for (int i2 = 0; i2 < this.f6778h[i].length; i2++) {
                CheckedTextView checkedTextView2 = this.f6778h[i][i2];
                boolean z2 = this.f6783m != null && this.f6783m.groupIndex == i && this.f6783m.containsTrack(i2);
                checkedTextView2.setChecked(z2);
            }
            i++;
        }
    }

    /* renamed from: c */
    private void m8224c() {
        C2251c b = this.f6779i.m17068b();
        b.m8111a(this.f6780j, this.f6782l);
        if (this.f6783m != null) {
            b.m8110a(this.f6780j, this.f6781k, this.f6783m);
        } else {
            b.m8109a(this.f6780j);
        }
        this.f6779i.m17066a(b);
    }

    /* renamed from: a */
    private void m8217a(View view) {
        if (view == this.f6773c) {
            m8225d();
        } else if (view == this.f6774d) {
            m8226e();
        } else {
            m8222b(view);
        }
        m8221b();
    }

    /* renamed from: d */
    private void m8225d() {
        this.f6782l = true;
        this.f6783m = null;
    }

    /* renamed from: e */
    private void m8226e() {
        this.f6782l = false;
        this.f6783m = null;
    }

    /* renamed from: b */
    private void m8222b(View view) {
        this.f6782l = false;
        Pair pair = (Pair) view.getTag();
        int intValue = ((Integer) pair.first).intValue();
        int intValue2 = ((Integer) pair.second).intValue();
        if (this.f6783m != null && this.f6783m.groupIndex == intValue) {
            if (this.f6776f) {
                int i = this.f6783m.length;
                int[] iArr = this.f6783m.tracks;
                if (((CheckedTextView) view).isChecked() == null) {
                    this.f6783m = new SelectionOverride(intValue, m8220a(iArr, intValue2));
                    return;
                } else if (i == 1) {
                    this.f6783m = null;
                    this.f6782l = true;
                    return;
                } else {
                    this.f6783m = new SelectionOverride(intValue, m8223b(iArr, intValue2));
                    return;
                }
            }
        }
        this.f6783m = new SelectionOverride(intValue, intValue2);
    }

    /* renamed from: a */
    private static int[] m8220a(int[] iArr, int i) {
        iArr = Arrays.copyOf(iArr, iArr.length + 1);
        iArr[iArr.length - 1] = i;
        return iArr;
    }

    /* renamed from: b */
    private static int[] m8223b(int[] iArr, int i) {
        int[] iArr2 = new int[(iArr.length - 1)];
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != i) {
                int i4 = i2 + 1;
                iArr2[i2] = i3;
                i2 = i4;
            }
        }
        return iArr2;
    }
}
