package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutorPorEpisodio;

    public Serie(String nome, int anoDelancamento) {
        super(nome, anoDelancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutorPorEpisodio() {
        return minutorPorEpisodio;
    }

    public void setMinutorPorEpisodio(int minutorPorEpisodio) {
        this.minutorPorEpisodio = minutorPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutorPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDelancamento() + ")";
    }
}
