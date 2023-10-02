package org.example.musicalInstrument;

public class Ukulele extends MusicalInstrument{
    public Ukulele() {
        super("Ukulele", "Four-stringed plucked instrument");
    }

    @Override
    public void getHistory() {
        System.out.println("The ukulele, a small four-stringed instrument," +
                " originated in Hawaii in the late 19th century. It is known for its pleasant and cheerful sound.");
    }
}
