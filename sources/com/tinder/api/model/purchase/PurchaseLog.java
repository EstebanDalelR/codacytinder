package com.tinder.api.model.purchase;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.squareup.moshi.Json;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0004,-./Be\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Jn\u0010$\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u00060"}, d2 = {"Lcom/tinder/api/model/purchase/PurchaseLog;", "", "domain", "Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "namespace", "", "className", "platform", "userId", "appVersion", "occurredAt", "", "metaData", "Lcom/tinder/api/model/purchase/PurchaseLog$MetaData;", "(Lcom/tinder/api/model/purchase/PurchaseLog$Domain;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/tinder/api/model/purchase/PurchaseLog$MetaData;)V", "getAppVersion", "()Ljava/lang/String;", "getClassName", "getDomain", "()Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "getMetaData", "()Lcom/tinder/api/model/purchase/PurchaseLog$MetaData;", "getNamespace", "getOccurredAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPlatform", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/tinder/api/model/purchase/PurchaseLog$Domain;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/tinder/api/model/purchase/PurchaseLog$MetaData;)Lcom/tinder/api/model/purchase/PurchaseLog;", "equals", "", "other", "hashCode", "", "toString", "Domain", "MetaData", "Source", "Subscription", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PurchaseLog {
    @Nullable
    private final String appVersion;
    @Nullable
    private final String className;
    @Nullable
    private final Domain domain;
    @Nullable
    private final MetaData metaData;
    @Nullable
    private final String namespace;
    @Nullable
    private final Long occurredAt;
    @Nullable
    private final String platform;
    @Nullable
    private final String userId;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "", "(Ljava/lang/String;I)V", "STORE", "CLIENT", "BACKEND", "HTTP", "api_release"}, k = 1, mv = {1, 1, 10})
    public enum Domain {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\bN\b\b\u0018\u0000 h2\u00020\u0001:\u0001hBÛ\u0002\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010$J\u0010\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010`\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&Jä\u0002\u0010b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010cJ\u0013\u0010d\u001a\u00020\t2\b\u0010e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010f\u001a\u00020\u0003HÖ\u0001J\t\u0010g\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00100\u001a\u0004\b\u0011\u0010/R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00100\u001a\u0004\b\b\u0010/R\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00100\u001a\u0004\b\f\u0010/R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0015\u0010#\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00100\u001a\u0004\b9\u0010/R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b:\u0010&R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bB\u0010>R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\bC\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\bF\u0010&¨\u0006i"}, d2 = {"Lcom/tinder/api/model/purchase/PurchaseLog$MetaData;", "", "statusCode", "", "language", "", "stackTrace", "", "isConnectedToGooglePlay", "", "locale", "region", "isPassporting", "subscription", "Lcom/tinder/api/model/purchase/PurchaseLog$Subscription;", "superlikeCount", "boostCount", "isBoostEnabled", "experimentGroups", "skusOffered", "skusOwned", "errorSku", "receiptId", "intendedSku", "source", "Lcom/tinder/api/model/purchase/PurchaseLog$Source;", "price", "", "json", "purchaseCodeVersion", "device", "manufacturer", "osVersion", "carrier", "connectionType", "profileV2", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/tinder/api/model/purchase/PurchaseLog$Subscription;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/api/model/purchase/PurchaseLog$Source;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBoostCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCarrier", "()Ljava/lang/String;", "getConnectionType", "getDevice", "getErrorSku", "getExperimentGroups", "getIntendedSku", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getJson", "getLanguage", "getLocale", "getManufacturer", "getOsVersion", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getProfileV2", "getPurchaseCodeVersion", "getReceiptId", "getRegion", "getSkusOffered", "()Ljava/util/List;", "getSkusOwned", "getSource", "()Lcom/tinder/api/model/purchase/PurchaseLog$Source;", "getStackTrace", "getStatusCode", "getSubscription", "()Lcom/tinder/api/model/purchase/PurchaseLog$Subscription;", "getSuperlikeCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/tinder/api/model/purchase/PurchaseLog$Subscription;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/api/model/purchase/PurchaseLog$Source;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/tinder/api/model/purchase/PurchaseLog$MetaData;", "equals", "other", "hashCode", "toString", "Companion", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class MetaData {
        public static final Companion Companion = new Companion();
        public static final int PURCHASE_CODE_ANJLAB = 1;
        public static final int PURCHASE_CODE_GOOGLE_BILLER = 2;
        @Nullable
        private final Integer boostCount;
        @Nullable
        private final String carrier;
        @Nullable
        private final String connectionType;
        @Nullable
        private final String device;
        @Nullable
        private final String errorSku;
        @Nullable
        private final String experimentGroups;
        @Nullable
        private final String intendedSku;
        @Nullable
        private final Boolean isBoostEnabled;
        @Nullable
        private final Boolean isConnectedToGooglePlay;
        @Nullable
        private final Boolean isPassporting;
        @Nullable
        private final String json;
        @Nullable
        private final String language;
        @Nullable
        private final String locale;
        @Nullable
        private final String manufacturer;
        @Nullable
        private final String osVersion;
        @Nullable
        private final Double price;
        @Nullable
        private final Boolean profileV2;
        @Nullable
        private final Integer purchaseCodeVersion;
        @Nullable
        private final String receiptId;
        @Nullable
        private final String region;
        @Nullable
        private final List<String> skusOffered;
        @Nullable
        private final List<String> skusOwned;
        @Nullable
        private final Source source;
        @Nullable
        private final List<String> stackTrace;
        @Nullable
        private final Integer statusCode;
        @Nullable
        private final Subscription subscription;
        @Nullable
        private final Integer superlikeCount;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/api/model/purchase/PurchaseLog$MetaData$Companion;", "", "()V", "PURCHASE_CODE_ANJLAB", "", "PURCHASE_CODE_GOOGLE_BILLER", "api_release"}, k = 1, mv = {1, 1, 10})
        public static final class Companion {
            private Companion() {
            }
        }

        public MetaData() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217727, null);
        }

        @NotNull
        public static /* synthetic */ MetaData copy$default(MetaData metaData, Integer num, String str, List list, Boolean bool, String str2, String str3, Boolean bool2, Subscription subscription, Integer num2, Integer num3, Boolean bool3, String str4, List list2, List list3, String str5, String str6, String str7, Source source, Double d, String str8, Integer num4, String str9, String str10, String str11, String str12, String str13, Boolean bool4, int i, Object obj) {
            String str14;
            String str15;
            MetaData metaData2 = metaData;
            int i2 = i;
            Integer num5 = (i2 & 1) != 0 ? metaData2.statusCode : num;
            String str16 = (i2 & 2) != 0 ? metaData2.language : str;
            List list4 = (i2 & 4) != 0 ? metaData2.stackTrace : list;
            Boolean bool5 = (i2 & 8) != 0 ? metaData2.isConnectedToGooglePlay : bool;
            String str17 = (i2 & 16) != 0 ? metaData2.locale : str2;
            String str18 = (i2 & 32) != 0 ? metaData2.region : str3;
            Boolean bool6 = (i2 & 64) != 0 ? metaData2.isPassporting : bool2;
            Subscription subscription2 = (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? metaData2.subscription : subscription;
            Integer num6 = (i2 & 256) != 0 ? metaData2.superlikeCount : num2;
            Integer num7 = (i2 & 512) != 0 ? metaData2.boostCount : num3;
            Boolean bool7 = (i2 & 1024) != 0 ? metaData2.isBoostEnabled : bool3;
            String str19 = (i2 & ItemAnimator.FLAG_MOVED) != 0 ? metaData2.experimentGroups : str4;
            List list5 = (i2 & 4096) != 0 ? metaData2.skusOffered : list2;
            List list6 = (i2 & 8192) != 0 ? metaData2.skusOwned : list3;
            String str20 = (i2 & 16384) != 0 ? metaData2.errorSku : str5;
            if ((i2 & 32768) != 0) {
                str14 = str20;
                str15 = metaData2.receiptId;
            } else {
                str14 = str20;
                str15 = str6;
            }
            return metaData2.copy(num5, str16, list4, bool5, str17, str18, bool6, subscription2, num6, num7, bool7, str19, list5, list6, str14, str15, (65536 & i2) != 0 ? metaData2.intendedSku : str7, (131072 & i2) != 0 ? metaData2.source : source, (262144 & i2) != 0 ? metaData2.price : d, (524288 & i2) != 0 ? metaData2.json : str8, (1048576 & i2) != 0 ? metaData2.purchaseCodeVersion : num4, (2097152 & i2) != 0 ? metaData2.device : str9, (4194304 & i2) != 0 ? metaData2.manufacturer : str10, (8388608 & i2) != 0 ? metaData2.osVersion : str11, (16777216 & i2) != 0 ? metaData2.carrier : str12, (33554432 & i2) != 0 ? metaData2.connectionType : str13, (i2 & 67108864) != 0 ? metaData2.profileV2 : bool4);
        }

        @Nullable
        public final Integer component1() {
            return this.statusCode;
        }

        @Nullable
        public final Integer component10() {
            return this.boostCount;
        }

        @Nullable
        public final Boolean component11() {
            return this.isBoostEnabled;
        }

        @Nullable
        public final String component12() {
            return this.experimentGroups;
        }

        @Nullable
        public final List<String> component13() {
            return this.skusOffered;
        }

        @Nullable
        public final List<String> component14() {
            return this.skusOwned;
        }

        @Nullable
        public final String component15() {
            return this.errorSku;
        }

        @Nullable
        public final String component16() {
            return this.receiptId;
        }

        @Nullable
        public final String component17() {
            return this.intendedSku;
        }

        @Nullable
        public final Source component18() {
            return this.source;
        }

        @Nullable
        public final Double component19() {
            return this.price;
        }

        @Nullable
        public final String component2() {
            return this.language;
        }

        @Nullable
        public final String component20() {
            return this.json;
        }

        @Nullable
        public final Integer component21() {
            return this.purchaseCodeVersion;
        }

        @Nullable
        public final String component22() {
            return this.device;
        }

        @Nullable
        public final String component23() {
            return this.manufacturer;
        }

        @Nullable
        public final String component24() {
            return this.osVersion;
        }

        @Nullable
        public final String component25() {
            return this.carrier;
        }

        @Nullable
        public final String component26() {
            return this.connectionType;
        }

        @Nullable
        public final Boolean component27() {
            return this.profileV2;
        }

        @Nullable
        public final List<String> component3() {
            return this.stackTrace;
        }

        @Nullable
        public final Boolean component4() {
            return this.isConnectedToGooglePlay;
        }

        @Nullable
        public final String component5() {
            return this.locale;
        }

        @Nullable
        public final String component6() {
            return this.region;
        }

        @Nullable
        public final Boolean component7() {
            return this.isPassporting;
        }

        @Nullable
        public final Subscription component8() {
            return this.subscription;
        }

        @Nullable
        public final Integer component9() {
            return this.superlikeCount;
        }

        @NotNull
        public final MetaData copy(@Nullable @Json(name = "status_code") Integer num, @Nullable @Json(name = "language") String str, @Nullable @Json(name = "stack_trace") List<String> list, @Nullable @Json(name = "is_connected_to_google_play") Boolean bool, @Nullable @Json(name = "locale") String str2, @Nullable @Json(name = "region") String str3, @Nullable @Json(name = "is_passport") Boolean bool2, @Nullable @Json(name = "subscription") Subscription subscription, @Nullable @Json(name = "superlike_count") Integer num2, @Nullable @Json(name = "boost_count") Integer num3, @Nullable @Json(name = "boost_enabled") Boolean bool3, @Nullable @Json(name = "experiment_groups") String str4, @Nullable @Json(name = "skus_offered") List<String> list2, @Nullable @Json(name = "skus_owned") List<String> list3, @Nullable @Json(name = "error_sku") String str5, @Nullable @Json(name = "receipt_id") String str6, @Nullable @Json(name = "intended_sku") String str7, @Nullable @Json(name = "source") Source source, @Nullable @Json(name = "price") Double d, @Nullable @Json(name = "json") String str8, @Nullable @Json(name = "purchase_code_version") Integer num4, @Nullable @Json(name = "device") String str9, @Nullable @Json(name = "manufacturer") String str10, @Nullable @Json(name = "os_version") String str11, @Nullable @Json(name = "carrier") String str12, @Nullable @Json(name = "connectionType") String str13, @Nullable @Json(name = "profile_v2") Boolean bool4) {
            return new MetaData(num, str, list, bool, str2, str3, bool2, subscription, num2, num3, bool3, str4, list2, list3, str5, str6, str7, source, d, str8, num4, str9, str10, str11, str12, str13, bool4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MetaData) {
                    MetaData metaData = (MetaData) obj;
                    if (C2668g.a(this.statusCode, metaData.statusCode) && C2668g.a(this.language, metaData.language) && C2668g.a(this.stackTrace, metaData.stackTrace) && C2668g.a(this.isConnectedToGooglePlay, metaData.isConnectedToGooglePlay) && C2668g.a(this.locale, metaData.locale) && C2668g.a(this.region, metaData.region) && C2668g.a(this.isPassporting, metaData.isPassporting) && C2668g.a(this.subscription, metaData.subscription) && C2668g.a(this.superlikeCount, metaData.superlikeCount) && C2668g.a(this.boostCount, metaData.boostCount) && C2668g.a(this.isBoostEnabled, metaData.isBoostEnabled) && C2668g.a(this.experimentGroups, metaData.experimentGroups) && C2668g.a(this.skusOffered, metaData.skusOffered) && C2668g.a(this.skusOwned, metaData.skusOwned) && C2668g.a(this.errorSku, metaData.errorSku) && C2668g.a(this.receiptId, metaData.receiptId) && C2668g.a(this.intendedSku, metaData.intendedSku) && C2668g.a(this.source, metaData.source) && C2668g.a(this.price, metaData.price) && C2668g.a(this.json, metaData.json) && C2668g.a(this.purchaseCodeVersion, metaData.purchaseCodeVersion) && C2668g.a(this.device, metaData.device) && C2668g.a(this.manufacturer, metaData.manufacturer) && C2668g.a(this.osVersion, metaData.osVersion) && C2668g.a(this.carrier, metaData.carrier) && C2668g.a(this.connectionType, metaData.connectionType) && C2668g.a(this.profileV2, metaData.profileV2)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Integer num = this.statusCode;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            String str = this.language;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            List list = this.stackTrace;
            hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            Boolean bool = this.isConnectedToGooglePlay;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            str = this.locale;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.region;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            bool = this.isPassporting;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            Subscription subscription = this.subscription;
            hashCode = (hashCode + (subscription != null ? subscription.hashCode() : 0)) * 31;
            Integer num2 = this.superlikeCount;
            hashCode = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
            num2 = this.boostCount;
            hashCode = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
            bool = this.isBoostEnabled;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            str = this.experimentGroups;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            list = this.skusOffered;
            hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            list = this.skusOwned;
            hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            str = this.errorSku;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.receiptId;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.intendedSku;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Source source = this.source;
            hashCode = (hashCode + (source != null ? source.hashCode() : 0)) * 31;
            Double d = this.price;
            hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
            str = this.json;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            num2 = this.purchaseCodeVersion;
            hashCode = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
            str = this.device;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.manufacturer;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.osVersion;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.carrier;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.connectionType;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            bool = this.profileV2;
            if (bool != null) {
                i = bool.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MetaData(statusCode=");
            stringBuilder.append(this.statusCode);
            stringBuilder.append(", language=");
            stringBuilder.append(this.language);
            stringBuilder.append(", stackTrace=");
            stringBuilder.append(this.stackTrace);
            stringBuilder.append(", isConnectedToGooglePlay=");
            stringBuilder.append(this.isConnectedToGooglePlay);
            stringBuilder.append(", locale=");
            stringBuilder.append(this.locale);
            stringBuilder.append(", region=");
            stringBuilder.append(this.region);
            stringBuilder.append(", isPassporting=");
            stringBuilder.append(this.isPassporting);
            stringBuilder.append(", subscription=");
            stringBuilder.append(this.subscription);
            stringBuilder.append(", superlikeCount=");
            stringBuilder.append(this.superlikeCount);
            stringBuilder.append(", boostCount=");
            stringBuilder.append(this.boostCount);
            stringBuilder.append(", isBoostEnabled=");
            stringBuilder.append(this.isBoostEnabled);
            stringBuilder.append(", experimentGroups=");
            stringBuilder.append(this.experimentGroups);
            stringBuilder.append(", skusOffered=");
            stringBuilder.append(this.skusOffered);
            stringBuilder.append(", skusOwned=");
            stringBuilder.append(this.skusOwned);
            stringBuilder.append(", errorSku=");
            stringBuilder.append(this.errorSku);
            stringBuilder.append(", receiptId=");
            stringBuilder.append(this.receiptId);
            stringBuilder.append(", intendedSku=");
            stringBuilder.append(this.intendedSku);
            stringBuilder.append(", source=");
            stringBuilder.append(this.source);
            stringBuilder.append(", price=");
            stringBuilder.append(this.price);
            stringBuilder.append(", json=");
            stringBuilder.append(this.json);
            stringBuilder.append(", purchaseCodeVersion=");
            stringBuilder.append(this.purchaseCodeVersion);
            stringBuilder.append(", device=");
            stringBuilder.append(this.device);
            stringBuilder.append(", manufacturer=");
            stringBuilder.append(this.manufacturer);
            stringBuilder.append(", osVersion=");
            stringBuilder.append(this.osVersion);
            stringBuilder.append(", carrier=");
            stringBuilder.append(this.carrier);
            stringBuilder.append(", connectionType=");
            stringBuilder.append(this.connectionType);
            stringBuilder.append(", profileV2=");
            stringBuilder.append(this.profileV2);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public MetaData(@Nullable @Json(name = "status_code") Integer num, @Nullable @Json(name = "language") String str, @Nullable @Json(name = "stack_trace") List<String> list, @Nullable @Json(name = "is_connected_to_google_play") Boolean bool, @Nullable @Json(name = "locale") String str2, @Nullable @Json(name = "region") String str3, @Nullable @Json(name = "is_passport") Boolean bool2, @Nullable @Json(name = "subscription") Subscription subscription, @Nullable @Json(name = "superlike_count") Integer num2, @Nullable @Json(name = "boost_count") Integer num3, @Nullable @Json(name = "boost_enabled") Boolean bool3, @Nullable @Json(name = "experiment_groups") String str4, @Nullable @Json(name = "skus_offered") List<String> list2, @Nullable @Json(name = "skus_owned") List<String> list3, @Nullable @Json(name = "error_sku") String str5, @Nullable @Json(name = "receipt_id") String str6, @Nullable @Json(name = "intended_sku") String str7, @Nullable @Json(name = "source") Source source, @Nullable @Json(name = "price") Double d, @Nullable @Json(name = "json") String str8, @Nullable @Json(name = "purchase_code_version") Integer num4, @Nullable @Json(name = "device") String str9, @Nullable @Json(name = "manufacturer") String str10, @Nullable @Json(name = "os_version") String str11, @Nullable @Json(name = "carrier") String str12, @Nullable @Json(name = "connectionType") String str13, @Nullable @Json(name = "profile_v2") Boolean bool4) {
            this.statusCode = num;
            this.language = str;
            this.stackTrace = list;
            this.isConnectedToGooglePlay = bool;
            this.locale = str2;
            this.region = str3;
            this.isPassporting = bool2;
            this.subscription = subscription;
            this.superlikeCount = num2;
            this.boostCount = num3;
            this.isBoostEnabled = bool3;
            this.experimentGroups = str4;
            this.skusOffered = list2;
            this.skusOwned = list3;
            this.errorSku = str5;
            this.receiptId = str6;
            this.intendedSku = str7;
            this.source = source;
            this.price = d;
            this.json = str8;
            this.purchaseCodeVersion = num4;
            this.device = str9;
            this.manufacturer = str10;
            this.osVersion = str11;
            this.carrier = str12;
            this.connectionType = str13;
            this.profileV2 = bool4;
        }

        public /* synthetic */ MetaData(Integer num, String str, List list, Boolean bool, String str2, String str3, Boolean bool2, Subscription subscription, Integer num2, Integer num3, Boolean bool3, String str4, List list2, List list3, String str5, String str6, String str7, Source source, Double d, String str8, Integer num4, String str9, String str10, String str11, String str12, String str13, Boolean bool4, int i, C15823e c15823e) {
            int i2 = i;
            this((i2 & 1) != 0 ? Integer.valueOf(0) : num, (i2 & 2) != 0 ? (String) null : str, (i2 & 4) != 0 ? (List) null : list, (i2 & 8) != 0 ? Boolean.valueOf(false) : bool, (i2 & 16) != 0 ? (String) null : str2, (i2 & 32) != 0 ? (String) null : str3, (i2 & 64) != 0 ? Boolean.valueOf(false) : bool2, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? (Subscription) null : subscription, (i2 & 256) != 0 ? Integer.valueOf(0) : num2, (i2 & 512) != 0 ? Integer.valueOf(0) : num3, (i2 & 1024) != 0 ? Boolean.valueOf(false) : bool3, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? (String) null : str4, (i2 & 4096) != 0 ? (List) null : list2, (i2 & 8192) != 0 ? (List) null : list3, (i2 & 16384) != 0 ? (String) null : str5, (32768 & i2) != 0 ? (String) null : str6, (65536 & i2) != 0 ? (String) null : str7, (131072 & i2) != 0 ? (Source) null : source, (262144 & i2) != 0 ? (Double) null : d, (524288 & i2) != 0 ? (String) null : str8, (1048576 & i2) != 0 ? Integer.valueOf(1) : num4, (2097152 & i2) != 0 ? (String) null : str9, (4194304 & i2) != 0 ? (String) null : str10, (8388608 & i2) != 0 ? (String) null : str11, (16777216 & i2) != 0 ? (String) null : str12, (33554432 & i2) != 0 ? (String) null : str13, (i2 & 67108864) != 0 ? Boolean.valueOf(false) : bool4);
        }

        @Nullable
        public final Integer getStatusCode() {
            return this.statusCode;
        }

        @Nullable
        public final String getLanguage() {
            return this.language;
        }

        @Nullable
        public final List<String> getStackTrace() {
            return this.stackTrace;
        }

        @Nullable
        public final Boolean isConnectedToGooglePlay() {
            return this.isConnectedToGooglePlay;
        }

        @Nullable
        public final String getLocale() {
            return this.locale;
        }

        @Nullable
        public final String getRegion() {
            return this.region;
        }

        @Nullable
        public final Boolean isPassporting() {
            return this.isPassporting;
        }

        @Nullable
        public final Subscription getSubscription() {
            return this.subscription;
        }

        @Nullable
        public final Integer getSuperlikeCount() {
            return this.superlikeCount;
        }

        @Nullable
        public final Integer getBoostCount() {
            return this.boostCount;
        }

        @Nullable
        public final Boolean isBoostEnabled() {
            return this.isBoostEnabled;
        }

        @Nullable
        public final String getExperimentGroups() {
            return this.experimentGroups;
        }

        @Nullable
        public final List<String> getSkusOffered() {
            return this.skusOffered;
        }

        @Nullable
        public final List<String> getSkusOwned() {
            return this.skusOwned;
        }

        @Nullable
        public final String getErrorSku() {
            return this.errorSku;
        }

        @Nullable
        public final String getReceiptId() {
            return this.receiptId;
        }

        @Nullable
        public final String getIntendedSku() {
            return this.intendedSku;
        }

        @Nullable
        public final Source getSource() {
            return this.source;
        }

        @Nullable
        public final Double getPrice() {
            return this.price;
        }

        @Nullable
        public final String getJson() {
            return this.json;
        }

        @Nullable
        public final Integer getPurchaseCodeVersion() {
            return this.purchaseCodeVersion;
        }

        @Nullable
        public final String getDevice() {
            return this.device;
        }

        @Nullable
        public final String getManufacturer() {
            return this.manufacturer;
        }

        @Nullable
        public final String getOsVersion() {
            return this.osVersion;
        }

        @Nullable
        public final String getCarrier() {
            return this.carrier;
        }

        @Nullable
        public final String getConnectionType() {
            return this.connectionType;
        }

        @Nullable
        public final Boolean getProfileV2() {
            return this.profileV2;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/api/model/purchase/PurchaseLog$Source;", "", "(Ljava/lang/String;I)V", "RESTORE", "PURCHASE", "OTHER", "api_release"}, k = 1, mv = {1, 1, 10})
    public enum Source {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tinder/api/model/purchase/PurchaseLog$Subscription;", "", "productId", "", "isGold", "", "isPlus", "platform", "(Ljava/lang/String;ZZLjava/lang/String;)V", "()Z", "getPlatform", "()Ljava/lang/String;", "getProductId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Subscription {
        private final boolean isGold;
        private final boolean isPlus;
        @NotNull
        private final String platform;
        @NotNull
        private final String productId;

        @NotNull
        public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, boolean z, boolean z2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subscription.productId;
            }
            if ((i & 2) != 0) {
                z = subscription.isGold;
            }
            if ((i & 4) != 0) {
                z2 = subscription.isPlus;
            }
            if ((i & 8) != 0) {
                str2 = subscription.platform;
            }
            return subscription.copy(str, z, z2, str2);
        }

        @NotNull
        public final String component1() {
            return this.productId;
        }

        public final boolean component2() {
            return this.isGold;
        }

        public final boolean component3() {
            return this.isPlus;
        }

        @NotNull
        public final String component4() {
            return this.platform;
        }

        @NotNull
        public final Subscription copy(@NotNull String str, boolean z, boolean z2, @NotNull String str2) {
            C2668g.b(str, "productId");
            C2668g.b(str2, "platform");
            return new Subscription(str, z, z2, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Subscription) {
                Subscription subscription = (Subscription) obj;
                if (C2668g.a(this.productId, subscription.productId)) {
                    if ((this.isGold == subscription.isGold ? 1 : null) != null) {
                        return (this.isPlus == subscription.isPlus ? 1 : null) != null && C2668g.a(this.platform, subscription.platform);
                    }
                }
            }
        }

        public int hashCode() {
            String str = this.productId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            int i2 = this.isGold;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.isPlus;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            String str2 = this.platform;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Subscription(productId=");
            stringBuilder.append(this.productId);
            stringBuilder.append(", isGold=");
            stringBuilder.append(this.isGold);
            stringBuilder.append(", isPlus=");
            stringBuilder.append(this.isPlus);
            stringBuilder.append(", platform=");
            stringBuilder.append(this.platform);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Subscription(@NotNull String str, boolean z, boolean z2, @NotNull String str2) {
            C2668g.b(str, "productId");
            C2668g.b(str2, "platform");
            this.productId = str;
            this.isGold = z;
            this.isPlus = z2;
            this.platform = str2;
        }

        @NotNull
        public final String getProductId() {
            return this.productId;
        }

        public final boolean isGold() {
            return this.isGold;
        }

        public final boolean isPlus() {
            return this.isPlus;
        }

        @NotNull
        public final String getPlatform() {
            return this.platform;
        }
    }

    @NotNull
    public static /* synthetic */ PurchaseLog copy$default(PurchaseLog purchaseLog, Domain domain, String str, String str2, String str3, String str4, String str5, Long l, MetaData metaData, int i, Object obj) {
        PurchaseLog purchaseLog2 = purchaseLog;
        int i2 = i;
        return purchaseLog2.copy((i2 & 1) != 0 ? purchaseLog2.domain : domain, (i2 & 2) != 0 ? purchaseLog2.namespace : str, (i2 & 4) != 0 ? purchaseLog2.className : str2, (i2 & 8) != 0 ? purchaseLog2.platform : str3, (i2 & 16) != 0 ? purchaseLog2.userId : str4, (i2 & 32) != 0 ? purchaseLog2.appVersion : str5, (i2 & 64) != 0 ? purchaseLog2.occurredAt : l, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? purchaseLog2.metaData : metaData);
    }

    @Nullable
    public final Domain component1() {
        return this.domain;
    }

    @Nullable
    public final String component2() {
        return this.namespace;
    }

    @Nullable
    public final String component3() {
        return this.className;
    }

    @Nullable
    public final String component4() {
        return this.platform;
    }

    @Nullable
    public final String component5() {
        return this.userId;
    }

    @Nullable
    public final String component6() {
        return this.appVersion;
    }

    @Nullable
    public final Long component7() {
        return this.occurredAt;
    }

    @Nullable
    public final MetaData component8() {
        return this.metaData;
    }

    @NotNull
    public final PurchaseLog copy(@Nullable @Json(name = "err_domain") Domain domain, @Nullable @Json(name = "err_namespace") String str, @Nullable @Json(name = "err_class") String str2, @Nullable @Json(name = "platform") String str3, @Nullable @Json(name = "user_id") String str4, @Nullable @Json(name = "app_version") String str5, @Nullable @Json(name = "occurred_at") Long l, @Nullable @Json(name = "meta") MetaData metaData) {
        return new PurchaseLog(domain, str, str2, str3, str4, str5, l, metaData);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PurchaseLog) {
                PurchaseLog purchaseLog = (PurchaseLog) obj;
                if (C2668g.a(this.domain, purchaseLog.domain) && C2668g.a(this.namespace, purchaseLog.namespace) && C2668g.a(this.className, purchaseLog.className) && C2668g.a(this.platform, purchaseLog.platform) && C2668g.a(this.userId, purchaseLog.userId) && C2668g.a(this.appVersion, purchaseLog.appVersion) && C2668g.a(this.occurredAt, purchaseLog.occurredAt) && C2668g.a(this.metaData, purchaseLog.metaData)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Domain domain = this.domain;
        int i = 0;
        int hashCode = (domain != null ? domain.hashCode() : 0) * 31;
        String str = this.namespace;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.className;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.platform;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.userId;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.appVersion;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.occurredAt;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        MetaData metaData = this.metaData;
        if (metaData != null) {
            i = metaData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PurchaseLog(domain=");
        stringBuilder.append(this.domain);
        stringBuilder.append(", namespace=");
        stringBuilder.append(this.namespace);
        stringBuilder.append(", className=");
        stringBuilder.append(this.className);
        stringBuilder.append(", platform=");
        stringBuilder.append(this.platform);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", appVersion=");
        stringBuilder.append(this.appVersion);
        stringBuilder.append(", occurredAt=");
        stringBuilder.append(this.occurredAt);
        stringBuilder.append(", metaData=");
        stringBuilder.append(this.metaData);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PurchaseLog(@Nullable @Json(name = "err_domain") Domain domain, @Nullable @Json(name = "err_namespace") String str, @Nullable @Json(name = "err_class") String str2, @Nullable @Json(name = "platform") String str3, @Nullable @Json(name = "user_id") String str4, @Nullable @Json(name = "app_version") String str5, @Nullable @Json(name = "occurred_at") Long l, @Nullable @Json(name = "meta") MetaData metaData) {
        this.domain = domain;
        this.namespace = str;
        this.className = str2;
        this.platform = str3;
        this.userId = str4;
        this.appVersion = str5;
        this.occurredAt = l;
        this.metaData = metaData;
    }

    @Nullable
    public final Domain getDomain() {
        return this.domain;
    }

    @Nullable
    public final String getNamespace() {
        return this.namespace;
    }

    @Nullable
    public final String getClassName() {
        return this.className;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final Long getOccurredAt() {
        return this.occurredAt;
    }

    @Nullable
    public final MetaData getMetaData() {
        return this.metaData;
    }
}
