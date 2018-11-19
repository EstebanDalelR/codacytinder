package com.tinder.settings.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.settings.model.ExitSurveyReason;
import com.tinder.utils.av;
import java.util.ArrayList;
import java.util.List;

public class SurveyReasonGridView extends RecyclerView {
    /* renamed from: a */
    final C16692a f58457a = new C16692a(this, 2);
    @Nullable
    /* renamed from: b */
    private OnExitSurveyReasonSelectedListener f58458b;

    public interface OnExitSurveyReasonSelectedListener {
        void reasonSelected(ExitSurveyReason exitSurveyReason);
    }

    /* renamed from: com.tinder.settings.views.SurveyReasonGridView$a */
    private class C16692a extends Adapter<C16691a> {
        /* renamed from: a */
        final /* synthetic */ SurveyReasonGridView f51661a;
        /* renamed from: b */
        private List<ExitSurveyReason> f51662b;
        /* renamed from: c */
        private final int f51663c;

        /* renamed from: com.tinder.settings.views.SurveyReasonGridView$a$a */
        class C16691a extends ViewHolder {
            /* renamed from: a */
            final /* synthetic */ C16692a f51656a;
            /* renamed from: b */
            private final ImageView f51657b;
            /* renamed from: c */
            private final TextView f51658c;
            /* renamed from: d */
            private final View f51659d;
            /* renamed from: e */
            private final View f51660e;

            C16691a(C16692a c16692a, View view) {
                this.f51656a = c16692a;
                super(view);
                this.f51660e = view;
                this.f51657b = (ImageView) view.findViewById(R.id.exitSurveyReasonImage);
                this.f51658c = (TextView) view.findViewById(R.id.exitSurveyReasonText);
                this.f51659d = view.findViewById(R.id.exitSurveyRightBorder);
            }

            /* renamed from: a */
            void m62176a(ExitSurveyReason exitSurveyReason, int i) {
                this.f51658c.setText(this.f51658c.getContext().getString(exitSurveyReason.getNameResourceId()));
                this.f51657b.setImageResource(exitSurveyReason.getDrawableResourceId());
                if (m62175a(i) != 0) {
                    av.c(new View[]{this.f51659d});
                } else {
                    av.a(new View[]{this.f51659d});
                }
                this.f51660e.setOnClickListener(new C14914h(this, exitSurveyReason));
            }

            /* renamed from: a */
            final /* synthetic */ void m62177a(ExitSurveyReason exitSurveyReason, View view) {
                if (this.f51656a.f51661a.f58458b != null) {
                    this.f51656a.f51661a.f58458b.reasonSelected(exitSurveyReason);
                }
            }

            /* renamed from: a */
            private boolean m62175a(int i) {
                return (i + 1) % this.f51656a.f51663c == 0;
            }
        }

        public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            m62180a((C16691a) viewHolder, i);
        }

        public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m62179a(viewGroup, i);
        }

        C16692a(SurveyReasonGridView surveyReasonGridView, int i) {
            this.f51661a = surveyReasonGridView;
            this.f51663c = i;
        }

        /* renamed from: a */
        public C16691a m62179a(ViewGroup viewGroup, int i) {
            return new C16691a(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_exit_survey_reason, viewGroup, false));
        }

        /* renamed from: a */
        public void m62180a(C16691a c16691a, int i) {
            c16691a.m62176a((ExitSurveyReason) this.f51662b.get(i), i);
        }

        public int getItemCount() {
            return this.f51662b.size();
        }

        /* renamed from: a */
        public void m62181a(@NonNull List<ExitSurveyReason> list) {
            this.f51662b = new ArrayList(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.tinder.settings.views.SurveyReasonGridView$b */
    private class C18857b extends GridLayoutManager {
        /* renamed from: a */
        final /* synthetic */ SurveyReasonGridView f58456a;

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        C18857b(SurveyReasonGridView surveyReasonGridView, Context context, int i) {
            this.f58456a = surveyReasonGridView;
            super(context, i);
        }

        public LayoutParams generateDefaultLayoutParams() {
            return m67315a(super.generateDefaultLayoutParams());
        }

        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return m67315a(super.generateLayoutParams(context, attributeSet));
        }

        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return m67315a(super.generateLayoutParams(layoutParams));
        }

        /* renamed from: a */
        private LayoutParams m67315a(LayoutParams layoutParams) {
            if (getOrientation() == 0) {
                layoutParams.width = (int) Math.round(((double) m67314a()) / Math.ceil((double) (getItemCount() / getSpanCount())));
            } else if (getOrientation() == 1) {
                layoutParams.height = (int) Math.round(((double) m67316b()) / Math.ceil((double) (getItemCount() / getSpanCount())));
            }
            return layoutParams;
        }

        /* renamed from: a */
        private int m67314a() {
            return (getWidth() - getPaddingRight()) - getPaddingLeft();
        }

        /* renamed from: b */
        private int m67316b() {
            return (getHeight() - getPaddingBottom()) - getPaddingTop();
        }
    }

    public SurveyReasonGridView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutManager(new C18857b(this, getContext(), 2));
        setAdapter(this.f58457a);
    }

    /* renamed from: a */
    public void m67318a(List<ExitSurveyReason> list) {
        this.f58457a.m62181a((List) list);
    }

    public void setReasonSelectedlistener(@Nullable OnExitSurveyReasonSelectedListener onExitSurveyReasonSelectedListener) {
        this.f58458b = onExitSurveyReasonSelectedListener;
    }
}
