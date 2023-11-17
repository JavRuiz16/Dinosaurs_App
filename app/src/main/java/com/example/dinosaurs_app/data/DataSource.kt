package com.example.dinosaurs_app.data

import com.example.dinosaurs_app.R
import com.example.dinosaurs_app.model.Dinosaurs_App

object DataSource {
    val dinosaursApp = listOf(
        Dinosaurs_App(
            name = R.string.Tyrannosaurus_rex,
            imageResourceId = R.drawable.tyrannosaurus_rex,
            description = R.string.description1
        ),
        Dinosaurs_App(
            name = R.string.Brontosaurus,
            imageResourceId = R.drawable.brontosaurus_img,
            description = R.string.description2
        ),
        Dinosaurs_App(
            name = R.string.Stegosaurus,
            imageResourceId = R.drawable.stegosaurus_img,
            description = R.string.description3
        ),
        Dinosaurs_App(
            name = R.string.Triceratops,
            imageResourceId = R.drawable.triceratops_image,
            description = R.string.description4
        ),
        Dinosaurs_App(
            name = R.string.Velociraptor,
            imageResourceId = R.drawable.velociraptor_img,
            description = R.string.description5
        ),
        Dinosaurs_App(
            name = R.string.Pterodactyl,
            imageResourceId = R.drawable.pterodactyl_img,
            description = R.string.description6
        )
    )
}
