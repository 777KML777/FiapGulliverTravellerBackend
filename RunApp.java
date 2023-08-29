import java.time.LocalDate;
import java.util.ArrayList;

import br.com.gt.beans.Agencia;
import br.com.gt.beans.Avaliacao;
import br.com.gt.beans.Carro;
import br.com.gt.beans.Cidade;
import br.com.gt.beans.Comentario;
import br.com.gt.beans.Endereco;
import br.com.gt.beans.Locadora;
import br.com.gt.beans.Reserva;
import br.com.gt.beans.Usuario;
import br.com.gt.beans.Veiculo;

class RunApp {
    public static void main(String[] args) {
        System.out.println("\n" + "Testando a Aplicação com Listas");
        
        ArrayList<Cidade> listaDeCidade = new ArrayList<>();
        listaDeCidade.add(0, new Cidade(1, "São Paulo", "São Paulo", "Brasil", "SP", "BR"));
        listaDeCidade.add(1, new Cidade(1, "Rio De Janeiro", "Rio De Janeiro", "Brasil", "SP", "BR"));

        ArrayList<Endereco> listaDeEndereco = new ArrayList<>();
        listaDeEndereco.add(0, new Endereco(1, "Jardim De Algum Lugar", "08532-950", "", "7", listaDeCidade.get(0)));
        listaDeEndereco.add(1, new Endereco(1, "Garden of some place", "0592-3580", "", "77", listaDeCidade.get(1)));

        ArrayList<Agencia> listaDeAgencia = new ArrayList<>();
        listaDeAgencia.add(0, new Agencia(1, listaDeEndereco.get(0)));
        listaDeAgencia.add(1, new Agencia(2, listaDeEndereco.get(1)));

        ArrayList<Locadora> listaDeLocadora = new ArrayList<>();
        listaDeLocadora.add(0, new Locadora(1, "Locadora GT", "gtlocadora@gmail.com", "74.521.092/14", "(11) 94321-9832",
                "locadoragt.com.br", listaDeAgencia));

        ArrayList<Comentario> listaDeComentario = new ArrayList<>();
        listaDeComentario.add(0, new Comentario(1, "Carro de 4 rodas e o mais legal é que as duas da frente vira.", 70));
        listaDeComentario.add(1, new Comentario(2, "O carro tem motor. Isso é bom!", 700));

        ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();
        listaDeUsuarios.add(0, new Usuario(1, "Kleber", "klebermirandalima@gmail.com", "777.777.777-77", "(11) 97777-7777",
                LocalDate.of(1999, 1, 17), "Masculino", listaDeComentario));

        ArrayList<Avaliacao> listaDeAvaliacao = new ArrayList<>();
        listaDeAvaliacao.add(0, new Avaliacao(1, listaDeUsuarios, 70));
        listaDeAvaliacao.add(1, new Avaliacao(2, listaDeUsuarios, 12));

        ArrayList<Veiculo> listaDeCarros = new ArrayList<>();
        listaDeCarros.add(0 , new Carro(1, 1999, 4, true, 150, "Preto", "Gasolina", "Carro de 4 rodas e pneus de borracha",
                "carro1.png", "Hyunday", "Palio Weekend", "FTA5E98", listaDeAvaliacao, 4));
                
        listaDeCarros.add(0 , new Carro(1, 1999, 4, true, 150, "Vermelho", "Gasolina", "Carro de 4 rodas e pneus de borracha",
                "carro1.png", "Fiat", "Palio", "FTA5E98", listaDeAvaliacao, 4));

        Reserva reserva = new Reserva(1, 0, LocalDate.now(), LocalDate.now().plusDays(2), LocalDate.now().plusDays(4),
                listaDeAgencia.get(1), listaDeCarros.get(0));

        reserva.setValorTotalAluguel(listaDeCarros.get(0).getPrecoDiaria());

        System.out.println(reserva);
    }
}