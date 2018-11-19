package com.tinder.profile.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.utils.av;
import java.util.Set;

public class CensorMenuDialog extends Dialog {
    @NonNull
    /* renamed from: a */
    private final CensorMenuDialogListener f45592a;
    @BindView(2131361998)
    TextView muteButton;
    @BindView(2131362000)
    View recommendButton;
    @BindView(2131362001)
    View reportButton;
    @BindView(2131362005)
    TextView unMuteButton;
    @BindView(2131362006)
    View unmatchButton;
    @BindView(2131363971)
    View viewSeparator2;
    @BindView(2131363970)
    View viewSeperator1;

    public interface CensorMenuDialogListener {
        void onMuteClicked();

        void onRecommendClicked();

        void onReportClicked();

        void onUnMatchClicked();

        void onUnMuteClicked();
    }

    public enum MenuItem {
        REPORT,
        MUTE,
        UN_MUTE,
        UN_MATCH,
        RECOMMEND
    }

    public CensorMenuDialog(@NonNull CensorMenuDialogListener censorMenuDialogListener, @NonNull Context context, @NonNull Set<MenuItem> set, @Nullable View view) {
        super(context, 16973935);
        requestWindowFeature(1);
        setContentView(R.layout.dialog_censor_menu);
        ButterKnife.a(this);
        this.muteButton.setVisibility(8);
        this.unMuteButton.setVisibility(8);
        this.viewSeperator1.setVisibility(8);
        this.unmatchButton.setVisibility(8);
        this.viewSeparator2.setVisibility(8);
        this.reportButton.setVisibility(8);
        this.recommendButton.setVisibility(8);
        if (view == null) {
            m54831a();
        } else {
            m54832a(view);
        }
        setCanceledOnTouchOutside(true);
        m54833a((Set) set);
        this.f45592a = censorMenuDialogListener;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void m54831a() {
        Window window = getWindow();
        window.setLayout(-2, -2);
        LayoutParams attributes = window.getAttributes();
        attributes.gravity = 8388661;
        attributes.flags = 512;
        attributes.y = (int) (getContext().getResources().getDimension(R.dimen.actionbar_size) - getContext().getResources().getDimension(R.dimen.height_dialog_drop_shadow));
    }

    /* renamed from: a */
    private void m54832a(View view) {
        view = av.a(view).y;
        Window window = getWindow();
        window.setLayout(-2, -2);
        LayoutParams attributes = window.getAttributes();
        attributes.gravity = 8388661;
        attributes.flags = 768;
        attributes.y = view;
    }

    /* renamed from: a */
    private void m54833a(@NonNull Set<MenuItem> set) {
        for (MenuItem menuItem : set) {
            switch (menuItem) {
                case REPORT:
                    this.reportButton.setVisibility(0);
                    break;
                case MUTE:
                    this.muteButton.setVisibility(0);
                    break;
                case UN_MUTE:
                    this.unMuteButton.setVisibility(0);
                    break;
                case UN_MATCH:
                    this.unmatchButton.setVisibility(0);
                    break;
                case RECOMMEND:
                    this.recommendButton.setVisibility(0);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown menu item");
            }
        }
        if (set.size() > 1) {
            this.viewSeperator1.setVisibility(0);
        }
        if (set.size() > 2) {
            this.viewSeparator2.setVisibility(0);
        }
    }

    @OnClick({2131362001})
    void onReportUser() {
        this.f45592a.onReportClicked();
        dismiss();
    }

    @OnClick({2131362006})
    void onUnmatch() {
        this.f45592a.onUnMatchClicked();
        dismiss();
    }

    @OnClick({2131361998})
    void onMute() {
        this.f45592a.onMuteClicked();
        dismiss();
    }

    @OnClick({2131362005})
    void onUnMute() {
        this.f45592a.onUnMuteClicked();
        dismiss();
    }

    @OnClick({2131362000})
    void onRecommend() {
        this.f45592a.onRecommendClicked();
        dismiss();
    }
}
