package com.example.edusafe_safetyeducationforteenagers.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SimulationProgressBar(progress: Float) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(3.dp)
            .background(color = Color(0xFF2A2740), shape = RoundedCornerShape(4.dp)),
        contentAlignment = Alignment.CenterStart
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(fraction = progress.coerceIn(0f, 1f))
                .fillMaxHeight()
                .background(color = Color(0xFF7A6FE0), shape = RoundedCornerShape(4.dp))
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF120F1F)
@Composable
private fun SimulationProgressBarPreview() {
    SimulationProgressBar(progress = 0.66f)
}