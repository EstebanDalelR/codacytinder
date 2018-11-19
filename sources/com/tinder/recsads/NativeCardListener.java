package com.tinder.recsads;

import com.tinder.recsads.model.C16464a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/recsads/NativeCardListener;", "", "onCardMovedToTop", "", "adRec", "Lcom/tinder/recsads/model/AdRec;", "onClickthroughClicked", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public interface NativeCardListener {
    void onCardMovedToTop(@NotNull C16464a c16464a);

    void onClickthroughClicked(@NotNull C16464a c16464a);
}
