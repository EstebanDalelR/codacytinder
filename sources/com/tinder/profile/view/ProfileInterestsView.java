package com.tinder.profile.view;

import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.profile.model.Profile;
import com.tinder.utils.av;
import com.tinder.views.CustomTextView;
import java.util.List;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;

public class ProfileInterestsView extends LinearLayout {
    @BindView(2131363304)
    InterestsGrid interestsGrid;
    @BindView(2131363303)
    CustomTextView profileInterestsTitleText;

    public static class InterestsGrid extends LinearLayout {
        /* renamed from: a */
        private Paint f45786a;
        /* renamed from: b */
        private LayoutParams f45787b;
        /* renamed from: c */
        private LayoutParams f45788c;

        public InterestsGrid(Context context) {
            super(context);
            m55176a();
        }

        public InterestsGrid(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            m55176a();
        }

        /* renamed from: a */
        private void m55176a() {
            this.f45786a = new Paint();
            int a = (int) av.a(5.0f, getContext());
            this.f45787b = new LayoutParams(-2, -2);
            this.f45787b.leftMargin = a;
            this.f45788c = new LayoutParams(-2, -2);
            this.f45788c.bottomMargin = a;
        }

        public void setInterests(List<String> list) {
            removeAllViews();
            m55177a((List) list);
        }

        /* renamed from: a */
        private void m55177a(@NonNull List<String> list) {
            Context context = getContext();
            int b = av.b() - (context.getResources().getDimensionPixelSize(R.dimen.margin_large) * 2);
            int childCount = getChildCount();
            ViewGroup b2 = childCount > 0 ? (LinearLayout) getChildAt(getChildCount() - 1) : m55178b();
            ViewGroup viewGroup = childCount > 0 ? b2 : null;
            for (String str : list) {
                int i = 0;
                TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.cell_profile_interest, b2, false);
                textView.setMaxWidth(b);
                textView.setText(str);
                int i2 = 0;
                while (i < b2.getChildCount()) {
                    i2 += m55175a((TextView) b2.getChildAt(i));
                    i++;
                }
                if (i2 + m55175a(textView) > b && b2.getChildCount() > 0) {
                    b2 = m55178b();
                }
                if (b2.getChildCount() == 0) {
                    b2.addView(textView);
                } else {
                    b2.addView(textView, this.f45787b);
                }
                if (b2 != viewGroup) {
                    addView(b2, this.f45788c);
                    viewGroup = b2;
                }
            }
        }

        @NonNull
        /* renamed from: b */
        private LinearLayout m55178b() {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            return linearLayout;
        }

        /* renamed from: a */
        private int m55175a(@NonNull TextView textView) {
            this.f45786a.setTextSize(textView.getTextSize());
            this.f45786a.setTypeface(textView.getTypeface());
            return (int) (((float) ((int) (((float) (textView.getPaddingLeft() + textView.getPaddingRight())) + this.f45786a.measureText(textView.getText().toString())))) + av.a(2.5f, getContext()));
        }
    }

    public ProfileInterestsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_profile_interests, this);
        setOrientation(1);
        ButterKnife.a(this);
    }

    /* renamed from: a */
    public void m55179a(@NonNull Profile profile) {
        List list = (List) StreamSupport.m59708a(profile.mo11665o()).map(C16164q.f50340a).collect(Collectors.m59434a());
        int size = list.size();
        this.profileInterestsTitleText.setText(getResources().getQuantityString(R.plurals.interests_plural, size, new Object[]{Integer.valueOf(size)}));
        this.interestsGrid.setInterests(list);
    }
}
