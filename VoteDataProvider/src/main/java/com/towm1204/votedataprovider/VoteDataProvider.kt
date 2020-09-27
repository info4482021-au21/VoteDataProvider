package com.towm1204.votedataprovider

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlin.random.Random

@Parcelize
data class StateResult (
    val state: String,
    val demVote: Int,
    val repVote:Int,
    val totalVote:Int
): Parcelable

class VoteDataProvider {
    companion object {
        fun getAllResults(): List<StateResult> {
            val states = listOf<String>(
                "Alabama",
                "Alaska",
                "Arizona",
                "Arkansas",
                "California",
                "Colorado",
                "Connecticut",
                "Delaware",
                "Florida",
                "Georgia",
                "Hawaii",
                "Idaho",
                "Illinois",
                "Indiana",
                "Iowa",
                "Kansas",
                "Kentucky",
                "Louisiana",
                "Maine",
                "Maryland",
                "Massachusetts",
                "Michigan",
                "Minnesota",
                "Mississippi",
                "Missouri",
                "Montana",
                "Nebraska",
                "Nevada",
                "New Hampshire",
                "New Jersey",
                "New Mexico",
                "New York",
                "North Carolina",
                "North Dakota",
                "Ohio",
                "Oklahoma",
                "Oregon",
                "Pennsylvania",
                "Rhode Island",
                "South Carolina",
                "South Dakota",
                "Tennessee",
                "Texas",
                "Utah",
                "Vermont",
                "Virginia",
                "Washington",
                "West Virginia",
                "Wisconsin",
                "Wyoming",
                "District of Columbia")

            val pops = listOf<Int>(4903185,
                731545,
                113990,
                53179,
                39512223,
                104094,
                3565278,
                973764,
                21477737,
                59425,
                10932,
                83569,
                12671821,
                36420,
                56273,
                2913314,
                4467673,
                4648794,
                1344212,
                6045680,
                10554,
                9986857,
                5639632,
                48432,
                6137428,
                1068778,
                1934408,
                3080156,
                1359711,
                8882190,
                2096829,
                19453561,
                10488084,
                762062,
                44826,
                69899,
                4217737,
                12801989,
                1545,
                5148714,
                884659,
                42144,
                28995881,
                84897,
                623989,
                8535519,
                7614893,
                24230,
                5822434,
                578023,
                705838)
            val result = mutableListOf<StateResult>()
            for (i in 0..50) {
                val ratio = Random(1).nextDouble(0.6)
                val rep = (pops[i] * ratio).toInt()
                val dem = (pops[i] - rep).toInt()
                result.add(createStateResult(
                    states[i],dem,rep,dem + rep
                ))

            }
            return result
        }

        private fun createStateResult(state: String, demVote: Int, repVote:Int, totalVote:Int): StateResult {
            return StateResult(state, demVote, repVote, totalVote)
        }
    }
}


