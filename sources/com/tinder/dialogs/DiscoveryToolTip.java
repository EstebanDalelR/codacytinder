package com.tinder.dialogs;

import android.content.Context;
import android.support.v7.app.AppCompatDialog;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.tinder.R;

public class DiscoveryToolTip extends AppCompatDialog {
    /* renamed from: a */
    private Unbinder f41802a = ButterKnife.a(this);
    @BindView(2131362344)
    ImageView mToolTipIcon;
    @BindView(2131362348)
    TextView mToolTipTextIcon;
    @BindView(2131362347)
    TextView mToolTipTextView;
    @BindString(2131822030)
    String selectToolTipText;
    @BindString(2131821167)
    String socialToolTipText;

    /* renamed from: com.tinder.dialogs.DiscoveryToolTip$1 */
    static /* synthetic */ class C88471 {
        /* renamed from: a */
        static final /* synthetic */ int[] f30992a = new int[ToolTipState.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.dialogs.DiscoveryToolTip.ToolTipState.values();
            r0 = r0.length;
            r0 = new int[r0];
            f30992a = r0;
            r0 = f30992a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.dialogs.DiscoveryToolTip.ToolTipState.SELECT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.dialogs.DiscoveryToolTip.1.<clinit>():void");
        }
    }

    public enum ToolTipState {
        SELECT,
        SOCIAL
    }

    public DiscoveryToolTip(Context context, ToolTipState toolTipState) {
        super(context, R.style.DiscoveryToolTip);
        setContentView(R.layout.view_discovery_tool_tip);
        m51059a(toolTipState);
    }

    protected void onStop() {
        super.onStop();
        this.f41802a.unbind();
    }

    /* renamed from: a */
    private void m51059a(ToolTipState toolTipState) {
        if (C88471.f30992a[toolTipState.ordinal()] == 1) {
            this.mToolTipTextIcon.setVisibility(0);
            toolTipState = new SpannableStringBuilder(this.selectToolTipText);
            toolTipState.setSpan(new StyleSpan(1), 14, this.selectToolTipText.length(), 33);
            this.mToolTipTextView.setText(toolTipState);
        }
    }

    @OnClick({2131362340})
    void onClickDismissDialog() {
        dismiss();
    }
}
