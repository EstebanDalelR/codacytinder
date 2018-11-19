package com.tinder.toppicks.target;

import com.tinder.domain.recs.model.TopPickTeaserRec;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/tinder/toppicks/target/TopPicksTarget;", "", "showEmpty", "", "showGoldExhausted", "teasers", "", "Lcom/tinder/domain/recs/model/TopPickTeaserRec;", "showGoldGrid", "showIntroModal", "url", "", "showNonGoldGrid", "showRecsNotLoaded", "showTeasersNotLoaded", "showTutorial", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksTarget {
    void showEmpty();

    void showGoldExhausted();

    void showGoldExhausted(@NotNull List<TopPickTeaserRec> list);

    void showGoldGrid();

    void showIntroModal(@NotNull String str);

    void showNonGoldGrid();

    void showRecsNotLoaded();

    void showTeasersNotLoaded();

    void showTutorial();
}
