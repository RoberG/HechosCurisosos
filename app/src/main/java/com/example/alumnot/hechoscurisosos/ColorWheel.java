package com.example.alumnot.hechoscurisosos;

import android.content.res.Resources;

import java.util.Random;

/**
 * Created by AlumnoT on 30/10/2014.
 */
public class ColorWheel {

    private Random rl;
    private String[]colores;

    public String  getRandomFact(Resources res)
    {
        colores = res.getStringArray(R.array.colores);
        rl = new Random();
        return(colores[rl.nextInt(colores.length)]);
    }

}
