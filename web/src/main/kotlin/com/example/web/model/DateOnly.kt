/**
* DictionaryApi
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0
*
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.example.web.model

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

/**
 *
 * @param year
 * @param month
 * @param day
 * @param dayOfWeek
 * @param dayOfYear
 * @param dayNumber
 */
@Parcelize

data class DateOnly(
    @Json(name = "year")
    val year: kotlin.Int? = null,
    @Json(name = "month")
    val month: kotlin.Int? = null,
    @Json(name = "day")
    val day: kotlin.Int? = null,
    @Json(name = "dayOfWeek")
    val dayOfWeek: DayOfWeek? = null,
    @Json(name = "dayOfYear")
    val dayOfYear: kotlin.Int? = null,
    @Json(name = "dayNumber")
    val dayNumber: kotlin.Int? = null
) : Parcelable
