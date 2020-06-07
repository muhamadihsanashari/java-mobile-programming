package com.ashart.mobileprogrammingjava.list;

import com.ashart.mobileprogrammingjava.R;

import java.util.ArrayList;

public class MoviesData {

    private static String[] movieNames = {
            "Stranger Things",
            "Avenger: End Game",
            "Band of Brother",
            "John Wick: Chapter 3 - Parabellum",
            "1917",
            "Chernobyl",
            "Alita: Battel Angel",
            "IT chapter 2",
            "Rambo: Last Blood",
            "Ad Astra"
    };

    private static String[] movieDetails = {
            "When a young boy disappears, his mother, a police chief and his friends must confront terrifying supernatural forces in order to get him back.",
            "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
            "The story of Easy Company of the U.S. Army 101st Airborne Division, and their mission in World War II Europe, from Operation Overlord, through V-J Day.",
            "John Wick is on the run after killing a member of the international assassins' guild, and with a $14 million price tag on his head, he is the target of hit men and women everywhere.",
            "April 6th, 1917. As a regiment assembles to wage war deep in enemy territory, two soldiers are assigned to race against time and deliver a message that will stop 1,600 men from walking straight into a deadly trap.",
            "In April 1986, an explosion at the Chernobyl nuclear power plant in the Union of Soviet Socialist Republics becomes one of the world's worst man-made catastrophes.",
            "A deactivated cyborg is revived, but cannot remember anything of her past life and goes on a quest to find out who she is.",
            "Twenty-seven years after their first encounter with the terrifying Pennywise, the Losers Club have grown up and moved away, until a devastating phone call brings them back.",
            "Rambo must confront his past and unearth his ruthless combat skills to exact revenge in a final mission.",
            "Astronaut Roy McBride undertakes a mission across an unforgiving solar system to uncover the truth about his missing father and his doomed expedition that now, 30 years later, threatens the universe."
    };

    private static int[] movieImages = {
            R.drawable.stranger_things,
            R.drawable.endgame,
            R.drawable.band_of_brothers,
            R.drawable.john_wick_3,
            R.drawable.film_1917,
            R.drawable.chernobyl,
            R.drawable.alita,
            R.drawable.it_chapter_two,
            R.drawable.rambo_last_blood,
            R.drawable.ad_astra
    };

    static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for (int position = 0; position < movieNames.length; position++) {
            Movie movie = new Movie();
            movie.setName(movieNames[position]);
            movie.setDetail(movieDetails[position]);
            movie.setPhoto(movieImages[position]);
            list.add(movie);
        }
        return list;
    }
}
