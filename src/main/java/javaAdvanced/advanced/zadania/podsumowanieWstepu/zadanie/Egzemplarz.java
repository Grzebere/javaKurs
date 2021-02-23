package javaAdvanced.advanced.zadania.podsumowanieWstepu.zadanie;

public class Egzemplarz {
    protected String title;
    protected Autor autor;

    public Egzemplarz(String title, Autor autor) {
        this.title = title;
        this.autor = autor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public Autor getAutor() {
        return autor;
    }
}
