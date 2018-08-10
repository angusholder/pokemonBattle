package com.github.angusholder.pokemonBattle

import com.squareup.sqldelight.EnumColumnAdapter
import com.squareup.sqldelight.sqlite.driver.SqliteJdbcOpenHelper

enum class PokeType {
    Normal,
    Fire,
    Fighting,
    Water,
    Flying,
    Grass,
    Poison,
    Electric,
    Ground,
    Psychic,
    Rock,
    Ice,
    Bug,
    Dragon,
    Ghost,
    Dark,
    Steel
}

enum class MoveCategory {
    Physical,
    Special,
    Status
}

fun main(args: Array<String>) {
    val db = SqliteJdbcOpenHelper(":jdbc:sqlite:/:memory:")
    val q = QueryWrapper(db, Move.Adapter(EnumColumnAdapter(), EnumColumnAdapter()), Pokemon.Adapter(EnumColumnAdapter(), EnumColumnAdapter()))
}