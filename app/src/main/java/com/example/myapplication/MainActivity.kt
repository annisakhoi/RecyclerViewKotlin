package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                nameSuperhero = "Ant-Man",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.blackwidow,
                nameSuperhero = "Black Widow",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.ironman2,
                nameSuperhero = "Iron Man",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "Captain America",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.scarlet,
                nameSuperhero = "Scarlet Witch",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.nick,
                nameSuperhero = "Nick Fury",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.phanter,
                nameSuperhero = "Black Panther",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.thor,
                nameSuperhero = "Thor",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.strange,
                nameSuperhero = "Doctor Strange",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdaptor(this, superheroList){

        }
    }
}