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

package com.google.api.services.container.model;

/**
 * ClusterUpdate describes an update to the cluster. Exactly one update can be applied to a cluster
 * with each request, so at most one field can be provided.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClusterUpdate extends com.google.api.client.json.GenericJson {

  /**
   * Configurations for the various addons available to run in the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AddonsConfig desiredAddonsConfig;

  /**
   * The desired configuration options for the Binary Authorization feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BinaryAuthorization desiredBinaryAuthorization;

  /**
   * Configuration of etcd encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatabaseEncryption desiredDatabaseEncryption;

  /**
   * The desired image type for the node pool. NOTE: Set the "desired_node_pool" field as well.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredImageType;

  /**
   * The desired config of Intra-node visibility.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IntraNodeVisibilityConfig desiredIntraNodeVisibilityConfig;

  /**
   * The desired list of Google Compute Engine [zones](/compute/docs/zones#available) in which the
   * cluster's nodes should be located. Changing the locations a cluster is in will result in nodes
   * being either created or removed from the cluster, depending on whether locations are being
   * added or removed.
   *
   * This list must always include the cluster's primary zone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> desiredLocations;

  /**
   * The logging service the cluster should use to write logs. Currently available options:
   *
   * * "logging.googleapis.com/kubernetes" - the Google Cloud Logging service with Kubernetes-native
   * resource model in Stackdriver * "logging.googleapis.com" - the Google Cloud Logging service *
   * "none" - no logs will be exported from the cluster
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredLoggingService;

  /**
   * The desired configuration options for master authorized networks feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MasterAuthorizedNetworksConfig desiredMasterAuthorizedNetworksConfig;

  /**
   * The Kubernetes version to change the master to.
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or version aliases,
   * which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid
   * patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
   * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the default
   * Kubernetes version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredMasterVersion;

  /**
   * The monitoring service the cluster should use to write metrics. Currently available options:
   *
   * * "monitoring.googleapis.com/kubernetes" - the Google Cloud Monitoring service with Kubernetes-
   * native resource model in Stackdriver * "monitoring.googleapis.com" - the Google Cloud
   * Monitoring service * "none" - no metrics will be exported from the cluster
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredMonitoringService;

  /**
   * Autoscaler configuration for the node pool specified in desired_node_pool_id. If there is only
   * one pool in the cluster and desired_node_pool_id is not provided then the change applies to
   * that single node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodePoolAutoscaling desiredNodePoolAutoscaling;

  /**
   * The node pool to be upgraded. This field is mandatory if "desired_node_version",
   * "desired_image_family" or "desired_node_pool_autoscaling" is specified and there is more than
   * one node pool on the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredNodePoolId;

  /**
   * The Kubernetes version to change the nodes to (typically an upgrade).
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or version aliases,
   * which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid
   * patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
   * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the Kubernetes
   * master version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredNodeVersion;

  /**
   * The desired configuration for exporting resource usage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceUsageExportConfig desiredResourceUsageExportConfig;

  /**
   * Configurations for the various addons available to run in the cluster.
   * @return value or {@code null} for none
   */
  public AddonsConfig getDesiredAddonsConfig() {
    return desiredAddonsConfig;
  }

  /**
   * Configurations for the various addons available to run in the cluster.
   * @param desiredAddonsConfig desiredAddonsConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredAddonsConfig(AddonsConfig desiredAddonsConfig) {
    this.desiredAddonsConfig = desiredAddonsConfig;
    return this;
  }

  /**
   * The desired configuration options for the Binary Authorization feature.
   * @return value or {@code null} for none
   */
  public BinaryAuthorization getDesiredBinaryAuthorization() {
    return desiredBinaryAuthorization;
  }

  /**
   * The desired configuration options for the Binary Authorization feature.
   * @param desiredBinaryAuthorization desiredBinaryAuthorization or {@code null} for none
   */
  public ClusterUpdate setDesiredBinaryAuthorization(BinaryAuthorization desiredBinaryAuthorization) {
    this.desiredBinaryAuthorization = desiredBinaryAuthorization;
    return this;
  }

  /**
   * Configuration of etcd encryption.
   * @return value or {@code null} for none
   */
  public DatabaseEncryption getDesiredDatabaseEncryption() {
    return desiredDatabaseEncryption;
  }

  /**
   * Configuration of etcd encryption.
   * @param desiredDatabaseEncryption desiredDatabaseEncryption or {@code null} for none
   */
  public ClusterUpdate setDesiredDatabaseEncryption(DatabaseEncryption desiredDatabaseEncryption) {
    this.desiredDatabaseEncryption = desiredDatabaseEncryption;
    return this;
  }

  /**
   * The desired image type for the node pool. NOTE: Set the "desired_node_pool" field as well.
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredImageType() {
    return desiredImageType;
  }

  /**
   * The desired image type for the node pool. NOTE: Set the "desired_node_pool" field as well.
   * @param desiredImageType desiredImageType or {@code null} for none
   */
  public ClusterUpdate setDesiredImageType(java.lang.String desiredImageType) {
    this.desiredImageType = desiredImageType;
    return this;
  }

  /**
   * The desired config of Intra-node visibility.
   * @return value or {@code null} for none
   */
  public IntraNodeVisibilityConfig getDesiredIntraNodeVisibilityConfig() {
    return desiredIntraNodeVisibilityConfig;
  }

  /**
   * The desired config of Intra-node visibility.
   * @param desiredIntraNodeVisibilityConfig desiredIntraNodeVisibilityConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredIntraNodeVisibilityConfig(IntraNodeVisibilityConfig desiredIntraNodeVisibilityConfig) {
    this.desiredIntraNodeVisibilityConfig = desiredIntraNodeVisibilityConfig;
    return this;
  }

  /**
   * The desired list of Google Compute Engine [zones](/compute/docs/zones#available) in which the
   * cluster's nodes should be located. Changing the locations a cluster is in will result in nodes
   * being either created or removed from the cluster, depending on whether locations are being
   * added or removed.
   *
   * This list must always include the cluster's primary zone.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDesiredLocations() {
    return desiredLocations;
  }

  /**
   * The desired list of Google Compute Engine [zones](/compute/docs/zones#available) in which the
   * cluster's nodes should be located. Changing the locations a cluster is in will result in nodes
   * being either created or removed from the cluster, depending on whether locations are being
   * added or removed.
   *
   * This list must always include the cluster's primary zone.
   * @param desiredLocations desiredLocations or {@code null} for none
   */
  public ClusterUpdate setDesiredLocations(java.util.List<java.lang.String> desiredLocations) {
    this.desiredLocations = desiredLocations;
    return this;
  }

  /**
   * The logging service the cluster should use to write logs. Currently available options:
   *
   * * "logging.googleapis.com/kubernetes" - the Google Cloud Logging service with Kubernetes-native
   * resource model in Stackdriver * "logging.googleapis.com" - the Google Cloud Logging service *
   * "none" - no logs will be exported from the cluster
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredLoggingService() {
    return desiredLoggingService;
  }

  /**
   * The logging service the cluster should use to write logs. Currently available options:
   *
   * * "logging.googleapis.com/kubernetes" - the Google Cloud Logging service with Kubernetes-native
   * resource model in Stackdriver * "logging.googleapis.com" - the Google Cloud Logging service *
   * "none" - no logs will be exported from the cluster
   * @param desiredLoggingService desiredLoggingService or {@code null} for none
   */
  public ClusterUpdate setDesiredLoggingService(java.lang.String desiredLoggingService) {
    this.desiredLoggingService = desiredLoggingService;
    return this;
  }

  /**
   * The desired configuration options for master authorized networks feature.
   * @return value or {@code null} for none
   */
  public MasterAuthorizedNetworksConfig getDesiredMasterAuthorizedNetworksConfig() {
    return desiredMasterAuthorizedNetworksConfig;
  }

  /**
   * The desired configuration options for master authorized networks feature.
   * @param desiredMasterAuthorizedNetworksConfig desiredMasterAuthorizedNetworksConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredMasterAuthorizedNetworksConfig(MasterAuthorizedNetworksConfig desiredMasterAuthorizedNetworksConfig) {
    this.desiredMasterAuthorizedNetworksConfig = desiredMasterAuthorizedNetworksConfig;
    return this;
  }

  /**
   * The Kubernetes version to change the master to.
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or version aliases,
   * which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid
   * patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
   * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the default
   * Kubernetes version
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredMasterVersion() {
    return desiredMasterVersion;
  }

  /**
   * The Kubernetes version to change the master to.
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or version aliases,
   * which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid
   * patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
   * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the default
   * Kubernetes version
   * @param desiredMasterVersion desiredMasterVersion or {@code null} for none
   */
  public ClusterUpdate setDesiredMasterVersion(java.lang.String desiredMasterVersion) {
    this.desiredMasterVersion = desiredMasterVersion;
    return this;
  }

  /**
   * The monitoring service the cluster should use to write metrics. Currently available options:
   *
   * * "monitoring.googleapis.com/kubernetes" - the Google Cloud Monitoring service with Kubernetes-
   * native resource model in Stackdriver * "monitoring.googleapis.com" - the Google Cloud
   * Monitoring service * "none" - no metrics will be exported from the cluster
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredMonitoringService() {
    return desiredMonitoringService;
  }

  /**
   * The monitoring service the cluster should use to write metrics. Currently available options:
   *
   * * "monitoring.googleapis.com/kubernetes" - the Google Cloud Monitoring service with Kubernetes-
   * native resource model in Stackdriver * "monitoring.googleapis.com" - the Google Cloud
   * Monitoring service * "none" - no metrics will be exported from the cluster
   * @param desiredMonitoringService desiredMonitoringService or {@code null} for none
   */
  public ClusterUpdate setDesiredMonitoringService(java.lang.String desiredMonitoringService) {
    this.desiredMonitoringService = desiredMonitoringService;
    return this;
  }

  /**
   * Autoscaler configuration for the node pool specified in desired_node_pool_id. If there is only
   * one pool in the cluster and desired_node_pool_id is not provided then the change applies to
   * that single node pool.
   * @return value or {@code null} for none
   */
  public NodePoolAutoscaling getDesiredNodePoolAutoscaling() {
    return desiredNodePoolAutoscaling;
  }

  /**
   * Autoscaler configuration for the node pool specified in desired_node_pool_id. If there is only
   * one pool in the cluster and desired_node_pool_id is not provided then the change applies to
   * that single node pool.
   * @param desiredNodePoolAutoscaling desiredNodePoolAutoscaling or {@code null} for none
   */
  public ClusterUpdate setDesiredNodePoolAutoscaling(NodePoolAutoscaling desiredNodePoolAutoscaling) {
    this.desiredNodePoolAutoscaling = desiredNodePoolAutoscaling;
    return this;
  }

  /**
   * The node pool to be upgraded. This field is mandatory if "desired_node_version",
   * "desired_image_family" or "desired_node_pool_autoscaling" is specified and there is more than
   * one node pool on the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredNodePoolId() {
    return desiredNodePoolId;
  }

  /**
   * The node pool to be upgraded. This field is mandatory if "desired_node_version",
   * "desired_image_family" or "desired_node_pool_autoscaling" is specified and there is more than
   * one node pool on the cluster.
   * @param desiredNodePoolId desiredNodePoolId or {@code null} for none
   */
  public ClusterUpdate setDesiredNodePoolId(java.lang.String desiredNodePoolId) {
    this.desiredNodePoolId = desiredNodePoolId;
    return this;
  }

  /**
   * The Kubernetes version to change the nodes to (typically an upgrade).
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or version aliases,
   * which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid
   * patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
   * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the Kubernetes
   * master version
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredNodeVersion() {
    return desiredNodeVersion;
  }

  /**
   * The Kubernetes version to change the nodes to (typically an upgrade).
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or version aliases,
   * which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid
   * patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
   * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the Kubernetes
   * master version
   * @param desiredNodeVersion desiredNodeVersion or {@code null} for none
   */
  public ClusterUpdate setDesiredNodeVersion(java.lang.String desiredNodeVersion) {
    this.desiredNodeVersion = desiredNodeVersion;
    return this;
  }

  /**
   * The desired configuration for exporting resource usage.
   * @return value or {@code null} for none
   */
  public ResourceUsageExportConfig getDesiredResourceUsageExportConfig() {
    return desiredResourceUsageExportConfig;
  }

  /**
   * The desired configuration for exporting resource usage.
   * @param desiredResourceUsageExportConfig desiredResourceUsageExportConfig or {@code null} for none
   */
  public ClusterUpdate setDesiredResourceUsageExportConfig(ResourceUsageExportConfig desiredResourceUsageExportConfig) {
    this.desiredResourceUsageExportConfig = desiredResourceUsageExportConfig;
    return this;
  }

  @Override
  public ClusterUpdate set(String fieldName, Object value) {
    return (ClusterUpdate) super.set(fieldName, value);
  }

  @Override
  public ClusterUpdate clone() {
    return (ClusterUpdate) super.clone();
  }

}
