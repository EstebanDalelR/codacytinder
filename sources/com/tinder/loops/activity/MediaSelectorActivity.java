package com.tinder.loops.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.loops.C9753a.C9749d;
import com.tinder.loops.C9753a.C9750e;
import com.tinder.loops.di.LoopsApplicationComponentProvider;
import com.tinder.loops.di.MediaSelectorActivitySubComponent;
import com.tinder.loops.di.MediaSelectorActivitySubComponentProvider;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/tinder/loops/activity/MediaSelectorActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/tinder/loops/di/MediaSelectorActivitySubComponentProvider;", "()V", "mediaSelectorActivitySubComponent", "Lcom/tinder/loops/di/MediaSelectorActivitySubComponent;", "toolbar", "Landroid/support/v7/widget/Toolbar;", "getToolbar", "()Landroid/support/v7/widget/Toolbar;", "toolbar$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "provideMediaSelectorActivitySubComponent", "setUpToolbar", "loops_release"}, k = 1, mv = {1, 1, 10})
public final class MediaSelectorActivity extends AppCompatActivity implements MediaSelectorActivitySubComponentProvider {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f45380a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(MediaSelectorActivity.class), "toolbar", "getToolbar()Landroid/support/v7/widget/Toolbar;"))};
    /* renamed from: b */
    private MediaSelectorActivitySubComponent f45381b;
    /* renamed from: c */
    private final Lazy f45382c = C18451c.a(LazyThreadSafetyMode.NONE, new MediaSelectorActivity$$special$$inlined$bindView$1(this, C9749d.toolBarContainer));

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.activity.MediaSelectorActivity$a */
    static final class C9755a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MediaSelectorActivity f32375a;

        C9755a(MediaSelectorActivity mediaSelectorActivity) {
            this.f32375a = mediaSelectorActivity;
        }

        public final void onClick(View view) {
            this.f32375a.onBackPressed();
        }
    }

    /* renamed from: a */
    private final Toolbar m54499a() {
        Lazy lazy = this.f45382c;
        KProperty kProperty = f45380a[0];
        return (Toolbar) lazy.getValue();
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getApplication();
        if (bundle == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.loops.di.LoopsApplicationComponentProvider");
        }
        this.f45381b = ((LoopsApplicationComponentProvider) bundle).provideLoopsApplicationComponent().mediaSelectorActivityComponentBuilder().build();
        bundle = this.f45381b;
        if (bundle == null) {
            C2668g.b("mediaSelectorActivitySubComponent");
        }
        bundle.inject(this);
        setContentView(C9750e.activity_media_selector);
        m54500b();
    }

    @NotNull
    public MediaSelectorActivitySubComponent provideMediaSelectorActivitySubComponent() {
        MediaSelectorActivitySubComponent mediaSelectorActivitySubComponent = this.f45381b;
        if (mediaSelectorActivitySubComponent == null) {
            C2668g.b("mediaSelectorActivitySubComponent");
        }
        return mediaSelectorActivitySubComponent;
    }

    /* renamed from: b */
    private final void m54500b() {
        m54499a().setNavigationOnClickListener(new C9755a(this));
    }
}
