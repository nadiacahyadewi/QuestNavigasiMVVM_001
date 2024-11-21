package com.example.simpleviewmodel

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.simpleviewmodel.viewmodel.MahasiswaViewModel

enum class Halaman{
    Form,
    Data
}

@Composable
fun Navigasi(
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel= viewModel(),
    navHost: NavHostController = rememberNavController()
){
    Scaffold { isipadding ->
        val uiState by viewModel.dataModel.collectAsState()
    }
}