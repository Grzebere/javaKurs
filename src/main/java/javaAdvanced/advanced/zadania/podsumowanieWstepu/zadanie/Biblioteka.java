package javaAdvanced.advanced.zadania.podsumowanieWstepu.zadanie;

public class Biblioteka {
    int LibrarySize;
    Egzemplarz[] egzemplarze;



    public Biblioteka(Egzemplarz... egzemplarze) {
        this.LibrarySize = egzemplarze.length;
        this.egzemplarze = egzemplarze;
    }

    public Egzemplarz[] searchByTitle(String title) {
        int count = 0;
        for ( Egzemplarz egzemplarz : egzemplarze ) {
            if (title.equals(egzemplarz.getTitle())) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        Egzemplarz[] result = new Egzemplarz[count];
        count = 0;
        for ( Egzemplarz egzemplarz : egzemplarze ) {
            if (title.equals(egzemplarz.getTitle())) {
                result[count] = egzemplarz;
                count++;
            }
        }
        return result;

    }

    public Egzemplarz[] searchByAuthor(String author) {
        int count = 0;
        for ( Egzemplarz egzemplarz : egzemplarze ) {
            if (author.equals(egzemplarz.getAutor())) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        Egzemplarz[] result = new Egzemplarz[count];
        count = 0;
        for ( Egzemplarz egzemplarz : egzemplarze ) {
            if (author.equals(egzemplarz.getAutor())) {
                result[count] = egzemplarz;
                count++;
            }
        }
        return result;

    }

    public Egzemplarz[] searchByTitleAndAuthor(String phrase) {
        int count = 0;
        for ( Egzemplarz egzemplarz : egzemplarze ) {
            if (phrase.equals(egzemplarz.getTitle()) || phrase.equals(egzemplarz.getAutor())) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        Egzemplarz[] result = new Egzemplarz[count];
        count = 0;
        for ( Egzemplarz egzemplarz : egzemplarze ) {

            if (phrase.equals(egzemplarz.getTitle()) || phrase.equals(egzemplarz.getAutor())) {
                result[count] = egzemplarz;
                count++;
            }
        }
        return result;
    }

    public Autor authorWithTheMostCopy() {
        Autor mostAuthor = egzemplarze[0].getAutor();
        int maxCount = 1;
        int count = 0;
        for ( int i = 0; i < egzemplarze.length; i++ ) {
            for ( int j = i + 1; j < egzemplarze.length; j++ ) {
                if (egzemplarze[i].getAutor().equals(egzemplarze[j].getAutor())) {
                    count++;
                }
            }
            if (count > maxCount) {
                count = maxCount;
                mostAuthor = egzemplarze[i].getAutor();
            }
            count = 0;

        }
        return mostAuthor;
    }

}
