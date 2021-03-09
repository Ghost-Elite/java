package controller;

import entities.Professeur;

import java.util.List;
import java.util.Map;

public interface IProfesseur {
    public Professeur creation();
    public void affichage(Professeur professeur);
    public Map<Integer,Professeur> copie (Professeur professeur);
}
