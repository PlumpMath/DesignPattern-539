package design_pattern.composite_pattern;

public class SongListGenerator {

    public static void main(String[] args){

        SongComponent industrialMusic =
                new SongGroup("Industrial",
                        "is a style of experimental music that draws on transgressive and provocative themes");

        SongComponent heavyMetalMusic =
                new SongGroup("\nHeavy Metal",
                        "is a genre of rock that developed in the late 1960s, largely in the UK and in the US");

        SongComponent dubstepMusic =
                new SongGroup("\nDubstep",
                        "is a genre of electronic dance music that originated in South London, England");

        // Top level component that holds everything

        SongComponent everySong = new SongGroup("Song List", "Every Song Available");

        // Composite that holds individual groups of songs
        // This holds Songs plus a SongGroup with Songs

        everySong.add(industrialMusic);

        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

        industrialMusic.add(dubstepMusic);

        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        // This is a SongGroup that just holds Songs

        everySong.add(heavyMetalMusic);

        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        // test throw **UnsupportedOperationException**
        //Song testSong = new Song("test Song", "test Band", 2015);
        //Song testSong2 = new Song("test Song 2", "test Band 2", 2015);
        //testSong.add(testSong2);  // this will report **UnsupportedOperationException**

        DiscJockey crazyLarry = new DiscJockey(everySong);

        crazyLarry.getSongList();

    }

}
