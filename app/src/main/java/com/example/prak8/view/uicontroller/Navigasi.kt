package com.example.prak8.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.prak8.view.FormSiswa
import com.example.prak8.viewmodel.SiswaViewModel
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.layout.padding
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


enum class Navigasi {
    Formulir,
    Detail
}

@OptIn(ExperimentalMaterial3Api)
@Composable
fun SiswaApp(
    modifier: Modifier,
    viewModel: SiswaViewModel = ViewModel(),
    navController: NavHostController = rememberNavController()
){
    Scaffold { isiRuang ->
        val uiState = ViewModel.statusUI.collectAsState()
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulir.name,

            modifier = Modifier.padding(isiRuang)){
                composable(route = Navigasi.Formulir.name){
                    val konteks = LocalContext.current
                    FormSiswa(
                        pilihanJK = JenisK.map {id -> konteks.resources.getString(id) },
                        onSubmitButtonClicked = {
                            viewModel.setSiswa(it)
                        }
                    )
                }
            }
        )
    }
}