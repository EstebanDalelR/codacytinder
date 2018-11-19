package com.tinder.reactions.gestures.viewmodel;

import android.widget.ImageView.ScaleType;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.gestures.animation.C16333c;
import com.tinder.reactions.gestures.animation.C16334f;
import com.tinder.reactions.gestures.animation.C17974d;
import com.tinder.reactions.gestures.animation.C17975e;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lcom/tinder/reactions/gestures/viewmodel/ReactionViewModelFactory;", "", "()V", "createForReceiver", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureReactionViewModel;", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "createForSender", "getReactionAnimationFilenames", "", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.viewmodel.j */
public final class C14679j {
    @NotNull
    /* renamed from: a */
    public final List<String> m55933a() {
        return C17554o.m64199b((Object[]) new String[]{"hearts_0831_1310.json", "heartreceive_0831_1701.json", "clap_0814_1646.json", "laugh_0831_1709.json", "martinisend_0901_1539.json", "martinireceive_0613_0415.json", "really_0912_1658.json", "ugh_0912_1736.json", "nope_0912_1711.json", "strike1_0901_1626.json", "strike2_0906_1324.json", "strike3_0906_1349.json", "eyeroll_0925_1410.json", "ballsender_0919_1411.json", "ballreceiver_full_0922_1620.json"});
    }

    @NotNull
    /* renamed from: a */
    public final C14676f m55932a(@NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "grandGestureType");
        switch (C14680k.f46262a[grandGestureType.ordinal()]) {
            case 1:
                return new C14676f(GrandGestureType.HEART, "hearts_0831_1310.json", null, null, null, 0, 60, null);
            case 2:
                return new C14676f(GrandGestureType.CLAP, "clap_0814_1646.json", ScaleType.FIT_CENTER, new C16334f(), new C17975e(), 1500);
            case 3:
                return new C14676f(GrandGestureType.LAUGH, "laugh_0831_1709.json", null, null, null, 0, 60, null);
            case 4:
                return new C14676f(GrandGestureType.MARTINI, "martinisend_0901_1539.json", null, null, null, 0, 60, null);
            case 5:
                return new C14676f(GrandGestureType.REALLY, "really_0912_1658.json", ScaleType.CENTER_INSIDE, new C16334f(), new C17975e(), 0, 32, null);
            case 6:
                return new C14676f(GrandGestureType.UGH, "ugh_0912_1736.json", ScaleType.CENTER_INSIDE, new C16334f(), new C17975e(), 0, 32, null);
            case 7:
                return new C14676f(GrandGestureType.NOPE, "nope_0912_1711.json", ScaleType.CENTER_INSIDE, new C16334f(), new C17975e(), 0, 32, null);
            case 8:
                return new C14676f(GrandGestureType.EYEROLL, "eyeroll_0925_1410.json", ScaleType.FIT_CENTER, new C16333c(), new C17974d(), 0, 32, null);
            case 9:
                return new C14676f(GrandGestureType.STRIKE_1, "strike1_0901_1626.json", ScaleType.FIT_CENTER, null, null, 0, 56, null);
            case 10:
                return new C14676f(GrandGestureType.STRIKE_2, "strike2_0906_1324.json", ScaleType.FIT_CENTER, null, null, 0, 56, null);
            case 11:
                return new C14676f(GrandGestureType.STRIKE_3, "strike3_0906_1349.json", ScaleType.FIT_CENTER, null, null, 0, 56, null);
            case 12:
                return new C14676f(GrandGestureType.BALL_IN_COURT, "ballsender_0919_1411.json", ScaleType.FIT_CENTER, null, null, 0, 56, null);
            case 13:
                throw new UnsupportedOperationException("Unsupported GrandGestureType");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    /* renamed from: b */
    public final C14676f m55934b(@NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "grandGestureType");
        switch (C14680k.f46263b[grandGestureType.ordinal()]) {
            case 1:
                return new C14676f(GrandGestureType.HEART, "heartreceive_0831_1701.json", null, null, null, 0, 60, null);
            case 2:
                return new C14676f(GrandGestureType.CLAP, "clap_0814_1646.json", ScaleType.FIT_CENTER, new C16334f(), new C17975e(), 1500);
            case 3:
                return new C14676f(GrandGestureType.LAUGH, "laugh_0831_1709.json", null, null, null, 0, 60, null);
            case 4:
                return new C14676f(GrandGestureType.MARTINI, "martinireceive_0613_0415.json", null, null, null, 0, 60, null);
            case 5:
                return new C14676f(GrandGestureType.REALLY, "really_0912_1658.json", ScaleType.CENTER_INSIDE, new C16334f(), new C17975e(), 0, 32, null);
            case 6:
                return new C14676f(GrandGestureType.UGH, "ugh_0912_1736.json", ScaleType.CENTER_INSIDE, new C16334f(), new C17975e(), 0, 32, null);
            case 7:
                return new C14676f(GrandGestureType.NOPE, "nope_0912_1711.json", ScaleType.CENTER_INSIDE, new C16334f(), new C17975e(), 0, 32, null);
            case 8:
                return new C14676f(GrandGestureType.EYEROLL, "eyeroll_0925_1410.json", ScaleType.FIT_CENTER, new C16333c(), new C17974d(), 0, 32, null);
            case 9:
                return new C14676f(GrandGestureType.STRIKE_1, "strike1_0901_1626.json", ScaleType.FIT_CENTER, null, null, 0, 56, null);
            case 10:
                return new C14676f(GrandGestureType.STRIKE_2, "strike2_0906_1324.json", ScaleType.FIT_CENTER, null, null, 0, 56, null);
            case 11:
                return new C14676f(GrandGestureType.STRIKE_3, "strike3_0906_1349.json", ScaleType.FIT_CENTER, null, null, 0, 56, null);
            case 12:
                return new C14676f(GrandGestureType.BALL_IN_COURT, "ballreceiver_full_0922_1620.json", ScaleType.FIT_CENTER, null, null, 0, 56, null);
            case 13:
                throw new UnsupportedOperationException("Unsupported GrandGestureType");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
