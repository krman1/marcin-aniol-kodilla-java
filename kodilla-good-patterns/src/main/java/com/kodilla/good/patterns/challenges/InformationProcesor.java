package com.kodilla.good.patterns.challenges;

public class InformationProcesor implements InformationService {

    @Override
    public void inform(User user) {

        System.out.println("Informacja o zamówienie wysłana do użytkownika");
    }
}
