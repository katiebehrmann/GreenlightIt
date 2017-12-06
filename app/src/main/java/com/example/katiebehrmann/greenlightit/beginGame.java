package com.example.katiebehrmann.greenlightit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class beginGame extends AppCompatActivity {

    private ImageView movie;
    private TextView movieCopy;
    private TextView title;
    private int bechdel;
    private int nonBechdel;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin_game);

        movie = (ImageView) findViewById(R.id.movie_image);
        movieCopy = (TextView) findViewById(R.id.movie_copy);
        title = (TextView) findViewById(R.id.titleofmovie);

        bechdel = 0;
        nonBechdel = 0;
        counter = 0;
    }

    public void greenLight(View view) {
        counter = counter + 1;
        if (movie.getDrawable().equals(R.drawable.angelinvestorsBECHDEL)) {
            movie.setImageResource(R.drawable.coneyislandNONBECHDEL);
            movieCopy.setText(R.string.coney_island);
            title.setText("The Coney Island Six");
            bechdel = bechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.coneyislandNONBECHDEL)) {
            movie.setImageResource(R.drawable.dystopianNONBECHDEL);
            movieCopy.setText(R.string.vortex);
            title.setText("The Vortex");
            nonBechdel = nonBechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.dystopianNONBECHDEL)) {
            movie.setImageResource(R.drawable.dystopiatimetravelBECHDEL);
            movieCopy.setText(R.string.war_on_time);
            title.setText("The War on Time");
            nonBechdel = nonBechdel + 1;

        }

        if (movie.getDrawable().equals(R.drawable.dystopiatimetravelBECHDEL)) {
            movie.setImageResource(R.drawable.FamilyInkBECHDEL);
            movieCopy.setText(R.string.family_ink);
            title.setText("Family, Inkorporated");
            bechdel = bechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.FamilyInkBECHDEL)) {
            movie.setImageResource(R.drawable.femaleweightliftingBECHDEL);
            movieCopy.setText(R.string.carry_that_weight);
            title.setText("Carry That Weight");
            bechdel = bechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.femaleweightliftingBECHDEL)) {
            movie.setImageResource(R.drawable.fightingoverguyNONBECHDEL);
            movieCopy.setText(R.string.caught_in_middle);
            title.setText("Caught in the Middle");
            bechdel = bechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.fightingoverguyNONBECHDEL)) {
            movie.setImageResource(R.drawable.lovablerobotNONBECHDEL);
            movieCopy.setText(R.string.winkle_me);
            title.setText("Winkle and Me");
            nonBechdel = nonBechdel + 1;

        }

        if (movie.getDrawable().equals(R.drawable.lovablerobotNONBECHDEL)) {
            movie.setImageResource(R.drawable.meetjeremyNONBECHDEL);
            movieCopy.setText(R.string.meet_jeremy);
            title.setText("Meet Jeremy");
            nonBechdel = nonBechdel + 1;

        }

        if (movie.getDrawable().equals(R.drawable.meetjeremyNONBECHDEL)) {
            movie.setImageResource(R.drawable.monstersincNONBECHDEL);
            movieCopy.setText(R.string.greatest_mistake);
            title.setText("Gak and Fizzle III: The Greatest Mistake");
            nonBechdel = nonBechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.monstersincNONBECHDEL)) {
            movie.setImageResource(R.drawable.paranormalparalegalBECHDEL);
            movieCopy.setText(R.string.paranormal_paralegal);
            title.setText("Paranormal Paralegal");
            nonBechdel = nonBechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.paranormalparalegalBECHDEL)) {
            movie.setImageResource(R.drawable.PriestessBECHDEL);
            movieCopy.setText(R.string.miranda_priestess);
            title.setText("Miranda, Priestess of the Midwest");
            bechdel = bechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.PriestessBECHDEL)) {
            movie.setImageResource(R.drawable.Softwareinsky);
            movieCopy.setText(R.string.software_sky);
            title.setText("Software in the Sky");
            bechdel = bechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.Softwareinsky)) {
            movie.setImageResource(R.drawable.valleybountyNONBECHDEL);
            movieCopy.setText(R.string.bounty_valley);
            title.setText("The Bounty of the Valley");
            bechdel = bechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.valleybountyNONBECHDEL)) {
            movie.setImageResource(R.drawable.winhard);
            movieCopy.setText(R.string.win_hard);
            title.setText("Win Hard");
            nonBechdel = nonBechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.winhard)) {
            movie.setImageResource(R.drawable.youthnatureBECHDEL);
            movieCopy.setText(R.string.escape_woods);
            title.setText("Escape the Woods");
            nonBechdel = nonBechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.youthnatureBECHDEL)) {
            movie.setImageResource(R.drawable.thelifemolecule);
            movieCopy.setText(R.string.life_molecule);
            title.setText("The Life Molecule");
            bechdel = bechdel + 1;
        }

        if (movie.getDrawable().equals(R.drawable.thelifemolecule)) {
            nonBechdel = nonBechdel + 1;
        }
    }

    public void redLight(View view) {
        counter = counter + 1;
        if (movie.getDrawable().equals(R.drawable.angelinvestorsBECHDEL)) {
            movie.setImageResource(R.drawable.coneyislandNONBECHDEL);
            movieCopy.setText(R.string.coney_island);
            title.setText("The Coney Island Six");
        }

        if (movie.getDrawable().equals(R.drawable.coneyislandNONBECHDEL)) {
            movie.setImageResource(R.drawable.dystopianNONBECHDEL);
            movieCopy.setText(R.string.vortex);
            title.setText("The Vortex");
        }

        if (movie.getDrawable().equals(R.drawable.dystopianNONBECHDEL)) {
            movie.setImageResource(R.drawable.dystopiatimetravelBECHDEL);
            movieCopy.setText(R.string.war_on_time);
            title.setText("The War on Time");
        }

        if (movie.getDrawable().equals(R.drawable.dystopiatimetravelBECHDEL)) {
            movie.setImageResource(R.drawable.FamilyInkBECHDEL);
            movieCopy.setText(R.string.family_ink);
            title.setText("Family, Inkorporated");
        }

        if (movie.getDrawable().equals(R.drawable.FamilyInkBECHDEL)) {
            movie.setImageResource(R.drawable.femaleweightliftingBECHDEL);
            movieCopy.setText(R.string.carry_that_weight);
            title.setText("Carry That Weight");
        }

        if (movie.getDrawable().equals(R.drawable.femaleweightliftingBECHDEL)) {
            movie.setImageResource(R.drawable.fightingoverguyNONBECHDEL);
            movieCopy.setText(R.string.caught_in_middle);
            title.setText("Caught in the Middle");
        }

        if (movie.getDrawable().equals(R.drawable.fightingoverguyNONBECHDEL)) {
            movie.setImageResource(R.drawable.lovablerobotNONBECHDEL);
            movieCopy.setText(R.string.winkle_me);
            title.setText("Winkle and Me");
        }

        if (movie.getDrawable().equals(R.drawable.lovablerobotNONBECHDEL)) {
            movie.setImageResource(R.drawable.meetjeremyNONBECHDEL);
            movieCopy.setText(R.string.meet_jeremy);
            title.setText("Meet Jeremy");
        }

        if (movie.getDrawable().equals(R.drawable.meetjeremyNONBECHDEL)) {
            movie.setImageResource(R.drawable.monstersincNONBECHDEL);
            movieCopy.setText(R.string.greatest_mistake);
            title.setText("Gak and Fizzle III: The Greatest Mistake");
        }

        if (movie.getDrawable().equals(R.drawable.monstersincNONBECHDEL)) {
            movie.setImageResource(R.drawable.paranormalparalegalBECHDEL);
            movieCopy.setText(R.string.paranormal_paralegal);
            title.setText("Paranormal Paralegal");
        }

        if (movie.getDrawable().equals(R.drawable.paranormalparalegalBECHDEL)) {
            movie.setImageResource(R.drawable.PriestessBECHDEL);
            movieCopy.setText(R.string.miranda_priestess);
            title.setText("Miranda, Priestess of the Midwest");
        }

        if (movie.getDrawable().equals(R.drawable.PriestessBECHDEL)) {
            movie.setImageResource(R.drawable.Softwareinsky);
            movieCopy.setText(R.string.software_sky);
            title.setText("Software in the Sky");
        }

        if (movie.getDrawable().equals(R.drawable.Softwareinsky)) {
            movie.setImageResource(R.drawable.valleybountyNONBECHDEL);
            movieCopy.setText(R.string.bounty_valley);
            title.setText("The Bounty of the Valley");
        }

        if (movie.getDrawable().equals(R.drawable.valleybountyNONBECHDEL)) {
            movie.setImageResource(R.drawable.winhard);
            movieCopy.setText(R.string.win_hard);
            title.setText("Win Hard");
        }

        if (movie.getDrawable().equals(R.drawable.winhard)) {
            movie.setImageResource(R.drawable.youthnatureBECHDEL);
            movieCopy.setText(R.string.escape_woods);
            title.setText("Escape the Woods");
        }

        if (movie.getDrawable().equals(R.drawable.youthnatureBECHDEL)) {
            movie.setImageResource(R.drawable.thelifemolecule);
            movieCopy.setText(R.string.life_molecule);
            title.setText("The Life Molecule");
        }

    }
}
