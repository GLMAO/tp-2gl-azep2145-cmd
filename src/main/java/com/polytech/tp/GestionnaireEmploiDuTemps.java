package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>(); // Liste des observateurs

    @Override
    public void attach(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        // Notification des observateurs
        notifyObservers("Nouveau cours ajouté : " + cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // Notification des observateurs
        notifyObservers("Cours modifié : " + message);
    }

    public void annulerCours(ICours cours) {
        listeCours.remove(cours);
        String message = "Cours annulé : " + cours.getDescription();
        System.out.println(message);
        // Notification des observateurs
        notifyObservers(message);
    }

    public void setChangement(String message) {
        System.out.println("Changement dans l'emploi du temps : " + message);
        // Notification des observateurs
        notifyObservers( message);
    }
}