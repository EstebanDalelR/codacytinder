package com.tinder.data.p206a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tinder.domain.apprating.AppRatingRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\nH\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\nH\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\nH\u0016J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/data/apprating/PreferenceAppRatingRepository;", "Lcom/tinder/domain/apprating/AppRatingRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "clearAppRatingPreferences", "Lrx/Completable;", "readChatActivityPaused", "", "readIsAppRatedBefore", "readIsFeedbackDismissed", "readIsFirstTimeAfterGooglePlayReview", "readIsRatingDismissed", "readIsVersionRateable", "readItsANewMatchDialogSeen", "readNewChatMessageRead", "readSessionTimeStamp", "", "writeChatActivityPaused", "", "paused", "writeFeedbackDismissed", "dismissed", "writeIsAppRatedBefore", "ratedAppBefore", "writeIsFirstTimeAfterGooglePlayReview", "sentFeedback", "writeIsVersionRateable", "versionRateable", "writeItsANewMatchDialogSeen", "itsAMatchDialogSeen", "writeNewChatMessageRead", "newMessageRead", "writeRatingDismissed", "writeSessionTimeStamp", "timeStamp", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.a.a */
public final class C10725a implements AppRatingRepository {
    /* renamed from: a */
    private final Editor f35102a;
    /* renamed from: b */
    private final SharedPreferences f35103b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.a.a$a */
    static final class C13794a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10725a f43790a;

        C13794a(C10725a c10725a) {
            this.f43790a = c10725a;
        }

        public final void call() {
            this.f43790a.f35102a.clear();
            this.f43790a.f35102a.commit();
        }
    }

    public C10725a(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f35103b = sharedPreferences;
        sharedPreferences = this.f35103b.edit();
        C2668g.a(sharedPreferences, "sharedPreferences.edit()");
        this.f35102a = sharedPreferences;
    }

    @NotNull
    public Completable clearAppRatingPreferences() {
        Completable a = Completable.a(new C13794a(this));
        C2668g.a(a, "Completable.fromAction {…    editor.commit()\n    }");
        return a;
    }

    public long readSessionTimeStamp() {
        return this.f35103b.getLong("session_timestamp", 0);
    }

    public void writeSessionTimeStamp(long j) {
        this.f35102a.putLong("session_timestamp", j).apply();
    }

    public boolean readItsANewMatchDialogSeen() {
        return this.f35103b.getBoolean("has_seen_new_match", false);
    }

    public void writeItsANewMatchDialogSeen(boolean z) {
        this.f35102a.putBoolean("has_seen_new_match", z).apply();
    }

    public boolean readNewChatMessageRead() {
        return this.f35103b.getBoolean("has_read_new_message", false);
    }

    public void writeNewChatMessageRead(boolean z) {
        this.f35102a.putBoolean("has_read_new_message", z).apply();
    }

    public boolean readIsAppRatedBefore() {
        return this.f35103b.getBoolean("has_rated_app_before", false);
    }

    public void writeIsAppRatedBefore(boolean z) {
        this.f35102a.putBoolean("has_rated_app_before", z).apply();
    }

    public boolean readIsVersionRateable() {
        return this.f35103b.getBoolean("version_is_rateable", true);
    }

    public void writeIsVersionRateable(boolean z) {
        this.f35102a.putBoolean("version_is_rateable", z).apply();
    }

    public boolean readIsRatingDismissed() {
        return this.f35103b.getBoolean("has_not_rated_app", false);
    }

    public void writeRatingDismissed(boolean z) {
        this.f35102a.putBoolean("has_not_rated_app", z).apply();
    }

    public boolean readIsFeedbackDismissed() {
        return this.f35103b.getBoolean("has_not_send_feedback", false);
    }

    public void writeFeedbackDismissed(boolean z) {
        this.f35102a.putBoolean("has_not_send_feedback", z).apply();
    }

    public boolean readIsFirstTimeAfterGooglePlayReview() {
        return this.f35103b.getBoolean("first_run_after_review_from_google_play", false);
    }

    public void writeIsFirstTimeAfterGooglePlayReview(boolean z) {
        this.f35102a.putBoolean("first_run_after_review_from_google_play", z).apply();
    }

    public boolean readChatActivityPaused() {
        return this.f35103b.getBoolean("chat_activity_paused", false);
    }

    public void writeChatActivityPaused(boolean z) {
        this.f35102a.putBoolean("chat_activity_paused", z).apply();
    }
}
