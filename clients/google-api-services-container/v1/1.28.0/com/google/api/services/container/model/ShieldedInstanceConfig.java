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
 * A set of Shielded Instance options.
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
public final class ShieldedInstanceConfig extends com.google.api.client.json.GenericJson {

  /**
   * Defines whether the instance has integrity monitoring enabled.
   *
   * Enables monitoring and attestation of the boot integrity of the instance. The attestation is
   * performed against the integrity policy baseline. This baseline is initially derived from the
   * implicitly trusted boot image when the instance is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableIntegrityMonitoring;

  /**
   * Defines whether the instance has Secure Boot enabled.
   *
   * Secure Boot helps ensure that the system only runs authentic software by verifying the digital
   * signature of all boot components, and halting the boot process if signature verification fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableSecureBoot;

  /**
   * Defines whether the instance has integrity monitoring enabled.
   *
   * Enables monitoring and attestation of the boot integrity of the instance. The attestation is
   * performed against the integrity policy baseline. This baseline is initially derived from the
   * implicitly trusted boot image when the instance is created.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableIntegrityMonitoring() {
    return enableIntegrityMonitoring;
  }

  /**
   * Defines whether the instance has integrity monitoring enabled.
   *
   * Enables monitoring and attestation of the boot integrity of the instance. The attestation is
   * performed against the integrity policy baseline. This baseline is initially derived from the
   * implicitly trusted boot image when the instance is created.
   * @param enableIntegrityMonitoring enableIntegrityMonitoring or {@code null} for none
   */
  public ShieldedInstanceConfig setEnableIntegrityMonitoring(java.lang.Boolean enableIntegrityMonitoring) {
    this.enableIntegrityMonitoring = enableIntegrityMonitoring;
    return this;
  }

  /**
   * Defines whether the instance has Secure Boot enabled.
   *
   * Secure Boot helps ensure that the system only runs authentic software by verifying the digital
   * signature of all boot components, and halting the boot process if signature verification fails.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableSecureBoot() {
    return enableSecureBoot;
  }

  /**
   * Defines whether the instance has Secure Boot enabled.
   *
   * Secure Boot helps ensure that the system only runs authentic software by verifying the digital
   * signature of all boot components, and halting the boot process if signature verification fails.
   * @param enableSecureBoot enableSecureBoot or {@code null} for none
   */
  public ShieldedInstanceConfig setEnableSecureBoot(java.lang.Boolean enableSecureBoot) {
    this.enableSecureBoot = enableSecureBoot;
    return this;
  }

  @Override
  public ShieldedInstanceConfig set(String fieldName, Object value) {
    return (ShieldedInstanceConfig) super.set(fieldName, value);
  }

  @Override
  public ShieldedInstanceConfig clone() {
    return (ShieldedInstanceConfig) super.clone();
  }

}
