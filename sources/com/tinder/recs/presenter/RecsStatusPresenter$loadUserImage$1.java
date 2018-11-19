package com.tinder.recs.presenter;

import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import org.jetbrains.annotations.Nullable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "user", "Lcom/tinder/model/User;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class RecsStatusPresenter$loadUserImage$1<T, R> implements Func1<T, R> {
    public static final RecsStatusPresenter$loadUserImage$1 INSTANCE = new RecsStatusPresenter$loadUserImage$1();

    RecsStatusPresenter$loadUserImage$1() {
    }

    @Nullable
    public final String call(User user) {
        if (user != null) {
            user = user.getPhotos();
            if (user != null) {
                ProfilePhoto profilePhoto = (ProfilePhoto) C19299w.m68831g((List) user);
                if (profilePhoto != null) {
                    user = profilePhoto.getProcessedPhotos();
                    if (user != null) {
                        ProcessedPhoto processedPhoto = (ProcessedPhoto) C19299w.m68831g((List) user);
                        if (processedPhoto != null) {
                            return processedPhoto.getImageUrl();
                        }
                    }
                    return null;
                }
            }
        }
        return null;
    }
}
