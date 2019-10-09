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

package com.google.api.services.container.v1beta1.model;

/**
 * AcceleratorConfig represents a Hardware Accelerator request.
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
public final class AcceleratorConfig extends com.google.api.client.json.GenericJson {

  /**
   * The number of the accelerator cards exposed to an instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long acceleratorCount;

  /**
   * The accelerator type resource name. List of supported accelerators [here](/compute/docs/gpus)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String acceleratorType;

  /**
   * The number of the accelerator cards exposed to an instance.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAcceleratorCount() {
    return acceleratorCount;
  }

  /**
   * The number of the accelerator cards exposed to an instance.
   * @param acceleratorCount acceleratorCount or {@code null} for none
   */
  public AcceleratorConfig setAcceleratorCount(java.lang.Long acceleratorCount) {
    this.acceleratorCount = acceleratorCount;
    return this;
  }

  /**
   * The accelerator type resource name. List of supported accelerators [here](/compute/docs/gpus)
   * @return value or {@code null} for none
   */
  public java.lang.String getAcceleratorType() {
    return acceleratorType;
  }

  /**
   * The accelerator type resource name. List of supported accelerators [here](/compute/docs/gpus)
   * @param acceleratorType acceleratorType or {@code null} for none
   */
  public AcceleratorConfig setAcceleratorType(java.lang.String acceleratorType) {
    this.acceleratorType = acceleratorType;
    return this;
  }

  @Override
  public AcceleratorConfig set(String fieldName, Object value) {
    return (AcceleratorConfig) super.set(fieldName, value);
  }

  @Override
  public AcceleratorConfig clone() {
    return (AcceleratorConfig) super.clone();
  }

}
