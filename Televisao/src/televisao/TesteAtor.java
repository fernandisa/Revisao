package televisao;
import javax.swing.JOptionPane;
public class TesteAtor {

   
    public static void main(String[] args) {
        
        Ator atuar = new Ator ();
        String nome;
        String data;
        String nomeArtistico;
        String email;
        String cidade;
        String estado;
        String endereco;
        String bairro;
        int qtdNovelas;
        double salarioMensal;
        double cache;
        
        nome = JOptionPane.showInputDialog("Nome: ");
        data = JOptionPane.showInputDialog("Data de seu nascimento: ");
        nomeArtistico = JOptionPane.showInputDialog("Nome artístico: ");
        email = JOptionPane.showInputDialog("E-mail: ");
        cidade = JOptionPane.showInputDialog("Cidade: ");
        estado = JOptionPane.showInputDialog("Estado: ");
        endereco = JOptionPane.showInputDialog("Endereço: ");
        bairro = JOptionPane.showInputDialog("Bairo: ");
        
        qtdNovelas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de novelas feitas:"));
        salarioMensal = Double.parseDouble(JOptionPane.showInputDialog("Salário mensal:"));
        cache = Double.parseDouble(JOptionPane.showInputDialog("Cachê por eventos:"));
        
        JOptionPane.showMessageDialog(null,"Nome artístico: "+ nome+"\nData de nascimento:" + data + "\nE-mail:" + email + "Quantidade de novelas:" 
                + qtdNovelas + "");
        
        atuar.setNomeArtistico(nome);
        atuar.setData(data);
        atuar.setEmail(email);
        atuar.setQtdNovelas(qtdNovelas);
        
        
        
        JOptionPane.showMessageDialog(null,"Status:" + atuar.obterStatus(qtdNovelas, salarioMensal)+ "Ganhos mensais:" 
                + atuar.calcularGanhos(qtdNovelas));
        
        
    }
    
}
