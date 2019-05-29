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

package com.google.api.services.firebasedynamiclinks.v1;

/**
 * Service definition for FirebaseDynamicLinks (v1).
 *
 * <p>
 * Programmatically creates and manages Firebase Dynamic Links.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://firebase.google.com/docs/dynamic-links/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link FirebaseDynamicLinksRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class FirebaseDynamicLinks extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.28.0 of the Firebase Dynamic Links API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://firebasedynamiclinks.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public FirebaseDynamicLinks(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  FirebaseDynamicLinks(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the ManagedShortLinks collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code FirebaseDynamicLinks firebasedynamiclinks = new FirebaseDynamicLinks(...);}
   *   {@code FirebaseDynamicLinks.ManagedShortLinks.List request = firebasedynamiclinks.managedShortLinks().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public ManagedShortLinks managedShortLinks() {
    return new ManagedShortLinks();
  }

  /**
   * The "managedShortLinks" collection of methods.
   */
  public class ManagedShortLinks {

    /**
     * Creates a managed short Dynamic Link given either a valid long Dynamic Link or details such as
     * Dynamic Link domain, Android and iOS app information. The created short Dynamic Link will not
     * expire.
     *
     * This differs from CreateShortDynamicLink in the following ways:   - The request will also contain
     * a name for the link (non unique name     for the front end).   - The response must be
     * authenticated with an auth token (generated with     the admin service account).   - The link
     * will appear in the FDL list of links in the console front end.
     *
     * The Dynamic Link domain in the request must be owned by requester's Firebase project.
     *
     * Create a request for the method "managedShortLinks.create".
     *
     * This request holds the parameters needed by the firebasedynamiclinks server.  After setting any
     * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.firebasedynamiclinks.v1.model.CreateManagedShortLinkRequest}
     * @return the request
     */
    public Create create(com.google.api.services.firebasedynamiclinks.v1.model.CreateManagedShortLinkRequest content) throws java.io.IOException {
      Create result = new Create(content);
      initialize(result);
      return result;
    }

    public class Create extends FirebaseDynamicLinksRequest<com.google.api.services.firebasedynamiclinks.v1.model.CreateManagedShortLinkResponse> {

      private static final String REST_PATH = "v1/managedShortLinks:create";

      /**
       * Creates a managed short Dynamic Link given either a valid long Dynamic Link or details such as
       * Dynamic Link domain, Android and iOS app information. The created short Dynamic Link will not
       * expire.
       *
       * This differs from CreateShortDynamicLink in the following ways:   - The request will also
       * contain a name for the link (non unique name     for the front end).   - The response must be
       * authenticated with an auth token (generated with     the admin service account).   - The link
       * will appear in the FDL list of links in the console front end.
       *
       * The Dynamic Link domain in the request must be owned by requester's Firebase project.
       *
       * Create a request for the method "managedShortLinks.create".
       *
       * This request holds the parameters needed by the the firebasedynamiclinks server.  After setting
       * any optional parameters, call the {@link Create#execute()} method to invoke the remote
       * operation. <p> {@link
       * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.firebasedynamiclinks.v1.model.CreateManagedShortLinkRequest}
       * @since 1.13
       */
      protected Create(com.google.api.services.firebasedynamiclinks.v1.model.CreateManagedShortLinkRequest content) {
        super(FirebaseDynamicLinks.this, "POST", REST_PATH, content, com.google.api.services.firebasedynamiclinks.v1.model.CreateManagedShortLinkResponse.class);
      }

      @Override
      public Create set$Xgafv(java.lang.String $Xgafv) {
        return (Create) super.set$Xgafv($Xgafv);
      }

      @Override
      public Create setAccessToken(java.lang.String accessToken) {
        return (Create) super.setAccessToken(accessToken);
      }

      @Override
      public Create setAlt(java.lang.String alt) {
        return (Create) super.setAlt(alt);
      }

      @Override
      public Create setCallback(java.lang.String callback) {
        return (Create) super.setCallback(callback);
      }

      @Override
      public Create setFields(java.lang.String fields) {
        return (Create) super.setFields(fields);
      }

      @Override
      public Create setKey(java.lang.String key) {
        return (Create) super.setKey(key);
      }

      @Override
      public Create setOauthToken(java.lang.String oauthToken) {
        return (Create) super.setOauthToken(oauthToken);
      }

      @Override
      public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Create) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Create setQuotaUser(java.lang.String quotaUser) {
        return (Create) super.setQuotaUser(quotaUser);
      }

      @Override
      public Create setUploadType(java.lang.String uploadType) {
        return (Create) super.setUploadType(uploadType);
      }

      @Override
      public Create setUploadProtocol(java.lang.String uploadProtocol) {
        return (Create) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Create set(String parameterName, Object value) {
        return (Create) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the ShortLinks collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code FirebaseDynamicLinks firebasedynamiclinks = new FirebaseDynamicLinks(...);}
   *   {@code FirebaseDynamicLinks.ShortLinks.List request = firebasedynamiclinks.shortLinks().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public ShortLinks shortLinks() {
    return new ShortLinks();
  }

  /**
   * The "shortLinks" collection of methods.
   */
  public class ShortLinks {

    /**
     * Creates a short Dynamic Link given either a valid long Dynamic Link or details such as Dynamic
     * Link domain, Android and iOS app information. The created short Dynamic Link will not expire.
     *
     * Repeated calls with the same long Dynamic Link or Dynamic Link information will produce the same
     * short Dynamic Link.
     *
     * The Dynamic Link domain in the request must be owned by requester's Firebase project.
     *
     * Create a request for the method "shortLinks.create".
     *
     * This request holds the parameters needed by the firebasedynamiclinks server.  After setting any
     * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.firebasedynamiclinks.v1.model.CreateShortDynamicLinkRequest}
     * @return the request
     */
    public Create create(com.google.api.services.firebasedynamiclinks.v1.model.CreateShortDynamicLinkRequest content) throws java.io.IOException {
      Create result = new Create(content);
      initialize(result);
      return result;
    }

    public class Create extends FirebaseDynamicLinksRequest<com.google.api.services.firebasedynamiclinks.v1.model.CreateShortDynamicLinkResponse> {

      private static final String REST_PATH = "v1/shortLinks";

      /**
       * Creates a short Dynamic Link given either a valid long Dynamic Link or details such as Dynamic
       * Link domain, Android and iOS app information. The created short Dynamic Link will not expire.
       *
       * Repeated calls with the same long Dynamic Link or Dynamic Link information will produce the
       * same short Dynamic Link.
       *
       * The Dynamic Link domain in the request must be owned by requester's Firebase project.
       *
       * Create a request for the method "shortLinks.create".
       *
       * This request holds the parameters needed by the the firebasedynamiclinks server.  After setting
       * any optional parameters, call the {@link Create#execute()} method to invoke the remote
       * operation. <p> {@link
       * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.firebasedynamiclinks.v1.model.CreateShortDynamicLinkRequest}
       * @since 1.13
       */
      protected Create(com.google.api.services.firebasedynamiclinks.v1.model.CreateShortDynamicLinkRequest content) {
        super(FirebaseDynamicLinks.this, "POST", REST_PATH, content, com.google.api.services.firebasedynamiclinks.v1.model.CreateShortDynamicLinkResponse.class);
      }

      @Override
      public Create set$Xgafv(java.lang.String $Xgafv) {
        return (Create) super.set$Xgafv($Xgafv);
      }

      @Override
      public Create setAccessToken(java.lang.String accessToken) {
        return (Create) super.setAccessToken(accessToken);
      }

      @Override
      public Create setAlt(java.lang.String alt) {
        return (Create) super.setAlt(alt);
      }

      @Override
      public Create setCallback(java.lang.String callback) {
        return (Create) super.setCallback(callback);
      }

      @Override
      public Create setFields(java.lang.String fields) {
        return (Create) super.setFields(fields);
      }

      @Override
      public Create setKey(java.lang.String key) {
        return (Create) super.setKey(key);
      }

      @Override
      public Create setOauthToken(java.lang.String oauthToken) {
        return (Create) super.setOauthToken(oauthToken);
      }

      @Override
      public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Create) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Create setQuotaUser(java.lang.String quotaUser) {
        return (Create) super.setQuotaUser(quotaUser);
      }

      @Override
      public Create setUploadType(java.lang.String uploadType) {
        return (Create) super.setUploadType(uploadType);
      }

      @Override
      public Create setUploadProtocol(java.lang.String uploadProtocol) {
        return (Create) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Create set(String parameterName, Object value) {
        return (Create) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the V1 collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code FirebaseDynamicLinks firebasedynamiclinks = new FirebaseDynamicLinks(...);}
   *   {@code FirebaseDynamicLinks.V1.List request = firebasedynamiclinks.v1().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public V1 v1() {
    return new V1();
  }

  /**
   * The "v1" collection of methods.
   */
  public class V1 {

    /**
     * Fetches analytics stats of a short Dynamic Link for a given duration. Metrics include number of
     * clicks, redirects, installs, app first opens, and app reopens.
     *
     * Create a request for the method "v1.getLinkStats".
     *
     * This request holds the parameters needed by the firebasedynamiclinks server.  After setting any
     * optional parameters, call the {@link GetLinkStats#execute()} method to invoke the remote
     * operation.
     *
     * @param dynamicLink Dynamic Link URL. e.g. https://abcd.app.goo.gl/wxyz
     * @return the request
     */
    public GetLinkStats getLinkStats(java.lang.String dynamicLink) throws java.io.IOException {
      GetLinkStats result = new GetLinkStats(dynamicLink);
      initialize(result);
      return result;
    }

    public class GetLinkStats extends FirebaseDynamicLinksRequest<com.google.api.services.firebasedynamiclinks.v1.model.DynamicLinkStats> {

      private static final String REST_PATH = "v1/{dynamicLink}/linkStats";

      /**
       * Fetches analytics stats of a short Dynamic Link for a given duration. Metrics include number of
       * clicks, redirects, installs, app first opens, and app reopens.
       *
       * Create a request for the method "v1.getLinkStats".
       *
       * This request holds the parameters needed by the the firebasedynamiclinks server.  After setting
       * any optional parameters, call the {@link GetLinkStats#execute()} method to invoke the remote
       * operation. <p> {@link
       * GetLinkStats#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param dynamicLink Dynamic Link URL. e.g. https://abcd.app.goo.gl/wxyz
       * @since 1.13
       */
      protected GetLinkStats(java.lang.String dynamicLink) {
        super(FirebaseDynamicLinks.this, "GET", REST_PATH, null, com.google.api.services.firebasedynamiclinks.v1.model.DynamicLinkStats.class);
        this.dynamicLink = com.google.api.client.util.Preconditions.checkNotNull(dynamicLink, "Required parameter dynamicLink must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public GetLinkStats set$Xgafv(java.lang.String $Xgafv) {
        return (GetLinkStats) super.set$Xgafv($Xgafv);
      }

      @Override
      public GetLinkStats setAccessToken(java.lang.String accessToken) {
        return (GetLinkStats) super.setAccessToken(accessToken);
      }

      @Override
      public GetLinkStats setAlt(java.lang.String alt) {
        return (GetLinkStats) super.setAlt(alt);
      }

      @Override
      public GetLinkStats setCallback(java.lang.String callback) {
        return (GetLinkStats) super.setCallback(callback);
      }

      @Override
      public GetLinkStats setFields(java.lang.String fields) {
        return (GetLinkStats) super.setFields(fields);
      }

      @Override
      public GetLinkStats setKey(java.lang.String key) {
        return (GetLinkStats) super.setKey(key);
      }

      @Override
      public GetLinkStats setOauthToken(java.lang.String oauthToken) {
        return (GetLinkStats) super.setOauthToken(oauthToken);
      }

      @Override
      public GetLinkStats setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetLinkStats) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetLinkStats setQuotaUser(java.lang.String quotaUser) {
        return (GetLinkStats) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetLinkStats setUploadType(java.lang.String uploadType) {
        return (GetLinkStats) super.setUploadType(uploadType);
      }

      @Override
      public GetLinkStats setUploadProtocol(java.lang.String uploadProtocol) {
        return (GetLinkStats) super.setUploadProtocol(uploadProtocol);
      }

      /** Dynamic Link URL. e.g. https://abcd.app.goo.gl/wxyz */
      @com.google.api.client.util.Key
      private java.lang.String dynamicLink;

      /** Dynamic Link URL. e.g. https://abcd.app.goo.gl/wxyz
       */
      public java.lang.String getDynamicLink() {
        return dynamicLink;
      }

      /** Dynamic Link URL. e.g. https://abcd.app.goo.gl/wxyz */
      public GetLinkStats setDynamicLink(java.lang.String dynamicLink) {
        this.dynamicLink = dynamicLink;
        return this;
      }

      /** The span of time requested in days. */
      @com.google.api.client.util.Key
      private java.lang.Long durationDays;

      /** The span of time requested in days.
       */
      public java.lang.Long getDurationDays() {
        return durationDays;
      }

      /** The span of time requested in days. */
      public GetLinkStats setDurationDays(java.lang.Long durationDays) {
        this.durationDays = durationDays;
        return this;
      }

      /** Google SDK version. Version takes the form "$major.$minor.$patch" */
      @com.google.api.client.util.Key
      private java.lang.String sdkVersion;

      /** Google SDK version. Version takes the form "$major.$minor.$patch"
       */
      public java.lang.String getSdkVersion() {
        return sdkVersion;
      }

      /** Google SDK version. Version takes the form "$major.$minor.$patch" */
      public GetLinkStats setSdkVersion(java.lang.String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
      }

      @Override
      public GetLinkStats set(String parameterName, Object value) {
        return (GetLinkStats) super.set(parameterName, value);
      }
    }
    /**
     * Get iOS strong/weak-match info for post-install attribution.
     *
     * Create a request for the method "v1.installAttribution".
     *
     * This request holds the parameters needed by the firebasedynamiclinks server.  After setting any
     * optional parameters, call the {@link InstallAttribution#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.firebasedynamiclinks.v1.model.GetIosPostInstallAttributionRequest}
     * @return the request
     */
    public InstallAttribution installAttribution(com.google.api.services.firebasedynamiclinks.v1.model.GetIosPostInstallAttributionRequest content) throws java.io.IOException {
      InstallAttribution result = new InstallAttribution(content);
      initialize(result);
      return result;
    }

    public class InstallAttribution extends FirebaseDynamicLinksRequest<com.google.api.services.firebasedynamiclinks.v1.model.GetIosPostInstallAttributionResponse> {

      private static final String REST_PATH = "v1/installAttribution";

      /**
       * Get iOS strong/weak-match info for post-install attribution.
       *
       * Create a request for the method "v1.installAttribution".
       *
       * This request holds the parameters needed by the the firebasedynamiclinks server.  After setting
       * any optional parameters, call the {@link InstallAttribution#execute()} method to invoke the
       * remote operation. <p> {@link InstallAttribution#initialize(com.google.api.client.googleapis.ser
       * vices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
       * after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.firebasedynamiclinks.v1.model.GetIosPostInstallAttributionRequest}
       * @since 1.13
       */
      protected InstallAttribution(com.google.api.services.firebasedynamiclinks.v1.model.GetIosPostInstallAttributionRequest content) {
        super(FirebaseDynamicLinks.this, "POST", REST_PATH, content, com.google.api.services.firebasedynamiclinks.v1.model.GetIosPostInstallAttributionResponse.class);
      }

      @Override
      public InstallAttribution set$Xgafv(java.lang.String $Xgafv) {
        return (InstallAttribution) super.set$Xgafv($Xgafv);
      }

      @Override
      public InstallAttribution setAccessToken(java.lang.String accessToken) {
        return (InstallAttribution) super.setAccessToken(accessToken);
      }

      @Override
      public InstallAttribution setAlt(java.lang.String alt) {
        return (InstallAttribution) super.setAlt(alt);
      }

      @Override
      public InstallAttribution setCallback(java.lang.String callback) {
        return (InstallAttribution) super.setCallback(callback);
      }

      @Override
      public InstallAttribution setFields(java.lang.String fields) {
        return (InstallAttribution) super.setFields(fields);
      }

      @Override
      public InstallAttribution setKey(java.lang.String key) {
        return (InstallAttribution) super.setKey(key);
      }

      @Override
      public InstallAttribution setOauthToken(java.lang.String oauthToken) {
        return (InstallAttribution) super.setOauthToken(oauthToken);
      }

      @Override
      public InstallAttribution setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (InstallAttribution) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public InstallAttribution setQuotaUser(java.lang.String quotaUser) {
        return (InstallAttribution) super.setQuotaUser(quotaUser);
      }

      @Override
      public InstallAttribution setUploadType(java.lang.String uploadType) {
        return (InstallAttribution) super.setUploadType(uploadType);
      }

      @Override
      public InstallAttribution setUploadProtocol(java.lang.String uploadProtocol) {
        return (InstallAttribution) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public InstallAttribution set(String parameterName, Object value) {
        return (InstallAttribution) super.set(parameterName, value);
      }
    }
    /**
     * Get iOS reopen attribution for app universal link open deeplinking.
     *
     * Create a request for the method "v1.reopenAttribution".
     *
     * This request holds the parameters needed by the firebasedynamiclinks server.  After setting any
     * optional parameters, call the {@link ReopenAttribution#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.firebasedynamiclinks.v1.model.GetIosReopenAttributionRequest}
     * @return the request
     */
    public ReopenAttribution reopenAttribution(com.google.api.services.firebasedynamiclinks.v1.model.GetIosReopenAttributionRequest content) throws java.io.IOException {
      ReopenAttribution result = new ReopenAttribution(content);
      initialize(result);
      return result;
    }

    public class ReopenAttribution extends FirebaseDynamicLinksRequest<com.google.api.services.firebasedynamiclinks.v1.model.GetIosReopenAttributionResponse> {

      private static final String REST_PATH = "v1/reopenAttribution";

      /**
       * Get iOS reopen attribution for app universal link open deeplinking.
       *
       * Create a request for the method "v1.reopenAttribution".
       *
       * This request holds the parameters needed by the the firebasedynamiclinks server.  After setting
       * any optional parameters, call the {@link ReopenAttribution#execute()} method to invoke the
       * remote operation. <p> {@link ReopenAttribution#initialize(com.google.api.client.googleapis.serv
       * ices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.firebasedynamiclinks.v1.model.GetIosReopenAttributionRequest}
       * @since 1.13
       */
      protected ReopenAttribution(com.google.api.services.firebasedynamiclinks.v1.model.GetIosReopenAttributionRequest content) {
        super(FirebaseDynamicLinks.this, "POST", REST_PATH, content, com.google.api.services.firebasedynamiclinks.v1.model.GetIosReopenAttributionResponse.class);
      }

      @Override
      public ReopenAttribution set$Xgafv(java.lang.String $Xgafv) {
        return (ReopenAttribution) super.set$Xgafv($Xgafv);
      }

      @Override
      public ReopenAttribution setAccessToken(java.lang.String accessToken) {
        return (ReopenAttribution) super.setAccessToken(accessToken);
      }

      @Override
      public ReopenAttribution setAlt(java.lang.String alt) {
        return (ReopenAttribution) super.setAlt(alt);
      }

      @Override
      public ReopenAttribution setCallback(java.lang.String callback) {
        return (ReopenAttribution) super.setCallback(callback);
      }

      @Override
      public ReopenAttribution setFields(java.lang.String fields) {
        return (ReopenAttribution) super.setFields(fields);
      }

      @Override
      public ReopenAttribution setKey(java.lang.String key) {
        return (ReopenAttribution) super.setKey(key);
      }

      @Override
      public ReopenAttribution setOauthToken(java.lang.String oauthToken) {
        return (ReopenAttribution) super.setOauthToken(oauthToken);
      }

      @Override
      public ReopenAttribution setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (ReopenAttribution) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ReopenAttribution setQuotaUser(java.lang.String quotaUser) {
        return (ReopenAttribution) super.setQuotaUser(quotaUser);
      }

      @Override
      public ReopenAttribution setUploadType(java.lang.String uploadType) {
        return (ReopenAttribution) super.setUploadType(uploadType);
      }

      @Override
      public ReopenAttribution setUploadProtocol(java.lang.String uploadProtocol) {
        return (ReopenAttribution) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public ReopenAttribution set(String parameterName, Object value) {
        return (ReopenAttribution) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link FirebaseDynamicLinks}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link FirebaseDynamicLinks}. */
    @Override
    public FirebaseDynamicLinks build() {
      return new FirebaseDynamicLinks(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link FirebaseDynamicLinksRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setFirebaseDynamicLinksRequestInitializer(
        FirebaseDynamicLinksRequestInitializer firebasedynamiclinksRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(firebasedynamiclinksRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}