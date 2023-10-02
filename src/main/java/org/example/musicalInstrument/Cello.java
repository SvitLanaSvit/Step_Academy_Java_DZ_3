package org.example.musicalInstrument;

public class Cello extends MusicalInstrument{
    public Cello() {
        super("Cello", "Large bowed string instrument");
    }

    @Override
    public void getHistory() {
        System.out.println("The cello, a large bowed string instrument, " +
                "has a history dating back to the 16th century. It is a prominent member of the orchestra.");
    }
}
