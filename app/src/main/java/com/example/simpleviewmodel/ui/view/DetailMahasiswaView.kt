package com.example.simpleviewmodel.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.simpleviewmodel.model.Mahasiswa

@Composable
fun DetailMahasiswaView(
    dataMhs: Mahasiswa,
    modifier: Modifier = Modifier,
    onBackButton: () -> Boolean
){
    val listDatamhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("Nim", dataMhs.nim),
        Pair("Email", dataMhs.email),
        Pair("Gender", dataMhs.gender),
        Pair("noTelepon", dataMhs.noTelepon),
        Pair("Alamat", dataMhs.alamat),

        
    )

    Column (
        modifier = modifier
            .fillMaxSize() .padding(16.dp)
    ){
        listDatamhs.forEach { data->
            DetailMhs(judul = data.first,
                isi = data.second)
        }
        Button(modifier = modifier
            .fillMaxWidth(),
            onClick = { onBackButton() },
        ) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun DetailMhs(
    judul: String, isi: String
){
    Column(
        modifier = Modifier.fillMaxWidth().padding(8.dp),
    ){

        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.1f))
            Text(text = isi,
                modifier = Modifier.weight(2f))
        }



    }
}