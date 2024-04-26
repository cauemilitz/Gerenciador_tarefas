package com.example.taskwise

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomChip(texto:String,cor:Long){
    ElevatedAssistChip(
        onClick = {},
        label = {
            Text(texto)
        },
        colors = AssistChipDefaults.elevatedAssistChipColors(containerColor = Color(cor),labelColor = Color.White)
    )
}

@Composable
fun CustomChip1(texto:String,cor:Long){
    ElevatedAssistChip(
        onClick = {},
        label = {
            Text(texto)
        },
        colors = AssistChipDefaults.elevatedAssistChipColors(containerColor = Color(cor),labelColor = Color.White)
    )
}

@Composable
fun CustomChip2(texto:String,cor:Long){
    ElevatedAssistChip(
        onClick = {},
        label = {
            Text(texto)
        },
        colors = AssistChipDefaults.elevatedAssistChipColors(containerColor = Color(cor),labelColor = Color.White)
    )
}

@Composable
fun CustomChip3(texto:String,cor:Long){
    ElevatedAssistChip(
        onClick = {},
        label = {
            Text(texto)
        },
        colors = AssistChipDefaults.elevatedAssistChipColors(containerColor = Color(cor),labelColor = Color.White)
    )
}

@Composable
fun CustomChip4(texto:String,cor:Long){
    ElevatedAssistChip(
        onClick = {},
        label = {
            Text(texto)
        },
        colors = AssistChipDefaults.elevatedAssistChipColors(containerColor = Color(cor),labelColor = Color.White)
    )
}

@Composable
fun CustomChip5(texto:String,cor:Long){
    ElevatedAssistChip(
        onClick = {},
        label = {
            Text(texto)
        },
        colors = AssistChipDefaults.elevatedAssistChipColors(containerColor = Color(cor),labelColor = Color.White)
    )
}

@Composable
fun CustomChipDelet_S(texto:String,cor:Long){
    ElevatedAssistChip(
        onClick = {},
        label = {
            Text(texto)
        },
        colors = AssistChipDefaults.elevatedAssistChipColors(containerColor = Color(cor),labelColor = Color.White)
    )
}

@Composable
fun CustomChipDelet_N(texto:String,cor:Long){
    ElevatedAssistChip(
        onClick = {},
        label = {
            Text(texto)
        },
        colors = AssistChipDefaults.elevatedAssistChipColors(containerColor = Color(cor),labelColor = Color.White)
    )
}

@Composable
fun Textarea() {
    val text = rememberSaveable { mutableStateOf("digite o titulo da tarefa") }
    TextField(
        value = text.value,
        onValueChange = { text.value = it }, modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp)
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
    )
}

@Composable
fun Textarea1() {
    val text = rememberSaveable { mutableStateOf(" digite a data para a conclusão") }
    TextField(
        value = text.value,
        onValueChange = { text.value = it }, modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp)
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
    )
}

@Composable
fun Textarea2() {
    val text = rememberSaveable { mutableStateOf("digite a importancia da tarefa") }
    TextField(
        value = text.value,
        onValueChange = { text.value = it }, modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp)
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
    )
}

@Composable
fun Textarea3() {
    val text = rememberSaveable { mutableStateOf("digite sua tarefa") }
    TextField(
        value = text.value,
        onValueChange = { text.value = it }, modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp)
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
    )
}

@Composable
fun Textarea4() {
    val text = rememberSaveable { mutableStateOf("edite o titulo da tarefa") }
    TextField(
        value = text.value,
        onValueChange = { text.value = it }, modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp)
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
    )
}

@Composable
fun Textarea5() {
    val text = rememberSaveable { mutableStateOf(" edite a data para a conclusão") }
    TextField(
        value = text.value,
        onValueChange = { text.value = it }, modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp)
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
    )
}

@Composable
fun Textarea6() {
    val text = rememberSaveable { mutableStateOf("edite a importancia da tarefa") }
    TextField(
        value = text.value,
        onValueChange = { text.value = it }, modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp)
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
    )
}

@Composable
fun Textarea7() {
    val text = rememberSaveable { mutableStateOf("edite sua tarefa") }
    TextField(
        value = text.value,
        onValueChange = { text.value = it }, modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp)
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
    )
}
