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

package com.google.api.services.remotebuildexecution.v1.model;

/**
 * All information about the execution of a command, suitable for providing as the Bots interface's
 * `Lease.result` field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemoteworkersV1test2CommandResult extends com.google.api.client.json.GenericJson {

  /**
   * The elapsed time between calling Accept and Complete. The server will also have its own idea of
   * what this should be, but this excludes the overhead of the RPCs and the bot response time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * The exit code of the process. An exit code of "0" should only be trusted if `status` has a code
   * of OK (otherwise it may simply be unset).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer exitCode;

  /**
   * Implementation-dependent metadata about the task. Both servers and bots may define messages
   * which can be encoded here; bots are free to provide metadata in multiple formats, and servers
   * are free to choose one or more of the values to process and ignore others. In particular, it is
   * *not* considered an error for the bot to provide the server with a field that it doesn't know
   * about.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.util.Map<String, java.lang.Object>> metadata;

  /**
   * The output files. The blob referenced by the digest should contain one of the following
   * (implementation-dependent): A marshalled DirectoryMetadata of the returned filesystem A LUCI-
   * style .isolated file
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemoteworkersV1test2Digest outputs;

  /**
   * The amount of time *not* spent executing the command (ie uploading/downloading files).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String overhead;

  /**
   * An overall status for the command. For example, if the command timed out, this might have a
   * code of DEADLINE_EXCEEDED; if it was killed by the OS for memory exhaustion, it might have a
   * code of RESOURCE_EXHAUSTED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus status;

  /**
   * The elapsed time between calling Accept and Complete. The server will also have its own idea of
   * what this should be, but this excludes the overhead of the RPCs and the bot response time.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * The elapsed time between calling Accept and Complete. The server will also have its own idea of
   * what this should be, but this excludes the overhead of the RPCs and the bot response time.
   * @param duration duration or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandResult setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The exit code of the process. An exit code of "0" should only be trusted if `status` has a code
   * of OK (otherwise it may simply be unset).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getExitCode() {
    return exitCode;
  }

  /**
   * The exit code of the process. An exit code of "0" should only be trusted if `status` has a code
   * of OK (otherwise it may simply be unset).
   * @param exitCode exitCode or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandResult setExitCode(java.lang.Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * Implementation-dependent metadata about the task. Both servers and bots may define messages
   * which can be encoded here; bots are free to provide metadata in multiple formats, and servers
   * are free to choose one or more of the values to process and ignore others. In particular, it is
   * *not* considered an error for the bot to provide the server with a field that it doesn't know
   * about.
   * @return value or {@code null} for none
   */
  public java.util.List<java.util.Map<String, java.lang.Object>> getMetadata() {
    return metadata;
  }

  /**
   * Implementation-dependent metadata about the task. Both servers and bots may define messages
   * which can be encoded here; bots are free to provide metadata in multiple formats, and servers
   * are free to choose one or more of the values to process and ignore others. In particular, it is
   * *not* considered an error for the bot to provide the server with a field that it doesn't know
   * about.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandResult setMetadata(java.util.List<java.util.Map<String, java.lang.Object>> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The output files. The blob referenced by the digest should contain one of the following
   * (implementation-dependent): A marshalled DirectoryMetadata of the returned filesystem A LUCI-
   * style .isolated file
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2Digest getOutputs() {
    return outputs;
  }

  /**
   * The output files. The blob referenced by the digest should contain one of the following
   * (implementation-dependent): A marshalled DirectoryMetadata of the returned filesystem A LUCI-
   * style .isolated file
   * @param outputs outputs or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandResult setOutputs(GoogleDevtoolsRemoteworkersV1test2Digest outputs) {
    this.outputs = outputs;
    return this;
  }

  /**
   * The amount of time *not* spent executing the command (ie uploading/downloading files).
   * @return value or {@code null} for none
   */
  public String getOverhead() {
    return overhead;
  }

  /**
   * The amount of time *not* spent executing the command (ie uploading/downloading files).
   * @param overhead overhead or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandResult setOverhead(String overhead) {
    this.overhead = overhead;
    return this;
  }

  /**
   * An overall status for the command. For example, if the command timed out, this might have a
   * code of DEADLINE_EXCEEDED; if it was killed by the OS for memory exhaustion, it might have a
   * code of RESOURCE_EXHAUSTED.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getStatus() {
    return status;
  }

  /**
   * An overall status for the command. For example, if the command timed out, this might have a
   * code of DEADLINE_EXCEEDED; if it was killed by the OS for memory exhaustion, it might have a
   * code of RESOURCE_EXHAUSTED.
   * @param status status or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandResult setStatus(GoogleRpcStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2CommandResult set(String fieldName, Object value) {
    return (GoogleDevtoolsRemoteworkersV1test2CommandResult) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2CommandResult clone() {
    return (GoogleDevtoolsRemoteworkersV1test2CommandResult) super.clone();
  }

}