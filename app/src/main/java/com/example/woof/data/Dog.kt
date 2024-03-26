/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    //val email: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.photo1, R.string.dog_name_1, 60410001,  R.string.dog_description_1),
    Dog(R.drawable.photo2, R.string.dog_name_2, 60410002, R.string.dog_description_2),
    Dog(R.drawable.photo3, R.string.dog_name_3, 60410003, R.string.dog_description_3),
    Dog(R.drawable.photo4, R.string.dog_name_4, 60410004, R.string.dog_description_4),
    Dog(R.drawable.photo5, R.string.dog_name_5, 60410005, R.string.dog_description_5),
    Dog(R.drawable.photo6, R.string.dog_name_6, 60410006, R.string.dog_description_6),
    Dog(R.drawable.photo7, R.string.dog_name_7, 60410007, R.string.dog_description_7),
    Dog(R.drawable.photo8, R.string.dog_name_8, 60410008, R.string.dog_description_8),
    Dog(R.drawable.photo9, R.string.dog_name_9, 60410009, R.string.dog_description_9),
    Dog(R.drawable.photo10, R.string.dog_name_10, 604100010, R.string.dog_description_10),
    Dog(R.drawable.photo11, R.string.dog_name_11, 60410011, R.string.dog_description_11),
    Dog(R.drawable.photo12, R.string.dog_name_12, 60410012, R.string.dog_description_12),
    Dog(R.drawable.photo13, R.string.dog_name_13, 60410013, R.string.dog_description_13),
    Dog(R.drawable.photo14, R.string.dog_name_14, 60410014, R.string.dog_description_14),
    Dog(R.drawable.photo15, R.string.dog_name_15, 60410015, R.string.dog_description_15),
    Dog(R.drawable.photo16, R.string.dog_name_16, 60410016, R.string.dog_description_16),
    Dog(R.drawable.photo17, R.string.dog_name_17, 60410017, R.string.dog_description_17),
    Dog(R.drawable.photo18, R.string.dog_name_18, 60410018, R.string.dog_description_18),
    Dog(R.drawable.photo19, R.string.dog_name_19, 60410019, R.string.dog_description_19),
    Dog(R.drawable.photo20, R.string.dog_name_20, 60410020, R.string.dog_description_20),
    Dog(R.drawable.photo21, R.string.dog_name_21, 60410021, R.string.dog_description_21),
    Dog(R.drawable.photo22, R.string.dog_name_22, 60410022, R.string.dog_description_22),
    Dog(R.drawable.photo23, R.string.dog_name_23, 60410023, R.string.dog_description_23),
    Dog(R.drawable.photo24, R.string.dog_name_24, 604100024, R.string.dog_description_24),
    Dog(R.drawable.photo25, R.string.dog_name_25, 60410025, R.string.dog_description_25),
    Dog(R.drawable.photo26, R.string.dog_name_26, 60410026, R.string.dog_description_26),
    Dog(R.drawable.photo27, R.string.dog_name_27, 60410027, R.string.dog_description_27),
    Dog(R.drawable.photo28, R.string.dog_name_28, 60410028, R.string.dog_description_28),
    Dog(R.drawable.photo29, R.string.dog_name_29, 60410029, R.string.dog_description_29),
    Dog(R.drawable.photo30, R.string.dog_name_30, 60410030, R.string.dog_description_30),
    Dog(R.drawable.photo31, R.string.dog_name_31, 60410031, R.string.dog_description_31),
    Dog(R.drawable.photo32, R.string.dog_name_32, 60410032, R.string.dog_description_32),
    Dog(R.drawable.buu_eng_transparent_grey_gold, R.string.dog_name_9, 4, R.string.dog_description_9)

)
