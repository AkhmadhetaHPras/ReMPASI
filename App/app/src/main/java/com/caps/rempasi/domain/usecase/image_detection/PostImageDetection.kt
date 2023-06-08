package com.caps.rempasi.domain.usecase.image_detection

import com.caps.rempasi.data.remote.response.PredictionsItem
import com.caps.rempasi.presentation.ui.screen.recomendation.DetectionResult
import kotlinx.coroutines.flow.Flow

interface PostImageDetection {
    fun imageDetection(): Flow<List<PredictionsItem>>
}