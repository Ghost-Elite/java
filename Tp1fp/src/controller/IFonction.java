package controller;

import entities.Salaire;

@FunctionalInterface
public interface IFonction {
    public double getSalaireNet(Salaire salaire);
}
