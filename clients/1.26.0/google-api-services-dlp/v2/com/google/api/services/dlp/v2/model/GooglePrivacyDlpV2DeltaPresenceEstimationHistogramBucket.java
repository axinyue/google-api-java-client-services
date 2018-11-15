/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dlp.v2.model;

/**
 * A DeltaPresenceEstimationHistogramBucket message with the following values:   min_probability:
 * 0.1   max_probability: 0.2   frequency: 42 means that there are 42 records for which δ is in
 * [0.1, 0.2). An important particular case is when min_probability = max_probability = 1: then,
 * every individual who shares this quasi-identifier combination is in the dataset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket extends com.google.api.client.json.GenericJson {

  /**
   * Number of records within these probability bounds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bucketSize;

  /**
   * Total number of distinct quasi-identifier tuple values in this bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bucketValueCount;

  /**
   * Sample of quasi-identifier tuple values in this bucket. The total number of classes returned
   * per bucket is capped at 20.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues> bucketValues;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues.class);
  }

  /**
   * Always greater than or equal to min_probability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maxProbability;

  /**
   * Between 0 and 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minProbability;

  /**
   * Number of records within these probability bounds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBucketSize() {
    return bucketSize;
  }

  /**
   * Number of records within these probability bounds.
   * @param bucketSize bucketSize or {@code null} for none
   */
  public GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket setBucketSize(java.lang.Long bucketSize) {
    this.bucketSize = bucketSize;
    return this;
  }

  /**
   * Total number of distinct quasi-identifier tuple values in this bucket.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBucketValueCount() {
    return bucketValueCount;
  }

  /**
   * Total number of distinct quasi-identifier tuple values in this bucket.
   * @param bucketValueCount bucketValueCount or {@code null} for none
   */
  public GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket setBucketValueCount(java.lang.Long bucketValueCount) {
    this.bucketValueCount = bucketValueCount;
    return this;
  }

  /**
   * Sample of quasi-identifier tuple values in this bucket. The total number of classes returned
   * per bucket is capped at 20.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues> getBucketValues() {
    return bucketValues;
  }

  /**
   * Sample of quasi-identifier tuple values in this bucket. The total number of classes returned
   * per bucket is capped at 20.
   * @param bucketValues bucketValues or {@code null} for none
   */
  public GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket setBucketValues(java.util.List<GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues> bucketValues) {
    this.bucketValues = bucketValues;
    return this;
  }

  /**
   * Always greater than or equal to min_probability.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaxProbability() {
    return maxProbability;
  }

  /**
   * Always greater than or equal to min_probability.
   * @param maxProbability maxProbability or {@code null} for none
   */
  public GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket setMaxProbability(java.lang.Double maxProbability) {
    this.maxProbability = maxProbability;
    return this;
  }

  /**
   * Between 0 and 1.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinProbability() {
    return minProbability;
  }

  /**
   * Between 0 and 1.
   * @param minProbability minProbability or {@code null} for none
   */
  public GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket setMinProbability(java.lang.Double minProbability) {
    this.minProbability = minProbability;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket clone() {
    return (GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket) super.clone();
  }

}
