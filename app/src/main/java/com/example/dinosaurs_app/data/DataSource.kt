package com.example.dinosaurs_app.data

import com.example.dinosaurs_app.R
import com.example.dinosaurs_app.model.Dinosaurs_App

object DataSource {
    val dinosaursApp = listOf(
        Dinosaurs_App(R.string.Tyrannosaurus_rex, R.drawable.tyrannosaurus_rex),
        Dinosaurs_App(R.string.Brontosaurus, R.drawable.brontosaurus_img),
        Dinosaurs_App(R.string.Stegosaurus, R.drawable.stegosaurus_img),
        Dinosaurs_App(R.string.Triceratops, R.drawable.triceratops_image),
        Dinosaurs_App(R.string.Velociraptor, R.drawable.velociraptor_img),
        Dinosaurs_App(R.string.Pterodactyl, R.drawable.pterodactyl_img)
    )
}