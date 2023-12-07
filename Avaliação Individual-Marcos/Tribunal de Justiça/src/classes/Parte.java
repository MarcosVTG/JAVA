package Avaliação Individual-Marcos.Tribunal de Justiça.src;

    import Avaliação.Pessoa;
    public class Parte extends Pessoa {
        private List<Pessoa> membros;

        public List<Pessoa> getMembros() {
            return membros;
        }
        
        public void setMembros(List<Pessoa> membros) {
            this.membros = membros;
        }
    }
    
    

