package org.example.musicalInstrument;

public class Violin extends MusicalInstrument{
    public Violin() {
        super("Violin", "Four-stringed bowed instrument");
    }

    @Override
    public void getHistory() {
        System.out.println("The violin, known for its beautiful and versatile sound, " +
                "has a history dating back to the 16th century. It is an essential instrument in classical music.");
    }
}
