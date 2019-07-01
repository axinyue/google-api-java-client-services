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

package com.google.api.services.cloudkms.v1.model;

/**
 * The public key component of the wrapping key. For details of the type of key this public key
 * corresponds to, see the ImportMethod.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WrappingPublicKey extends com.google.api.client.json.GenericJson {

  /**
   * The public key, encoded in PEM format. For more information, see the [RFC
   * 7468](https://tools.ietf.org/html/rfc7468) sections for [General
   * Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject
   * Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pem;

  /**
   * The public key, encoded in PEM format. For more information, see the [RFC
   * 7468](https://tools.ietf.org/html/rfc7468) sections for [General
   * Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject
   * Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
   * @return value or {@code null} for none
   */
  public java.lang.String getPem() {
    return pem;
  }

  /**
   * The public key, encoded in PEM format. For more information, see the [RFC
   * 7468](https://tools.ietf.org/html/rfc7468) sections for [General
   * Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject
   * Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
   * @param pem pem or {@code null} for none
   */
  public WrappingPublicKey setPem(java.lang.String pem) {
    this.pem = pem;
    return this;
  }

  @Override
  public WrappingPublicKey set(String fieldName, Object value) {
    return (WrappingPublicKey) super.set(fieldName, value);
  }

  @Override
  public WrappingPublicKey clone() {
    return (WrappingPublicKey) super.clone();
  }

}
