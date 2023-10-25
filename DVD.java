public class DVD extends ItemBiblioteca{
    private int duracaoMin;

    public DVD(String titulo, int anoPublicacao, int numCopias, int duracaoMin) {
        super(titulo, anoPublicacao, numCopias);
        this.duracaoMin = duracaoMin;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

   
    
}
