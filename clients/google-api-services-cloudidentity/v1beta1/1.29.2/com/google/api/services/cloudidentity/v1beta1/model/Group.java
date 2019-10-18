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

package com.google.api.services.cloudidentity.v1beta1.model;

/**
 * Resource representing a Group
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Group extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Additional entity key aliases for a Group
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntityKey> additionalGroupKeys;

  static {
    // hack to force ProGuard to consider EntityKey used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EntityKey.class);
  }

  /**
   * Output only. The time when the Group was created. Output only
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * An extended description to help users determine the purpose of a Group. For example, you can
   * include information about who should join the Group, the types of messages to send to the
   * Group, links to FAQs about the Group, or related Groups. Maximum length is 4,096 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The Group's display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required. Immutable. EntityKey of the Group.
   *
   * Must be set when creating a Group, read-only afterwards.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EntityKey groupKey;

  /**
   * Required. Labels for Group resource. Required. For creating Groups under a namespace, set label
   * key to 'labels/system/groups/external' and label value as empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group
   * in the format: `groups/{group_id}`, where group_id is the unique id assigned to the Group.
   *
   * Must be left blank while creating a Group
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Immutable. The entity under which this Group resides in Cloud Identity resource
   * hierarchy. Must be set when creating a Group, read-only afterwards.
   *
   * Currently allowed types: 'identitysources'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Output only. The time when the Group was last updated. Output only
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Additional entity key aliases for a Group
   * @return value or {@code null} for none
   */
  public java.util.List<EntityKey> getAdditionalGroupKeys() {
    return additionalGroupKeys;
  }

  /**
   * Optional. Additional entity key aliases for a Group
   * @param additionalGroupKeys additionalGroupKeys or {@code null} for none
   */
  public Group setAdditionalGroupKeys(java.util.List<EntityKey> additionalGroupKeys) {
    this.additionalGroupKeys = additionalGroupKeys;
    return this;
  }

  /**
   * Output only. The time when the Group was created. Output only
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the Group was created. Output only
   * @param createTime createTime or {@code null} for none
   */
  public Group setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * An extended description to help users determine the purpose of a Group. For example, you can
   * include information about who should join the Group, the types of messages to send to the
   * Group, links to FAQs about the Group, or related Groups. Maximum length is 4,096 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An extended description to help users determine the purpose of a Group. For example, you can
   * include information about who should join the Group, the types of messages to send to the
   * Group, links to FAQs about the Group, or related Groups. Maximum length is 4,096 characters.
   * @param description description or {@code null} for none
   */
  public Group setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The Group's display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The Group's display name.
   * @param displayName displayName or {@code null} for none
   */
  public Group setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. Immutable. EntityKey of the Group.
   *
   * Must be set when creating a Group, read-only afterwards.
   * @return value or {@code null} for none
   */
  public EntityKey getGroupKey() {
    return groupKey;
  }

  /**
   * Required. Immutable. EntityKey of the Group.
   *
   * Must be set when creating a Group, read-only afterwards.
   * @param groupKey groupKey or {@code null} for none
   */
  public Group setGroupKey(EntityKey groupKey) {
    this.groupKey = groupKey;
    return this;
  }

  /**
   * Required. Labels for Group resource. Required. For creating Groups under a namespace, set label
   * key to 'labels/system/groups/external' and label value as empty.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Required. Labels for Group resource. Required. For creating Groups under a namespace, set label
   * key to 'labels/system/groups/external' and label value as empty.
   * @param labels labels or {@code null} for none
   */
  public Group setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group
   * in the format: `groups/{group_id}`, where group_id is the unique id assigned to the Group.
   *
   * Must be left blank while creating a Group
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Group
   * in the format: `groups/{group_id}`, where group_id is the unique id assigned to the Group.
   *
   * Must be left blank while creating a Group
   * @param name name or {@code null} for none
   */
  public Group setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Immutable. The entity under which this Group resides in Cloud Identity resource
   * hierarchy. Must be set when creating a Group, read-only afterwards.
   *
   * Currently allowed types: 'identitysources'.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Required. Immutable. The entity under which this Group resides in Cloud Identity resource
   * hierarchy. Must be set when creating a Group, read-only afterwards.
   *
   * Currently allowed types: 'identitysources'.
   * @param parent parent or {@code null} for none
   */
  public Group setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Output only. The time when the Group was last updated. Output only
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the Group was last updated. Output only
   * @param updateTime updateTime or {@code null} for none
   */
  public Group setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Group set(String fieldName, Object value) {
    return (Group) super.set(fieldName, value);
  }

  @Override
  public Group clone() {
    return (Group) super.clone();
  }

}
