package com.example.mycity.data

import com.example.mycity.R

object Datasource {

    private val restaurantsCategory = Category(
        name = R.string.restaurants_category,
        icon = R.drawable.restaurant_icon,
        list = listOf(
            Place(
                name = R.string.kavkaz_title,
                description = R.string.kavkaz_description,
                address = R.string.kavkaz_address,
                photo = R.drawable.hiddengarden
            ),
            Place(
                name = R.string.genacvale_title,
                description = R.string.genacvale_description,
                address = R.string.genacvale_address,
                photo = R.drawable.casajardin
            ),
            Place(
                name = R.string.black_angus_title,
                description = R.string.black_angus_description,
                address = R.string.black_angus_address,
                photo = R.drawable._995studiocafe
            ),
            Place(
                name = R.string.sakurada_title,
                description = R.string.sakurada_description,
                address = R.string.sakurada_address,
                photo = R.drawable.kusinafelicitas
            )
        )
    )

    private val barsCategory = Category(
        name = R.string.bars_category,
        icon = R.drawable.bar_icon,
        list = listOf(
            Place(
                name = R.string.beer_academy_title,
                description = R.string.beer_academy_description,
                address = R.string.beer_academy_address,
                photo = R.drawable.heritageskybar
            ),
            Place(
                name = R.string.dargett_title,
                description = R.string.dargett_description,
                address = R.string.dargett_address,
                photo = R.drawable.lyricbar
            )
        )
    )
    private val parksCategory=Category(
        name=R.string.parks_category,
        icon = R.drawable.nature_icon,
        list=listOf(
            Place(
                name = R.string.lovers_park_title,
                description = R.string.lovers_park_description,
                address = R.string.lovers_park_address,
                photo = R.drawable.plazasalcedo
            ),
            Place(
                name = R.string.victory_park_title,
                description = R.string.victory_park_description,
                address = R.string.victory_park_address,
                photo = R.drawable.fil_hispanicpark
            )
        )
    )
    private val shopsCategory=Category(
        name=R.string.shops_category,
        icon=R.drawable.shops_icon,
        list = listOf(
            Place(
                name = R.string.miniso_title,
                description = R.string.miniso_description,
                address = R.string.miniso_address,
                photo = R.drawable.callecrisologo
            ),
            Place(
                name = R.string.rio_mall_title,
                description = R.string.rio_mall_description,
                address = R.string.rio_mall_address,
                photo = R.drawable.vigan_market_2
            ),
            Place(
                name = R.string.tsiran_title,
                description = R.string.tsiran_description,
                address = R.string.tsiran_address,
                photo = R.drawable.martone
            )
        )
    )

    private val attractionsCategory= Category(
        name = R.string.attractions_category,
        icon = R.drawable.attractions_icon,
        list = listOf(
            Place(
                name = R.string.cascade_title,
                description = R.string.cascade_description,
                address = R.string.cascade_address,
                photo = R.drawable.bantaychurch
            ),
            Place(
                name = R.string.metro_title,
                description = R.string.metro_description,
                address = R.string.metro_address,
                photo = R.drawable.baluarte_zoo_25
            ),
            Place(
                name = R.string.northern_avenue_title,
                description = R.string.northern_avenue_description,
                address = R.string.northern_avenue_address,
                photo = R.drawable.vigancathedral
            ),
            Place(
                name = R.string.vernissage_title,
                description = R.string.vernissage_description,
                address = R.string.vernissage_address,
                photo = R.drawable.syquia_mansion_3
            )
        )
    )


    val listOfCategories = listOf(restaurantsCategory, barsCategory, parksCategory, shopsCategory, attractionsCategory)
}