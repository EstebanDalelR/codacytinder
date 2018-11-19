package com.tinder.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.C0432b;
import android.support.v4.view.C0600i;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.GridLayout;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.request.target.C4455b;
import com.tinder.R;
import com.tinder.model.CommonConnection;
import com.tinder.utils.HeightSizeSpan;
import com.tinder.utils.av;
import com.tinder.views.RoundImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.tinder.adapters.c */
public class C7290c extends C0600i {
    /* renamed from: a */
    private int f26369a = 2;
    /* renamed from: b */
    private int f26370b = 3;
    /* renamed from: c */
    private int f26371c = 29;
    /* renamed from: d */
    private int f26372d;
    /* renamed from: e */
    private int f26373e;
    /* renamed from: f */
    private int f26374f;
    /* renamed from: g */
    private int f26375g;
    /* renamed from: h */
    private int f26376h;
    /* renamed from: i */
    private int f26377i;
    /* renamed from: j */
    private int f26378j;
    /* renamed from: k */
    private int f26379k;
    /* renamed from: l */
    private int f26380l;
    /* renamed from: m */
    private int f26381m;
    /* renamed from: n */
    private int f26382n;
    /* renamed from: o */
    private float f26383o;
    /* renamed from: p */
    private boolean f26384p;
    /* renamed from: q */
    private List<CommonConnection> f26385q;
    /* renamed from: r */
    private HeightSizeSpan f26386r;
    /* renamed from: s */
    private Context f26387s;

    public int getItemPosition(Object obj) {
        return 0;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public C7290c(@NonNull Context context) {
        this.f26387s = context;
        this.f26383o = context.getResources().getDisplayMetrics().density;
        m31175b();
    }

    /* renamed from: a */
    public void m31178a(List<CommonConnection> list) {
        this.f26385q = list;
        if (this.f26385q != null && this.f26385q.size() > null) {
            list = this.f26385q.size();
            if (list <= this.f26370b) {
                this.f26369a = 1;
            }
            if (list > this.f26371c) {
                list = this.f26371c;
            }
            this.f26372d = (int) Math.ceil((double) (((float) list) / ((float) this.f26373e)));
            this.f26378j = (this.f26369a * this.f26380l) + (this.f26376h * 2);
        }
    }

    /* renamed from: a */
    public int m31176a() {
        return this.f26378j;
    }

    /* renamed from: b */
    private void m31175b() {
        this.f26385q = new ArrayList();
        Resources resources = this.f26387s.getResources();
        this.f26382n = (int) av.a(5.0f, this.f26387s);
        this.f26375g = resources.getDimensionPixelSize(R.dimen.connection_page_padding);
        this.f26376h = (int) av.a(10.0f, this.f26387s);
        this.f26377i = this.f26382n * 2;
        this.f26374f = (this.f26370b * this.f26377i) + (this.f26375g * 2);
        int b = av.b() - this.f26374f;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((float) resources.getDimensionPixelSize(R.dimen.connection_name_size));
        int measureText = (int) textPaint.measureText("TygO");
        this.f26379k = b / this.f26370b;
        this.f26381m = (int) (((float) this.f26379k) * 0.9f);
        this.f26380l = (this.f26381m + measureText) + resources.getDimensionPixelSize(R.dimen.connection_name_padding);
        this.f26373e = this.f26369a * this.f26370b;
        this.f26386r = new HeightSizeSpan(0.5f, 0.65f);
    }

    /* renamed from: a */
    public void m31177a(int i) {
        this.f26371c = i;
    }

    public int getCount() {
        return this.f26372d;
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        View gridLayout = new GridLayout(this.f26387s);
        gridLayout.setUseDefaultMargins(false);
        gridLayout.setColumnCount(this.f26370b);
        gridLayout.setRowCount(this.f26369a);
        if (!this.f26384p) {
            this.f26384p = true;
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = this.f26378j;
            viewGroup.setLayoutParams(layoutParams);
        }
        m31174a(gridLayout, i);
        viewGroup.addView(gridLayout);
        return gridLayout;
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((GridLayout) obj);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private void m31174a(@NonNull GridLayout gridLayout, int i) {
        i *= this.f26373e;
        int min = Math.min((this.f26385q.size() > this.f26371c ? this.f26371c : this.f26385q.size()) - i, this.f26373e) + i;
        while (i < min) {
            CommonConnection commonConnection = (CommonConnection) this.f26385q.get(i);
            View inflate = LayoutInflater.from(this.f26387s).inflate(R.layout.cell_common_connection, gridLayout, false);
            RoundImageView roundImageView = (RoundImageView) inflate.findViewById(R.id.cell_connection_image);
            roundImageView.setScaleType(ScaleType.CENTER_CROP);
            ((TextView) inflate.findViewById(R.id.cell_connection_text_name)).setText(commonConnection.name);
            TextView textView = (TextView) inflate.findViewById(R.id.cell_connection_text_degree);
            CharSequence charSequence = this.f26387s.getResources().getStringArray(R.array.ordinals)[commonConnection.degree];
            if (Locale.getDefault().getLanguage().contains("en")) {
                CharSequence spannableString = new SpannableString(charSequence);
                spannableString.setSpan(this.f26386r, 1, charSequence.length(), 17);
                textView.setText(spannableString);
            } else {
                textView.setText(charSequence);
            }
            LayoutParams layoutParams = new GridLayout.LayoutParams();
            layoutParams.width = this.f26379k;
            layoutParams.setMargins(this.f26382n, this.f26376h, this.f26382n, this.f26376h);
            inflate.setLayoutParams(layoutParams);
            layoutParams = roundImageView.getLayoutParams();
            layoutParams.width = this.f26381m;
            layoutParams.height = this.f26381m;
            roundImageView.setLayoutParams(layoutParams);
            gridLayout.addView(inflate);
            Object imageForDensity = commonConnection.getImageForDensity(this.f26383o);
            if (TextUtils.isEmpty(imageForDensity)) {
                Drawable colorDrawable = new ColorDrawable(C0432b.c(this.f26387s, R.color.gray_very_very_light));
                colorDrawable.setBounds(0, 0, this.f26381m, this.f26381m);
                roundImageView.setBackground(colorDrawable);
            } else {
                C0994i.b(this.f26387s).a(imageForDensity).l().a(R.drawable.ic_match_placeholder).b().b(new C4455b(roundImageView));
            }
            i++;
        }
    }
}
