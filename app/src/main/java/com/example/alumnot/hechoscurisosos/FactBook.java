package com.example.alumnot.hechoscurisosos;

import android.content.res.Resources;

import java.util.Random;

/**
 * Created by AlumnoT on 28/10/2014.
 */


public class FactBook
{
    private Random rl;
    private String[]respuestas;

    public String  getRandomFact(Resources res)
    {
        respuestas = res.getStringArray(R.array.respuestas);
        rl = new Random();
        return(respuestas[rl.nextInt(respuestas.length)]);
    }
}
