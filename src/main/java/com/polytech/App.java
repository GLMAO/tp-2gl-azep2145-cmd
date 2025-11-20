package com.polytech;

import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Exemple d'utilisation
Cours cours = new CoursBuilder()
    .setMatiere("Génie Logiciel")
    .setEnseignant("Dr. Dupont")
    .setSalle("A101")
    .setDate("2024-01-15")
    .setHeureDebut("14:00")
    .setEstOptionnel(true)
    .setNiveau("Master")
    .setNecessiteProjecteur(true)
    .build();
    }
}
