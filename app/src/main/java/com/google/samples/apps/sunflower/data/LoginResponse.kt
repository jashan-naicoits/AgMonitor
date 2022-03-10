/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.sunflower.data

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("user_name"        ) var userName        : String?  = null,
    @SerializedName("company_id"       ) var companyId       : Int?     = null,
    @SerializedName("user_id"          ) var userId          : Int?     = null,
    @SerializedName("authorization_id" ) var authorizationId : Int?     = null,
    @SerializedName("tenant_code"      ) var tenantCode      : String?  = null,
    @SerializedName("company_name"     ) var companyName     : String?  = null,
    @SerializedName("is_superuser"     ) var isSuperuser     : Boolean? = null,
    @SerializedName("is_advisor"       ) var isAdvisor       : Boolean? = null,
    @SerializedName("csrftoken"        ) var csrftoken       : String?  = null,
    @SerializedName("session_id"       ) var sessionId       : String?  = null,
    @SerializedName("firebase_jwt"     ) var firebaseJwt     : String?  = null,
    @SerializedName("default_map"      ) var defaultMap      : String?  = null,
    @SerializedName("account_choices"  ) var accountChoices  : String?  = null
)
