package com.example.prak8.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.prak8.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUiSiswa: Siswa,
    onBackButtonClick: () -> Unit
) {
    val item = listOf(
        Pair(stringResource("Nama Lengkap"), statusUiSiswa.nama),
        Pair(stringResource("Jenis Kelamin"), statusUiSiswa.gender),
        Pair(stringResource("Alamat"), statusUiSiswa.alamat)
    )


}