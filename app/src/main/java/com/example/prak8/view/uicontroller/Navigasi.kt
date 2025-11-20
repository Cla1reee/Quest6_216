package com.example.prak8.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.prak8.viewmodel.SiswaViewModel

@OptIn(ExperimentalMaterial3Api)
@Composable
fun SiswaApp(
    modifier: Modifier,
    viewModel: SiswaViewModel = ViewModel(),
    navController: NavHostController = rememberNavController()
){

}