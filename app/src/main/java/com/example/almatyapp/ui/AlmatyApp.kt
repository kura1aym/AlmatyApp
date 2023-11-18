package com.example.almatyapp.ui

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import com.example.almatyapp.ui.utils.windowSizeClass
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun AlmatyApp(windowSize: WindowWidthSizeClass, onBackPressed: () -> Unit) {
    val navController = rememberNavController()

    val contentType = windowSizeClass(windowSize)

    NavHost(navController, startDestination = "categories") {
        composable("categories") {
            CategoryListScreen(
                onCategorySelected = {
                    navController.navigate("recommendations/$it")
                }
            )
        }

        composable("recommendations/{category}") { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category")
            if (category != null) {
                RecommendationListScreen(
                    category = category,
                    onRecommendationSelected = {  }
                )
            }
        }


        composable("recommendation_detail/{recommendationId}") { backStackEntry ->
            val recommendationId =
                backStackEntry.arguments?.getString("recommendationId")
            if (recommendationId != null) {
                RecommendationDetailScreen(
                    recommendationId = recommendationId,
                    onNavigateUp = { navController.popBackStack() },
                    onBackPressed = onBackPressed
                )
            }
        }
    }
}

@Composable
fun RecommendationDetailScreen(
    recommendationId: String,
    onNavigateUp: () -> Boolean,
    onBackPressed: () -> Unit
) {
    TODO("Not yet implemented")
}

@Composable
fun RecommendationListScreen(category: String, onRecommendationSelected: () -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun CategoryListScreen(onCategorySelected: () -> Unit) {
    TODO("Not yet implemented")
}
