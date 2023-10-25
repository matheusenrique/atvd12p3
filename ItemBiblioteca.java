public class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;
    private int numCopias;
    
    public ItemBiblioteca(String titulo, int anoPublicacao, int numCopias) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.numCopias = numCopias;
    }

    public double calcularMulta(int diasAtrasados){
        double multa = diasAtrasados * 0.5;
        return multa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }

    public void emprestar() {
        if(numCopias < 0){
            System.out.println("Livro indisponível.");
        } else {
            numCopias--;
        }
    }

    public void devolver(){
        numCopias++;
    }
    
    
}
