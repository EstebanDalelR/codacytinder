package com.tinder.fastmatch.presenter;

import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.fastmatch.viewmodel.FastMatchPreviewViewModel;
import com.tinder.fastmatch.viewmodel.FastMatchPreviewViewModel.CountPosition;
import com.tinder.fastmatch.viewmodel.FastMatchPreviewViewModel.PreviewState;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u000e"}, d2 = {"Lcom/tinder/fastmatch/presenter/FastMatchPreviewViewModelFactory;", "", "()V", "create", "Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel;", "fastMatchStatus", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "subscription", "Lcom/tinder/domain/common/model/Subscription;", "determineState", "Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel$PreviewState;", "count", "", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.presenter.f */
public final class C9390f {
    /* renamed from: a */
    public static final C9389a f31494a = new C9389a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/fastmatch/presenter/FastMatchPreviewViewModelFactory$Companion;", "", "()V", "NON_SUBSCRIBER_MIN_COUNT", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.f$a */
    public static final class C9389a {
        private C9389a() {
        }
    }

    @NotNull
    /* renamed from: a */
    public final FastMatchPreviewViewModel m39307a(@NotNull FastMatchStatus fastMatchStatus, @NotNull Subscription subscription) {
        C2668g.b(fastMatchStatus, "fastMatchStatus");
        C2668g.b(subscription, "subscription");
        int count = fastMatchStatus.getCount();
        boolean isRange = fastMatchStatus.isRange();
        byte[] previewImageBytes = fastMatchStatus.getPreviewImageBytes();
        long previewImageTimestamp = fastMatchStatus.getPreviewImageTimestamp();
        fastMatchStatus = subscription.isGold();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastMatchPreviewImage ");
        stringBuilder.append(previewImageTimestamp);
        stringBuilder.append(" not pixelated ");
        stringBuilder.append(fastMatchStatus);
        String stringBuilder2 = stringBuilder.toString();
        if (subscription.isGold() != null) {
            return new FastMatchPreviewViewModel(count, isRange, CountPosition.TITLE, previewImageBytes, stringBuilder2, fastMatchStatus ^ 1, m39306a(count));
        }
        if (count < 3) {
            subscription = CountPosition.NONE;
        } else {
            subscription = CountPosition.AVATAR;
        }
        return new FastMatchPreviewViewModel(count, isRange, subscription, previewImageBytes, stringBuilder2, fastMatchStatus ^ 1, m39306a(count));
    }

    /* renamed from: a */
    private final PreviewState m39306a(int i) {
        if (i > 0) {
            return PreviewState.HAS_LIKES;
        }
        if (i == 0) {
            return PreviewState.NO_LIKES;
        }
        return PreviewState.LOADING;
    }
}
