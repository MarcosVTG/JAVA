package Avaliação Individual-Marcos.Tribunal de Justiça.src.classes;

public class Estado {
    private String nome;
    private List<Parte> partes;

    // Construtor e outros métodos...

    // Getter
    public String getNome() {
        return nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter
    public List<Parte> getPartes() {
        return partes;
    }

    // Setter
    public void setPartes(List<Parte> partes) {
        this.partes = partes;
    }
}
