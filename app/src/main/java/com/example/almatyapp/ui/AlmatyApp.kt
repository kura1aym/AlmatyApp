package com.example.almatyapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.almatyapp.data.LocalRecomendationDataProvider
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument
import com.example.almatyapp.R

enum class AlmatyScreen(val route: String) {
    Categories("categories"),
    Recommendations("recommendations/{category}"),
    RecommendationDetail("recommendation_detail/{recommendationId}")
}

@Composable
fun AlmatyApp(
    windowSize: WindowWidthSizeClass,
    onBackPressed: () -> Unit,
) {
    val navController = rememberNavController()

    NavHost(navController, startDestination = AlmatyScreen.Categories.route) {
        composable(AlmatyScreen.Categories.route) {
            CategoryListScreen(
                onCategorySelected = { category ->
                    navController.navigate("${AlmatyScreen.Recommendations.route.replace("{category}", category)}")
                }
            )
        }

        composable(
            AlmatyScreen.Recommendations.route,
            arguments = listOf(navArgument("category") { type = NavType.StringType })
        ) { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category")
            if (category != null) {
                RecommendationListScreen(
                    category = category,
                    onRecommendationSelected = { recommendationId ->
                        navController.navigate("${AlmatyScreen.RecommendationDetail.route.replace("{recommendationId}", recommendationId)}")
                    }
                )
            }
        }

        composable(
            AlmatyScreen.RecommendationDetail.route,
            arguments = listOf(navArgument("recommendationId") { type = NavType.StringType })
        ) { backStackEntry ->
            val recommendationId = backStackEntry.arguments?.getString("recommendationId")
            if (recommendationId != null) {
                RecommendationDetailScreen(
                    recommendationId = recommendationId,
                    onNavigateUp = { navController.popBackStack() }
                )
            }
        }
    }
}

@Composable
fun CategoryListScreen(onCategorySelected: (String) -> Unit) {
    val categories = LocalRecomendationDataProvider.recommendations
        .map { it.category }
        .distinct()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        LazyColumn {
            items(categories) { category ->
                Text(
                    text = category,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onCategorySelected(category) }
                        .padding(16.dp),
                    fontSize = 18.sp
                )
            }
        }
    }

}

@Composable
fun RecommendationListScreen(
    category: String,
    onRecommendationSelected: (String) -> Unit
) {
    val recommendations = LocalRecomendationDataProvider.recommendations
        .filter { it.category == category }

    LazyColumn {
        items(recommendations) { recommendation ->
            Text(
                text = recommendation.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onRecommendationSelected(recommendation.id.toString()) }
                    .padding(16.dp),
                fontSize = 18.sp
            )
        }
    }
}

@Composable
fun RecommendationDetailScreen(
    recommendationId: String,
    onNavigateUp: () -> Unit
) {
    val recommendation = LocalRecomendationDataProvider.recommendations
        .firstOrNull { it.id.toString() == recommendationId }

    if (recommendation != null) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = recommendation.name, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = recommendation.category, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = recommendation.address, fontSize = 16.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = recommendation.description, fontSize = 16.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(id = recommendation.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(shape = RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
        }
    } else {
        Text("Recommendation not found")
    }
}


@Preview
@Composable
fun CategoryListScreenPreview() {
    CategoryListScreen {}
}

@Preview
@Composable
fun RecommendationListScreenPreview() {
    RecommendationListScreen("Coffee Shop") {
    }
}

@Preview
@Composable
fun RecommendationDetailScreenPreview() {
    RecommendationDetailScreen("1") {}
}
