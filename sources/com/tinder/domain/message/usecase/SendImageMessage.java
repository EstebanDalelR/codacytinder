package com.tinder.domain.message.usecase;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.message.Image;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.profile.model.ProfileOption.User;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import hu.akarnokd.rxjava.interop.C15551e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/domain/message/usecase/SendImageMessage;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/domain/message/usecase/SendImageMessage$Request;", "commonMessagePropertiesAggregator", "Lcom/tinder/domain/message/usecase/CommonMessagePropertiesAggregator;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "loadProfileUser", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "(Lcom/tinder/domain/message/usecase/CommonMessagePropertiesAggregator;Lcom/tinder/domain/message/MessageRepository;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;)V", "createImageMessage", "Lcom/tinder/domain/message/ImageMessage;", "commonMessageProperties", "Lcom/tinder/domain/message/usecase/CommonMessageProperties;", "image", "Lcom/tinder/domain/message/Image;", "fallbackMessage", "", "execute", "Lrx/Completable;", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SendImageMessage implements CompletableUseCase<Request> {
    private final CommonMessagePropertiesAggregator commonMessagePropertiesAggregator;
    private final LoadProfileOptionData loadProfileUser;
    private final MessageRepository messageRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/tinder/domain/message/usecase/SendImageMessage$Request;", "", "matchId", "", "image", "Lcom/tinder/domain/message/Image;", "fallbackMessage", "isImageUrlValid", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lcom/tinder/domain/message/Image;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getFallbackMessage", "()Ljava/lang/String;", "getImage", "()Lcom/tinder/domain/message/Image;", "()Lkotlin/jvm/functions/Function0;", "getMatchId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @NotNull
        private final String fallbackMessage;
        @NotNull
        private final Image image;
        @NotNull
        private final Function0<Boolean> isImageUrlValid;
        @NotNull
        private final String matchId;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, String str, Image image, String str2, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.matchId;
            }
            if ((i & 2) != 0) {
                image = request.image;
            }
            if ((i & 4) != 0) {
                str2 = request.fallbackMessage;
            }
            if ((i & 8) != 0) {
                function0 = request.isImageUrlValid;
            }
            return request.copy(str, image, str2, function0);
        }

        @NotNull
        public final String component1() {
            return this.matchId;
        }

        @NotNull
        public final Image component2() {
            return this.image;
        }

        @NotNull
        public final String component3() {
            return this.fallbackMessage;
        }

        @NotNull
        public final Function0<Boolean> component4() {
            return this.isImageUrlValid;
        }

        @NotNull
        public final Request copy(@NotNull String str, @NotNull Image image, @NotNull String str2, @NotNull Function0<Boolean> function0) {
            C2668g.b(str, "matchId");
            C2668g.b(image, ManagerWebServices.IG_PARAM_IMAGE);
            C2668g.b(str2, "fallbackMessage");
            C2668g.b(function0, "isImageUrlValid");
            return new Request(str, image, str2, function0);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    Request request = (Request) obj;
                    if (C2668g.a(this.matchId, request.matchId) && C2668g.a(this.image, request.image) && C2668g.a(this.fallbackMessage, request.fallbackMessage) && C2668g.a(this.isImageUrlValid, request.isImageUrlValid)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.matchId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Image image = this.image;
            hashCode = (hashCode + (image != null ? image.hashCode() : 0)) * 31;
            String str2 = this.fallbackMessage;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Function0 function0 = this.isImageUrlValid;
            if (function0 != null) {
                i = function0.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.matchId);
            stringBuilder.append(", image=");
            stringBuilder.append(this.image);
            stringBuilder.append(", fallbackMessage=");
            stringBuilder.append(this.fallbackMessage);
            stringBuilder.append(", isImageUrlValid=");
            stringBuilder.append(this.isImageUrlValid);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull String str, @NotNull Image image, @NotNull String str2, @NotNull Function0<Boolean> function0) {
            C2668g.b(str, "matchId");
            C2668g.b(image, ManagerWebServices.IG_PARAM_IMAGE);
            C2668g.b(str2, "fallbackMessage");
            C2668g.b(function0, "isImageUrlValid");
            this.matchId = str;
            this.image = image;
            this.fallbackMessage = str2;
            this.isImageUrlValid = function0;
        }

        @NotNull
        public final String getMatchId() {
            return this.matchId;
        }

        @NotNull
        public final Image getImage() {
            return this.image;
        }

        @NotNull
        public final String getFallbackMessage() {
            return this.fallbackMessage;
        }

        @NotNull
        public final Function0<Boolean> isImageUrlValid() {
            return this.isImageUrlValid;
        }
    }

    @Inject
    public SendImageMessage(@NotNull CommonMessagePropertiesAggregator commonMessagePropertiesAggregator, @NotNull MessageRepository messageRepository, @NotNull LoadProfileOptionData loadProfileOptionData) {
        C2668g.b(commonMessagePropertiesAggregator, "commonMessagePropertiesAggregator");
        C2668g.b(messageRepository, "messageRepository");
        C2668g.b(loadProfileOptionData, "loadProfileUser");
        this.commonMessagePropertiesAggregator = commonMessagePropertiesAggregator;
        this.messageRepository = messageRepository;
        this.loadProfileUser = loadProfileOptionData;
    }

    @NotNull
    public Completable execute(@NotNull Request request) {
        C2668g.b(request, "request");
        String component1 = request.component1();
        Image component2 = request.component2();
        String component3 = request.component3();
        if (((Boolean) request.component4().invoke()).booleanValue() == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to send Image. Invalid url ");
            stringBuilder.append(component2.getUrl());
            request = Completable.a((Throwable) new IllegalArgumentException(stringBuilder.toString()));
            C2668g.a(request, "Completable.error(\n     …valid url ${image.url}\"))");
            return request;
        }
        request = Single.a(C15551e.a(this.loadProfileUser.execute(User.INSTANCE).firstOrError()), this.commonMessagePropertiesAggregator.aggregate$domain_release(component1, component2.getUrl()), new SendImageMessage$execute$1(this, component3, component2)).c(new SendImageMessage$sam$rx_functions_Func1$0(new SendImageMessage$execute$2(this.messageRepository)));
        C2668g.a(request, "Single.zip(RxJavaInterop…epository::createMessage)");
        return request;
    }

    private final ImageMessage createImageMessage(CommonMessageProperties commonMessageProperties, Image image, String str) {
        return new ImageMessage(null, commonMessageProperties.getId(), commonMessageProperties.getMatchId(), commonMessageProperties.getToId(), commonMessageProperties.getFromId(), str, commonMessageProperties.getSentDate(), commonMessageProperties.isLiked(), commonMessageProperties.isSeen(), commonMessageProperties.getDeliveryStatus(), image, 1, null);
    }
}
