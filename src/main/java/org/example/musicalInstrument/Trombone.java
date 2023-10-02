package org.example.musicalInstrument;

public class Trombone extends MusicalInstrument{
    public Trombone() {
        super("Trombone", "Brass wind instrument");
    }

    @Override
    public void getHistory() {
        System.out.println("The trombone, a brass wind instrument with a slide, " +
                "has a history dating back to the 15th century. It plays a vital role in brass bands and orchestras.");
    }
}
