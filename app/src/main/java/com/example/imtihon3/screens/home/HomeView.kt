package com.example.imtihon3.screens.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.imtihon3.R
import com.example.imtihon3.database.Item
import com.example.imtihon3.screens.primary.PrimaryViewModel

@Composable
fun HomeView(pvm: PrimaryViewModel) {
    val books = pvm.books.observeAsState().value
    LazyColumn {
        items(books!!) {
            BookItem(it, pvm)
        }
    }
}

@Composable
fun BookItem(item: Item, pvm: PrimaryViewModel) {
    val saved = remember {
        mutableStateOf(item.saved)
    }
    Row(
        Modifier
            .fillMaxWidth()
            .clickable {
                pvm.navigate(item)
            }
            .padding(vertical = 12.dp), verticalAlignment = Alignment.CenterVertically) {
        AsyncImage(
            model = item.image,
            contentDescription = "",
            placeholder = painterResource(id = R.drawable.loading),
            error = painterResource(
                id = R.drawable.error
            ),
            modifier = Modifier.width(60.dp),
            contentScale = ContentScale.Fit
        )
        Column(
            Modifier
                .padding(horizontal = 12.dp)
                .weight(1f)
        ) {
            Text(
                text = item.name,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFA7A7A7)
            )
        }
        IconButton(onClick = {
            pvm.updateState(item)
            saved.value = !saved.value
        }) {
            Icon(
                painter = painterResource(
                    id = R.drawable.bookmark
                ),
                contentDescription = "",
                tint = if (saved.value) Color(0xFF676F8D) else Color(0xFFC7C5C5)
            )
        }
    }
}