/*
 * Copyright 2022 The Android Open Source Project
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

package com.google.android.horologist.media.ui.util

/**
 * Make explicit that a conscious decision was made to mark an element as decorative, so it does not
 * have associated actions or state.
 *
 * https://developer.android.com/jetpack/compose/accessibility#describe-visual
 */
internal val DECORATIVE_ELEMENT_CONTENT_DESCRIPTION: String? = null
