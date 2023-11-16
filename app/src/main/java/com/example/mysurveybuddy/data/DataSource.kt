/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.mysurveybuddy.data

import com.example.mysurveybuddy.constants.ItemType
import com.example.mysurveybuddy.model.SurveyItem

/**
 * Map of available survey items to be displayed in the survey fragments.
 */
object DataSource {
    val surveyItems = mapOf(
        "highly_satisfied_rep" to
        SurveyItem(
            name = "Excellent Service",
            description = "The representative provided top notch service.",
            score = 5.00,
            type = ItemType.REPRESENTATIVE
        ),
        "satisfied_rep" to
        SurveyItem(
            name = "Good Service",
            description = "The representative provided satisfactory service.",
            score = 4.00,
            type = ItemType.REPRESENTATIVE
        ),
        "fair_rep" to
        SurveyItem(
            name = "Fair",
            description = "The service was adequate.",
            score = 3.00,
            type = ItemType.REPRESENTATIVE
        ),
        "unsatisfied_rep" to
        SurveyItem(
            name = "Poor Service",
            description = "The representative provided unsatisfactory service.",
            score = 2.00,
            type = ItemType.REPRESENTATIVE
        ),
        "highly_unsatisfied_rep" to
                SurveyItem(
                    name = "Terrible Service",
                    description = "The representative provided terrible service.",
                    score = 1.00,
                    type = ItemType.REPRESENTATIVE
                ),
        "highly_satisfied_product" to
        SurveyItem(
            name = "Excellent Purchase",
            description = "I'm highly satisfied with my purchase.",
            score = 5.00,
            type = ItemType.PRODUCT
        ),
        "satisfied_product" to
        SurveyItem(
            name = "Good Purchase",
            description = "I'm mostly satisfied with my purchase.",
            score = 4.00,
            type = ItemType.PRODUCT
        ),
        "fair_product" to
        SurveyItem(
            name = "Fair",
            description = "My purchase was adequate.",
            score = 3.00,
            type = ItemType.PRODUCT
        ),
        "unsatisfied_product" to
        SurveyItem(
            name = "Poor Purchase",
            description = "I'm not satisfied with my purchase.",
            score = 2.00,
            type = ItemType.PRODUCT
        ),
        "highly_unsatisfied_product" to
                SurveyItem(
                    name = "Terrible Purchase",
                    description = "I'm extremely unsatisfied with my purchase.",
                    score = 1.00,
                    type = ItemType.PRODUCT
                ),
        "would_recommend" to
        SurveyItem(
            name = "Would Recommend",
            description = "I would recommend this product/service to others.",
            score = 3.00,
            type = ItemType.RECOMMEND
        ),
        "maybe" to
        SurveyItem(
            name = "Might Recommend",
            description = "I might recommend this product/service to others.",
            score = 2.00,
            type = ItemType.RECOMMEND
        ),
        "would_not_recommend" to
        SurveyItem(
            name = "Would Not Recommend",
            description = "I would not recommend this product/service to others.",
            score = 1.00,
            type = ItemType.RECOMMEND
        )
    )
}
