package com.example.prak8.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.example.prak8.R
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

    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = { Text(stringResource(id = R.string.app_name), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.purple_500)),
            )
        }) { isiRuang ->
        Column(
            modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.padding(dimensionResource(16dp)),
                verticalArrangement = Arrangement.spacedBy(dimensionResource(10dp))
            ) {
                items.forEach { item ->
                    Column {
                        Text(item.first.uppercase(), fontSize = 16.sp)
                        Text(text = item.second, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    }
                    Divider(thickness = dimensionResource(1dp))
                }
                Spacer(modifier = Modifier.height(dimensionResource(10dp)))
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onBackButtonClicked
                ) {
                    Text(text = stringResource("Back"))
                }
            }
        }
    }
}