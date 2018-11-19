package com.tinder.fastmatch.target;

import com.tinder.fastmatch.view.FastMatchRecsActivity.Source;
import com.tinder.fastmatch.viewmodel.FastMatchPreviewViewModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/tinder/fastmatch/target/FastMatchPreviewRowTarget;", "", "navigateToCardGrid", "", "source", "Lcom/tinder/fastmatch/view/FastMatchRecsActivity$Source;", "showPaywall", "showPreview", "viewModel", "Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface FastMatchPreviewRowTarget {
    void navigateToCardGrid(@NotNull Source source);

    void showPaywall();

    void showPreview(@NotNull FastMatchPreviewViewModel fastMatchPreviewViewModel);
}
