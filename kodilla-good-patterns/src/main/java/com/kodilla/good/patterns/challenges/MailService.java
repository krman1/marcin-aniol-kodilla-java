package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {

        System.out.println("Informacja o zamówieniu wysłana do użytkownika");
    }

}
