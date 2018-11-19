package com.tinder.loops.activity;

import android.arch.lifecycle.C0030o;
import com.tinder.loops.ui.viewmodels.VideoFrameViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/loops/ui/viewmodels/VideoFrameViewModel;", "invoke"}, k = 3, mv = {1, 1, 10})
final class TrimAndCropActivity$videoFrameViewModel$2 extends Lambda implements Function0<VideoFrameViewModel> {
    /* renamed from: a */
    final /* synthetic */ TrimAndCropActivity f44507a;

    TrimAndCropActivity$videoFrameViewModel$2(TrimAndCropActivity trimAndCropActivity) {
        this.f44507a = trimAndCropActivity;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53743a();
    }

    @NotNull
    /* renamed from: a */
    public final VideoFrameViewModel m53743a() {
        return (VideoFrameViewModel) C0030o.a(this.f44507a, this.f44507a.m54522a()).a(VideoFrameViewModel.class);
    }
}
