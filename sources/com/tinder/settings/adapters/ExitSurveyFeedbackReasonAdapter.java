package com.tinder.settings.adapters;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.settings.model.ExitSurveyDetailReason;
import java.util.ArrayList;
import java.util.List;

public class ExitSurveyFeedbackReasonAdapter extends Adapter<C16613a> {
    /* renamed from: a */
    private List<ExitSurveyDetailReason> f51447a = new ArrayList();
    @Nullable
    /* renamed from: b */
    private OnExitSurveyReasonSelectedListener f51448b;

    public interface OnExitSurveyReasonSelectedListener {
        void reasonSelected(ExitSurveyDetailReason exitSurveyDetailReason, boolean z);
    }

    /* renamed from: com.tinder.settings.adapters.ExitSurveyFeedbackReasonAdapter$a */
    class C16613a extends ViewHolder {
        /* renamed from: a */
        final /* synthetic */ ExitSurveyFeedbackReasonAdapter f51443a;
        /* renamed from: b */
        private TextView f51444b;
        /* renamed from: c */
        private CheckBox f51445c;
        /* renamed from: d */
        private View f51446d;

        C16613a(ExitSurveyFeedbackReasonAdapter exitSurveyFeedbackReasonAdapter, View view) {
            this.f51443a = exitSurveyFeedbackReasonAdapter;
            super(view);
            this.f51446d = view;
            this.f51445c = (CheckBox) view.findViewById(R.id.exitSurveyFeedbackReasonCheckbox);
            this.f51444b = (TextView) view.findViewById(R.id.exitSurveyFeedbackReasonText);
        }

        /* renamed from: a */
        void m62042a(ExitSurveyDetailReason exitSurveyDetailReason) {
            this.f51444b.setText(this.f51444b.getContext().getString(exitSurveyDetailReason.getNameResourceId()));
            this.f51446d.setOnClickListener(new C14858a(this));
            this.f51445c.setOnCheckedChangeListener(new C14859b(this, exitSurveyDetailReason));
        }

        /* renamed from: a */
        final /* synthetic */ void m62041a(View view) {
            this.f51445c.toggle();
        }

        /* renamed from: a */
        final /* synthetic */ void m62043a(ExitSurveyDetailReason exitSurveyDetailReason, CompoundButton compoundButton, boolean z) {
            if (this.f51443a.f51448b != null) {
                this.f51443a.f51448b.reasonSelected(exitSurveyDetailReason, z);
            }
        }
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m62047a((C16613a) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m62045a(viewGroup, i);
    }

    /* renamed from: a */
    public void m62046a(@Nullable OnExitSurveyReasonSelectedListener onExitSurveyReasonSelectedListener) {
        this.f51448b = onExitSurveyReasonSelectedListener;
    }

    /* renamed from: a */
    public C16613a m62045a(ViewGroup viewGroup, int i) {
        return new C16613a(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_exit_survey_reason_feedback, viewGroup, false));
    }

    /* renamed from: a */
    public void m62047a(C16613a c16613a, int i) {
        c16613a.m62042a((ExitSurveyDetailReason) this.f51447a.get(i));
    }

    public int getItemCount() {
        return this.f51447a.size();
    }

    /* renamed from: a */
    public void m62048a(List<? extends ExitSurveyDetailReason> list) {
        this.f51447a = new ArrayList(list);
        notifyDataSetChanged();
    }
}
