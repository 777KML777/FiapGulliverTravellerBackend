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
        
        ArrayList<Cidade> listaDeCidade = new ArrayList<>(null);
        listaDeCidade.add(0, new Cidade(1, "São Paulo", "São Paulo", "Brasil", "SP", "BR"));
        listaDeCidade.add(1, new Cidade(1, "Rio De Janeiro", "Rio De Janeiro", "Brasil", "SP", "BR"));

        Endereco endereco = new Endereco(1, "Jardim De Algum Lugar", "08532-950", "", "7", null);
        Agencia agencia = new Agencia(1, endereco);

        Locadora locadora = new Locadora(1, "Locadora GT", "gtlocadora@gmail.com", "74.521.092/14", "(11) 94321-9832",
                "locadoragt.com.br", new ArrayList<>());
        locadora.setAgencias(agencia);

        Comentario comentario = new Comentario(1, "Carro de 4 rodas e o mais legal é que as duas da frente vira.", 70);
        Usuario usuario = new Usuario(1, "Kleber", "klebermirandalima@gmail.com", "777.777.777-77", "(11) 97777-7777",
                LocalDate.of(1999, 1, 17), "Masculino", new ArrayList<>());
        usuario.setComentarios(comentario);

        Avaliacao avaliacao = new Avaliacao(1, new ArrayList<>(), 0);
        avaliacao.setUsuarios(usuario);
        avaliacao.setTotalAvaliacoes(avaliacao.getUsuarios().size());

        // Veículo aqui poderia ser uma moto, caminhonete, helicóptero, ônibus...
        // qualquer meio de transporte.
        Veiculo carro = new Carro(1, 1999, 4, true, 150, "Preto", "Gasolina", "Carro de 4 rodas e pneus de borracha",
                "carro1.png", "Hyunday", "Palio Weekend", "FTA5E98", new ArrayList<>(), 4);
        carro.setAvaliacoes(avaliacao);

        Reserva reserva = new Reserva(1, 0, LocalDate.now(), LocalDate.now().plusDays(2), LocalDate.now().plusDays(4),
                agencia, carro);

        reserva.setValorTotalAluguel(carro.getPrecoDiaria());
        System.out.println(reserva);
    }
}