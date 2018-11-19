package com.tinder.bitmoji.analytics;

import com.tinder.etl.event.ax;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u0011"}, d2 = {"Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory;", "", "()V", "create", "Lcom/tinder/etl/event/AppTutorialEvent;", "tutorialAction", "Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialAction;", "tutorialContext", "Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialContext;", "tutorialName", "Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialName;", "tutorialType", "Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialType;", "TutorialAction", "TutorialContext", "TutorialName", "TutorialType", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
public final class AppTutorialEventFactory {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialAction;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SHOW", "TAP", "DISMISS", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
    public enum TutorialAction {
        ;
        
        @NotNull
        private final String value;

        protected TutorialAction(String str) {
            C2668g.b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialContext;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "APP", "RECS", "CHAT", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
    public enum TutorialContext {
        ;
        
        @NotNull
        private final String value;

        protected TutorialContext(String str) {
            C2668g.b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialName;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BITMOJI_INTRO", "BITMOJI_TOOLTIP", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
    public enum TutorialName {
        ;
        
        @NotNull
        private final String value;

        protected TutorialName(String str) {
            C2668g.b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MODAL", "TOOLTIP", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
    public enum TutorialType {
        ;
        
        @NotNull
        private final String value;

        protected TutorialType(String str) {
            C2668g.b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @NotNull
    /* renamed from: a */
    public final ax m35431a(@NotNull TutorialAction tutorialAction, @NotNull TutorialContext tutorialContext, @NotNull TutorialName tutorialName, @NotNull TutorialType tutorialType) {
        C2668g.b(tutorialAction, "tutorialAction");
        C2668g.b(tutorialContext, "tutorialContext");
        C2668g.b(tutorialName, "tutorialName");
        C2668g.b(tutorialType, "tutorialType");
        tutorialAction = ax.m44195a().m37852a(tutorialAction.getValue()).m37854b(tutorialContext.getValue()).m37855c(tutorialName.getValue()).m37856d(tutorialType.getValue()).m37853a();
        C2668g.a(tutorialAction, "AppTutorialEvent.builder…\n                .build()");
        return tutorialAction;
    }
}
